package pt.rumos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	
	@JsonProperty(value = "original_title")
    private String originalTitle;
	
	@JsonProperty(value = "overview")
	private String overview;
	
	@JsonProperty(value = "release_date")
	private String releaseDate;
	
	@JsonProperty(value = "poster_path")
	private String poster;
	
	@JsonProperty(value = "popularity")
	private String popularity;
	

	public String getPopularity() {
		return popularity;
	}


	public void setPopularity(String popularity) {
		
		if (popularity.length()>5){
		String test = popularity.substring(0, 5);
		this.popularity = test;}
	}


	public String getOverview() {
		return overview;
	}


	public void setOverview(String overview) {
		this.overview = overview;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getPoster() {
		return poster;
	}


	public void setPoster(String poster) {
		this.poster = poster;
	}


	public String getOriginalTitle() {
        return originalTitle;
    }


	public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }   
     

    @Override
	public String toString() {
		return "Movie [originalTitle=" + originalTitle + "]";
	}
    
}
