package com.contabilidade.service;

import com.contabilidade.dto.request.UnidadeGestoraRequestDTO;
import com.contabilidade.dto.response.UnidadeGestoraResponseDTO;
import com.contabilidade.entity.UnidadeGestora;
import com.contabilidade.mapper.UnidadeGestoraMapper;
import com.contabilidade.repository.UnidadeGestoraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnidadeGestoraService {

    private final UnidadeGestoraRepository repository;
    private final UnidadeGestoraMapper mapper;

    public UnidadeGestoraService(UnidadeGestoraRepository repository, UnidadeGestoraMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public UnidadeGestoraResponseDTO save(UnidadeGestoraRequestDTO dto) {
        UnidadeGestora entidade = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(entidade));
    }

    public UnidadeGestora buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Unidade Gestora não encontrada."));
    }

    public UnidadeGestoraResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<UnidadeGestoraResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public UnidadeGestoraResponseDTO update(Long id, UnidadeGestoraRequestDTO dto) {
        UnidadeGestora existente = buscarPorId(id);

        existente.setNome(dto.getNome());
        existente.setCnpj(dto.getCnpj());
        existente.setTipoUnidade(existente.getTipoUnidade().valueOf(dto.getTipoUnidade()));
        existente.setAtiva(dto.getAtiva());

        return mapper.toResponse(repository.save(existente));
    }

    public void delete(Long id) {
        UnidadeGestora entidade = buscarPorId(id);
        repository.delete(entidade);
    }
}
