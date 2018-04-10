package aplication.data.mapper;

import aplication.data.entity.PersonaEntity;
import aplication.domain.model.PersonaModel;


public class PersonaModelToEntity {

    public static PersonaModel reverse( PersonaEntity personaEntity) {
        PersonaModel personaModel = new PersonaModel();
        personaModel.setRut(personaEntity.getRut());
        personaModel.setNombre(personaEntity.getNombre());

        return personaModel;
    }
}
