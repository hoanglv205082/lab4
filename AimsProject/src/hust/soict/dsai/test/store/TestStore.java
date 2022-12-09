package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class TestStore {

	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",1,19.95f);
		store.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",2,24.95f);
        store.addDVD(dvd2);
		DigitalVideoDisc khophim = new DigitalVideoDisc("Yua Mikami","300 tu the thieu nhi","Nhap mon xxx", 3,999.95f);
		store.addDVD(khophim);
		
        store.availableDVD();
        System.out.print("\n*************************************************\n");
		store.removeDVD(dvd1);
		System.out.print("\n*************************************************\n");
		store.availableDVD();
	}

}
