package com.activos.Entity;

public class GestionRetornoObjeto {

    private Object objetoRetorno;
    private String estadoProceso;
    private String mensajeProceso;

    public GestionRetornoObjeto() {
    }

    public GestionRetornoObjeto(Object objetoRetorno, String estadoProceso, String mensajeProceso) {
        this.objetoRetorno = objetoRetorno;
        this.estadoProceso = estadoProceso;
        this.mensajeProceso = mensajeProceso;
    }

    public String getMensajeProceso() {
        return this.mensajeProceso;
    }

    public void setMensajeProceso(String mensajeProceso) {
        this.mensajeProceso = mensajeProceso;
    }

    public Object getObjetoRetorno() {
        return this.objetoRetorno;
    }

    public void setObjetoRetorno(Object objetoRetorno) {
        this.objetoRetorno = objetoRetorno;
    }

    public String getEstadoProceso() {
        return this.estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }
}

