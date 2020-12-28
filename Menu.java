package entitäten;
import javax.persistence.*;

@Entity
public class Menu {
	
	@Id
	private String menu_name;
	
	
	private Warenkorb Waren;

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public Warenkorb getWaren() {
		return Waren;
	}

	public void setWaren(Warenkorb waren) {
		Waren = waren;
	}

}
