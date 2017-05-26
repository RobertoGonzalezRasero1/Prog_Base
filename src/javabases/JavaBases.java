/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class JavaBases {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Conectar b = new Conectar();
        int m ;
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion"));
            switch(m){
                case 1:
                    b.conexion();
                    break;
                case 2: 
                    b.crearTabla();
                    break;
                case 3:
                    b.insertarDatos();
                    break;
                case 4:
                    b.mostrar();
                    break;
                case 5:
                    b.añadir();
                    break;
                case 6:
                    b.borrar();
                    break;
                case 7:
                      b.cerrarBase();
                    break;
            }
            
            }while(m!=7);
  }
    
        }

