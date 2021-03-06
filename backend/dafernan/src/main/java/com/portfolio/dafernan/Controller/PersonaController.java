/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.dafernan.Controller;



import com.portfolio.dafernan.Entity.Persona;
import com.portfolio.dafernan.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author COREi5
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
 @Autowired IPersonaService ipersonaService ;

 @GetMapping("personas/traer")
public List<Persona> getPersona() {
    
 return ipersonaService.getPersona();
}

@PostMapping("personas/crear")
public String createPersona(@RequestBody Persona persona){

   ipersonaService.savePersona(persona);
   return "la persona fue creada";
}
@DeleteMapping("personas/borrar/(id)")
public String deletePersona(@PathVariable Long id){
ipersonaService.deletePersona(id);
return "La persona fue eliminada";
}
//URL:PUERTO/personas/editar/4/nombre/apellido/img

@PutMapping("personas/editar/(id)")
public Persona editPersona(@PathVariable Long id,
                            @RequestParam("nombre")String nuevoNombre,
                            @RequestParam("Apellido")String nuevoApellido,
                            @RequestParam("img") String nuevoImg){
    Persona persona = ipersonaService.findPersona(id);
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    
    ipersonaService.savePersona(persona);
    return persona;
    
}


}






