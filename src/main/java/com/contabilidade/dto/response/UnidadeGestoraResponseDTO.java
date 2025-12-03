package com.contabilidade.dto.response;

import com.contabilidade.enums.TipoUnidadeGestora;

public class UnidadeGestoraResponseDTO {

    private Long id;
    private String nome;
    private String cnpj;
    private TipoUnidadeGestora tipoUnidade;
    private Boolean ativa;

    public UnidadeGestoraResponseDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public TipoUnidadeGestora getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(TipoUnidadeGestora tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
}
