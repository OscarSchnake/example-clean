package aplication.endpoint;

import aplication.domain.model.PersonaModel;
import aplication.domain.usecase.ObtenerPersonasUseCases;
import aplication.endpoint.mapper.PersonaViewModelToModel;
import aplication.endpoint.modelview.PersonaViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaEndpoint {

    @Autowired
    private ObtenerPersonasUseCases obtenerPersonasUseCases;

    @RequestMapping(value="/persona", method = RequestMethod.GET)
    public PersonaViewModel obtenerPersona(@RequestParam ( value="rut") String rut){
        return PersonaViewModelToModel.reverse(obtenerPersonasUseCases.obtenerPersona(rut));
    }

}
