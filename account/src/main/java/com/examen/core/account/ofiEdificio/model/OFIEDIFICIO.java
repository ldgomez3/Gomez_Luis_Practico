package com.examen.core.account.ofiEdificio.model;

import java.util.List;
import com.examen.core.account.ofiEdificioBloque.model.OFIEDIFICIOBLOQUE;
import com.examen.core.account.ofiSede.model.OFISEDE;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_EDIFICIO")

public class OFIEDIFICIO {

    @Id
    @Column(name = "COD_EDIFICIO")
    private String codEdificio;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", nullable = false)
    private OFISEDE sede;

    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String nombre;

    @Column(name = "COD_ALTERNO", length = 16)
    private String codAlterno;

    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;

    @Column(name = "DIRECCION", length = 256)
    private String direccion;

    @Column(name = "COMENTARIO", length = 1000)
    private String comentario;

    @Column(name = "MANEJA_BLOQUES")
    private Boolean manejaBloques;

    @Column(name = "POSEE_AULAS")
    private Boolean poseeAulas;

    @Column(name = "PISOS")
    private Integer pisos;

    @OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OFIEDIFICIOBLOQUE> bloques;

    public OFIEDIFICIO() {
    }

    public OFIEDIFICIO(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public OFISEDE getSede() {
        return sede;
    }

    public void setSede(OFISEDE sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getManejaBloques() {
        return manejaBloques;
    }

    public void setManejaBloques(Boolean manejaBloques) {
        this.manejaBloques = manejaBloques;
    }

    public Boolean getPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(Boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public List<OFIEDIFICIOBLOQUE> getBloques() {
        return bloques;
    }

    public void setBloques(List<OFIEDIFICIOBLOQUE> bloques) {
        this.bloques = bloques;
    }

    

}
