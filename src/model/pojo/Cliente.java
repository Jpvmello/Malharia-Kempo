/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojo;

import java.util.Objects;

/**
 *
 * @author JeanPablo
 */
public class Cliente {
    private Long cadastroPessoa;
    private String nome;
    private Long telefoneFixo;
    private Long celular;
    private String email;
    private String rua;
    private Integer numero;
    private String bairro;
    private String codigoEstado;
    private Integer cep;
    private String observacao;
    
    public Cliente(Long cadastroPessoa, String nome, Long telefoneFixo, Long celular, String email, String rua,
            Integer numero, String bairro, String codigoEstado, Integer cep, String observacao) {
        this.cadastroPessoa = cadastroPessoa;
        this.nome = nome;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.codigoEstado = codigoEstado;
        this.cep = cep;
        this.observacao = observacao;
    }

    public Long getCadastroPessoa() {
        return cadastroPessoa;
    }

    public void setCadastroPessoa(Long cadastroPessoa) {
        this.cadastroPessoa = cadastroPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(Long telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cadastroPessoa);
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.telefoneFixo);
        hash = 23 * hash + Objects.hashCode(this.celular);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.rua);
        hash = 23 * hash + Objects.hashCode(this.numero);
        hash = 23 * hash + Objects.hashCode(this.bairro);
        hash = 23 * hash + Objects.hashCode(this.codigoEstado);
        hash = 23 * hash + Objects.hashCode(this.cep);
        hash = 23 * hash + Objects.hashCode(this.observacao);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.codigoEstado, other.codigoEstado)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.cadastroPessoa, other.cadastroPessoa)) {
            return false;
        }
        if (!Objects.equals(this.telefoneFixo, other.telefoneFixo)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cadastroPessoa=" + cadastroPessoa + ", nome=" + nome + ", telefoneFixo=" + telefoneFixo + ", celular=" + celular + ", email=" + email + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", codigoEstado=" + codigoEstado + ", cep=" + cep + ", observacao=" + observacao + '}';
    }
}
