package com.contabilidade.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CredorRequestDTO {

    @NotBlank(message = "O nome do credor é obrigatório.")
    @Size(min = 3, max = 150, message = "O nome deve ter entre 3 e 150 caracteres.")
    private String nome;

    @NotBlank(message = "O CPF/CNPJ é obrigatório.")
    @Size(min = 11, max = 18, message = "O CPF/CNPJ deve ter entre 11 e 18 caracteres.")
    private String cpfCnpj;

    @NotBlank(message = "O tipo do credor é obrigatório. Use: PESSOA_FISICA ou PESSOA_JURIDICA.")
    private String tipoCredor;

    @NotNull(message = "É necessário informar se o credor está ativo.")
    private Boolean ativo;

    public CredorRequestDTO() {
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

    public String getTipoCredor() {
        return tipoCredor;
    }

    public void setTipoCredor(String tipoCredor) {
        this.tipoCredor = tipoCredor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
