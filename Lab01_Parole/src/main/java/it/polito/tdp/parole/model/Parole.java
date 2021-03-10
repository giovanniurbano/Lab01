package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> parole;
	
	public Parole() {
		parole = new ArrayList<String>();
	}
	
	public int size() {
		return parole.size();
	}
	
	public void addParola(String p) {
		if(!parole.contains(p))
			parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void cancella(String p) {
		parole.remove(p);
	}
	
	public String toString() {
		String res = "";
    	for(String s : parole) {
    		res += s + "\n";
    	}
    	return res;
	}

}
