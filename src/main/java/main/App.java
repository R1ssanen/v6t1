package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<Instrument>();
        Scanner scan = new Scanner(System.in);

        int choice = 1;
        while (choice != 0) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");
            choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                    int instrument = scan.nextInt();
                    System.out.println("Anna valmistajan nimi:");
                    String manufacturer = scan.next();
                    System.out.println("Anna hinta euroina:");
                    int price = scan.nextInt();

                    if (instrument == 1) instruments.add(new Guitar(manufacturer, price));
                    else if (instrument == 2) instruments.add(new Violin(manufacturer, price));
                    else if (instrument == 3) instruments.add(new Drum(manufacturer, price));
                    else;

                    System.out.println("Soitin lisätty listaan!");
                } break;

                case 2:
                    if (instruments.size() == 0) System.out.println("Ei lisättyjä soittimia.");
                    else {
                        for (Instrument instrument : instruments)
                            System.out.println(instrument.getDetails());
                    }
                    break;

                case 3:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof StringInstrument)
                            ((StringInstrument)instrument).tune();
                    }
                    break;

                case 4:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof Drum)
                            ((Drum)instrument).playBeat();
                    }
                    break;

                case 0:
                default: break;
            }
        }

        scan.close();
        System.out.println("Kiitos ohjelman käytöstä.");
    }
}
