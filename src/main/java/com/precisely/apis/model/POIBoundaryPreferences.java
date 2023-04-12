/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 15.0.0
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
 * POIBoundaryPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class POIBoundaryPreferences {
  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_SIC_CODE = "sicCode";
  @SerializedName(SERIALIZED_NAME_SIC_CODE)
  private String sicCode;

  public static final String SERIALIZED_NAME_NAICS_CODE = "naicsCode";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  private String naicsCode;

  public POIBoundaryPreferences() { 
  }

  public POIBoundaryPreferences categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public POIBoundaryPreferences sicCode(String sicCode) {
    
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSicCode() {
    return sicCode;
  }


  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }


  public POIBoundaryPreferences naicsCode(String naicsCode) {
    
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Get naicsCode
   * @return naicsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNaicsCode() {
    return naicsCode;
  }


  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIBoundaryPreferences poIBoundaryPreferences = (POIBoundaryPreferences) o;
    return Objects.equals(this.categoryCode, poIBoundaryPreferences.categoryCode) &&
        Objects.equals(this.sicCode, poIBoundaryPreferences.sicCode) &&
        Objects.equals(this.naicsCode, poIBoundaryPreferences.naicsCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, sicCode, naicsCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIBoundaryPreferences {\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
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

