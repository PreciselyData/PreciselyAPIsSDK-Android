/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.SpecialPurposeDistrictTaxRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UseTaxRate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-23T11:56:04.654+05:30")
public class UseTaxRate   {
  @SerializedName("totalTaxRate")
  private Double totalTaxRate = null;

  @SerializedName("stateTaxRate")
  private Double stateTaxRate = null;

  @SerializedName("countyTaxRate")
  private Double countyTaxRate = null;

  @SerializedName("municipalTaxRate")
  private Double municipalTaxRate = null;

  @SerializedName("spdsTax")
  private List<SpecialPurposeDistrictTaxRate> spdsTax = new ArrayList<SpecialPurposeDistrictTaxRate>();

  public UseTaxRate totalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
    return this;
  }

   /**
   * Get totalTaxRate
   * @return totalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTaxRate() {
    return totalTaxRate;
  }

  public void setTotalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
  }

  public UseTaxRate stateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
    return this;
  }

   /**
   * Get stateTaxRate
   * @return stateTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTaxRate() {
    return stateTaxRate;
  }

  public void setStateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
  }

  public UseTaxRate countyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
    return this;
  }

   /**
   * Get countyTaxRate
   * @return countyTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTaxRate() {
    return countyTaxRate;
  }

  public void setCountyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
  }

  public UseTaxRate municipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
    return this;
  }

   /**
   * Get municipalTaxRate
   * @return municipalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTaxRate() {
    return municipalTaxRate;
  }

  public void setMunicipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
  }

  public UseTaxRate spdsTax(List<SpecialPurposeDistrictTaxRate> spdsTax) {
    this.spdsTax = spdsTax;
    return this;
  }

   /**
   * Get spdsTax
   * @return spdsTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SpecialPurposeDistrictTaxRate> getSpdsTax() {
    return spdsTax;
  }

  public void setSpdsTax(List<SpecialPurposeDistrictTaxRate> spdsTax) {
    this.spdsTax = spdsTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseTaxRate useTaxRate = (UseTaxRate) o;
    return Objects.equals(this.totalTaxRate, useTaxRate.totalTaxRate) &&
        Objects.equals(this.stateTaxRate, useTaxRate.stateTaxRate) &&
        Objects.equals(this.countyTaxRate, useTaxRate.countyTaxRate) &&
        Objects.equals(this.municipalTaxRate, useTaxRate.municipalTaxRate) &&
        Objects.equals(this.spdsTax, useTaxRate.spdsTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTaxRate, stateTaxRate, countyTaxRate, municipalTaxRate, spdsTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseTaxRate {\n");
    
    sb.append("    totalTaxRate: ").append(toIndentedString(totalTaxRate)).append("\n");
    sb.append("    stateTaxRate: ").append(toIndentedString(stateTaxRate)).append("\n");
    sb.append("    countyTaxRate: ").append(toIndentedString(countyTaxRate)).append("\n");
    sb.append("    municipalTaxRate: ").append(toIndentedString(municipalTaxRate)).append("\n");
    sb.append("    spdsTax: ").append(toIndentedString(spdsTax)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

