/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Juan
 */
public class ValidarNombre {
    public boolean validarNombre(String NombreApellidos) {
        Pattern patronNomApe = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$");
        Matcher matcherNombre = patronNomApe.matcher(NombreApellidos);

        if(NombreApellidos.trim().length() != 0 && NombreApellidos.length()<=40 && matcherNombre.matches()){
            return true;
        }
        return false;
    }

}
