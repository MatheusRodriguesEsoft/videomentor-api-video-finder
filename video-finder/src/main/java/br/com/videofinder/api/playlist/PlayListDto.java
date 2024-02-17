package br.com.videofinder.api.playlist;

import java.io.Serializable;
import java.util.List;

import br.com.videofinder.api.item.Item;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
public class PlayListDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public String king;

    public String etag;

    public List<Item> items;

}
