package com.contabilidade.mapper;

import com.contabilidade.dto.request.PagamentoRequestDTO;
import com.contabilidade.dto.response.PagamentoResponseDTO;
import com.contabilidade.entity.Liquidacao;
import com.contabilidade.entity.Pagamento;
import com.contabilidade.entity.Usuario;
import com.contabilidade.enums.TipoPagamento;
import org.springframework.stereotype.Component;

@Component
public class PagamentoMapper {

    public Pagamento toEntity(PagamentoRequestDTO dto, Liquidacao liquidacao, Usuario usuario) {
        if (dto == null) return null;

        Pagamento entidade = new Pagamento();
        entidade.setDataPagamento(java.time.LocalDate.parse(dto.getDataPagamento()));
        entidade.setValorPago(dto.getValorPago());
        entidade.setTipoPagamento(TipoPagamento.valueOf(dto.getTipoPagamento()));
        entidade.setLiquidacao(liquidacao);
        entidade.setUsuarioResponsavel(usuario);

        return entidade;
    }

    public PagamentoResponseDTO toResponse(Pagamento entidade) {
        if (entidade == null) return null;

        PagamentoResponseDTO dto = new PagamentoResponseDTO();
        dto.setId(entidade.getId());
        dto.setDataPagamento(entidade.getDataPagamento().toString());
        dto.setValorPago(entidade.getValorPago());
        dto.setTipoPagamento(entidade.getTipoPagamento());

        dto.setLiquidacaoId(entidade.getLiquidacao().getId());
        dto.setNumeroLiquidacao(entidade.getLiquidacao().getNumeroLiquidacao());

        dto.setUsuarioResponsavelId(entidade.getUsuarioResponsavel().getId());
        dto.setUsuarioResponsavelNome(entidade.getUsuarioResponsavel().getNome());

        return dto;
    }
}
