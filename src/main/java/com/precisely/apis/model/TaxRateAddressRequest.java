/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.LocalTaxPreferences;
import com.precisely.apis.model.TaxRateAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxRateAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class TaxRateAddressRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private LocalTaxPreferences preferences;

  public static final String SERIALIZED_NAME_TAX_RATE_ADDRESSES = "taxRateAddresses";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_ADDRESSES)
  private List<TaxRateAddress> taxRateAddresses = new ArrayList<TaxRateAddress>();

  public TaxRateAddressRequest() { 
  }

  public TaxRateAddressRequest preferences(LocalTaxPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalTaxPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(LocalTaxPreferences preferences) {
    this.preferences = preferences;
  }


  public TaxRateAddressRequest taxRateAddresses(List<TaxRateAddress> taxRateAddresses) {
    
    this.taxRateAddresses = taxRateAddresses;
    return this;
  }

  public TaxRateAddressRequest addTaxRateAddressesItem(TaxRateAddress taxRateAddressesItem) {
    this.taxRateAddresses.add(taxRateAddressesItem);
    return this;
  }

   /**
   * Get taxRateAddresses
   * @return taxRateAddresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TaxRateAddress> getTaxRateAddresses() {
    return taxRateAddresses;
  }


  public void setTaxRateAddresses(List<TaxRateAddress> taxRateAddresses) {
    this.taxRateAddresses = taxRateAddresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateAddressRequest taxRateAddressRequest = (TaxRateAddressRequest) o;
    return Objects.equals(this.preferences, taxRateAddressRequest.preferences) &&
        Objects.equals(this.taxRateAddresses, taxRateAddressRequest.taxRateAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, taxRateAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateAddressRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    taxRateAddresses: ").append(toIndentedString(taxRateAddresses)).append("\n");
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

