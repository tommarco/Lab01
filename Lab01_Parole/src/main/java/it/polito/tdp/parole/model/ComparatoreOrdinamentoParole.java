package it.polito.tdp.parole.model;

import java.util.Comparator;

public class ComparatoreOrdinamentoParole implements Comparator <String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
	
	

}
