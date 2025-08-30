package io.github.bible_verse_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BibleVerse {

    @JsonProperty("book")
    private String book;

    @JsonProperty("chapter")
    private String chapter;

    @JsonProperty("verse")
    private String verse;

    @JsonProperty("text")
    private String text;

    public BibleVerse(String book, String chapter, String verse, String text) {
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
        this.text = text;
    }

    @JsonProperty(value = "reference", access = JsonProperty.Access.READ_ONLY)
    public String getReference(){
        if(book == null || chapter == null || verse == null){
            return null;
        }
        return  book + " " + chapter + ":" + verse;
    }
}