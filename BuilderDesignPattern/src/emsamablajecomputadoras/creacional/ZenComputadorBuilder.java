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
        Mainboard placa = new Mainboard("Prime","Z370");
        
    }

    @Override
    public void crearOs() {
           SistemaOperativo os = new SistemaOperativo ("Windows Home",64,"10");

       
    }
}
