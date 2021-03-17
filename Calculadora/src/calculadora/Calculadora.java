/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Oboe
 */
public class Calculadora {
    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return a+b;
    }
     
    public int restar(){
        return a-b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
}
