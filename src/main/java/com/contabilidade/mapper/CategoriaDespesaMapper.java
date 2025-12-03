package com.contabilidade.mapper;

import com.contabilidade.dto.request.CategoriaDespesaRequestDTO;
import com.contabilidade.dto.response.CategoriaDespesaResponseDTO;
import com.contabilidade.entity.CategoriaDespesa;
import org.springframework.stereotype.Component;

@Component
public class CategoriaDespesaMapper {

    public CategoriaDespesa toEntity(CategoriaDespesaRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        CategoriaDespesa entidade = new CategoriaDespesa();
        entidade.setCodigo(dto.getCodigo());
        entidade.setDescricao(dto.getDescricao());

        return entidade;
    }

    public CategoriaDespesaResponseDTO toResponse(CategoriaDespesa entidade) {
        if (entidade == null) {
            return null;
        }

        CategoriaDespesaResponseDTO dto = new CategoriaDespesaResponseDTO();
        dto.setId(entidade.getId());
        dto.setCodigo(entidade.getCodigo());
        dto.setDescricao(entidade.getDescricao());

        return dto;
    }
}
