package com.examen.core.account.ofiSede;

import java.util.List;
import com.examen.core.account.ofiEdificio.model.OFIEDIFICIO;
import com.examen.core.account.ofiInstitucion.OFIINSTITUCION;
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

}
