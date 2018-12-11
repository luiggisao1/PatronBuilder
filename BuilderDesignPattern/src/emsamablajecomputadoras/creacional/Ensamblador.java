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
public class Ensamblador {
    private BuilderComputador builderComputador;
    
    
    
    
    public void construirComputador(){
        
    }

    public Computador getComputador() {
        return builderComputador.getComputador();
    }

    public void setBuilderComputador(BuilderComputador builderComputador) {
        this.builderComputador = builderComputador;
    }
    
    
    
}
