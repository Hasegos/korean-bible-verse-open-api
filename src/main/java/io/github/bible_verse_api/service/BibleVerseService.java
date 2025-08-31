package io.github.bible_verse_api.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bible_verse_api.model.BibleVerse;
import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class BibleVerseService {

    private List<BibleVerse> verses = Collections.emptyList();
    private final Random random = new Random();

    @PostConstruct
    public void init() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream is = new ClassPathResource("verses.json").getInputStream()){
            this.verses = objectMapper.readValue(is, new TypeReference<>() {});
        }
    }

    public BibleVerse getRandomVerse(){
        if(verses.isEmpty()){
            return new BibleVerse("로딩 실패", "0", "0", "성경 구절 데이터를 불러오는데 실패했습니다.");
        }

        return verses.get(random.nextInt(verses.size()));
    }
}