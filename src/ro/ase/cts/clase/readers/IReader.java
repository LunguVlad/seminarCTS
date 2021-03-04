package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class IReader {
    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException ;

}
