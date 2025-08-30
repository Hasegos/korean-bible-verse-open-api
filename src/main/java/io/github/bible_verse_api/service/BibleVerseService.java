package io.github.bible_verse_api.service;

import io.github.bible_verse_api.model.BibleVerse;
import io.github.bible_verse_api.repository.BibleVerseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class BibleVerseService {

    private final BibleVerseRepository repo;
    private final Random random = ThreadLocalRandom.current();

    public BibleVerse getRandomVerse(){
        var list = repo.findAll();
        return list.get(random.nextInt(list.size()));
    }
}