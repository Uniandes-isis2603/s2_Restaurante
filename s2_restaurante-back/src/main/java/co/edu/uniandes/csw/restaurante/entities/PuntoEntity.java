/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.restaurante.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jp.hidalgo
 */
@javax.persistence.Entity
public class PuntoEntity extends BaseEntity implements Serializable {
    

    

    /**
     * fecha creacion del punto
     */
    private Date fecha;
    
    /**
     * retorna fecha creacion 
     * @return fecha creacion
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * cambia la fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
