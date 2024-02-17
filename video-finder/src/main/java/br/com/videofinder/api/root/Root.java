package br.com.videofinder.api.root;

import java.util.ArrayList;

import br.com.videofinder.api.item.Item;
import br.com.videofinder.api.pageInfo.PageInfo;

/**
 * @author Matheus Rodrigues <matheusrodrigues@outlook.com.br>
 * @version 1.0
 * @since 16/02/2024
 */
public class Root {

    public String kind;

    public String etag;

    public ArrayList<Item> items;

    public PageInfo pageInfo;

}
