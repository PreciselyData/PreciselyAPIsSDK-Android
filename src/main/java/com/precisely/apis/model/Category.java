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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class Category {
  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_TRADE_DIVISION = "tradeDivision";
  @SerializedName(SERIALIZED_NAME_TRADE_DIVISION)
  private String tradeDivision;

  public static final String SERIALIZED_NAME_TRADE_GROUP = "tradeGroup";
  @SerializedName(SERIALIZED_NAME_TRADE_GROUP)
  private String tradeGroup;

  public static final String SERIALIZED_NAME_SUB_CLASS = "subClass";
  @SerializedName(SERIALIZED_NAME_SUB_CLASS)
  private String subClass;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public Category() { 
  }

  public Category categoryCode(String categoryCode) {
    
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


  public Category tradeDivision(String tradeDivision) {
    
    this.tradeDivision = tradeDivision;
    return this;
  }

   /**
   * Get tradeDivision
   * @return tradeDivision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeDivision() {
    return tradeDivision;
  }


  public void setTradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
  }


  public Category tradeGroup(String tradeGroup) {
    
    this.tradeGroup = tradeGroup;
    return this;
  }

   /**
   * Get tradeGroup
   * @return tradeGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeGroup() {
    return tradeGroup;
  }


  public void setTradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
  }


  public Category subClass(String subClass) {
    
    this.subClass = subClass;
    return this;
  }

   /**
   * Get subClass
   * @return subClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubClass() {
    return subClass;
  }


  public void setSubClass(String subClass) {
    this.subClass = subClass;
  }


  public Category propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryCode, category.categoryCode) &&
        Objects.equals(this.tradeDivision, category.tradeDivision) &&
        Objects.equals(this.tradeGroup, category.tradeGroup) &&
        Objects.equals(this.subClass, category.subClass) &&
        Objects.equals(this.propertyClass, category.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, tradeDivision, tradeGroup, subClass, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    tradeDivision: ").append(toIndentedString(tradeDivision)).append("\n");
    sb.append("    tradeGroup: ").append(toIndentedString(tradeGroup)).append("\n");
    sb.append("    subClass: ").append(toIndentedString(subClass)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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

