/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Greatschools
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class Greatschools {
  public static final String SERIALIZED_NAME_GS_ID = "gsId";
  @SerializedName(SERIALIZED_NAME_GS_ID)
  private String gsId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private String rating;

  public Greatschools() { 
  }

  public Greatschools gsId(String gsId) {
    
    this.gsId = gsId;
    return this;
  }

   /**
   * Get gsId
   * @return gsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGsId() {
    return gsId;
  }


  public void setGsId(String gsId) {
    this.gsId = gsId;
  }


  public Greatschools url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Greatschools rating(String rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRating() {
    return rating;
  }


  public void setRating(String rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Greatschools greatschools = (Greatschools) o;
    return Objects.equals(this.gsId, greatschools.gsId) &&
        Objects.equals(this.url, greatschools.url) &&
        Objects.equals(this.rating, greatschools.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gsId, url, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greatschools {\n");
    sb.append("    gsId: ").append(toIndentedString(gsId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

