package subiecteACS.C.Ex3.clase;

public class Factura {
    private int numarPungi;
    private boolean cerePungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private float cotaTVA;
    private boolean platitorTVA;

    public Factura(){
        this.numarPungi = 0;
        this.cerePungi = false;
        this.plataCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0;
        this.platitorTVA = false;
    }

    public Factura(int numarPungi, boolean cerePungi, boolean plataCard, boolean cardFidelitate, float cotaTVA, boolean platitorTVA) {
        this.numarPungi = numarPungi;
        this.cerePungi = cerePungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
        this.platitorTVA = platitorTVA;
    }

    public int getNumarPungi() {
        return numarPungi;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public boolean isCerePungi() {
        return cerePungi;
    }

    public void setCerePungi(boolean cerePungi) {
        this.cerePungi = cerePungi;
    }

    public boolean isPlataCard() {
        return plataCard;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public float getCotaTVA() {
        return cotaTVA;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public boolean isPlatitorTVA() {
        return platitorTVA;
    }

    public void setPlatitorTVA(boolean platitorTVA) {
        this.platitorTVA = platitorTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", cerePungi=").append(cerePungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append(", platitorTVA=").append(platitorTVA);
        sb.append('}');
        return sb.toString();
    }
}
