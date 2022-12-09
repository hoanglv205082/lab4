package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestCart {

	

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",1,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",2,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc khophim = new DigitalVideoDisc("Yua Mikami","300 tu the thieu nhi","Nhap mon xxx", 3,999.95f);
		anOrder.addDigitalVideoDisc(khophim);
		
	    anOrder.displayCart();
	    
	    anOrder.search("The");
	    System.out.print("\n*************************************************\n");
	    anOrder.search("Wars");
	    System.out.print("\n*************************************************\n");
	    anOrder.search("Yua");
	    System.out.print("\n*************************************************\n");
	    anOrder.search("");
	    System.out.print("\n*************************************************\n");
	    anOrder.search("aaa");
	}

}
