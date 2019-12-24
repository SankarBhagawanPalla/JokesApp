package com.springworks.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetJokeService {

    private ChuckNorrisQuotes quote  = new ChuckNorrisQuotes();
    public String getJoke(){

        return quote.getRandomQuote();

    }
}
