package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.PersonaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ObtenerPersonasUseCases {

    @Autowired
    private Repository repositoryLocal;

    public PersonaModel obtenerPersona( String rut){
        return repositoryLocal.obtenerPersona( rut );
    }
}
