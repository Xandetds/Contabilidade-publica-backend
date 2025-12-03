package com.contabilidade.mapper;

import com.contabilidade.dto.request.CredorRequestDTO;
import com.contabilidade.dto.response.CredorResponseDTO;
import com.contabilidade.entity.Credor;
import com.contabilidade.enums.TipoCredor;
import org.springframework.stereotype.Component;

@Component
public class CredorMapper {

    public Credor toEntity(CredorRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        Credor entidade = new Credor();
        entidade.setNome(dto.getNome());
        entidade.setCpfCnpj(dto.getCpfCnpj());

        if (dto.getTipoCredor() != null) {
            entidade.setTipoCredor(TipoCredor.valueOf(dto.getTipoCredor()));
        }

        entidade.setAtivo(dto.getAtivo());
        return entidade;
    }

    public CredorResponseDTO toResponse(Credor entidade) {
        if (entidade == null) {
            return null;
        }

        CredorResponseDTO dto = new CredorResponseDTO();
        dto.setId(entidade.getId());
        dto.setNome(entidade.getNome());
        dto.setCpfCnpj(entidade.getCpfCnpj());
        dto.setTipoCredor(entidade.getTipoCredor());
        dto.setAtivo(entidade.getAtivo());

        return dto;
    }
}
