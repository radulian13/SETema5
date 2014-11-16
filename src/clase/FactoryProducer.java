package clase;

/**
 * Aceasta este clasa prin care aleg ce tip de interfata voi folosi, IInstrument( cu ajutorul stringului choice)
 * Created by VoldHouse on 11/16/2014.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("INSTRUMENT")){
            return new InstrumentFactory();
        }
        else
            return null;
    }
}
