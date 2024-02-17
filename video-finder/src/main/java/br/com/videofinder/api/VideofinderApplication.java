package br.com.videofinder.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * VideofinderApplication
 * @author  Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since   16/02/2024
 */
@RestController
@RequestMapping("/")
@SpringBootApplication
public class VideofinderApplication {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(VideofinderApplication.class, args);
	}


	 /** 
     * @return String
     */
    @GetMapping
    public String hello(){
        return "Api Video Finder® V1.0";
    }

}
