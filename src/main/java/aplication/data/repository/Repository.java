package aplication.data.repository;

import aplication.domain.model.PersonaModel;


public interface Repository {
    PersonaModel obtenerPersona(String rut);
}
