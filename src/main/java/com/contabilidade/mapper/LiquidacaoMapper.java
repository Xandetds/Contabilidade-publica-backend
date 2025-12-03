package com.contabilidade.mapper;

import com.contabilidade.dto.request.LiquidacaoRequestDTO;
import com.contabilidade.dto.response.LiquidacaoResponseDTO;
import com.contabilidade.entity.Empenho;
import com.contabilidade.entity.Liquidacao;
import com.contabilidade.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class LiquidacaoMapper {

    public Liquidacao toEntity(LiquidacaoRequestDTO dto, Empenho empenho, Usuario usuario) {
        if (dto == null) return null;

        Liquidacao entidade = new Liquidacao();
        entidade.setNumeroLiquidacao(dto.getNumeroLiquidacao());
        entidade.setDataLiquidacao(java.time.LocalDate.parse(dto.getDataLiquidacao()));
        entidade.setValorLiquidado(dto.getValorLiquidado());
        entidade.setEmpenho(empenho);
        entidade.setUsuarioResponsavel(usuario);

        return entidade;
    }

    public LiquidacaoResponseDTO toResponse(Liquidacao entidade) {
        if (entidade == null) return null;

        LiquidacaoResponseDTO dto = new LiquidacaoResponseDTO();
        dto.setId(entidade.getId());
        dto.setNumeroLiquidacao(entidade.getNumeroLiquidacao());
        dto.setDataLiquidacao(entidade.getDataLiquidacao().toString());
        dto.setValorLiquidado(entidade.getValorLiquidado());

        dto.setEmpenhoId(entidade.getEmpenho().getId());
        dto.setNumeroEmpenho(entidade.getEmpenho().getNumeroEmpenho());

        dto.setUsuarioResponsavelId(entidade.getUsuarioResponsavel().getId());
        dto.setUsuarioResponsavelNome(entidade.getUsuarioResponsavel().getNome());

        return dto;
    }
}
