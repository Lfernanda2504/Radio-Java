package com.aluracurso.radio.principal;

import com.aluracurso.radio.models.MyFavourites;
import com.aluracurso.radio.models.Podcast;
import com.aluracurso.radio.models.Song;

public class Principal {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Forever");
        mySong.setSinger("Kiss");

        Podcast myPodcast = new Podcast();
        myPodcast.setPresenter("Gabriela Aguilar");
        myPodcast.setTitle("Cafe.Tech");

        //song
        for (int i = 0; i < 100; i++) {
            mySong.like();
        }
        for (int i = 0; i < 2800; i++) {
            mySong.plays();

        }
        //podcast
        for (int i = 0; i < 100; i++) {
            myPodcast.like();
        }
        for (int i = 0; i < 8000; i++) {
            myPodcast.plays();

        }

        System.out.println("Total de reproducciones " + mySong.getTotalPlays());
        System.out.println("Total de me gustas " + mySong.getTotalLikes());

        MyFavourites favourites = new MyFavourites();
        favourites.addAudio(myPodcast);
        favourites.addAudio(mySong);

    }
}
