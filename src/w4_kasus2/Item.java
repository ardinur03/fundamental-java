/**
 * Filename : Item.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w4_kasus2;

public class Item {
	private String name;

	private Item() {
		name = "Ipin";
	}

	public Item(String name) {
		this();
		System.out.println(this.name);
	}
}
