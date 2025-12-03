package com.contabilidade.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.contabilidade.enums.SituacaoEmpenho;


@Entity
@Table(name = "empenho")
public class Empenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_empenho", nullable = false, length = 20)
    private String numeroEmpenho;

    @Column(name = "data_empenho", nullable = false)
    private LocalDate dataEmpenho;

    @Column(name = "valor_empenhado", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorEmpenhado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private SituacaoEmpenho situacao;


    @ManyToOne
    @JoinColumn(name = "unidade_gestora_id", nullable = false)
    private UnidadeGestora unidadeGestora;

    @ManyToOne
    @JoinColumn(name = "credor_id", nullable = false)
    private Credor credor;

    @ManyToOne
    @JoinColumn(name = "categoria_despesa_id", nullable = false)
    private CategoriaDespesa categoriaDespesa;

    @ManyToOne
    @JoinColumn(name = "recurso_id", nullable = false)
    private Recurso recurso; // A FONTE da despesa

    @ManyToOne
    @JoinColumn(name = "usuario_responsavel_id")
    private Usuario usuarioResponsavel;

    public Empenho() {
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

    public LocalDate getDataEmpenho() {
        return dataEmpenho;
    }

    public void setDataEmpenho(LocalDate dataEmpenho) {
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


    public UnidadeGestora getUnidadeGestora() {
        return unidadeGestora;
    }

    public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
        this.unidadeGestora = unidadeGestora;
    }

    public Credor getCredor() {
        return credor;
    }

    public void setCredor(Credor credor) {
        this.credor = credor;
    }

    public CategoriaDespesa getCategoriaDespesa() {
        return categoriaDespesa;
    }

    public void setCategoriaDespesa(CategoriaDespesa categoriaDespesa) {
        this.categoriaDespesa = categoriaDespesa;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }
}
