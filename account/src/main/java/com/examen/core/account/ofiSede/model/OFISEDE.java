package com.examen.core.account.ofiSede.model;

import java.util.List;
import com.examen.core.account.ofiEdificio.model.OFIEDIFICIO;
import com.examen.core.account.ofiInstitucion.model.OFIINSTITUCION;
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
@Table(name = "OFI_SEDE")

public class OFISEDE {

    @Id
    @Column(name = "COD_SEDE")
    private String codSede;

    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", nullable = false)
    private OFIINSTITUCION institucion;

    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String nombre;

    @Column(name = "DIRECCION", length = 128)
    private String direccion;

    @Column(name = "ES_PRINCIPAL")
    private Boolean esPrincipal;

    @Column(name = "PRESUPUESTO", precision = 18, scale = 2)
    private Double presupuesto;

    @OneToMany(mappedBy = "sede", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OFIEDIFICIO> edificios;


    public OFISEDE() {
    }

    public OFISEDE(String codSede) {
        this.codSede = codSede;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public OFIINSTITUCION getInstitucion() {
        return institucion;
    }

    public void setInstitucion(OFIINSTITUCION institucion) {
        this.institucion = institucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<OFIEDIFICIO> getEdificios() {
        return edificios;
    }

    public void setEdificios(List<OFIEDIFICIO> edificios) {
        this.edificios = edificios;
    }

    

}
