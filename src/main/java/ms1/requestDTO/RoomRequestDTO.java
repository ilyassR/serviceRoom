package ms1.requestDTO;

import io.swagger.annotations.ApiModelProperty;

public class RoomRequestDTO {
	
	private Long nbRoomDTO;
	
	@ApiModelProperty(notes="Description de la chambre: Economique, Normale, VIP.")
	private String descriptionDTO;
	
	private float prixDTO;
	
	public Long getNbRoomDTO() {
		return nbRoomDTO;
	}
	
	public void setNbRoomDTO(Long nbRoomDTO) {
		this.nbRoomDTO = nbRoomDTO;
	}
	
	public String getDescriptionDTO() {
		return descriptionDTO;
	}
	
	public void setDescriptionDTO(String descriptionDTO) {
		this.descriptionDTO = descriptionDTO;
	}
	
	public float getPrixDTO() {
		return prixDTO;
	}
	
	public void setPrixDTO(float prixDTO) {
		this.prixDTO = prixDTO;
	}
	
}
