package br.com.lima.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSerial(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons") String seasons,
                         @JsonAlias("imdbRating") String rating,
                         @JsonAlias("Writer") String writer) {
}
