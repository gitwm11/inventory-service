package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import ma.xproce.inventoryservice.service.CreatorManager;
import ma.xproce.inventoryservice.service.VideoManager;
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

//	@Bean
/*	public CommandLineRunner startDao(CreatorRepository creatorRepository, VideoRepository videoRepository)
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
*/
	@Bean
	public CommandLineRunner startService(CreatorManager creatorManager, VideoManager videoManager)
	{
		return args -> {


			Video video4 = new Video();
			video4.setName("video4");
			video4.setUrl("www.youtube.com/video4");
			video4.setDescription("content 4");
			video4.setDatePublication(new Date());
			video4.setCreator(null);


			Video video5 = new Video();
			video5.setName("video5");
			video5.setUrl("www.youtube.com/video5");
			video5.setDescription("content 5");
			video5.setDatePublication(new Date());
			video5.setCreator(null);

			Video video6 = new Video();
			video6.setName("video6");
			video6.setUrl("www.youtube.com/video6");
			video6.setDescription("content 6");
			video6.setDatePublication(new Date());
			video6.setCreator(null);

			videoManager.addVideo(video4);
			videoManager.addVideo(video5);
			videoManager.addVideo(video6);

			Creator creator4 = new Creator();
			creator4.setName("creator4");
			creator4.setEmail("creator4@xproce.ma");
			creator4.setVideos(List.of(video4));

			Creator creator5 = new Creator();
			creator5.setName("creator5");
			creator5.setEmail("creator5@xproce.ma");
			creator5.setVideos(List.of(video5));

			Creator creator6 = new Creator();
			creator6.setName("creator6");
			creator6.setEmail("creator6@xproce.ma");
			creator6.setVideos(List.of(video6));

			creatorManager.addCreator(creator4);
			creatorManager.addCreator(creator5);
			creatorManager.addCreator(creator6);
		};
	}

}
