package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareRaspunsProiect(Proiect proiect) {

		boolean esteAcceptat = punctaj >= proiect.getPragDeAcceptare();
		StringBuilder sb = new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume).append(" ");
		sb.append(esteAcceptat ? "a fost acceptat" : "a fost respins");
		System.out.println(sb.toString());
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}

	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}

	public void setVectorDenumiriProiecte(String[] denumiriProiecte,int nr_proiecte){
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public abstract float getSumaFinantare();

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Nume='").append(nume).append('\'');
		sb.append(", Prenume='").append(prenume).append('\'');
		sb.append(", Varsta=").append(varsta);
		sb.append(", Punctaj=").append(punctaj);
		sb.append(", Numar proiecte=").append(nr_proiecte);
		sb.append(", Denumiri proiecte=").append(Arrays.toString(denumiriProiecte));
		return sb.toString();
	}
}
