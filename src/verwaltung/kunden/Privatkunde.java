package verwaltung.kunden;

import java.util.ArrayList;

public class Privatkunde extends Kunde {
	
	
     public Privatkunde(String name, String vorname, Adresse adresse) {
		super(name, vorname,adresse);
	}
     
     @Override
     public void addAuftrag(Auftrag auftrag) {
     	this.auftraege.add((Privatauftraege) auftrag);
     }
     
     
     
     @Override
	 public String toString() {
		 return "ID: " + this.getID() + " Name: " + this.name + " Vorname: " + this.vorname;
	 }
     


}
