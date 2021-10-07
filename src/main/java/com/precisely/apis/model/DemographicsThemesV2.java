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
import com.precisely.apis.model.AssetsAndWealthTheme;
import com.precisely.apis.model.EducationTheme;
import com.precisely.apis.model.EmploymentTheme;
import com.precisely.apis.model.ExpenditureTheme;
import com.precisely.apis.model.HealthTheme;
import com.precisely.apis.model.HouseholdsTheme;
import com.precisely.apis.model.HousingTheme;
import com.precisely.apis.model.IncomeThemeV2;
import com.precisely.apis.model.PopulationTheme;
import com.precisely.apis.model.RaceAndEthnicityTheme;
import com.precisely.apis.model.SupplyAndDemandTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DemographicsThemesV2
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-23T11:56:04.654+05:30")
public class DemographicsThemesV2   {
  @SerializedName("boundaryId")
  private String boundaryId = null;

  @SerializedName("populationTheme")
  private PopulationTheme populationTheme = null;

  @SerializedName("raceAndEthnicityTheme")
  private RaceAndEthnicityTheme raceAndEthnicityTheme = null;

  @SerializedName("healthTheme")
  private HealthTheme healthTheme = null;

  @SerializedName("educationTheme")
  private EducationTheme educationTheme = null;

  @SerializedName("incomeTheme")
  private IncomeThemeV2 incomeTheme = null;

  @SerializedName("assetsAndWealthTheme")
  private AssetsAndWealthTheme assetsAndWealthTheme = null;

  @SerializedName("householdsTheme")
  private HouseholdsTheme householdsTheme = null;

  @SerializedName("housingTheme")
  private HousingTheme housingTheme = null;

  @SerializedName("employmentTheme")
  private EmploymentTheme employmentTheme = null;

  @SerializedName("expenditureTheme")
  private ExpenditureTheme expenditureTheme = null;

  @SerializedName("supplyAndDemandTheme")
  private SupplyAndDemandTheme supplyAndDemandTheme = null;

  public DemographicsThemesV2 boundaryId(String boundaryId) {
    this.boundaryId = boundaryId;
    return this;
  }

   /**
   * Get boundaryId
   * @return boundaryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryId() {
    return boundaryId;
  }

  public void setBoundaryId(String boundaryId) {
    this.boundaryId = boundaryId;
  }

  public DemographicsThemesV2 populationTheme(PopulationTheme populationTheme) {
    this.populationTheme = populationTheme;
    return this;
  }

   /**
   * Get populationTheme
   * @return populationTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public PopulationTheme getPopulationTheme() {
    return populationTheme;
  }

  public void setPopulationTheme(PopulationTheme populationTheme) {
    this.populationTheme = populationTheme;
  }

  public DemographicsThemesV2 raceAndEthnicityTheme(RaceAndEthnicityTheme raceAndEthnicityTheme) {
    this.raceAndEthnicityTheme = raceAndEthnicityTheme;
    return this;
  }

   /**
   * Get raceAndEthnicityTheme
   * @return raceAndEthnicityTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public RaceAndEthnicityTheme getRaceAndEthnicityTheme() {
    return raceAndEthnicityTheme;
  }

  public void setRaceAndEthnicityTheme(RaceAndEthnicityTheme raceAndEthnicityTheme) {
    this.raceAndEthnicityTheme = raceAndEthnicityTheme;
  }

  public DemographicsThemesV2 healthTheme(HealthTheme healthTheme) {
    this.healthTheme = healthTheme;
    return this;
  }

   /**
   * Get healthTheme
   * @return healthTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public HealthTheme getHealthTheme() {
    return healthTheme;
  }

  public void setHealthTheme(HealthTheme healthTheme) {
    this.healthTheme = healthTheme;
  }

  public DemographicsThemesV2 educationTheme(EducationTheme educationTheme) {
    this.educationTheme = educationTheme;
    return this;
  }

   /**
   * Get educationTheme
   * @return educationTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public EducationTheme getEducationTheme() {
    return educationTheme;
  }

  public void setEducationTheme(EducationTheme educationTheme) {
    this.educationTheme = educationTheme;
  }

  public DemographicsThemesV2 incomeTheme(IncomeThemeV2 incomeTheme) {
    this.incomeTheme = incomeTheme;
    return this;
  }

   /**
   * Get incomeTheme
   * @return incomeTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public IncomeThemeV2 getIncomeTheme() {
    return incomeTheme;
  }

  public void setIncomeTheme(IncomeThemeV2 incomeTheme) {
    this.incomeTheme = incomeTheme;
  }

  public DemographicsThemesV2 assetsAndWealthTheme(AssetsAndWealthTheme assetsAndWealthTheme) {
    this.assetsAndWealthTheme = assetsAndWealthTheme;
    return this;
  }

   /**
   * Get assetsAndWealthTheme
   * @return assetsAndWealthTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public AssetsAndWealthTheme getAssetsAndWealthTheme() {
    return assetsAndWealthTheme;
  }

  public void setAssetsAndWealthTheme(AssetsAndWealthTheme assetsAndWealthTheme) {
    this.assetsAndWealthTheme = assetsAndWealthTheme;
  }

  public DemographicsThemesV2 householdsTheme(HouseholdsTheme householdsTheme) {
    this.householdsTheme = householdsTheme;
    return this;
  }

   /**
   * Get householdsTheme
   * @return householdsTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public HouseholdsTheme getHouseholdsTheme() {
    return householdsTheme;
  }

  public void setHouseholdsTheme(HouseholdsTheme householdsTheme) {
    this.householdsTheme = householdsTheme;
  }

  public DemographicsThemesV2 housingTheme(HousingTheme housingTheme) {
    this.housingTheme = housingTheme;
    return this;
  }

   /**
   * Get housingTheme
   * @return housingTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public HousingTheme getHousingTheme() {
    return housingTheme;
  }

  public void setHousingTheme(HousingTheme housingTheme) {
    this.housingTheme = housingTheme;
  }

  public DemographicsThemesV2 employmentTheme(EmploymentTheme employmentTheme) {
    this.employmentTheme = employmentTheme;
    return this;
  }

   /**
   * Get employmentTheme
   * @return employmentTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public EmploymentTheme getEmploymentTheme() {
    return employmentTheme;
  }

  public void setEmploymentTheme(EmploymentTheme employmentTheme) {
    this.employmentTheme = employmentTheme;
  }

  public DemographicsThemesV2 expenditureTheme(ExpenditureTheme expenditureTheme) {
    this.expenditureTheme = expenditureTheme;
    return this;
  }

   /**
   * Get expenditureTheme
   * @return expenditureTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExpenditureTheme getExpenditureTheme() {
    return expenditureTheme;
  }

  public void setExpenditureTheme(ExpenditureTheme expenditureTheme) {
    this.expenditureTheme = expenditureTheme;
  }

  public DemographicsThemesV2 supplyAndDemandTheme(SupplyAndDemandTheme supplyAndDemandTheme) {
    this.supplyAndDemandTheme = supplyAndDemandTheme;
    return this;
  }

   /**
   * Get supplyAndDemandTheme
   * @return supplyAndDemandTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public SupplyAndDemandTheme getSupplyAndDemandTheme() {
    return supplyAndDemandTheme;
  }

  public void setSupplyAndDemandTheme(SupplyAndDemandTheme supplyAndDemandTheme) {
    this.supplyAndDemandTheme = supplyAndDemandTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemographicsThemesV2 demographicsThemesV2 = (DemographicsThemesV2) o;
    return Objects.equals(this.boundaryId, demographicsThemesV2.boundaryId) &&
        Objects.equals(this.populationTheme, demographicsThemesV2.populationTheme) &&
        Objects.equals(this.raceAndEthnicityTheme, demographicsThemesV2.raceAndEthnicityTheme) &&
        Objects.equals(this.healthTheme, demographicsThemesV2.healthTheme) &&
        Objects.equals(this.educationTheme, demographicsThemesV2.educationTheme) &&
        Objects.equals(this.incomeTheme, demographicsThemesV2.incomeTheme) &&
        Objects.equals(this.assetsAndWealthTheme, demographicsThemesV2.assetsAndWealthTheme) &&
        Objects.equals(this.householdsTheme, demographicsThemesV2.householdsTheme) &&
        Objects.equals(this.housingTheme, demographicsThemesV2.housingTheme) &&
        Objects.equals(this.employmentTheme, demographicsThemesV2.employmentTheme) &&
        Objects.equals(this.expenditureTheme, demographicsThemesV2.expenditureTheme) &&
        Objects.equals(this.supplyAndDemandTheme, demographicsThemesV2.supplyAndDemandTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryId, populationTheme, raceAndEthnicityTheme, healthTheme, educationTheme, incomeTheme, assetsAndWealthTheme, householdsTheme, housingTheme, employmentTheme, expenditureTheme, supplyAndDemandTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsThemesV2 {\n");
    
    sb.append("    boundaryId: ").append(toIndentedString(boundaryId)).append("\n");
    sb.append("    populationTheme: ").append(toIndentedString(populationTheme)).append("\n");
    sb.append("    raceAndEthnicityTheme: ").append(toIndentedString(raceAndEthnicityTheme)).append("\n");
    sb.append("    healthTheme: ").append(toIndentedString(healthTheme)).append("\n");
    sb.append("    educationTheme: ").append(toIndentedString(educationTheme)).append("\n");
    sb.append("    incomeTheme: ").append(toIndentedString(incomeTheme)).append("\n");
    sb.append("    assetsAndWealthTheme: ").append(toIndentedString(assetsAndWealthTheme)).append("\n");
    sb.append("    householdsTheme: ").append(toIndentedString(householdsTheme)).append("\n");
    sb.append("    housingTheme: ").append(toIndentedString(housingTheme)).append("\n");
    sb.append("    employmentTheme: ").append(toIndentedString(employmentTheme)).append("\n");
    sb.append("    expenditureTheme: ").append(toIndentedString(expenditureTheme)).append("\n");
    sb.append("    supplyAndDemandTheme: ").append(toIndentedString(supplyAndDemandTheme)).append("\n");
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

