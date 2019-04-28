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

public class Patrat extends FormaGeo {

	private double latura;

	public Patrat(String numeForma, double latura) {
		super(numeForma);
		this.latura = latura;
	}

	@Override
	public double arie() {
		return latura * latura;
	}
	
	
	
}