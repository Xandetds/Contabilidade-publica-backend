package com.contabilidade.mapper;

import com.contabilidade.dto.request.UsuarioRequestDTO;
import com.contabilidade.dto.response.UsuarioResponseDTO;
import com.contabilidade.entity.Usuario;
import com.contabilidade.enums.PerfilUsuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequestDTO dto) {
        if (dto == null) return null;

        Usuario entidade = new Usuario();
        entidade.setNome(dto.getNome());
        entidade.setEmail(dto.getEmail());
        entidade.setPerfil(PerfilUsuario.valueOf(dto.getPerfil()));
        entidade.setAtivo(dto.getAtivo());
        return entidade;
    }

    public UsuarioResponseDTO toResponse(Usuario entidade) {
        if (entidade == null) return null;

        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setId(entidade.getId());
        dto.setNome(entidade.getNome());
        dto.setEmail(entidade.getEmail());
        dto.setPerfil(entidade.getPerfil());
        dto.setAtivo(entidade.getAtivo());
        return dto;
    }
}
