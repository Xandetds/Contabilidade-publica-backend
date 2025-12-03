package com.contabilidade.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CategoriaDespesaRequestDTO {

    @NotBlank(message = "O código da categoria de despesa é obrigatório.")
    @Size(min = 3, max = 20, message = "O código deve ter entre 3 e 20 caracteres.")
    private String codigo;

    @NotBlank(message = "A descrição da categoria de despesa é obrigatória.")
    @Size(min = 3, max = 150, message = "A descrição deve ter entre 3 e 150 caracteres.")
    private String descricao;

    public CategoriaDespesaRequestDTO() {
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
