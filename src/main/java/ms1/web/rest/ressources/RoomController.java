package ms1.web.rest.ressources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ms1.exceptions.ResourceNotFoundException;
import ms1.requestDTO.RoomRequestDTO;
import ms1.service.RoomService;

@RestController
@RequestMapping("/room")
@Api(value="Room management module")
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@PutMapping("/update")
	@ApiOperation(value="Update room")
	public ResponseEntity<?> updateRoom(@Valid @RequestBody RoomRequestDTO roomRequestDTO) throws ResourceNotFoundException {
		
		roomService.updateRoomByIdService(roomRequestDTO);

		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/save")
	@ApiOperation(value="Save room", response=RoomRequestDTO.class)
	public ResponseEntity<?> saveRoom(@Valid @RequestBody RoomRequestDTO roomRequestDTO){
				
		return ResponseEntity.ok(this.roomService.saveNewRoomService(roomRequestDTO));
		
	}
	
	@GetMapping("/getRooms")
	public ResponseEntity<List<?>> getRooms(){
		
		return new ResponseEntity<List<?>>(roomService.getAllRoomsService(),HttpStatus.OK);
	}
	
	@GetMapping("/delete")
	public ResponseEntity<?> deleteRoomById(@RequestParam Long nbRoom) throws ResourceNotFoundException{
		roomService.deleteRoomByIdService(nbRoom);
		return ResponseEntity.noContent().build();
	}
}
