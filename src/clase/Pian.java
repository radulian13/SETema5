package clase;

import interfaces.IInstrument;

/**
 * Created by VoldHouse on 11/16/2014.
 */
public class Pian implements IInstrument {

    //Campurile acestei clase
    private String nume;
    private String tara;
    private String culoarea;
    private String clape;

    /**
     *
     * @param nume; Acesta este numele modelului pianului
     * @param tara; Aceasta este tara de provenienta a instrumentului pian
     * @param culoarea; Se va alege culoarea instrumentului pian
     * @param clape; String prin care se verifica autenticitatea instrumentului
     */
    public Pian(String nume, String tara, String culoarea, String clape) {
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
    public void model() {
        //Aceasta este implementarea ptr clasa Pian a functiei model
    System.out.println("Acesta este un pian. Modelul este: "+nume+ " , iar tara de provenienta este: "+tara+"\n");
    }
}
