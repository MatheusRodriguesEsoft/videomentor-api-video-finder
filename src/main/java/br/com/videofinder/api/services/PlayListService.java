package br.com.videofinder.api.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.videofinder.api.playlist.PlayListDto;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
@Service
public class PlayListService {

    @Value("${api.url.host}")
    private String host;

    @Value("${api.url.path.playlist}")
    private String pathGetPlayList;

    @Value("${api.key}")
    private String key;

    /**
     * @param id
     * @return PlayListDto
     */
    public PlayListDto getPlayList(String id, Integer maxResults) {

        RestTemplate restTemplate = new RestTemplate();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host)
                .path(pathGetPlayList)
                .queryParam("part", "snippet")
                .queryParam("playlistId", id)
                .queryParam("key", key)
                .queryParam("maxResults", maxResults)
                .build();

        ResponseEntity<PlayListDto> responseEntity = restTemplate.getForEntity(uriComponents.toString(),
                PlayListDto.class);
        System.out.println("Request playlist completed");
        return responseEntity.getBody();

    }
}
