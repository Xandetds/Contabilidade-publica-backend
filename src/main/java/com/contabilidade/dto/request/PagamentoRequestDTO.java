package com.contabilidade.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class PagamentoRequestDTO {

    @NotBlank(message = "A data do pagamento é obrigatória (formato: yyyy-MM-dd).")
    private String dataPagamento;

    @NotNull(message = "O valor pago é obrigatório.")
    @DecimalMin(value = "0.01", message = "O valor pago deve ser maior que zero.")
    private BigDecimal valorPago;

    @NotBlank(message = "O tipo de pagamento é obrigatório. Use: NORMAL ou RESTOS_A_PAGAR.")
    private String tipoPagamento;

    @NotNull(message = "É obrigatório informar o ID da liquidação.")
    private Long liquidacaoId;

    @NotNull(message = "É obrigatório informar o ID do usuário responsável pelo pagamento.")
    private Long usuarioResponsavelId;

    public PagamentoRequestDTO() {
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

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Long getLiquidacaoId() {
        return liquidacaoId;
    }

    public void setLiquidacaoId(Long liquidacaoId) {
        this.liquidacaoId = liquidacaoId;
    }

    public Long getUsuarioResponsavelId() {
        return usuarioResponsavelId;
    }

    public void setUsuarioResponsavelId(Long usuarioResponsavelId) {
        this.usuarioResponsavelId = usuarioResponsavelId;
    }
}
