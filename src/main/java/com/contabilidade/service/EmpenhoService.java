package com.contabilidade.service;

import com.contabilidade.dto.request.EmpenhoRequestDTO;
import com.contabilidade.dto.response.EmpenhoResponseDTO;
import com.contabilidade.entity.*;
import com.contabilidade.mapper.EmpenhoMapper;
import com.contabilidade.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpenhoService {

    private final EmpenhoRepository repository;
    private final EmpenhoMapper mapper;

    private final UnidadeGestoraRepository ugRepo;
    private final CredorRepository credorRepo;
    private final CategoriaDespesaRepository catRepo;
    private final RecursoRepository recursoRepo;
    private final UsuarioRepository usuarioRepo;

    public EmpenhoService(EmpenhoRepository repository,
                          EmpenhoMapper mapper,
                          UnidadeGestoraRepository ugRepo,
                          CredorRepository credorRepo,
                          CategoriaDespesaRepository catRepo,
                          RecursoRepository recursoRepo,
                          UsuarioRepository usuarioRepo) {

        this.repository = repository;
        this.mapper = mapper;
        this.ugRepo = ugRepo;
        this.credorRepo = credorRepo;
        this.catRepo = catRepo;
        this.recursoRepo = recursoRepo;
        this.usuarioRepo = usuarioRepo;
    }

    public EmpenhoResponseDTO save(EmpenhoRequestDTO dto) {
        UnidadeGestora ug = ugRepo.findById(dto.getUnidadeGestoraId())
                .orElseThrow(() -> new RuntimeException("Unidade Gestora não encontrada."));

        Credor credor = credorRepo.findById(dto.getCredorId())
                .orElseThrow(() -> new RuntimeException("Credor não encontrado."));

        CategoriaDespesa cat = catRepo.findById(dto.getCategoriaDespesaId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada."));

        Recurso recurso = recursoRepo.findById(dto.getRecursoId())
                .orElseThrow(() -> new RuntimeException("Recurso não encontrado."));

        Usuario usuario = usuarioRepo.findById(dto.getUsuarioResponsavelId())
                .orElseThrow(() -> new RuntimeException("Usuário responsável não encontrado."));

        Empenho entidade = mapper.toEntity(dto, ug, credor, cat, recurso, usuario);
        return mapper.toResponse(repository.save(entidade));
    }

    public Empenho buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empenho não encontrado."));
    }

    public EmpenhoResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<EmpenhoResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {
        Empenho entidade = buscarPorId(id);
        repository.delete(entidade);
    }
}
