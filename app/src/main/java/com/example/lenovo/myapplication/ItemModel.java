package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 10/24/2016.
 */

public class ItemModel {

    String image_path, film_name, over_view ;

    public ItemModel(String overView, String film_name, String over_view) {
        this.film_name= film_name;
        this.image_path = overView;
        this.over_view =over_view;
    }

    public String getImagePath() {
        return image_path;
    }

    public void setImagePath(String overView) {
        this.image_path = overView;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getOver_view() {
        return over_view;
    }

    public void setOver_view(String over_view) {
        this.over_view = over_view;
    }
}
