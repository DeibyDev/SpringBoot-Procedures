package com.activos.Repository;


import com.activos.Entity.Empresa;
import com.activos.Entity.EmpresaVo;
import com.activos.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferenciaLaboralRepository extends JpaRepository<Empresa, Long> {

    //@Query(value = "Select tdc_td,emp_nd from empresa where emp_nd = 891900280", nativeQuery = true)
    @Procedure(name = "Car.getTotalCardsbyModelEntity")
   Persona listaProcedure();


    @Query(value="Select * from empresa where emp_nd = :EMPRESA",  nativeQuery = true)
    List<Empresa> V_CCONSULTA(@Param("EMPRESA") String EMPRESA);



}
