package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository)
	{
		return args -> {

			Video video1 = new Video();
			video1.setName("video1");
			video1.setUrl("www.youtube.com/video1");
			video1.setDescription("content 1");
			video1.setDatePublication(new Date());


			Video video2 = new Video();
			video2.setName("video2");
			video2.setUrl("www.youtube.com/video2");
			video2.setDescription("content 2");
			video2.setDatePublication(new Date());

			Video video3 = new Video();
			video3.setName("video3");
			video3.setUrl("www.youtube.com/video3");
			video3.setDescription("content 3");

			videoRepository.saveAll(List.of(video1,video2,video3));

			Creator creator1 = new Creator();
			creator1.setName("creator1");
			creator1.setEmail("creator1@xproce.ma");
			creator1.setVideos(List.of(video1));

			Creator creator2 = new Creator();
			creator2.setName("creator2");
			creator2.setEmail("creator2@xproce.ma");
			creator2.setVideos(List.of(video2));

			Creator creator3 = new Creator();
			creator3.setName("creator3");
			creator3.setEmail("creator3@xproce.ma");
			creator3.setVideos(List.of(video3));

			creatorRepository.saveAll(List.of(creator1,creator2,creator3));

		};
	}

}
