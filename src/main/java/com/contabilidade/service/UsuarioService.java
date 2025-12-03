package com.contabilidade.service;

import com.contabilidade.dto.request.UsuarioRequestDTO;
import com.contabilidade.dto.response.UsuarioResponseDTO;
import com.contabilidade.entity.Usuario;
import com.contabilidade.enums.PerfilUsuario;
import com.contabilidade.mapper.UsuarioMapper;
import com.contabilidade.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository repository, UsuarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public UsuarioResponseDTO save(UsuarioRequestDTO dto) {
        Usuario entidade = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(entidade));
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    public UsuarioResponseDTO findById(Long id) {
        return mapper.toResponse(buscarPorId(id));
    }

    public List<UsuarioResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public UsuarioResponseDTO update(Long id, UsuarioRequestDTO dto) {
        Usuario existente = buscarPorId(id);

        existente.setNome(dto.getNome());
        existente.setEmail(dto.getEmail());
        existente.setPerfil(PerfilUsuario.valueOf(dto.getPerfil()));
        existente.setAtivo(dto.getAtivo());

        return mapper.toResponse(repository.save(existente));
    }

    public void delete(Long id) {
        Usuario existente = buscarPorId(id);
        repository.delete(existente);
    }
}
