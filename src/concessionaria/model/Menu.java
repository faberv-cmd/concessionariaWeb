package concessionaria.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Menu implements Iterable {

	Collection<MenuItem> elenco;
	
	public Menu() {
		elenco = new ArrayList<MenuItem>();
	}

	public void add(MenuItem item) {
		elenco.add(item);
	}

	@Override
	public String toString() {
		return "Menu [elenco=" + elenco + "]";
	}

	@Override
	public Iterator iterator() {
		return this.elenco.iterator();
	}
	
}

