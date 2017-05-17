package pt.rumos.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class NewReleasesResponse {
	
	    
	    @JsonProperty(value = "results")
	    private List<Movie> films;

	    public List<Movie> getFilms() {
	        return films;
	    }

	    public void setFilms(List<Movie> films) {
	        this.films = films;
	    }

	    
	    
	   
	}

