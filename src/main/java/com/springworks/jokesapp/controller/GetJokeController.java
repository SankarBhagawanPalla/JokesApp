package com.springworks.jokesapp.controller;

import com.springworks.jokesapp.service.GetJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetJokeController {

    private GetJokeService getJokeService;
    @Autowired
    public GetJokeController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        String joke = getJokeService.getJoke();
        model.addAttribute("joke",joke );
        return "chucknorris";

    }

}
