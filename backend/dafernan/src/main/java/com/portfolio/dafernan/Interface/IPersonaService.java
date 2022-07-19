/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.dafernan.Interface;

import com.portfolio.dafernan.Entity.Persona;
import java.util.List;

/**
 *
 * @author COREi5
 */
public interface IPersonaService {
  // Traer una persona

   
    public List<Persona> getPersona();
    
  //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
  //Eliminar persona
    public void deletePersona(Long id);
    
  // Buscar persona poe id
    public Persona findPersona(Long id);
}
