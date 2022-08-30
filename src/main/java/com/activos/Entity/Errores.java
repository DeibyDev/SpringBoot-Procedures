package com.activos.Entity;

import javax.persistence.Parameter;

public class Errores {
    private String VCESTADO_PROCESO;
    private String VCMENSAJE_PROCESO;



    public String getVCESTADO_PROCESO() {
        return VCESTADO_PROCESO;
    }

    public void setVCESTADO_PROCESO(String VCESTADO_PROCESO) {
        this.VCESTADO_PROCESO = VCESTADO_PROCESO;
    }

    public String getVCMENSAJE_PROCESO() {
        return VCMENSAJE_PROCESO;
    }

    public void setVCMENSAJE_PROCESO(String VCMENSAJE_PROCESO) {
        this.VCMENSAJE_PROCESO = VCMENSAJE_PROCESO;
    }

    public Errores(String VCESTADO_PROCESO, String VCMENSAJE_PROCESO) {
        this.VCESTADO_PROCESO = VCESTADO_PROCESO;
        this.VCMENSAJE_PROCESO = VCMENSAJE_PROCESO;
    }

    public Errores() {

    }

    @Override
    public String toString() {
        return "Errores{" +
                "VCESTADO_PROCESO='" + VCESTADO_PROCESO + '\'' +
                ", VCMENSAJE_PROCESO='" + VCMENSAJE_PROCESO + '\'' +
                '}';
    }
}
