package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @JsonProperty("id")
    private String id;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("title")
    private String title;
    @JsonProperty("fullTitle")
    private String fullTitle;
    @JsonProperty("year")
    private String year;
    @JsonProperty("image")
    private String image;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("imDbRating")
    private String imDbRating;
    @JsonProperty("imDbRatingCount")
    private String imDbRatingCount;

    public Movie(String id, String rank, String title, String fullTitle, String year, String image, String crew, String imDbRating, String imDbRatingCount) {
        this.id = id;
        this.rank = rank;
        this.title = title;
        this.fullTitle = fullTitle;
        this.year = year;
        this.image = image;
        this.crew = crew;
        this.imDbRating = imDbRating;
        this.imDbRatingCount = imDbRatingCount;
    }

    public Movie() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getImdbRating() {
        return imDbRating;
    }

    public void setImdbRating(String imDbRating) {
        this.imDbRating = imDbRating;
    }

    public String getImdbRatingCount() {
        return imDbRatingCount;
    }

    public void setImdbRatingCount(String imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", rank='" + rank + '\'' +
                ", title='" + title + '\'' +
                ", fullTitle='" + fullTitle + '\'' +
                ", year='" + year + '\'' +
                ", image='" + image + '\'' +
                ", crew='" + crew + '\'' +
                ", imDbRating='" + imDbRating + '\'' +
                ", imDbRatingCount='" + imDbRatingCount + '\'' +
                '}';
    }
}
