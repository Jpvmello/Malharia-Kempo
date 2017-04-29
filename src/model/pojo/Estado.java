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
public class Estado {
    private final String codigoEstado;
    private final String estado;
    
    public Estado (String codigoEstado, String estado) {
        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigoEstado);
        hash = 59 * hash + Objects.hashCode(this.estado);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.codigoEstado, other.codigoEstado)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigoEstado=" + codigoEstado + ", estado=" + estado + '}';
    }
}
