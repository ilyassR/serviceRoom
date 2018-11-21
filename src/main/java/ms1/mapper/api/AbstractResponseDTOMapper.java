package ms1.mapper.api;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractResponseDTOMapper<ResponseDTO, Entity> {
	
	public abstract ResponseDTO asResponseDTO(Entity entity);
	
	public List<ResponseDTO> asResponseDTOList(Collection<? extends Entity> entities){
		return entities.stream().map(this::asResponseDTO).filter(e -> e != null).collect(Collectors.toList());
	}
}
