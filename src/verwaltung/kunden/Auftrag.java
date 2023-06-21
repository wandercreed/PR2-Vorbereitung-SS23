package verwaltung.kunden;

public class Auftrag {
    

	private int auftragsnr;
	private static int counter= 1000;
	private Kunde kunde;
	private int summe;
	
	public Auftrag(int summe,  Kunde kunde) {
		this.summe = summe;
		this.auftragsnr= counter++;
		this.kunde = kunde;
		
	}
	

	@Override
	public String toString() {
		return "AuftragsNr.: "+this.auftragsnr+ " Summe: "+ this.summe + "Kunde: " + this.kunde.toString();
		
	}
	
	public int getID() {
		return this.auftragsnr;
	}

	public  int getAuftragsnr() {
		return this.auftragsnr;
	}

	public  void setAuftragsnr(int auftragsnr) {
		this.auftragsnr = auftragsnr;
	}
	
}
