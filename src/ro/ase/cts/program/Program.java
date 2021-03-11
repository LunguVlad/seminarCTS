package ro.ase.cts.program;

import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException{
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pt angajati "+ Angajat.getSumaFinantata());
		System.out.println("Suma finantata pt student "+ Student.getSumaFinantata());
		List<Aplicant> listaAplicanti;
		Proiect proiect = new Proiect(81);
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
