package com.aluracurso.radio.models;

public class MyFavourites {
    public void addAudio(Audio audio){
        if(audio.getClassification()>8){
            System.out.println(audio.getTitle() +" Es uno de los favoritos");
        }else {
            System.out.println(audio.getTitle() +" No está dentro de los favoritos");
        }
    }
}
