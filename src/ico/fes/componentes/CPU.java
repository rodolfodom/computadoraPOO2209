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
public class CPU {
    
    //atributuos
    private String marca;
    private String modelo;
    private int velocidadProcesador;
    
    //métodos constructores

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
    }
    
    //métodos de acceso

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

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }
    
    
    //métodos utilitarios

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesador=" + velocidadProcesador + '}';
    }
    
    
    
    
    
}
