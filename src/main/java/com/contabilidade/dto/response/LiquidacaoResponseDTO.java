package com.contabilidade.dto.response;

import java.math.BigDecimal;

public class LiquidacaoResponseDTO {

    private Long id;
    private String numeroLiquidacao;
    private String dataLiquidacao; // yyyy-MM-dd
    private BigDecimal valorLiquidado;

    private Long empenhoId;
    private String numeroEmpenho;

    private Long usuarioResponsavelId;
    private String usuarioResponsavelNome;

    public LiquidacaoResponseDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroLiquidacao() {
        return numeroLiquidacao;
    }

    public void setNumeroLiquidacao(String numeroLiquidacao) {
        this.numeroLiquidacao = numeroLiquidacao;
    }

    public String getDataLiquidacao() {
        return dataLiquidacao;
    }

    public void setDataLiquidacao(String dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public BigDecimal getValorLiquidado() {
        return valorLiquidado;
    }

    public void setValorLiquidado(BigDecimal valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public Long getEmpenhoId() {
        return empenhoId;
    }

    public void setEmpenhoId(Long empenhoId) {
        this.empenhoId = empenhoId;
    }

    public String getNumeroEmpenho() {
        return numeroEmpenho;
    }

    public void setNumeroEmpenho(String numeroEmpenho) {
        this.numeroEmpenho = numeroEmpenho;
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
