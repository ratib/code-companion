package com.example.codecompanion.repository;

import com.example.codecompanion.model.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnippetRepository extends JpaRepository<Snippet, Long> {
    List<Snippet> findByLanguageContainingIgnoreCase(String language);
    List<Snippet> findByDescriptionContainingIgnoreCase(String keyword);
}
