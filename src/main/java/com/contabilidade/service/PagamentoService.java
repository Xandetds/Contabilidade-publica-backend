package com.contabilidade.service;

import com.contabilidade.dto.request.PagamentoRequestDTO;
import com.contabilidade.dto.response.PagamentoResponseDTO;
import com.contabilidade.entity.Liquidacao;
import com.contabilidade.entity.Pagamento;
import com.contabilidade.entity.Usuario;
import com.contabilidade.mapper.PagamentoMapper;
import com.contabilidade.repository.LiquidacaoRepository;
import com.contabilidade.repository.PagamentoRepository;
import com.contabilidade.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoService {

    private final PagamentoRepository repository;
    private final PagamentoMapper mapper;

    private final LiquidacaoRepository liquidacaoRepo;
    private final UsuarioRepository usuarioRepo;

    public PagamentoService(PagamentoRepository repository,
                            PagamentoMapper mapper,
                            LiquidacaoRepository liquidacaoRepo,
                            UsuarioRepository usuarioRepo) {

        this.repository = repository;
        this.mapper = mapper;
        this.liquidacaoRepo = liquidacaoRepo;
        this.usuarioRepo = usuarioRepo;
    }

    public PagamentoResponseDTO save(PagamentoRequestDTO dto) {
        Liquidacao liquidacao = liquidacaoRepo.findById(dto.getLiquidacaoId())
                .orElseThrow(() -> new RuntimeException("Liquidação não encontrada."));

        Usuario usuario = usuarioRepo.findById(dto.getUsuarioResponsavelId())
                .orElseThrow(() -> new RuntimeException("Usuário responsável não encontrado."));

        Pagamento entidade = mapper.toEntity(dto, liquidacao, usuario);
        return mapper.toResponse(repository.save(entidade));
    }

    public Pagamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado."));
    }

    public PagamentoResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<PagamentoResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {
        Pagamento existente = buscarPorId(id);
        repository.delete(existente);
    }
}
