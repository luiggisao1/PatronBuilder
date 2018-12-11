/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
                 Ensamblador ensamblador = new Ensamblador();
		// AsusROGE
                
               
                RogComputadorBuilder roge = new RogComputadorBuilder();
		ensamblador.setBuilderComputador(roge);
                ensamblador.construirComputador();
                Computador computador1 = ensamblador.getComputador();
                
		
		// AsusZenbook
		ZenComputadorBuilder zen = new ZenComputadorBuilder();
		ensamblador.setBuilderComputador(zen);
                ensamblador.construirComputador();
		//Mostrar las caracteristicas de ambas computadoras 
                
                System.out.println(computador1);
                
                Computador computador2 = ensamblador.getComputador();
                System.out.println(computador2);

	}

}
