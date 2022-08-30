package com.activos.Service;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import com.activos.Repository.ReferenciaLaboralRepository;
import com.activos.Repository.ReferenciaLaboralRepositoryCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.List;


@Service
@Transactional
public class ReferenciaLaboralService {
    @Autowired
    EntityManager entityManager;

    @Autowired
    ReferenciaLaboralRepository referenciaLaboralRepository;

    @Autowired
    ReferenciaLaboralRepositoryCursor referenciaLaboralRepositoryCursor;

    public Persona personas (){
        return referenciaLaboralRepository.listaProcedure();
    }

    public List<Empresa> getById(String id){
        return referenciaLaboralRepository.V_CCONSULTA(id);
    }

    public Persona getByPersona(String id){
        return referenciaLaboralRepositoryCursor.findCarsAfterYear(id);
    }

    public List<Empresa> getEmpresa(String id){
        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("ObtenerEmpresa");
        query.setParameter("EMPRESA", id);
        return query.getResultList();
    }


}
