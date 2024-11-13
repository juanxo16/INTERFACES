/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author juanj.hermon
 */
public class MiBotonIMC extends JButton implements MouseListener{

    public MiBotonIMC(){
        super();
        setFont(new Font("Tahoma", 1, 14));
        setForeground(Color.white);
        setBackground(new Color(50,108,168));
        setBorder(null);
        addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        String eti = "";
        
        if(e.getButton() == MouseEvent.BUTTON1){
        eti= "Izquierdo";
        System.out.println("Ha pulsado el boton del raton " + eti);
        
        }else if( e.getButton() == MouseEvent.BUTTON3){
            eti= "Derecho";
            System.out.println("Ha pulsado el boton del raton " + eti);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.CYAN);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
       setBackground(Color.BLUE);
    }
 
    
    
}
