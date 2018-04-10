package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.factory.FactoryLocal;
import aplication.data.mapper.PersonaModelToEntity;
import aplication.domain.model.PersonaModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryLocal implements Repository{

    private Datasource localDataSource;

    public RepositoryLocal(FactoryLocal factoryLocal) {
        this.localDataSource = factoryLocal.crearDataSource();
    }

    @Override
    public PersonaModel obtenerPersona( String rut) {
        return PersonaModelToEntity.reverse(localDataSource.obtenerPersona(rut));
    }
}
