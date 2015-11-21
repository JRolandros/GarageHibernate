package fr.esigelec.garage;
/**
 * 
 * @author Rolland AKAMBA
 *
 */

public class Voiture {
	private int id; //id used to store the geneted id
	private String immatriculation; //immatriculation
	private String modele; // car model
	private int anneeConstruction; //construction year
	private int km; //kilometers
	
	public Voiture(){
		this.km=0;
		this.anneeConstruction=0;
	}

	public String toString() {
		return "\nVoiture\nid=" + id + "\nimmatriculation=" + immatriculation + "\nmodele=" + modele
				+ "\nanneeConstruction=" + anneeConstruction + "\nkm=" + km + "\ngetClass()=" + getClass();
	}
	
	
	/**
	 * @param id
	 * @param immatriculation
	 * @param modele
	 * @param anneeConstruction
	 * @param km
	 */
	public Voiture(int id, String immatriculation, String modele, int anneeConstruction, int km) {
		super();
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.anneeConstruction = anneeConstruction;
		this.km = km;
	}

	
	//Getters and setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}
	/**
	 * @param immatriculation the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		//TODO mettre les expression de controle du format du matricule
		this.immatriculation = immatriculation;
	}
	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}
	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}
	/**
	 * @return the anneeConstruction
	 */
	public int getAnneeConstruction() {
		return anneeConstruction;
	}
	/**
	 * @param anneeConstruction the anneeConstruction to set
	 */
	public void setAnneeConstruction(int anneeConstruction) {
		//TODO vérifier l'année
		this.anneeConstruction = anneeConstruction;
	}
	/**
	 * @return the km
	 */
	public int getKm() {
		return km;
	}
	/**
	 * @param km the km to set
	 */
	public void setKm(int km) {
		if(km>=0)
			this.km += km;
		else
			System.out.println("Le km doit etre positif!");
	}

	public static void main(String arg[]){
		Voiture v=new Voiture(10,"SG-456-AF","Toyota",523,1895);
		System.out.println(v.toString());
		v.toString();
	}
}
