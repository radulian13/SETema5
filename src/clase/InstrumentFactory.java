package clase;

import interfaces.IInstrument;

/**
 * Clasa pentru a suprascrie metoda abstracta din AbstractFactory si pt a diferentia Instrumentele
 * Created by VoldHouse on 11/16/2014.
 */
public class InstrumentFactory extends AbstractFactory {
    @Override
    public IInstrument produceInstrument(String nume, String tara, String culoarea, String clape) {
        {
            if(clape=="da") {
                return new Pian(nume, tara, culoarea, clape);
            }else if(clape=="nu" && tara=="Romania")
            {
                return new Harpa(nume,"Romania",culoarea,clape);
            }
            else if(clape=="nu" && tara!="Romania") {
                return new Saxofon(nume, tara, culoarea, clape);
            }else {
                return null;
            }
        }
    }
}
