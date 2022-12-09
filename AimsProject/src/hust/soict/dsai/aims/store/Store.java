package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	
		ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
		public Store() {
			super();
		}
		
		public ArrayList<DigitalVideoDisc> getItemsInStore() {
			return itemsInStore;
		}

		public void setItemsInStore(ArrayList<DigitalVideoDisc> itemsInStore) {
			this.itemsInStore = itemsInStore;
		}

		public void addDVD(DigitalVideoDisc dvd) {
			itemsInStore.add(dvd);
		}
		
		public void removeDVD(DigitalVideoDisc dvd) {
			Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
			
				DigitalVideoDisc tmp = itr.next();
				if(tmp.getId() == dvd.getId()) {
					itr.remove();
				
			}
		}
		
		public void availableDVD() {
			Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
			while(itr.hasNext()) {
				DigitalVideoDisc tmp = itr.next();
				System.out.println(tmp.printDetail());
			}
		}
		
	}
	



