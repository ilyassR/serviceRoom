package ms1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Room {
	@Id
	@GeneratedValue
	private Long nbRoom;
	
	private String description;
	
	@NotNull
	private float prix;

	public Room() {
		super();
	}

	public Room(Long nbRoom, String description, float prix) {
		super();
		this.nbRoom = nbRoom;
		this.description = description;
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Long getNbRoom() {
		return nbRoom;
	}

	public void setNbRoom(Long nbRoom) {
		this.nbRoom = nbRoom;
	}
	
}
