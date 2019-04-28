/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formegeometrice;

/**
 *
 * @author David PC
 */

public class Dreptunghi extends FormaGeo {

	private double lungime;
	private double latime;
	
	public Dreptunghi(String numeForma, double lungime, double latime) {
		super(numeForma);
		this.lungime = lungime;
		this.latime = latime;
	}

	@Override
	public double arie() {
		return lungime * latime;
	}

}
