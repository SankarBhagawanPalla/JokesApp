package com.springworks.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetJokeServiceImpl implements GetJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //public GetJokeServiceImpl() {this.chuckNorrisQuotes = new ChuckNorrisQuotes(); }
    //Instead of new object creation, Creating bean using Java Configuration
    public GetJokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke(){

        return chuckNorrisQuotes.getRandomQuote();

    }
}
