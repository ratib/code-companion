package com.example.codecompanion.service;

import com.example.codecompanion.model.Snippet;
import com.example.codecompanion.repository.SnippetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnippetService {

    private final SnippetRepository snippetRepository;

    public SnippetService(SnippetRepository snippetRepository) {
        this.snippetRepository = snippetRepository;
    }

    public List<Snippet> getAllSnippets() {
        return snippetRepository.findAll();
    }

    public List<Snippet> getSnippetsByLanguage(String language) {
        return snippetRepository.findByLanguageContainingIgnoreCase(language);
    }

    public List<Snippet> searchSnippets(String keyword) {
        return snippetRepository.findByDescriptionContainingIgnoreCase(keyword);
    }

    public void save(Snippet snippet) {
        snippetRepository.save(snippet);
    }
}
