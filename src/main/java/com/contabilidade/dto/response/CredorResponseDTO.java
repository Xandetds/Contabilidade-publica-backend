package com.contabilidade.dto.response;

import com.contabilidade.enums.TipoCredor;

public class CredorResponseDTO {

    private Long id;
    private String nome;
    private String cpfCnpj;
    private TipoCredor tipoCredor;
    private Boolean ativo;

    public CredorResponseDTO() {
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public TipoCredor getTipoCredor() {
        return tipoCredor;
    }

    public void setTipoCredor(TipoCredor tipoCredor) {
        this.tipoCredor = tipoCredor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
