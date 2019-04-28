/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatiipachete;

/**
 *
 * @author David PC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import clasegenerice.Sort;
import formegeometrice.Cerc;
import formegeometrice.Dreptunghi;
import formegeometrice.FormaGeo;
import formegeometrice.Patrat;

public class TestFormaInterfata {
	private static BufferedReader in;
	public static void main(String[] args) throws IOException {
		//Citeste numarul de figuri
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Numarul de figuri: ");
		int numForme = Integer.parseInt(in.readLine());

		//citeste formele
		FormaGeo[] forme = new FormaGeo[numForme];
		for(int i = 0; i < numForme; ++i) {
			forme[i] = citesteForma();
		}

		//sortare si afisre
		Sort.sortareComp(forme);
		System.out.println("Sortarea dupa arie: ");
		for(int i = 0; i < numForme; ++i) {
			System.out.println(forme[i]);
		}
		for(int i = 1; i < numForme; ++i) {
			if(forme[i-1].comparaCu(forme[i]) == -1) {
				System.out.println(forme[i-1] + " are o arie mai mica decat " + forme[i]);
			} else {
				System.out.println(forme[i-1] + " are o arie egala sau mai mare ca " + forme[i]);
			}
		}
	}

	//creaza un obiect adecvat de tip FormaGeo functie de date de intrare.
	//utilizatorul introduce 'c', 'p' sau 'd' pentru a indica forma, apoi introduce
	//dimensiunile in caz de eroare se intoarce un cerc de raza 0

	private static FormaGeo citesteForma() throws IOException {

		double rad;
		double lg;
		double lat;
		String s;

		System.out.println("Introduceti tipul formei: ");

		do {
			s = in.readLine();
		} while (s.length() == 0);

		switch (s.charAt(0)) {
		case 'c':
			System.out.println("Raza cercului: ");
			rad = Integer.parseInt(in.readLine());
			return new Cerc(s, rad);
		case 'p':
			System.out.println("Latura patratului: ");
			lg = Integer.parseInt(in.readLine());
			return new Patrat(s, lg);
		case 'd':
			System.out.println("Lungimea si latimea dreptunghiului pe linii separate: ");
			lg = Integer.parseInt(in.readLine());
			lat = Integer.parseInt(in.readLine());
			return new Dreptunghi(s, lg, lat);
		default:
			System.err.println("Tastati c, p sau d: ");
			return new Cerc(s, 0);
		}
	}
}

