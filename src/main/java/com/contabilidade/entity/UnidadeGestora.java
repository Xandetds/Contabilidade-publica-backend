package com.contabilidade.entity;

import com.contabilidade.enums.TipoUnidadeGestora;
import jakarta.persistence.*;

@Entity
@Table(name = "unidade_gestora")
public class UnidadeGestora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 18, unique = true)
    private String cnpj;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_unidade", nullable = false, length = 30)
    private TipoUnidadeGestora tipoUnidade;

    @Column(nullable = false)
    private Boolean ativa = true;

    public UnidadeGestora() {
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
