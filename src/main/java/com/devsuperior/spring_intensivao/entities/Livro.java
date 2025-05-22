package com.devsuperior.spring_intensivao.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String autor;

    @Column(name = "livro_year")
    private Integer year;
    private String genre;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Livro() {}

    public Livro(Long id, String title, String autor, Integer year, String genre, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public Integer getYear() {return year;}
    public void setYear(Integer year) {this.year = year;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    public String getImgUrl() {return imgUrl;}
    public void setImgUrl(String imgUrl) {this.imgUrl = imgUrl;}

    public String getShortDescription() {return shortDescription;}
    public void setShortDescription(String shortDescription) {this.shortDescription = shortDescription;}

    public String getLongDescription() {return longDescription;}
    public void setLongDescription(String longDescription) {this.longDescription = longDescription;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
