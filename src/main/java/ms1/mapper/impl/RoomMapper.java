package ms1.mapper.impl;

import org.springframework.stereotype.Component;

import ms1.entity.Room;
import ms1.mapper.api.AbstractEntityMapper;
import ms1.requestDTO.RoomRequestDTO;

@Component
public class RoomMapper extends AbstractEntityMapper<Room, RoomRequestDTO> {

	@Override
	public Room asEntity(RoomRequestDTO roomRequestDTO) {
		Room room = new Room();
		
		room.setNbRoom(roomRequestDTO.getNbRoomDTO());
		room.setPrix(roomRequestDTO.getPrixDTO());
		
		if(roomRequestDTO.getDescriptionDTO() != null)
			room.setDescription(roomRequestDTO.getDescriptionDTO());
		
		return room;
	}

	

}
