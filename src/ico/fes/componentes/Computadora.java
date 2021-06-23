/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author rodolfodom
 */
public class Computadora {
    private String marca;
    private String modelo;
    private CPU procesador;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, CPU procesador, Teclado teclado, Mouse mouse, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getProcesador() {
        return procesador;
    }

    public void setProcesador(CPU procesador) {
        this.procesador = procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", teclado=" + teclado + ", mouse=" + mouse + ", monitor=" + monitor + '}';
    }

    
    
    
}
