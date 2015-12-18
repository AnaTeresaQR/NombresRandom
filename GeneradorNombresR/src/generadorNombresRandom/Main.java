/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorNombresRandom;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        while (true) {
            int tamanno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número máximo que desea el nombre generado"));

            GeneradorNombre gn = new GeneradorNombre();
            JOptionPane.showMessageDialog(null, "El nombre resultante es: \n" + gn.crearNombre(tamanno));
        }
    }
}
