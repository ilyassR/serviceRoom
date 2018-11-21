package ms1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms1.entity.Room;
import ms1.exceptions.ResourceNotFoundException;
import ms1.mapper.impl.ResponseDTOMapper;
import ms1.mapper.impl.RoomMapper;
import ms1.repository.RoomRepository;
import ms1.requestDTO.RoomRequestDTO;
import ms1.responseDTO.RoomResponseDTO;

@Service
public class RoomService {
	
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	RoomMapper roomMapper;
	
	@Autowired
	ResponseDTOMapper responseDTOMapper;
	
	public void updateRoomByIdService(RoomRequestDTO roomRequestDTO) throws ResourceNotFoundException {
		
		Room room = roomRepository.findById(roomRequestDTO.getNbRoomDTO()).
				orElseThrow(()->new ResourceNotFoundException("ressource not found!"));
		Room roomResult = new Room();
		
		if( room != null ) {
			
			roomResult.setNbRoom(roomRequestDTO.getNbRoomDTO());
			roomResult.setPrix(roomRequestDTO.getPrixDTO());
			
			if (room.getDescription()!=null) {
				roomResult.setDescription(roomRequestDTO.getDescriptionDTO());
			}
			
			roomRepository.save(roomResult);
		}
	}
	
	public RoomResponseDTO saveNewRoomService(RoomRequestDTO roomRequestDTO) {
				
		return this.responseDTOMapper.asResponseDTO(roomRepository.save(this.roomMapper.asEntity(roomRequestDTO)));
	}
	
	public List<RoomResponseDTO> getAllRoomsService(){
		return this.responseDTOMapper.asResponseDTOList(this.roomRepository.findAll());
	}
	
	public void deleteRoomByIdService(Long nbRoom) throws ResourceNotFoundException {
		Room room = roomRepository.findById(nbRoom).
				orElseThrow( () -> new ResourceNotFoundException("No room with id {} is found" + nbRoom ));
		roomRepository.delete(room);
	}

}
