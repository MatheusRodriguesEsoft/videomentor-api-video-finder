package br.com.videofinder.api.playlist;

import br.com.videofinder.api.services.PlayListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
@RestController
@RequestMapping("/playlists")
public class PlayListController {

    private PlayListService playListService;

    public PlayListController(PlayListService playListService) {
        this.playListService = playListService;
    }

    /**
     * @param id
     * @return ResponseEntity<PlayListDto>
     */
    @ResponseBody
    @GetMapping(value = "/{id}")
    public ResponseEntity<PlayListDto> getPlayList(@PathVariable("id") String id) {
        Integer maxResults = 25;
        PlayListDto playListDto = playListService.getPlayList(id, maxResults);
        return new ResponseEntity<PlayListDto>(playListDto, HttpStatus.OK);
    }

}
