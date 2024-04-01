package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.List;

public interface VideoManager {
    public Video addVideo(Video video);
    public Video updateVideo(Video video);
    public boolean deleteVideo(Video video);
    public List<Video> getAllVideos();
}
