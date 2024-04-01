package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoManager{

    @Autowired
    private VideoRepository videoRepository;
    @Override
    public Video addVideo(Video video) {
        try {
            return videoRepository.save(video);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Video updateVideo(Video video) {
        try {
            return videoRepository.save(video);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteVideo(Video video) {
        try {
            videoRepository.delete(video);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }
}
