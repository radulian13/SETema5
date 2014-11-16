package main;

import clase.AbstractFactory;
import clase.FactoryProducer;
import clase.InstrumentFactory;
import interfaces.IInstrument;

/**
 * Clasa Main care implementeaza ceea ce am lucrat pana acum, metodele si clasele folosite
 * Created by VoldHouse on 11/16/2014.
 */
public class Main {
    public static void main(String[] args){

        //Pt inceput se alege un tip de Factory, in cazul meu Instrument( deoarece aceasta este interfata implementata)
        AbstractFactory instrumentfactory=FactoryProducer.getFactory("INSTRUMENT");

        /**
         *Aici avem deja aleasa interfata si incepem sa selectam obiecte de tip IInstrument
         * Modelele de instrumente sunt diferentiate prin intermediul metodei produceInstrument
         * Se vor afisa la sfarsit rezultatele obtinute
         */
        IInstrument instrument=instrumentfactory.produceInstrument("Petrov","Polonia","alb","da");
        instrument.model();

        IInstrument instrument1=instrumentfactory.produceInstrument("Yamaha","Japonia","auriu","nu");
        instrument1.model();

        IInstrument instrument2=instrumentfactory.produceInstrument("Facade","Romania","negru","nu");
        instrument2.model();

    }
}
