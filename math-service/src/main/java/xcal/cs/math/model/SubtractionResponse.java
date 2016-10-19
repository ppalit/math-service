package xcal.cs.math.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class SubtractionResponse {

  @JsonProperty
  @NotNull
  private Integer difference;

  public SubtractionResponse(int difference) {
    this.difference = difference;
  }

  @SuppressWarnings("unused") // for Jackson
  private SubtractionResponse() {}

  public int getDifference() {
    return difference;
  }
}
