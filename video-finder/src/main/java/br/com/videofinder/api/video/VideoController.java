package br.com.videofinder.api.video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.videofinder.api.services.VideoService;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ResponseBody
    @GetMapping(value = "/{id}")
    public ResponseEntity<VideoDto> getVideo(@PathVariable("id") String id) {
        VideoDto videoDto = videoService.getVideo(id);
        return new ResponseEntity<VideoDto>(videoDto, HttpStatus.OK);
    }
}
