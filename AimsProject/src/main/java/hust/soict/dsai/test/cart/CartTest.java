//Nguyen Trung Kien 20226110
package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc d1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
        DigitalVideoDisc[] dvdList = {d1, d2, d3};
        cart.addDigitalVideoDisc(dvdList);
        cart.print();
        cart.searchById(1);
        cart.searchByTitle("The scorpio has no heart");
    }
}
