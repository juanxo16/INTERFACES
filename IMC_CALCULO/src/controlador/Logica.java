/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author juanj.hermon
 */
public class Logica {
    
    double imc;
    ArrayList<Persona> arrayPersonas;
    
    public Logica(){
        arrayPersonas = new ArrayList<>();
    }
    
    public void altaPersonas(Persona persona){
        arrayPersonas.add(persona);
    }
    
    public String listarPersonas(Persona persona){
        String resul = "Persona registrada con exito.\n";
        resul+= "Dni: " + persona.getDni() + "\n";
        resul+= "Nombre: " + persona.getNombre()+ "\n";
        resul+= "Edad: " + persona.getEdad()+ "\n";
        resul+= "Peso: " + persona.getPeso()+ "\n";
        resul+= "Talla: " + persona.getTalla()+ "\n";
        
        String imcMsj = textoIMC(imc);
        resul+= "IMC: " + persona.getImc()+ "\n";
        return resul;
    }
    
    public void calcularImc(Persona persona){
        imc = persona.getPeso()/(persona.getTalla()*persona.getTalla());
        
        persona.setImc(imc);
    }

    private String textoIMC(double imc) {
       String mensaje;
     if(imc>40){
         mensaje = "Obesidad Tipo 3";
     }else if(imc>35){
         mensaje = "Obesidad Tipo 2";
     }else if(imc>30){
         mensaje = "Obesidad Tipo 1";
     }else if(imc>27){
         mensaje = "Sobrepeso";
     }else if(imc>20){
         mensaje = "Normal";
     }else if(imc>18){
         mensaje = "Delgado";
     }else{
          mensaje = "Anorexia";
     }
        return mensaje;
     
     
    }
}
