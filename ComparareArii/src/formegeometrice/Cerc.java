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

public class Cerc extends FormaGeo {

	private double raza;

	public Cerc(String s, double rad) {
		super(s);
		this.raza = rad;
	}

	@Override
	public double arie() {
		
		return Math.PI * Math.pow(this.raza, 2);
	}

}
