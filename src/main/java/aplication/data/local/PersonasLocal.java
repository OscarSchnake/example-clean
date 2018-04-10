package aplication.data.local;

import aplication.data.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PersonasLocal implements Local {

    Map <String,PersonaEntity> personas = new HashMap<String, PersonaEntity>();

    public PersonasLocal() {

        PersonaEntity persona1 = new PersonaEntity ();
        persona1.setRut("1-9");
        persona1.setNombre("Batman");
        personas.put(persona1.getRut(), persona1);

        PersonaEntity persona2 = new PersonaEntity ();
        persona2.setRut("1-9");
        persona2.setNombre("Batman");
        personas.put(persona2.getRut(), persona2);

    }

    @Override
    public PersonaEntity obtenerPersona( String rut ) {
            return personas.get(rut);
    }

   /* @Override
    public List<PersonaEntity> obtenerPersonas() {

        Map <String,PersonaEntity> personas = new Map  <String,PersonaEntity>();

        List personas = new ArrayList();
        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.add(particitanteEntityUno);
        participantes.add(particitanteEntityDos);
        participantes.add(particitanteEntityTres);
        participantes.add(particitanteEntityCuatro);


        return participantes;
    }*/
}
