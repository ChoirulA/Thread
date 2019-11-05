/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import praktikum1.ThreadOne;
import praktikum1.ThreadTwo;

/**
 *
 * @author choirulandriansyah
 */
public class Praktikum2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ClassThread("Thread",2));
        t.start();
    }
}
