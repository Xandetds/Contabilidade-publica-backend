package com.contabilidade.service;

import com.contabilidade.dto.request.CategoriaDespesaRequestDTO;
import com.contabilidade.dto.response.CategoriaDespesaResponseDTO;
import com.contabilidade.entity.CategoriaDespesa;
import com.contabilidade.mapper.CategoriaDespesaMapper;
import com.contabilidade.repository.CategoriaDespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaDespesaService {

    private final CategoriaDespesaRepository repository;
    private final CategoriaDespesaMapper mapper;

    public CategoriaDespesaService(CategoriaDespesaRepository repository, CategoriaDespesaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CategoriaDespesaResponseDTO save(CategoriaDespesaRequestDTO dto) {
        CategoriaDespesa entidade = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(entidade));
    }

    public CategoriaDespesa buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria de despesa não encontrada."));
    }

    public CategoriaDespesaResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<CategoriaDespesaResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public CategoriaDespesaResponseDTO update(Long id, CategoriaDespesaRequestDTO dto) {
        CategoriaDespesa existente = buscarPorId(id);

        existente.setCodigo(dto.getCodigo());
        existente.setDescricao(dto.getDescricao());

        return mapper.toResponse(repository.save(existente));
    }

    public void delete(Long id) {
        CategoriaDespesa existente = buscarPorId(id);
        repository.delete(existente);
    }
}
