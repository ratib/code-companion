package com.example.codecompanion;

import com.example.codecompanion.model.Snippet;
import com.example.codecompanion.service.SnippetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodeCompanionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeCompanionApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(SnippetService snippetService) {
        return (args) -> {
            snippetService.save(new Snippet("Java", "System.out.println(\"Hello, World!\");", "Print to console"));
            snippetService.save(new Snippet("Python", "print(\"Hello, World!\")", "Print to console"));
            snippetService.save(new Snippet("JavaScript", "console.log(\"Hello, World!\");", "Print to console"));
            snippetService.save(new Snippet("Go", "fmt.Println(\"Hello, World!\")", "Print to console"));
            snippetService.save(new Snippet("Rust", "println!(\"Hello, World!\");", "Print to console"));
        };
    }
}
