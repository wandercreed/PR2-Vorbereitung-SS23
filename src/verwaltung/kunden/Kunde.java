package verwaltung.kunden;

import java.util.ArrayList;

public class Kunde {

	 private int kundeID;
	 private static int counter = 100;
	 protected String name;
	 protected String vorname;
	 protected Adresse kundenAdresse;
	 protected ArrayList<Auftrag> auftraege;
	 
	 
	 public Kunde(String name, String vorname, Adresse adresse){
		 this.auftraege = new ArrayList<>();
		 this.kundenAdresse = adresse;
		 this.name= name;
		 this.vorname= vorname;
		counter++;
		this.kundeID = counter;
	 }
	 
	 
	 
    public void addAuftrag(Auftrag auftrag) {
    	this.auftraege.add(auftrag);
    }
    
    public ArrayList<Auftrag> getAuftrage() {
    	return this.auftraege;
    }
    
	public String getAdresse() {
		return this.kundenAdresse.toString();
	}
	
	
	public void setName(String name) {
		 this.name=name;
	 }
	 
	 public int getID() {
		 return this.kundeID;
	 }
	 
	 public void setVorname(String vorname) {
		 this.vorname= vorname;
	 }
	 
	 @Override
	 public String toString() {
		 return "ID: " + this.kundeID + " Name: " + this.name + " Vorname: " + this.vorname;
	 }



}
