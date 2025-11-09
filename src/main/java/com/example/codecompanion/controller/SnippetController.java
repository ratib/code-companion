package com.example.codecompanion.controller;

import com.example.codecompanion.model.Snippet;
import com.example.codecompanion.service.SnippetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SnippetController {

    private final SnippetService snippetService;

    public SnippetController(SnippetService snippetService) {
        this.snippetService = snippetService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("snippets", snippetService.getAllSnippets());
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        List<Snippet> snippets = snippetService.searchSnippets(keyword);
        model.addAttribute("snippets", snippets);
        return "index";
    }

    @GetMapping("/filter")
    public String filter(@RequestParam String language, Model model) {
        List<Snippet> snippets = snippetService.getSnippetsByLanguage(language);
        model.addAttribute("snippets", snippets);
        return "index";
    }
}
