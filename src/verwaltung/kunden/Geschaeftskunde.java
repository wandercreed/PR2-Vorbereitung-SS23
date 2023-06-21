package verwaltung.kunden;

import java.util.ArrayList;

public class Geschaeftskunde extends Kunde{

    private ArrayList<GAuftrag> auftraege;
	public Geschaeftskunde(String name, String vorname, Adresse adresse) {
		super(name,vorname,adresse);
		auftraege = new ArrayList<>();
		
	}
	
	
	 @Override
	 public String toString() {
		 return "ID: " + this.getID() + " Name: " + this.name + " Vorname: " + this.vorname ;
	 }

}
