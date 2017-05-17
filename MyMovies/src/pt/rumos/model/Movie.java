package pt.rumos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	
	@JsonProperty(value = "original_title")
    private String originalTitle;

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
