package com.activos.Controller;

import com.activos.Entity.Empresa;
import com.activos.Entity.Errores;
import com.activos.Entity.GestionRetornoObjeto;
import com.activos.Entity.Persona;
import com.activos.Service.ReferenciaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ReferenciaLaboral")
public class ReferenciaLaboralController {

    @Autowired
    ReferenciaLaboralService referenciaLaboralService;




    @GetMapping("/Certificado")
    public ResponseEntity<Persona> Persona(){
      Persona persona = referenciaLaboralService.personas();
      return new ResponseEntity(persona, HttpStatus.OK);
    }

    @GetMapping("/Empresa/{id}")
    public ResponseEntity<List<Empresa>> getEmpresa(@PathVariable("id") String name ){
        System.out.println(name);
        Errores error = new Errores();
        List<Empresa> empresa= referenciaLaboralService.getEmpresa(name);
        System.out.println(error.getVCMENSAJE_PROCESO());
        return new ResponseEntity(empresa, HttpStatus.OK);
    }

    @GetMapping("/Empresas/{id}")
    public ResponseEntity<GestionRetornoObjeto> Empresa(@PathVariable("id") String name ){
        System.out.println(name);
       GestionRetornoObjeto gestionRetornoObjeto = referenciaLaboralService.empresa(name);
        return new ResponseEntity(gestionRetornoObjeto,HttpStatus.OK);
    }








    @GetMapping("/Persona/{id}")
    public ResponseEntity<Persona> getEmpresav2(@PathVariable("id") String name ){

        System.out.println(name);
        Persona persona= referenciaLaboralService.getByPersona(name);
        System.out.println(persona);

        return new ResponseEntity(persona, HttpStatus.OK);
    }



}
