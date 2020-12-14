package it.polito.tdp.parole.model;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Parole {
	
	List <String> parole; 
	List <String> paroleOrdinate;
		
	public Parole() {
		
		parole= new LinkedList <String>();
		
	}
	
	public void addParola(String p) {
		
		parole.add(p);
		
	}
	
	public List<String> getElenco() {
		
		paroleOrdinate= new LinkedList <String>(parole);
		
		Collections.sort(paroleOrdinate,new ComparatoreOrdinamentoParole());
		
			
		return paroleOrdinate;
	}
	
	public void reset() {
		
	    parole.removeAll(parole);
	}
	public void delete(String p) {
		parole.remove(p);
	}

}
