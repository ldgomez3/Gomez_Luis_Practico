package com.examen.core.account.ofiAula.model;

import com.examen.core.account.ofiEdificio.model.OFIEDIFICIO;
import com.examen.core.account.ofiEdificioBloque.OFIEDIFICIOBLOQUE;
import com.examen.core.account.ofiTipoAula.OFITIPOAULA;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_AULA")

public class OFIAULA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULA")
    private Long codAula;

    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", nullable = false)
    private OFIEDIFICIO edificio;

    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO_BLOQUE", nullable = true)
    private OFIEDIFICIOBLOQUE bloque;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", nullable = false)
    private OFITIPOAULA tipoAula;

    @Column(name = "COD_ALTERNO", length = 10)
    private String codAlterno;

    @Column(name = "CAPACIDAD")
    private Integer capacidad;

    @Column(name = "PISO")
    private Integer piso;

    @Column(name = "FECHA_CREACION")
    private java.sql.Date fechaCreacion;

    @Column(name = "FECHA_ULT_ACTUALIZACION")
    private java.sql.Timestamp fechaUltActualizacion;

    public Long getCodAula() {
        return codAula;
    }

    public void setCodAula(Long codAula) {
        this.codAula = codAula;
    }

    public OFIEDIFICIO getEdificio() {
        return edificio;
    }

    public void setEdificio(OFIEDIFICIO edificio) {
        this.edificio = edificio;
    }

    public OFIEDIFICIOBLOQUE getBloque() {
        return bloque;
    }

    public void setBloque(OFIEDIFICIOBLOQUE bloque) {
        this.bloque = bloque;
    }

    public OFITIPOAULA getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(OFITIPOAULA tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public java.sql.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public java.sql.Timestamp getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(java.sql.Timestamp fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }


}
