package entitäten;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Warenkorb {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(cascade= {CascadeType.REMOVE}, mappedBy="waren" )
	private ArrayList<Menu>menu = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Menu> getMenu() {
		return menu;
	}
	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}
	
	
}
