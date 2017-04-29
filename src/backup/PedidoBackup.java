/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import java.awt.Image;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author JeanPablo
 */
public class PedidoBackup {
    private Integer idPedido;
    private Long cadastroPessoa;
    private Date data;
    private String refenciaEvento;
    private Float valorUnitario;
    private Integer quantidade;
    private Image imagemFrente;
    private Image imagemCostas;
    private String malha;
    private String cor;
    private String observacao;
    
    public PedidoBackup (Integer idPedido, Long cadastroPessoa, Date data, String referenciaEvento, Float valorUnitario,
            Integer quantidade, Image imagemFrente, Image imagemCostas, String malha, String cor, String observacao) {
        this.idPedido = idPedido;
        this.cadastroPessoa = cadastroPessoa;
        this.data = data;
        this.refenciaEvento = referenciaEvento;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.imagemFrente = imagemFrente;
        this.imagemCostas = imagemCostas;
        this.malha = malha;
        this.cor = cor;
        this.observacao = observacao;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Long getCadastroPessoa() {
        return cadastroPessoa;
    }

    public void setCadastroPessoa(Long cadastroPessoa) {
        this.cadastroPessoa = cadastroPessoa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRefenciaEvento() {
        return refenciaEvento;
    }

    public void setRefenciaEvento(String refenciaEvento) {
        this.refenciaEvento = refenciaEvento;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Image getImagemFrente() {
        return imagemFrente;
    }

    public void setImagemFrente(Image imagemFrente) {
        this.imagemFrente = imagemFrente;
    }

    public Image getImagemCostas() {
        return imagemCostas;
    }

    public void setImagemCostas(Image imagemCostas) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idPedido);
        hash = 47 * hash + Objects.hashCode(this.cadastroPessoa);
        hash = 47 * hash + Objects.hashCode(this.data);
        hash = 47 * hash + Objects.hashCode(this.refenciaEvento);
        hash = 47 * hash + Objects.hashCode(this.valorUnitario);
        hash = 47 * hash + Objects.hashCode(this.quantidade);
        hash = 47 * hash + Objects.hashCode(this.imagemFrente);
        hash = 47 * hash + Objects.hashCode(this.imagemCostas);
        hash = 47 * hash + Objects.hashCode(this.malha);
        hash = 47 * hash + Objects.hashCode(this.cor);
        hash = 47 * hash + Objects.hashCode(this.observacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoBackup other = (PedidoBackup) obj;
        if (!Objects.equals(this.refenciaEvento, other.refenciaEvento)) {
            return false;
        }
        if (!Objects.equals(this.malha, other.malha)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.idPedido, other.idPedido)) {
            return false;
        }
        if (!Objects.equals(this.cadastroPessoa, other.cadastroPessoa)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.valorUnitario, other.valorUnitario)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        if (!Objects.equals(this.imagemFrente, other.imagemFrente)) {
            return false;
        }
        if (!Objects.equals(this.imagemCostas, other.imagemCostas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", cadastroPessoa=" + cadastroPessoa + ", data=" + data + ", refenciaEvento=" + refenciaEvento + ", valorUnitario=" + valorUnitario + ", quantidade=" + quantidade + ", imagemFrente=" + imagemFrente + ", imagemCostas=" + imagemCostas + ", malha=" + malha + ", cor=" + cor + ", observacao=" + observacao + '}';
    } 
}
