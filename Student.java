package entitäten;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Student {
	
	@Id
	private long idNom;
	String Vorname;
	String Nachname;
	
	
	public long getIdNom() {
		return idNom;
	}
	public void setIdNom(long idNom) {
		this.idNom = idNom;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}

}
