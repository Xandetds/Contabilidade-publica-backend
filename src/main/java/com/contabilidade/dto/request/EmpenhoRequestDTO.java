package com.contabilidade.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMin;
import java.math.BigDecimal;

public class EmpenhoRequestDTO {

    @NotBlank(message = "O número do empenho é obrigatório.")
    @Size(min = 1, max = 20, message = "O número do empenho deve ter entre 1 e 20 caracteres.")
    private String numeroEmpenho;

    @NotBlank(message = "A data do empenho é obrigatória (formato: yyyy-MM-dd).")
    private String dataEmpenho;

    @NotNull(message = "O valor empenhado é obrigatório.")
    @DecimalMin(value = "0.01", message = "O valor empenhado deve ser maior que zero.")
    private BigDecimal valorEmpenhado;

    @NotBlank(message = "A situação do empenho é obrigatória. Use: EM_ABERTO, LIQUIDADO ou CANCELADO.")
    private String situacao;


    @NotNull(message = "É obrigatório informar o ID da unidade gestora.")
    private Long unidadeGestoraId;

    @NotNull(message = "É obrigatório informar o ID do credor.")
    private Long credorId;

    @NotNull(message = "É obrigatório informar o ID da categoria de despesa.")
    private Long categoriaDespesaId;

    @NotNull(message = "É obrigatório informar o ID do recurso.")
    private Long recursoId;

    @NotNull(message = "É obrigatório informar o ID do usuário responsável.")
    private Long usuarioResponsavelId;

    public EmpenhoRequestDTO() {
    }


    public String getNumeroEmpenho() {
        return numeroEmpenho;
    }

    public void setNumeroEmpenho(String numeroEmpenho) {
        this.numeroEmpenho = numeroEmpenho;
    }

    public String getDataEmpenho() {
        return dataEmpenho;
    }

    public void setDataEmpenho(String dataEmpenho) {
        this.dataEmpenho = dataEmpenho;
    }

    public BigDecimal getValorEmpenhado() {
        return valorEmpenhado;
    }

    public void setValorEmpenhado(BigDecimal valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Long getUnidadeGestoraId() {
        return unidadeGestoraId;
    }

    public void setUnidadeGestoraId(Long unidadeGestoraId) {
        this.unidadeGestoraId = unidadeGestoraId;
    }

    public Long getCredorId() {
        return credorId;
    }

    public void setCredorId(Long credorId) {
        this.credorId = credorId;
    }

    public Long getCategoriaDespesaId() {
        return categoriaDespesaId;
    }

    public void setCategoriaDespesaId(Long categoriaDespesaId) {
        this.categoriaDespesaId = categoriaDespesaId;
    }

    public Long getRecursoId() {
        return recursoId;
    }

    public void setRecursoId(Long recursoId) {
        this.recursoId = recursoId;
    }

    public Long getUsuarioResponsavelId() {
        return usuarioResponsavelId;
    }

    public void setUsuarioResponsavelId(Long usuarioResponsavelId) {
        this.usuarioResponsavelId = usuarioResponsavelId;
    }
}
