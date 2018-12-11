/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author Administrador
 */
public abstract class BuilderComputador {
    protected Computador computador;
    
    public Computador getComputador(){
        return computador;
    }
    
    
    public abstract void crearModelo();
    public abstract void crearRam();
    public abstract void crearAlmacenamiento();
    public abstract void crearMainboard();
    public abstract void crearOs();
    
    public void createComputador(){
        computador = new Computador();
    }
    
}
