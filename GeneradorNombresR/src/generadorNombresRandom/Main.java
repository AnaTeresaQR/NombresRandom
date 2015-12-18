/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorNombresRandom;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        char vector1[] = {'a', 'e', 'o'};

        VectorManager vm = new VectorManager(vector1);

        System.out.println("Letra:  " + vm.letraRandom());

    }
}
