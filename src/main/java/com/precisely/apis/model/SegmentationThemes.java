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
import com.precisely.apis.model.LifeStyleTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SegmentationThemes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class SegmentationThemes {
  public static final String SERIALIZED_NAME_LIFE_STYLE_THEME = "lifeStyleTheme";
  @SerializedName(SERIALIZED_NAME_LIFE_STYLE_THEME)
  private LifeStyleTheme lifeStyleTheme;

  public SegmentationThemes() { 
  }

  public SegmentationThemes lifeStyleTheme(LifeStyleTheme lifeStyleTheme) {
    
    this.lifeStyleTheme = lifeStyleTheme;
    return this;
  }

   /**
   * Get lifeStyleTheme
   * @return lifeStyleTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LifeStyleTheme getLifeStyleTheme() {
    return lifeStyleTheme;
  }


  public void setLifeStyleTheme(LifeStyleTheme lifeStyleTheme) {
    this.lifeStyleTheme = lifeStyleTheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentationThemes segmentationThemes = (SegmentationThemes) o;
    return Objects.equals(this.lifeStyleTheme, segmentationThemes.lifeStyleTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeStyleTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentationThemes {\n");
    sb.append("    lifeStyleTheme: ").append(toIndentedString(lifeStyleTheme)).append("\n");
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

