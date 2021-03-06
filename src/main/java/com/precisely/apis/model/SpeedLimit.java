/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
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
import com.precisely.apis.model.SpeedRoad;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SpeedLimit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class SpeedLimit   {
  @SerializedName("maxSpeed")
  private String maxSpeed = null;

  @SerializedName("speedUnit")
  private String speedUnit = null;

  @SerializedName("speedVerification")
  private String speedVerification = null;

  @SerializedName("amPeakAvgSpeed")
  private String amPeakAvgSpeed = null;

  @SerializedName("pmPeakAvgSpeed")
  private String pmPeakAvgSpeed = null;

  @SerializedName("offPeakAvgSpeed")
  private String offPeakAvgSpeed = null;

  @SerializedName("nightAvgSpeed")
  private String nightAvgSpeed = null;

  @SerializedName("weekAvgSpeed")
  private String weekAvgSpeed = null;

  @SerializedName("road")
  private SpeedRoad road = null;

  public SpeedLimit maxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * Get maxSpeed
   * @return maxSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public SpeedLimit speedUnit(String speedUnit) {
    this.speedUnit = speedUnit;
    return this;
  }

   /**
   * Get speedUnit
   * @return speedUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpeedUnit() {
    return speedUnit;
  }

  public void setSpeedUnit(String speedUnit) {
    this.speedUnit = speedUnit;
  }

  public SpeedLimit speedVerification(String speedVerification) {
    this.speedVerification = speedVerification;
    return this;
  }

   /**
   * Get speedVerification
   * @return speedVerification
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpeedVerification() {
    return speedVerification;
  }

  public void setSpeedVerification(String speedVerification) {
    this.speedVerification = speedVerification;
  }

  public SpeedLimit amPeakAvgSpeed(String amPeakAvgSpeed) {
    this.amPeakAvgSpeed = amPeakAvgSpeed;
    return this;
  }

   /**
   * Get amPeakAvgSpeed
   * @return amPeakAvgSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAmPeakAvgSpeed() {
    return amPeakAvgSpeed;
  }

  public void setAmPeakAvgSpeed(String amPeakAvgSpeed) {
    this.amPeakAvgSpeed = amPeakAvgSpeed;
  }

  public SpeedLimit pmPeakAvgSpeed(String pmPeakAvgSpeed) {
    this.pmPeakAvgSpeed = pmPeakAvgSpeed;
    return this;
  }

   /**
   * Get pmPeakAvgSpeed
   * @return pmPeakAvgSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPmPeakAvgSpeed() {
    return pmPeakAvgSpeed;
  }

  public void setPmPeakAvgSpeed(String pmPeakAvgSpeed) {
    this.pmPeakAvgSpeed = pmPeakAvgSpeed;
  }

  public SpeedLimit offPeakAvgSpeed(String offPeakAvgSpeed) {
    this.offPeakAvgSpeed = offPeakAvgSpeed;
    return this;
  }

   /**
   * Get offPeakAvgSpeed
   * @return offPeakAvgSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOffPeakAvgSpeed() {
    return offPeakAvgSpeed;
  }

  public void setOffPeakAvgSpeed(String offPeakAvgSpeed) {
    this.offPeakAvgSpeed = offPeakAvgSpeed;
  }

  public SpeedLimit nightAvgSpeed(String nightAvgSpeed) {
    this.nightAvgSpeed = nightAvgSpeed;
    return this;
  }

   /**
   * Get nightAvgSpeed
   * @return nightAvgSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNightAvgSpeed() {
    return nightAvgSpeed;
  }

  public void setNightAvgSpeed(String nightAvgSpeed) {
    this.nightAvgSpeed = nightAvgSpeed;
  }

  public SpeedLimit weekAvgSpeed(String weekAvgSpeed) {
    this.weekAvgSpeed = weekAvgSpeed;
    return this;
  }

   /**
   * Get weekAvgSpeed
   * @return weekAvgSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWeekAvgSpeed() {
    return weekAvgSpeed;
  }

  public void setWeekAvgSpeed(String weekAvgSpeed) {
    this.weekAvgSpeed = weekAvgSpeed;
  }

  public SpeedLimit road(SpeedRoad road) {
    this.road = road;
    return this;
  }

   /**
   * Get road
   * @return road
  **/
  @ApiModelProperty(example = "null", value = "")
  public SpeedRoad getRoad() {
    return road;
  }

  public void setRoad(SpeedRoad road) {
    this.road = road;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeedLimit speedLimit = (SpeedLimit) o;
    return Objects.equals(this.maxSpeed, speedLimit.maxSpeed) &&
        Objects.equals(this.speedUnit, speedLimit.speedUnit) &&
        Objects.equals(this.speedVerification, speedLimit.speedVerification) &&
        Objects.equals(this.amPeakAvgSpeed, speedLimit.amPeakAvgSpeed) &&
        Objects.equals(this.pmPeakAvgSpeed, speedLimit.pmPeakAvgSpeed) &&
        Objects.equals(this.offPeakAvgSpeed, speedLimit.offPeakAvgSpeed) &&
        Objects.equals(this.nightAvgSpeed, speedLimit.nightAvgSpeed) &&
        Objects.equals(this.weekAvgSpeed, speedLimit.weekAvgSpeed) &&
        Objects.equals(this.road, speedLimit.road);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSpeed, speedUnit, speedVerification, amPeakAvgSpeed, pmPeakAvgSpeed, offPeakAvgSpeed, nightAvgSpeed, weekAvgSpeed, road);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeedLimit {\n");
    
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    speedUnit: ").append(toIndentedString(speedUnit)).append("\n");
    sb.append("    speedVerification: ").append(toIndentedString(speedVerification)).append("\n");
    sb.append("    amPeakAvgSpeed: ").append(toIndentedString(amPeakAvgSpeed)).append("\n");
    sb.append("    pmPeakAvgSpeed: ").append(toIndentedString(pmPeakAvgSpeed)).append("\n");
    sb.append("    offPeakAvgSpeed: ").append(toIndentedString(offPeakAvgSpeed)).append("\n");
    sb.append("    nightAvgSpeed: ").append(toIndentedString(nightAvgSpeed)).append("\n");
    sb.append("    weekAvgSpeed: ").append(toIndentedString(weekAvgSpeed)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
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

