package com.examen.core.account.ofiEdificio.model;

import java.util.List;
import com.examen.core.account.ofiEdificioBloque.OFIEDIFICIOBLOQUE;
import com.examen.core.account.ofiSede.OFISEDE;
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

}
