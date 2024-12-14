package com.examen.core.account.ofiEdificioBloque;

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

}
