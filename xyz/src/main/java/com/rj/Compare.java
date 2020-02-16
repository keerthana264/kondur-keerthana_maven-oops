package com.rj;    
import java.util.ArrayList;

	public class Compare {

		public static void sortByCost() {
			Collections.sort(Main.list, new Comparator<Production>() {
				public int compare(Production o1, Production o2) {
					if (o1.getCost() >= o2.getCost()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
		}

		public static void sortByWeight() {
			Collections.sort(Main.list, new Comparator<Production>() {
				public int compare(Production o1, Production o2) {
					if (o1.getWeight() >= o2.getWeight()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
		}

		public static void sortByConsSuga() {
			Collections.sort(Main.list, new Comparator<Production>() {
				public int compare(Production o1, Production o2) {
					if (o1.getConsSuga() >= o2.getConsSuga()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
		}

	}

}
