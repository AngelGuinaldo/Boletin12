/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author aguinaldogonzalez
 */
public class Garaxe {
    private int numeroCoches;
    private int matricula;
    private int plazastotales;
    
    public void mensaje(){
        int respuesta = JOptionPane.showConfirmDialog(null,"BIENVENID@ A NUESTRO SISTEMA DE APARCAMIENTOS\n Quiere aparcar su coche? ");
        if(respuesta == JOptionPane.YES_OPTION){
            
        matricula =Integer.parseInt(JOptionPane.showInputDialog("Introduce la matricula de su coche")); 
            
        } 
    }
    
}
