package br.com.videofinder.api.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.videofinder.api.video.VideoDto;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
@Service
public class VideoService {

    @Value("${api.url.host}")
    private String host;

    @Value("${api.url.path.video}")
    private String pathGetVideo;

    @Value("${api.key}")
    private String key;

    /**
     * @param id
     * @return VideoDto
     */
    public VideoDto getVideo(String id) {

        RestTemplate restTemplate = new RestTemplate();
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host)
                .path(pathGetVideo)
                .queryParam("part", "snippet")
                .queryParam("id", id)
                .queryParam("key", key)
                .build();

        ResponseEntity<VideoDto> responseEntity = restTemplate.getForEntity(uriComponents.toString(), VideoDto.class);
        System.out.println("Request video completed");
        return responseEntity.getBody();
    }
}
