/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorNombresRandom;

import java.util.Random;

/**
 *
 * @author Ana Teresa
 */
public class VectorManager {

    char vector[];
    private Random r;

    public VectorManager(char vector[]) {
        this.vector = vector;
        initRandom();
    }

    private void initRandom() {
        r = new Random();
    }

    /**
     * Método que se encarga de devolver una letra tipo char del vector en
     * cuestión según una posición generada de manera random
     *
     * @return un char con la letra
     */
    public char letraRandom() {
        int numeroPos = r.nextInt(vector.length);
        return vector[numeroPos];
    }
}
