/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Juan Jose
 */
public class MiCuadrodeTextoFrm extends JTextField implements FocusListener{

    public MiCuadrodeTextoFrm(){
        super();
        setBorder(BorderFactory.createLineBorder(Color.BLACK, CENTER, true));
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
         setFont(new Font("Nirmala UI", Font.BOLD, 14));
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.GRAY);
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(Color.WHITE);
    }
 
    
}