package verwaltung.kunden;

public class maintest {

	public static void main(String[] args) {

        Adresse a = new Adresse(1234,"a","b","c",15);
		Privatkunde kunde = new Privatkunde("Penis","Penis",a);
		Geschaeftskunde kunde2 = new Geschaeftskunde("Penis2", "Penis2", a);
		Privatauftraege auftrag = new Privatauftraege(1234,kunde);
		Auftrag auftrag2 = new Auftrag(4321,kunde2);
		kunde.addAuftrag(auftrag);
		kunde2.addAuftrag(auftrag2);
		
		
		for(Auftrag b : kunde.getAuftrage()) {
			System.out.println(b.toString());
		}
		
		for(Auftrag b : kunde2.getAuftrage()) {
			System.out.println(b.toString());
		}
		
        

	}

}
