package com.contabilidade.service;

import com.contabilidade.dto.request.CredorRequestDTO;
import com.contabilidade.dto.response.CredorResponseDTO;
import com.contabilidade.entity.Credor;
import com.contabilidade.enums.TipoCredor;
import com.contabilidade.mapper.CredorMapper;
import com.contabilidade.repository.CredorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CredorService {

    private final CredorRepository repository;
    private final CredorMapper mapper;

    public CredorService(CredorRepository repository, CredorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CredorResponseDTO save(CredorRequestDTO dto) {
        Credor entidade = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(entidade));
    }

    public Credor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credor não encontrado."));
    }

    public CredorResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<CredorResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public CredorResponseDTO update(Long id, CredorRequestDTO dto) {
        Credor existente = buscarPorId(id);

        existente.setNome(dto.getNome());
        existente.setCpfCnpj(dto.getCpfCnpj());
        existente.setTipoCredor(TipoCredor.valueOf(dto.getTipoCredor()));
        existente.setAtivo(dto.getAtivo());

        return mapper.toResponse(repository.save(existente));
    }

    public void delete(Long id) {
        Credor existente = buscarPorId(id);
        repository.delete(existente);
    }
}
