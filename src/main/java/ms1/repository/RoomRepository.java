package ms1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ms1.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
