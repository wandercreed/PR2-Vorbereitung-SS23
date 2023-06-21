package verwaltung.kunden;

public class Adresse {
	
	private int plz;
	private String ort;
	private String land;
	private String strasse;
	private int hausnr;
	
	public Adresse(int plz,String ort, String land,String strasse, int hausnr) {
		this.plz = plz;
		this.ort = ort;
		this.land = land;
		this.strasse = strasse;
		this.hausnr = hausnr;
	}
	


	@Override
	public String toString() {
		return "PLZ: " + this.plz + "\n Ort: " + this.ort + " Land: " + this.land + " Strasse: " + this .strasse + " HausNr.:" + this.hausnr;
		
	}

}
