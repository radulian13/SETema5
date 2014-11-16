package clase;

import interfaces.IInstrument;

/**
 * Created by VoldHouse on 11/16/2014.
 */
public abstract class AbstractFactory {

    /**
     *Aceasta este o clasa Abstracta pt a lua metoda de alegere a instrumentelor
     * @param nume; Numele modelului instrument
     * @param tara; Tara de provenienta a instrumentului
     * @param culoarea; Culoarea instrumentului
     * @param clape; String ptr identificarea instrumentelor
     */
    public abstract IInstrument produceInstrument(String nume, String tara, String culoarea, String clape);
    //Aceasta este metoda abstracta folosita care va fi implementata apoi in InstrumentFactory

}
