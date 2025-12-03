package com.contabilidade.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RecursoRequestDTO {

    @NotBlank(message = "O código do recurso é obrigatório.")
    @Size(min = 1, max = 10, message = "O código do recurso deve ter entre 1 e 10 caracteres.")
    private String codigo;

    @NotBlank(message = "O nome do recurso é obrigatório.")
    @Size(min = 3, max = 120, message = "O nome do recurso deve ter entre 3 e 120 caracteres.")
    private String nome;

    @Size(max = 255, message = "A descrição do recurso deve ter no máximo 255 caracteres.")
    private String descricao; // Opcional

    public RecursoRequestDTO() {
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
