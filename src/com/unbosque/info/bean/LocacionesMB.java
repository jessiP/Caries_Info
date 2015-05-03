package com.unbosque.info.bean;


import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 





import org.primefaces.context.RequestContext;
 
@ManagedBean (name = "locacionesMB")
@SessionScoped
public class LocacionesMB implements Serializable {
	
private static final long serialVersionUID = -7809396348460743L;
	
	private LocacionesMB registroSeleccionado;
   
    private String depar;
    private String ciudad;




	public String getDepar() {
		return depar;
	}



	public void setDepar(String depar) {
		this.depar = depar;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LocacionesMB getRegistroSeleccionado() {
		return registroSeleccionado;
	}

	public void setRegistroSeleccionado(LocacionesMB registroSeleccionado) {
		this.registroSeleccionado = registroSeleccionado;
	}

	

	public void a�adirDepar(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesContext contex = FacesContext.getCurrentInstance();
        
        FacesMessage message = null;
        boolean loggedIn = false;
         
        if( depar != null) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Departamento A�adido", depar);
        
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al a�adir", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        //context.addCallbackParam("loggedIn", loggedIn);
    }
	
	public void a�adirCiudad(ActionEvent event) {
	        RequestContext context = RequestContext.getCurrentInstance();
	        FacesContext contex = FacesContext.getCurrentInstance();
	        
	        FacesMessage message = null;
	        boolean loggedIn = false;
	         
	        if(ciudad != null) {
	            loggedIn = true;
	            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ciudad A�adida", ciudad);
	        
	        } else {
	            loggedIn = false;
	            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al a�adir", "Invalid credentials");
	        }
	         
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        //context.addCallbackParam("loggedIn", loggedIn);
	    }
	
}