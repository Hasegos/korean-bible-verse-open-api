package io.github.bible_verse_api.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bible_verse_api.model.BibleVerse;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
@Primary
public class JsonBibleVerseRepository implements BibleVerseRepository{
    private final List<BibleVerse> verses;

    public JsonBibleVerseRepository(ObjectMapper om) throws IOException{
        try(var is = new ClassPathResource("verses.json").getInputStream()){
            this.verses = List.of(om.readValue(is,BibleVerse[].class));
        }
    }

    @Override
    public List<BibleVerse> findAll() {
        return verses;
    }
}