package clase;

import interfaces.IInstrument;

/**
 * Created by VoldHouse on 11/16/2014.
 */
public class Saxofon implements IInstrument {

    //Campurile clasei Saxofon
    private String nume;
    private String tara;
    private String culoarea;
    private String clape;

    /**
     *
     * @param nume; Acesta este numele modelului saxofonului
     * @param tara; Tara de provenienta a instrumentului saxofon
     * @param culoarea; Culoarea saxofonului
     * @param clape; String prin care verific daca instrumentul are clape sau nu
     */
    public Saxofon(String nume, String tara, String culoarea, String clape) {
        this.nume = nume;
        this.tara = tara;
        this.culoarea = culoarea;
        this.clape = clape;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    public String getClape() {
        return clape;
    }

    public void setClape(String clape) {
        this.clape = clape;
    }

    @Override
    /**
     * Metoda model implementata in mod diferit fata de celelalte clase
     */
    public void model() {
        System.out.println("Acesta este un saxofon. I: Are clape?\n R: "+clape+"\nCuloarea saxofonului este:"+culoarea+" ,iar tara de provenienta este: "+tara+"\n");
    }
}
