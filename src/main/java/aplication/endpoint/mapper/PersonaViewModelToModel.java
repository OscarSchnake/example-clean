package aplication.endpoint.mapper;

import aplication.data.entity.PersonaEntity;
import aplication.domain.model.PersonaModel;
import aplication.endpoint.modelview.PersonaViewModel;


public class PersonaViewModelToModel {
    
    
    public static PersonaViewModel reverse(PersonaModel personaModel) {
        PersonaViewModel personaViewModel = new PersonaViewModel();
        personaViewModel.setRut(personaModel.getRut());
        personaViewModel.setNombre(personaModel.getNombre());

        return personaViewModel;
    }

}
