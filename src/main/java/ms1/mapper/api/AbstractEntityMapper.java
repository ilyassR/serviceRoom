package ms1.mapper.api;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

public abstract class AbstractEntityMapper<Entity, RequestDTO> {
	
	public abstract Entity asEntity(RequestDTO requestDTO);
	
	public List<Entity> asRoomList(Collection<? extends RequestDTO> roomRequestDTO){
		if ( CollectionUtils.isEmpty(roomRequestDTO) ) {
			return null;
		}
		return roomRequestDTO.stream().map(this::asEntity).filter(e -> e != null).collect(Collectors.toList());
	}
	
}
