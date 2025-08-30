package io.github.bible_verse_api.controller;

import io.github.bible_verse_api.model.BibleVerse;
import io.github.bible_verse_api.service.BibleVerseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class VerseController {

    private final BibleVerseService bibleVerseService;

    @GetMapping("/verse")
    public ResponseEntity<BibleVerse> random(){
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(Duration.ofSeconds(5)).cachePublic())
                .body(bibleVerseService.getRandomVerse());
    }
}