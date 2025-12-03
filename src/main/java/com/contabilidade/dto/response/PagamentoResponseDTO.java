package com.contabilidade.dto.response;

import com.contabilidade.enums.TipoPagamento;

import java.math.BigDecimal;

public class PagamentoResponseDTO {

    private Long id;
    private String dataPagamento; // yyyy-MM-dd
    private BigDecimal valorPago;
    private TipoPagamento tipoPagamento;

    private Long liquidacaoId;
    private String numeroLiquidacao;

    private Long usuarioResponsavelId;
    private String usuarioResponsavelNome;

    public PagamentoResponseDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Long getLiquidacaoId() {
        return liquidacaoId;
    }

    public void setLiquidacaoId(Long liquidacaoId) {
        this.liquidacaoId = liquidacaoId;
    }

    public String getNumeroLiquidacao() {
        return numeroLiquidacao;
    }

    public void setNumeroLiquidacao(String numeroLiquidacao) {
        this.numeroLiquidacao = numeroLiquidacao;
    }

    public Long getUsuarioResponsavelId() {
        return usuarioResponsavelId;
    }

    public void setUsuarioResponsavelId(Long usuarioResponsavelId) {
        this.usuarioResponsavelId = usuarioResponsavelId;
    }

    public String getUsuarioResponsavelNome() {
        return usuarioResponsavelNome;
    }

    public void setUsuarioResponsavelNome(String usuarioResponsavelNome) {
        this.usuarioResponsavelNome = usuarioResponsavelNome;
    }
}
