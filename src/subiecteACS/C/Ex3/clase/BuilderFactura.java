package subiecteACS.C.Ex3.clase;

public class BuilderFactura implements BuilderAbstract {
    private Factura factura;

    public BuilderFactura BuilderFactura() {
        this.factura = new Factura();
        return this;
    }

    public BuilderFactura setCerePungi(boolean cerePungi) {
        this.factura.setCerePungi(cerePungi);
        return this;
    }


    public BuilderFactura setNumarPungi(int numarPungi) {
        this.factura.setNumarPungi(numarPungi);
        return this;
    }

    public BuilderFactura setPlataCard(boolean plataCard) {
        this.factura.setPlataCard(plataCard);
        return this;
    }

    public BuilderFactura setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public BuilderFactura setCotaTVA(float cotaTVA) {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

    public BuilderFactura setPlatitorTVA(boolean platitorTVA) {
        this.factura.setPlatitorTVA(platitorTVA);
        return this;
    }

    @Override
    public Factura build() {
        return this.factura;
    }
}
