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
public class ValidarDni {

    public boolean validarDni(String Dni) {
        Pattern patronDni = Pattern.compile("^[0-9]{8}[a-zA-z]+$");
        Matcher matcherDni = patronDni.matcher(Dni);

        if (Dni.trim().length() != 0 && Dni.length() == 9 && matcherDni.matches()) {
            return true;
        }
        return false;
    }
}