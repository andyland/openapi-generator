/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Query
 */
@JsonPropertyOrder({
  Query.JSON_PROPERTY_ID,
  Query.JSON_PROPERTY_OUTCOMES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Query {
  public static final String JSON_PROPERTY_ID = "id";
  protected Long id;

  /**
   * Gets or Sets outcomes
   */
  public enum OutcomesEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    SKIPPED("SKIPPED");

    private String value;

    OutcomesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutcomesEnum fromValue(String value) {
      for (OutcomesEnum b : OutcomesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTCOMES = "outcomes";
  protected List<OutcomesEnum> outcomes = new ArrayList<>(Arrays.asList(OutcomesEnum.SUCCESS, OutcomesEnum.FAILURE));

  public Query() {
  }

  public Query id(Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Query
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }

  public Query outcomes(List<OutcomesEnum> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public Query addOutcomesItem(OutcomesEnum outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>(Arrays.asList(OutcomesEnum.SUCCESS, OutcomesEnum.FAILURE));
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutcomesEnum> getOutcomes() {
    return outcomes;
  }


  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutcomes(List<OutcomesEnum> outcomes) {
    this.outcomes = outcomes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.id, query.id) &&
        Objects.equals(this.outcomes, query.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

