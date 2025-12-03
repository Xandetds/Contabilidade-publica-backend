package com.contabilidade.entity;

import com.contabilidade.enums.TipoCredor;
import jakarta.persistence.*;

@Entity
@Table(name = "credor")
public class Credor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 18, unique = true)
    private String cpfCnpj;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_credor", nullable = false, length = 20)
    private TipoCredor tipoCredor;

    @Column(nullable = false)
    private Boolean ativo = true;

    public Credor() {
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
