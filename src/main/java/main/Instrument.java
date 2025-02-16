package main;

public class Instrument {
    protected String manufacturer;
    protected int price;

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getDetails() {
        return String.format("Valmistaja: %s, Hinta: %de", this.manufacturer, this.price);
    }
}
