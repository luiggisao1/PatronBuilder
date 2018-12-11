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
public class RogComputadorBuilder extends BuilderComputador{

    @Override
    public void crearModelo() {
        computador.setModelo("ROG");
    }    

    @Override
    public void crearRam() {
        computador.setRam(32);
    }

    @Override
    public void crearAlmacenamiento() {
        computador.setAlmacenamiento(1000);
    }

    @Override
    public void crearMainboard() {
        computador.getPlaca().setModelo("Strix");
        computador.getPlaca().setNumeracion("x99");
    }


    @Override
    public void crearOs() {
        computador.getOs().setArquitectura(64);
        computador.getOs().setNombre("Windows PRO");
        computador.getOs().setVersion("10");
    }
    
   
    
}
