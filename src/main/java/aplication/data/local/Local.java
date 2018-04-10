package aplication.data.local;

import aplication.data.entity.PersonaEntity;

import java.util.List;

public interface Local {
    PersonaEntity obtenerPersona(String rut);
}
