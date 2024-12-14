package com.examen.core.account.ofiInstitucion;

import java.util.List;

import com.examen.core.account.ofiSede.OFISEDE;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_INSTITUCION")

public class OFIINSTITUCION {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_INSTITUCION")
    private Long codInstitucion;

    @Column(name = "RUC", nullable = false, length = 13)
    private String ruc;

    @Column(name = "RAZON_SOCIAL", nullable = false, length = 250)
    private String razonSocial;

    @Column(name = "NOMBRE_COMERCIAL", nullable = false, length = 250)
    private String nombreComercial;

    @OneToMany(mappedBy = "institucion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OFISEDE> sedes;

}
