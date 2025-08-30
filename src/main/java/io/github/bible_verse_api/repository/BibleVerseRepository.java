package io.github.bible_verse_api.repository;

import io.github.bible_verse_api.model.BibleVerse;

import java.util.List;

public interface BibleVerseRepository {
    List<BibleVerse> findAll();
}