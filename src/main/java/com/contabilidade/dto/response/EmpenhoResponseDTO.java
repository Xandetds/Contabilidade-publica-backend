package com.contabilidade.dto.response;

import com.contabilidade.enums.SituacaoEmpenho;

import java.math.BigDecimal;

public class EmpenhoResponseDTO {

    private Long id;
    private String numeroEmpenho;
    private String dataEmpenho; // formatado como String (yyyy-MM-dd)
    private BigDecimal valorEmpenhado;
    private SituacaoEmpenho situacao;

    private Long unidadeGestoraId;
    private String unidadeGestoraNome;

    private Long credorId;
    private String credorNome;

    private Long categoriaDespesaId;
    private String categoriaDespesaCodigo;

    private Long recursoId;
    private String recursoCodigo;

    private Long usuarioResponsavelId;
    private String usuarioResponsavelNome;

    public EmpenhoResponseDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SituacaoEmpenho getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoEmpenho situacao) {
        this.situacao = situacao;
    }

    public Long getUnidadeGestoraId() {
        return unidadeGestoraId;
    }

    public void setUnidadeGestoraId(Long unidadeGestoraId) {
        this.unidadeGestoraId = unidadeGestoraId;
    }

    public String getUnidadeGestoraNome() {
        return unidadeGestoraNome;
    }

    public void setUnidadeGestoraNome(String unidadeGestoraNome) {
        this.unidadeGestoraNome = unidadeGestoraNome;
    }

    public Long getCredorId() {
        return credorId;
    }

    public void setCredorId(Long credorId) {
        this.credorId = credorId;
    }

    public String getCredorNome() {
        return credorNome;
    }

    public void setCredorNome(String credorNome) {
        this.credorNome = credorNome;
    }

    public Long getCategoriaDespesaId() {
        return categoriaDespesaId;
    }

    public void setCategoriaDespesaId(Long categoriaDespesaId) {
        this.categoriaDespesaId = categoriaDespesaId;
    }

    public String getCategoriaDespesaCodigo() {
        return categoriaDespesaCodigo;
    }

    public void setCategoriaDespesaCodigo(String categoriaDespesaCodigo) {
        this.categoriaDespesaCodigo = categoriaDespesaCodigo;
    }

    public Long getRecursoId() {
        return recursoId;
    }

    public void setRecursoId(Long recursoId) {
        this.recursoId = recursoId;
    }

    public String getRecursoCodigo() {
        return recursoCodigo;
    }

    public void setRecursoCodigo(String recursoCodigo) {
        this.recursoCodigo = recursoCodigo;
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
