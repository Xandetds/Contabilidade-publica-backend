package com.contabilidade.service;

import com.contabilidade.dto.request.LiquidacaoRequestDTO;
import com.contabilidade.dto.response.LiquidacaoResponseDTO;
import com.contabilidade.entity.Empenho;
import com.contabilidade.entity.Liquidacao;
import com.contabilidade.entity.Usuario;
import com.contabilidade.mapper.LiquidacaoMapper;
import com.contabilidade.repository.EmpenhoRepository;
import com.contabilidade.repository.LiquidacaoRepository;
import com.contabilidade.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LiquidacaoService {

    private final LiquidacaoRepository repository;
    private final LiquidacaoMapper mapper;

    private final EmpenhoRepository empenhoRepo;
    private final UsuarioRepository usuarioRepo;

    public LiquidacaoService(LiquidacaoRepository repository,
                             LiquidacaoMapper mapper,
                             EmpenhoRepository empenhoRepo,
                             UsuarioRepository usuarioRepo) {

        this.repository = repository;
        this.mapper = mapper;
        this.empenhoRepo = empenhoRepo;
        this.usuarioRepo = usuarioRepo;
    }

    public LiquidacaoResponseDTO save(LiquidacaoRequestDTO dto) {
        Empenho empenho = empenhoRepo.findById(dto.getEmpenhoId())
                .orElseThrow(() -> new RuntimeException("Empenho não encontrado."));

        Usuario usuario = usuarioRepo.findById(dto.getUsuarioResponsavelId())
                .orElseThrow(() -> new RuntimeException("Usuário responsável não encontrado."));

        Liquidacao entidade = mapper.toEntity(dto, empenho, usuario);
        return mapper.toResponse(repository.save(entidade));
    }

    public Liquidacao buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Liquidação não encontrada."));
    }

    public LiquidacaoResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<LiquidacaoResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {
        Liquidacao existente = buscarPorId(id);
        repository.delete(existente);
    }
}
