package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.service.VideoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VideoController {


    @Autowired
    private VideoManager videoManager;

    @GetMapping("/indexVideos")
    public String index(Model model){
        List<Video> videos = videoManager.getAllVideos();
        model.addAttribute("listVideos",videos);
        return "index";
    }
}
