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
import com.precisely.apis.model.TaxRateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxResponses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class TaxResponses {
  public static final String SERIALIZED_NAME_TAX_RESPONSES = "taxResponses";
  @SerializedName(SERIALIZED_NAME_TAX_RESPONSES)
  private List<TaxRateResponse> taxResponses = null;

  public TaxResponses() { 
  }

  public TaxResponses taxResponses(List<TaxRateResponse> taxResponses) {
    
    this.taxResponses = taxResponses;
    return this;
  }

  public TaxResponses addTaxResponsesItem(TaxRateResponse taxResponsesItem) {
    if (this.taxResponses == null) {
      this.taxResponses = new ArrayList<TaxRateResponse>();
    }
    this.taxResponses.add(taxResponsesItem);
    return this;
  }

   /**
   * Get taxResponses
   * @return taxResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxRateResponse> getTaxResponses() {
    return taxResponses;
  }


  public void setTaxResponses(List<TaxRateResponse> taxResponses) {
    this.taxResponses = taxResponses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxResponses taxResponses = (TaxResponses) o;
    return Objects.equals(this.taxResponses, taxResponses.taxResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxResponses {\n");
    sb.append("    taxResponses: ").append(toIndentedString(taxResponses)).append("\n");
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

