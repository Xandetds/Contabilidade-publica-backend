package com.contabilidade.mapper;

import com.contabilidade.dto.request.RecursoRequestDTO;
import com.contabilidade.dto.response.RecursoResponseDTO;
import com.contabilidade.entity.Recurso;
import org.springframework.stereotype.Component;

@Component
public class RecursoMapper {

    public Recurso toEntity(RecursoRequestDTO dto) {
        if (dto == null) return null;

        Recurso entidade = new Recurso();
        entidade.setCodigo(dto.getCodigo());
        entidade.setNome(dto.getNome());
        entidade.setDescricao(dto.getDescricao());
        return entidade;
    }

    public RecursoResponseDTO toResponse(Recurso entidade) {
        if (entidade == null) return null;

        RecursoResponseDTO dto = new RecursoResponseDTO();
        dto.setId(entidade.getId());
        dto.setCodigo(entidade.getCodigo());
        dto.setNome(entidade.getNome());
        dto.setDescricao(entidade.getDescricao());
        return dto;
    }
}
