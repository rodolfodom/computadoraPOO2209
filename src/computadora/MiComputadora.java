/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author rodolfodom
 */
public class MiComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CPU miProcesador = new CPU("AMD", "Ryzen 3600", 3);
        Teclado miTeclado = new Teclado("Logitech", "g213", 165, 5);
        Monitor miMonitor = new Monitor("Asus", "x532", 22);
        Mouse miMouse = new Mouse("Logitech", "g352", "xxxxx");
        Computadora miPC = new Computadora("hp", "h256", miProcesador, miTeclado, miMouse, miMonitor);
        
        System.out.println(miPC.toString());
        
       
    }
    
}
