package com.activos.Entity;

import javax.persistence.*;
import java.awt.*;

@Entity
@NamedStoredProcedureQuery(name = "ObtenerEmpresa",
        procedureName = "RHU.QB_JRHU0049_CRUD.PL_OBTENER_EMPRESA",
        resultClasses = Empresa.class,
        parameters = {
        @StoredProcedureParameter(name = "EMPRESA" , type = String.class , mode = ParameterMode.IN),
        @StoredProcedureParameter(name = "V_CCONSULTA" , type =void.class , mode = ParameterMode.REF_CURSOR),
        @StoredProcedureParameter(name = "VCESTADO_PROCESO" , type = String.class , mode = ParameterMode.OUT),
        @StoredProcedureParameter(name = "VCMENSAJE_PROCESO" , type = String.class , mode = ParameterMode.OUT)

})
public class Empresa {

    @Id
    @Column(name = "TDC_TD")
    private String TDC_TD;
    @Column(name = "EMP_ND")
    private Integer EMP_ND;
    @Column(name = "EMP_DV")
    private Integer EMP_DV;
    @Column(name = "EMP_NOMBRE")
    private String EMP_NOMBRE;
    @Column(name = "ATE_CODIGO")
    private String ATE_CODIGO;





}
