package ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ms1.repository.RoomRepository;

@SpringBootApplication
public class ServiceRoomApplication extends SpringBootServletInitializer {
//extends SpringBootServletInitializer
//	implements ApplicationRunner
	
	@Autowired
	RoomRepository roomRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceRoomApplication.class, args);
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		Room room1 = new Room(1L, "VIP", 100);
//		Room room2 = new Room(2L, "Normale", 50);
//		roomRepository.save(room1);
//		roomRepository.save(room2);
//	}
}
