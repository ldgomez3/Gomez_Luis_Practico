package com.examen.core.account.service;

import java.util.List;

import com.examen.core.account.ofiInstitucion.model.OFIINSTITUCION;

public interface InstitucionService {
    OFIINSTITUCION createInstitucion(OFIINSTITUCION institucion);
    OFIINSTITUCION getInstitucionById(Long id);
    List<OFIINSTITUCION> getAllInstituciones();
    OFIINSTITUCION updateInstitucion(Long id, OFIINSTITUCION institucion);
    void deleteInstitucion(Long id);
}
