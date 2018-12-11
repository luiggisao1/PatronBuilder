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
                
		
		// AsusZenbook
		ZenComputadorBuilder zen = new ZenComputadorBuilder();
		ensamblador.setBuilderComputador(zen);
                ensamblador.construirComputador();
		//Mostrar las caracteristicas de ambas computadoras 
                Computador computador1 = ensamblador.getComputador();
		roge.toString();
                zen.toString();

	}

}
