package ms1.mapper.impl;

import org.springframework.stereotype.Component;

import ms1.entity.Room;
import ms1.mapper.api.AbstractResponseDTOMapper;
import ms1.responseDTO.RoomResponseDTO;

@Component
public class ResponseDTOMapper extends AbstractResponseDTOMapper<RoomResponseDTO, Room> {

	@Override
	public RoomResponseDTO asResponseDTO(Room room) {
		RoomResponseDTO roomResponseDTO = new RoomResponseDTO();
		
		roomResponseDTO.setNbRoomDTO(room.getNbRoom());
		roomResponseDTO.setPrixDTO(room.getPrix());
		if(room.getDescription() != null) {
			roomResponseDTO.setDescriptionDTO(room.getDescription());
		} else {
			roomResponseDTO.setDescriptionDTO("");
		}
		
		return roomResponseDTO;
	}

	

}
