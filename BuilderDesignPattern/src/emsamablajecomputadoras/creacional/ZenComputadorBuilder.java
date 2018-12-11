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
public class ZenComputadorBuilder extends BuilderComputador{

    @Override
    public void crearModelo() {
        computador.setModelo("Zenbook");
    }

    @Override
    public void crearRam() {
        computador.setRam(16);
    }

    @Override
    public void crearAlmacenamiento() {
        computador.setAlmacenamiento(500);
    }

    @Override
    public void crearMainboard() {
        computador.getPlaca().setModelo("Prime");
        computador.getPlaca().setNumeracion("Z370");
    }

    @Override
    public void crearOs() {
   
        computador.getOs().setArquitectura(64);
        computador.getOs().setNombre("Windows Home");
        computador.getOs().setVersion("10");
    }
}
