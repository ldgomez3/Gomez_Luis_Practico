package com.examen.core.account.ofiTipoAula.model;

import java.util.List;
import com.examen.core.account.ofiAula.model.OFIAULA;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_TIPO_AULA")

public class OFITIPOAULA {

    @Id
    @Column(name = "COD_TIPO_AULA")
    private String codTipoAula;

    @Column(name = "DESCRIPCION", nullable = false, length = 128)
    private String descripcion;

    @Column(name = "FECHA_CREACION")
    private java.sql.Date fechaCreacion;

    @OneToMany(mappedBy = "tipoAula", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OFIAULA> aulas;

    public OFITIPOAULA() {
    }

    public OFITIPOAULA(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public java.sql.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<OFIAULA> getAulas() {
        return aulas;
    }

    public void setAulas(List<OFIAULA> aulas) {
        this.aulas = aulas;
    }


}
