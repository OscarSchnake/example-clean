package aplication.data.datasource;

import aplication.data.entity.PersonaEntity;

import java.util.List;

public interface Datasource {
    PersonaEntity obtenerPersona( String rut );
}
