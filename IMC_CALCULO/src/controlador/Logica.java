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

    ArrayList<Persona> arrayPersonas = new ArrayList<>();

    public Logica() {
    }

    public void altaPersonas(Persona persona) {
        arrayPersonas.add(persona);
    }

    public String listarPersonas() {

        String resul = "";
        for (Persona person : arrayPersonas) {

            String imcMsj = textoIMC(person.getImc());
            resul += person.toString() + imcMsj + "\n";

        }
        return resul;
    }

    public void calcularImc(Persona persona) {

        persona.setImc((persona.getPeso() / (persona.getTalla()) * persona.getTalla()));

    }

    public String calcularMediaImc() {

        double contador = 0;
        double sum = 0;
        for (Persona person : arrayPersonas) {

            sum += person.getImc();
            contador++;

        }

        if (contador == 0) {
            return "No hay datos para calcular el IMC promedio.";
        } else {
            double media = sum / contador;
            String resultado = "La media de IMC es " + media;
            return resultado;
        }

    }

    private String textoIMC(double imc) {
        String mensaje;
        if (imc > 40) {
            mensaje = "Obesidad Tipo 3";
        } else if (imc > 35) {
            mensaje = "Obesidad Tipo 2";
        } else if (imc > 30) {
            mensaje = "Obesidad Tipo 1";
        } else if (imc > 27) {
            mensaje = "Sobrepeso";
        } else if (imc > 20) {
            mensaje = "Normal";
        } else if (imc > 18) {
            mensaje = "Delgado";
        } else {
            mensaje = "Anorexia";
        }
        return mensaje;

    }
}
