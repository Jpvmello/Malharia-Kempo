/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JeanPablo
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByData", query = "SELECT p FROM Pedido p WHERE p.data = :data")
    , @NamedQuery(name = "Pedido.findByReferenciaEvento", query = "SELECT p FROM Pedido p WHERE p.referenciaEvento = :referenciaEvento")
    , @NamedQuery(name = "Pedido.findByValorUnitario", query = "SELECT p FROM Pedido p WHERE p.valorUnitario = :valorUnitario")
    , @NamedQuery(name = "Pedido.findByQuantidade", query = "SELECT p FROM Pedido p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Pedido.findByMalha", query = "SELECT p FROM Pedido p WHERE p.malha = :malha")
    , @NamedQuery(name = "Pedido.findByCor", query = "SELECT p FROM Pedido p WHERE p.cor = :cor")
    , @NamedQuery(name = "Pedido.findByObservacao", query = "SELECT p FROM Pedido p WHERE p.observacao = :observacao")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Short idPedido;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "referenciaEvento")
    private String referenciaEvento;
    @Basic(optional = false)
    @Column(name = "valorUnitario")
    private float valorUnitario;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Lob
    @Column(name = "imagemFrente")
    private byte[] imagemFrente;
    @Basic(optional = false)
    @Lob
    @Column(name = "imagemCostas")
    private byte[] imagemCostas;
    @Basic(optional = false)
    @Column(name = "malha")
    private String malha;
    @Basic(optional = false)
    @Column(name = "cor")
    private String cor;
    @Column(name = "observacao")
    private String observacao;
    @JoinColumn(name = "cadastroPessoa", referencedColumnName = "cadastroPessoa")
    @ManyToOne(optional = false)
    private Cliente cadastroPessoa;

    public Pedido() {
    }

    public Pedido(Short idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Short idPedido, Date data, String referenciaEvento, float valorUnitario, int quantidade, byte[] imagemFrente, byte[] imagemCostas, String malha, String cor) {
        this.idPedido = idPedido;
        this.data = data;
        this.referenciaEvento = referenciaEvento;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.imagemFrente = imagemFrente;
        this.imagemCostas = imagemCostas;
        this.malha = malha;
        this.cor = cor;
    }

    public Short getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Short idPedido) {
        this.idPedido = idPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getReferenciaEvento() {
        return referenciaEvento;
    }

    public void setReferenciaEvento(String referenciaEvento) {
        this.referenciaEvento = referenciaEvento;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public byte[] getImagemFrente() {
        return imagemFrente;
    }

    public void setImagemFrente(byte[] imagemFrente) {
        this.imagemFrente = imagemFrente;
    }

    public byte[] getImagemCostas() {
        return imagemCostas;
    }

    public void setImagemCostas(byte[] imagemCostas) {
        this.imagemCostas = imagemCostas;
    }

    public String getMalha() {
        return malha;
    }

    public void setMalha(String malha) {
        this.malha = malha;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCadastroPessoa() {
        return cadastroPessoa;
    }

    public void setCadastroPessoa(Cliente cadastroPessoa) {
        this.cadastroPessoa = cadastroPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "malharia.kempo.Pedido[ idPedido=" + idPedido + " ]";
    }
    
}
