//Nguyen Trung Kien 20226110
package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc d1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
        store.addDVD(d1);
        store.addDVD(d2);
        store.addDVD(d3);
        store.print();
        store.removeDVD(d2);
        store.print();

    }
}
