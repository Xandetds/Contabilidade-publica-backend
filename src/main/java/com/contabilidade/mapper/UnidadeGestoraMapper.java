package com.contabilidade.mapper;

import com.contabilidade.dto.request.UnidadeGestoraRequestDTO;
import com.contabilidade.dto.response.UnidadeGestoraResponseDTO;
import com.contabilidade.entity.UnidadeGestora;
import com.contabilidade.enums.TipoUnidadeGestora;
import org.springframework.stereotype.Component;

@Component
public class UnidadeGestoraMapper {

    public UnidadeGestora toEntity(UnidadeGestoraRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        UnidadeGestora entidade = new UnidadeGestora();
        entidade.setNome(dto.getNome());
        entidade.setCnpj(dto.getCnpj());

        if (dto.getTipoUnidade() != null) {
            entidade.setTipoUnidade(TipoUnidadeGestora.valueOf(dto.getTipoUnidade()));
        }

        entidade.setAtiva(dto.getAtiva());

        return entidade;
    }

    public UnidadeGestoraResponseDTO toResponse(UnidadeGestora entidade) {
        if (entidade == null) {
            return null;
        }

        UnidadeGestoraResponseDTO dto = new UnidadeGestoraResponseDTO();
        dto.setId(entidade.getId());
        dto.setNome(entidade.getNome());
        dto.setCnpj(entidade.getCnpj());
        dto.setTipoUnidade(entidade.getTipoUnidade());
        dto.setAtiva(entidade.getAtiva());

        return dto;
    }
}
