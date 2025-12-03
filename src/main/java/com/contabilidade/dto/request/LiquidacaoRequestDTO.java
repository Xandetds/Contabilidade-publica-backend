package com.contabilidade.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class LiquidacaoRequestDTO {

    @NotBlank(message = "O número da liquidação é obrigatório.")
    @Size(min = 1, max = 20, message = "O número da liquidação deve ter entre 1 e 20 caracteres.")
    private String numeroLiquidacao;

    @NotBlank(message = "A data da liquidação é obrigatória (formato: yyyy-MM-dd).")
    private String dataLiquidacao;

    @NotNull(message = "O valor liquidado é obrigatório.")
    @DecimalMin(value = "0.01", message = "O valor liquidado deve ser maior que zero.")
    private BigDecimal valorLiquidado;

    @NotNull(message = "É obrigatório informar o ID do empenho.")
    private Long empenhoId;

    @NotNull(message = "É obrigatório informar o ID do usuário responsável pela liquidação.")
    private Long usuarioResponsavelId;

    public LiquidacaoRequestDTO() {
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

    public Long getUsuarioResponsavelId() {
        return usuarioResponsavelId;
    }

    public void setUsuarioResponsavelId(Long usuarioResponsavelId) {
        this.usuarioResponsavelId = usuarioResponsavelId;
    }
}
