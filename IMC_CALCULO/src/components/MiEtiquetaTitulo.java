/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author juanj.hermon
 */
public class MiEtiquetaTitulo extends JLabel {
    
    public MiEtiquetaTitulo()
    {
        super();
        this.setBorder(null);
        this.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12));
        this.setForeground(Color.BLACK);
        this.setBackground(Color.LIGHT_GRAY);
        this.setText(this.getText().toUpperCase());
    }
    
}
