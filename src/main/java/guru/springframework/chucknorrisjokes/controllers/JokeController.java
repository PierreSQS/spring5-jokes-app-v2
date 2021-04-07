package guru.springframework.chucknorrisjokes.controllers;

import guru.springframework.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
