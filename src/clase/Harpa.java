package clase;

import interfaces.IInstrument;

/**
 * Created by VoldHouse on 11/16/2014.
 */
public class Harpa implements IInstrument {

   //Acestia sunt membrii clasei Harpe
    private String nume;
    private String tara;
    private String culoarea;
    private String clape;

    /**
     *
     * @param nume; Numele modelului de harpa
     * @param tara; Tara de provenienta a instrumentului harpa
     * @param culoarea; Culoarea instrumentului harpa
     * @param clape; String prin care se specifica daca instrumentul are clape sau nu
     */
    public Harpa(String nume, String tara, String culoarea, String clape) {
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
     * Metoda implementata diferit in functie de clasa
     */
    public void model() {
    System.out.println("Aceasta este o harpa. Are clape?\nR:"+clape+"\nTara de provenienta:"+tara+" ,culoarea:"+culoarea+" ,numele modelului:"+nume);
    }
}
