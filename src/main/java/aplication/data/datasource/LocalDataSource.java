package aplication.data.datasource;

import aplication.data.entity.PersonaEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocalDataSource implements Datasource {

    @Autowired
    private Local personasLocal;

    @Override
    public PersonaEntity obtenerPersona(String rut) {
        return personasLocal.obtenerPersona(rut);
    }
}
