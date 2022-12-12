import java.util.ArrayList;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("ibuprofen", 10, 3, "04/05/2099");
        Pharmacy pharmacy2 = new Pharmacy("nurofen", 4, 99, "11/14/2055");
        Pharmacy pharmacy3 = new Pharmacy("paracetamol", 7, 58, "09/22/2034");
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        printPharmacyWithLowerPriceThanFive(pharmacies);
    }
    public static void printPharmacyWithLowerPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for (Pharmacy p : pharmacies) {
            if(p.price > 5) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }
}