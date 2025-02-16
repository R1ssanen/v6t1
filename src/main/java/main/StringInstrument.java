package main;

public class StringInstrument extends Instrument {
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    public void tune() {
        System.out.printf("%s soittimesta viritettiin %d kieltä!\n", this.manufacturer, this.numberOfStrings);
    }

}
