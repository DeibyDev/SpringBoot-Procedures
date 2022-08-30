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


    public Integer getEMP_ND() {
        return EMP_ND;
    }

    public void setEMP_ND(Integer EMP_ND) {
        this.EMP_ND = EMP_ND;
    }

    public Integer getEMP_DV() {
        return EMP_DV;
    }

    public void setEMP_DV(Integer EMP_DV) {
        this.EMP_DV = EMP_DV;
    }

    public String getEMP_NOMBRE() {
        return EMP_NOMBRE;
    }

    public void setEMP_NOMBRE(String EMP_NOMBRE) {
        this.EMP_NOMBRE = EMP_NOMBRE;
    }

    public String getATE_CODIGO() {
        return ATE_CODIGO;
    }

    public void setATE_CODIGO(String ATE_CODIGO) {
        this.ATE_CODIGO = ATE_CODIGO;
    }
}
