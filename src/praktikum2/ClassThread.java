/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import praktikum1.ThreadTwo;

/**
 *
 * @author choirulandriansyah
 */
public class ClassThread implements Runnable{
    private Generator generator;
    private final String name;
    public int jumlah;
    
    public ClassThread(String name, int jumlah){
        this.generator = new Generator(10,100);
        this.name = name;
        this.jumlah = jumlah;
    }
    
    
    @Override
    public void run() {
        for(int i = 0; i<jumlah; i++){
            generator.generateRandomNumber(name + "-"+i);
        }
    }
}
