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
import com.precisely.apis.model.SpecialPurposeDistrictTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SalesTax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class SalesTax {
  public static final String SERIALIZED_NAME_SPECIAL_TAX_RULES_APPLIED = "specialTaxRulesApplied";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TAX_RULES_APPLIED)
  private Boolean specialTaxRulesApplied;

  public static final String SERIALIZED_NAME_SPECIAL_TAX_RULES_DESCRIPTOR = "specialTaxRulesDescriptor";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TAX_RULES_DESCRIPTOR)
  private String specialTaxRulesDescriptor;

  public static final String SERIALIZED_NAME_TOTAL_TAX_RATE = "totalTaxRate";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_RATE)
  private Double totalTaxRate;

  public static final String SERIALIZED_NAME_TOTAL_TAX_AMOUNT = "totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_AMOUNT)
  private Double totalTaxAmount;

  public static final String SERIALIZED_NAME_STATE_TAX_RATE = "stateTaxRate";
  @SerializedName(SERIALIZED_NAME_STATE_TAX_RATE)
  private Double stateTaxRate;

  public static final String SERIALIZED_NAME_STATE_TAX_AMOUNT = "stateTaxAmount";
  @SerializedName(SERIALIZED_NAME_STATE_TAX_AMOUNT)
  private Double stateTaxAmount;

  public static final String SERIALIZED_NAME_COUNTY_TAX_RATE = "countyTaxRate";
  @SerializedName(SERIALIZED_NAME_COUNTY_TAX_RATE)
  private Double countyTaxRate;

  public static final String SERIALIZED_NAME_COUNTY_TAX_AMOUNT = "countyTaxAmount";
  @SerializedName(SERIALIZED_NAME_COUNTY_TAX_AMOUNT)
  private Double countyTaxAmount;

  public static final String SERIALIZED_NAME_MUNICIPAL_TAX_RATE = "municipalTaxRate";
  @SerializedName(SERIALIZED_NAME_MUNICIPAL_TAX_RATE)
  private Double municipalTaxRate;

  public static final String SERIALIZED_NAME_MUNICIPAL_TAX_AMOUNT = "municipalTaxAmount";
  @SerializedName(SERIALIZED_NAME_MUNICIPAL_TAX_AMOUNT)
  private Double municipalTaxAmount;

  public static final String SERIALIZED_NAME_SPDS_TAX = "spdsTax";
  @SerializedName(SERIALIZED_NAME_SPDS_TAX)
  private List<SpecialPurposeDistrictTax> spdsTax = null;

  public SalesTax() { 
  }

  public SalesTax specialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    
    this.specialTaxRulesApplied = specialTaxRulesApplied;
    return this;
  }

   /**
   * Get specialTaxRulesApplied
   * @return specialTaxRulesApplied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSpecialTaxRulesApplied() {
    return specialTaxRulesApplied;
  }


  public void setSpecialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    this.specialTaxRulesApplied = specialTaxRulesApplied;
  }


  public SalesTax specialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
    return this;
  }

   /**
   * Get specialTaxRulesDescriptor
   * @return specialTaxRulesDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpecialTaxRulesDescriptor() {
    return specialTaxRulesDescriptor;
  }


  public void setSpecialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
  }


  public SalesTax totalTaxRate(Double totalTaxRate) {
    
    this.totalTaxRate = totalTaxRate;
    return this;
  }

   /**
   * Get totalTaxRate
   * @return totalTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalTaxRate() {
    return totalTaxRate;
  }


  public void setTotalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
  }


  public SalesTax totalTaxAmount(Double totalTaxAmount) {
    
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Get totalTaxAmount
   * @return totalTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalTaxAmount() {
    return totalTaxAmount;
  }


  public void setTotalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }


  public SalesTax stateTaxRate(Double stateTaxRate) {
    
    this.stateTaxRate = stateTaxRate;
    return this;
  }

   /**
   * Get stateTaxRate
   * @return stateTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getStateTaxRate() {
    return stateTaxRate;
  }


  public void setStateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
  }


  public SalesTax stateTaxAmount(Double stateTaxAmount) {
    
    this.stateTaxAmount = stateTaxAmount;
    return this;
  }

   /**
   * Get stateTaxAmount
   * @return stateTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getStateTaxAmount() {
    return stateTaxAmount;
  }


  public void setStateTaxAmount(Double stateTaxAmount) {
    this.stateTaxAmount = stateTaxAmount;
  }


  public SalesTax countyTaxRate(Double countyTaxRate) {
    
    this.countyTaxRate = countyTaxRate;
    return this;
  }

   /**
   * Get countyTaxRate
   * @return countyTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCountyTaxRate() {
    return countyTaxRate;
  }


  public void setCountyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
  }


  public SalesTax countyTaxAmount(Double countyTaxAmount) {
    
    this.countyTaxAmount = countyTaxAmount;
    return this;
  }

   /**
   * Get countyTaxAmount
   * @return countyTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCountyTaxAmount() {
    return countyTaxAmount;
  }


  public void setCountyTaxAmount(Double countyTaxAmount) {
    this.countyTaxAmount = countyTaxAmount;
  }


  public SalesTax municipalTaxRate(Double municipalTaxRate) {
    
    this.municipalTaxRate = municipalTaxRate;
    return this;
  }

   /**
   * Get municipalTaxRate
   * @return municipalTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMunicipalTaxRate() {
    return municipalTaxRate;
  }


  public void setMunicipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
  }


  public SalesTax municipalTaxAmount(Double municipalTaxAmount) {
    
    this.municipalTaxAmount = municipalTaxAmount;
    return this;
  }

   /**
   * Get municipalTaxAmount
   * @return municipalTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMunicipalTaxAmount() {
    return municipalTaxAmount;
  }


  public void setMunicipalTaxAmount(Double municipalTaxAmount) {
    this.municipalTaxAmount = municipalTaxAmount;
  }


  public SalesTax spdsTax(List<SpecialPurposeDistrictTax> spdsTax) {
    
    this.spdsTax = spdsTax;
    return this;
  }

  public SalesTax addSpdsTaxItem(SpecialPurposeDistrictTax spdsTaxItem) {
    if (this.spdsTax == null) {
      this.spdsTax = new ArrayList<SpecialPurposeDistrictTax>();
    }
    this.spdsTax.add(spdsTaxItem);
    return this;
  }

   /**
   * Get spdsTax
   * @return spdsTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SpecialPurposeDistrictTax> getSpdsTax() {
    return spdsTax;
  }


  public void setSpdsTax(List<SpecialPurposeDistrictTax> spdsTax) {
    this.spdsTax = spdsTax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTax salesTax = (SalesTax) o;
    return Objects.equals(this.specialTaxRulesApplied, salesTax.specialTaxRulesApplied) &&
        Objects.equals(this.specialTaxRulesDescriptor, salesTax.specialTaxRulesDescriptor) &&
        Objects.equals(this.totalTaxRate, salesTax.totalTaxRate) &&
        Objects.equals(this.totalTaxAmount, salesTax.totalTaxAmount) &&
        Objects.equals(this.stateTaxRate, salesTax.stateTaxRate) &&
        Objects.equals(this.stateTaxAmount, salesTax.stateTaxAmount) &&
        Objects.equals(this.countyTaxRate, salesTax.countyTaxRate) &&
        Objects.equals(this.countyTaxAmount, salesTax.countyTaxAmount) &&
        Objects.equals(this.municipalTaxRate, salesTax.municipalTaxRate) &&
        Objects.equals(this.municipalTaxAmount, salesTax.municipalTaxAmount) &&
        Objects.equals(this.spdsTax, salesTax.spdsTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialTaxRulesApplied, specialTaxRulesDescriptor, totalTaxRate, totalTaxAmount, stateTaxRate, stateTaxAmount, countyTaxRate, countyTaxAmount, municipalTaxRate, municipalTaxAmount, spdsTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTax {\n");
    sb.append("    specialTaxRulesApplied: ").append(toIndentedString(specialTaxRulesApplied)).append("\n");
    sb.append("    specialTaxRulesDescriptor: ").append(toIndentedString(specialTaxRulesDescriptor)).append("\n");
    sb.append("    totalTaxRate: ").append(toIndentedString(totalTaxRate)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    stateTaxRate: ").append(toIndentedString(stateTaxRate)).append("\n");
    sb.append("    stateTaxAmount: ").append(toIndentedString(stateTaxAmount)).append("\n");
    sb.append("    countyTaxRate: ").append(toIndentedString(countyTaxRate)).append("\n");
    sb.append("    countyTaxAmount: ").append(toIndentedString(countyTaxAmount)).append("\n");
    sb.append("    municipalTaxRate: ").append(toIndentedString(municipalTaxRate)).append("\n");
    sb.append("    municipalTaxAmount: ").append(toIndentedString(municipalTaxAmount)).append("\n");
    sb.append("    spdsTax: ").append(toIndentedString(spdsTax)).append("\n");
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

