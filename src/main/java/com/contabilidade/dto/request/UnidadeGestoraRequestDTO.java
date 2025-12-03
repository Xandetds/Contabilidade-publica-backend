package com.contabilidade.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UnidadeGestoraRequestDTO {

    @NotBlank(message = "O nome da unidade gestora é obrigatório.")
    @Size(min = 3, max = 120, message = "O nome deve ter entre 3 e 120 caracteres.")
    private String nome;

    @NotBlank(message = "O CNPJ é obrigatório.")
    @Size(min = 14, max = 18, message = "O CNPJ deve ter entre 14 e 18 caracteres.")
    private String cnpj;

    @NotBlank(message = "O tipo de unidade é obrigatório.")
    private String tipoUnidade;

    @NotNull(message = "É necessário informar se a unidade está ativa ou não.")
    private Boolean ativa;

    public UnidadeGestoraRequestDTO() {
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

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
}
