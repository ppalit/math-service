package xcal.cs.math.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class SubtractionRequest {

  @JsonProperty
  @NotNull
  private Integer minuend;

  @JsonProperty
  @NotNull
  private Integer subtrahend;

  public SubtractionRequest(int minuend, int subtrahend) {
    this.minuend = minuend;
    this.subtrahend = subtrahend;
  }

  @SuppressWarnings("unused") // for Jackson
  private SubtractionRequest() {}

  public int getMinuend() {
    return minuend;
  }

  public int getSubtrahend() {
    return subtrahend;
  }
}
