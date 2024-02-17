package br.com.videofinder.api.thumbnails;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.videofinder.api.defaultDto.Default;
import br.com.videofinder.api.high.High;
import br.com.videofinder.api.maxres.Maxres;
import br.com.videofinder.api.medium.Medium;
import br.com.videofinder.api.standard.Standard;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
public class Thumbnails {

    @JsonProperty("default")

    public Standard standard;

    public Maxres maxres;

    public Default mydefault;

    public Medium medium;

    public High high;

}
