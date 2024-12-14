package com.examen.core.account.ofiEdificioBloque.model;

import java.util.List;
import com.examen.core.account.ofiAula.model.OFIAULA;
import com.examen.core.account.ofiEdificio.model.OFIEDIFICIO;
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
@Table(name = "OFI_EDIFICIO_BLOQUE")

public class OFIEDIFICIOBLOQUE {

    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE")
    private String codEdificioBloque;

    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", nullable = false)
    private OFIEDIFICIO edificio;

    @Column(name = "NOMBRE_BLOQUE", nullable = false, length = 128)
    private String nombreBloque;

    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "bloque", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OFIAULA> aulas;

    public OFIEDIFICIOBLOQUE() {
    }

    public OFIEDIFICIOBLOQUE(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public OFIEDIFICIO getEdificio() {
        return edificio;
    }

    public void setEdificio(OFIEDIFICIO edificio) {
        this.edificio = edificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<OFIAULA> getAulas() {
        return aulas;
    }

    public void setAulas(List<OFIAULA> aulas) {
        this.aulas = aulas;
    }

    
}

