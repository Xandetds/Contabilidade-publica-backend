package com.contabilidade.service;

import com.contabilidade.dto.request.RecursoRequestDTO;
import com.contabilidade.dto.response.RecursoResponseDTO;
import com.contabilidade.entity.Recurso;
import com.contabilidade.mapper.RecursoMapper;
import com.contabilidade.repository.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecursoService {

    private final RecursoRepository repository;
    private final RecursoMapper mapper;

    public RecursoService(RecursoRepository repository, RecursoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public RecursoResponseDTO save(RecursoRequestDTO dto) {
        Recurso entidade = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(entidade));
    }

    public Recurso buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recurso não encontrado."));
    }

    public RecursoResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<RecursoResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public RecursoResponseDTO update(Long id, RecursoRequestDTO dto) {
        Recurso existente = buscarPorId(id);

        existente.setCodigo(dto.getCodigo());
        existente.setNome(dto.getNome());
        existente.setDescricao(dto.getDescricao());

        return mapper.toResponse(repository.save(existente));
    }

    public void delete(Long id) {
        Recurso existente = buscarPorId(id);
        repository.delete(existente);
    }
}
