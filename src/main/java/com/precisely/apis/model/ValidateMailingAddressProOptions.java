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
 * ValidateMailingAddressProOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class ValidateMailingAddressProOptions {
  public static final String SERIALIZED_NAME_OUTPUT_ADDRESS_BLOCKS = "OutputAddressBlocks";
  @SerializedName(SERIALIZED_NAME_OUTPUT_ADDRESS_BLOCKS)
  private String outputAddressBlocks = "Y";

  public static final String SERIALIZED_NAME_KEEP_MULTIMATCH = "KeepMultimatch";
  @SerializedName(SERIALIZED_NAME_KEEP_MULTIMATCH)
  private String keepMultimatch = "N";

  public static final String SERIALIZED_NAME_OUTPUT_COUNTRY_FORMAT = "OutputCountryFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COUNTRY_FORMAT)
  private String outputCountryFormat = "E";

  public static final String SERIALIZED_NAME_OUTPUT_SCRIPT = "OutputScript";
  @SerializedName(SERIALIZED_NAME_OUTPUT_SCRIPT)
  private String outputScript = "InputScript";

  public static final String SERIALIZED_NAME_OUTPUT_CASING = "OutputCasing";
  @SerializedName(SERIALIZED_NAME_OUTPUT_CASING)
  private String outputCasing = "M";

  public static final String SERIALIZED_NAME_MAXIMUM_RESULTS = "MaximumResults";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_RESULTS)
  private String maximumResults = "10";

  public ValidateMailingAddressProOptions() { 
  }

  public ValidateMailingAddressProOptions outputAddressBlocks(String outputAddressBlocks) {
    
    this.outputAddressBlocks = outputAddressBlocks;
    return this;
  }

   /**
   * Specifies whether to return a formatted version of the address as it would be printed on a physical mail piece.
   * @return outputAddressBlocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to return a formatted version of the address as it would be printed on a physical mail piece.")

  public String getOutputAddressBlocks() {
    return outputAddressBlocks;
  }


  public void setOutputAddressBlocks(String outputAddressBlocks) {
    this.outputAddressBlocks = outputAddressBlocks;
  }


  public ValidateMailingAddressProOptions keepMultimatch(String keepMultimatch) {
    
    this.keepMultimatch = keepMultimatch;
    return this;
  }

   /**
   * Specifies whether to return multiple address for those input addresses that have more than one possible match.
   * @return keepMultimatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to return multiple address for those input addresses that have more than one possible match.")

  public String getKeepMultimatch() {
    return keepMultimatch;
  }


  public void setKeepMultimatch(String keepMultimatch) {
    this.keepMultimatch = keepMultimatch;
  }


  public ValidateMailingAddressProOptions outputCountryFormat(String outputCountryFormat) {
    
    this.outputCountryFormat = outputCountryFormat;
    return this;
  }

   /**
   * Specifies the format to use for the country name returned in the Country output field.
   * @return outputCountryFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the format to use for the country name returned in the Country output field.")

  public String getOutputCountryFormat() {
    return outputCountryFormat;
  }


  public void setOutputCountryFormat(String outputCountryFormat) {
    this.outputCountryFormat = outputCountryFormat;
  }


  public ValidateMailingAddressProOptions outputScript(String outputScript) {
    
    this.outputScript = outputScript;
    return this;
  }

   /**
   * Specifies the alphabet or script in which the output should be returned.
   * @return outputScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the alphabet or script in which the output should be returned.")

  public String getOutputScript() {
    return outputScript;
  }


  public void setOutputScript(String outputScript) {
    this.outputScript = outputScript;
  }


  public ValidateMailingAddressProOptions outputCasing(String outputCasing) {
    
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Specify the casing of the output data.
   * @return outputCasing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the casing of the output data.")

  public String getOutputCasing() {
    return outputCasing;
  }


  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }


  public ValidateMailingAddressProOptions maximumResults(String maximumResults) {
    
    this.maximumResults = maximumResults;
    return this;
  }

   /**
   * A number between 1 and 10 that indicates the maximum number of addresses to return.
   * @return maximumResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A number between 1 and 10 that indicates the maximum number of addresses to return.")

  public String getMaximumResults() {
    return maximumResults;
  }


  public void setMaximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressProOptions validateMailingAddressProOptions = (ValidateMailingAddressProOptions) o;
    return Objects.equals(this.outputAddressBlocks, validateMailingAddressProOptions.outputAddressBlocks) &&
        Objects.equals(this.keepMultimatch, validateMailingAddressProOptions.keepMultimatch) &&
        Objects.equals(this.outputCountryFormat, validateMailingAddressProOptions.outputCountryFormat) &&
        Objects.equals(this.outputScript, validateMailingAddressProOptions.outputScript) &&
        Objects.equals(this.outputCasing, validateMailingAddressProOptions.outputCasing) &&
        Objects.equals(this.maximumResults, validateMailingAddressProOptions.maximumResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputAddressBlocks, keepMultimatch, outputCountryFormat, outputScript, outputCasing, maximumResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressProOptions {\n");
    sb.append("    outputAddressBlocks: ").append(toIndentedString(outputAddressBlocks)).append("\n");
    sb.append("    keepMultimatch: ").append(toIndentedString(keepMultimatch)).append("\n");
    sb.append("    outputCountryFormat: ").append(toIndentedString(outputCountryFormat)).append("\n");
    sb.append("    outputScript: ").append(toIndentedString(outputScript)).append("\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
    sb.append("    maximumResults: ").append(toIndentedString(maximumResults)).append("\n");
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

