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
import com.precisely.apis.model.City;
import com.precisely.apis.model.ConsistencyCode;
import com.precisely.apis.model.GeoLocationCountry;
import com.precisely.apis.model.GeoLocationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GeoLocationPlace
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class GeoLocationPlace   {
  @SerializedName("continent")
  private String continent = null;

  @SerializedName("country")
  private GeoLocationCountry country = null;

  @SerializedName("consistencyCode")
  private ConsistencyCode consistencyCode = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("state")
  private GeoLocationState state = null;

  @SerializedName("city")
  private City city = null;

  @SerializedName("postCode")
  private String postCode = null;

  @SerializedName("postCodeConfidence")
  private String postCodeConfidence = null;

  public GeoLocationPlace continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public GeoLocationPlace country(GeoLocationCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoLocationCountry getCountry() {
    return country;
  }

  public void setCountry(GeoLocationCountry country) {
    this.country = country;
  }

  public GeoLocationPlace consistencyCode(ConsistencyCode consistencyCode) {
    this.consistencyCode = consistencyCode;
    return this;
  }

   /**
   * Get consistencyCode
   * @return consistencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConsistencyCode getConsistencyCode() {
    return consistencyCode;
  }

  public void setConsistencyCode(ConsistencyCode consistencyCode) {
    this.consistencyCode = consistencyCode;
  }

  public GeoLocationPlace region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public GeoLocationPlace state(GeoLocationState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoLocationState getState() {
    return state;
  }

  public void setState(GeoLocationState state) {
    this.state = state;
  }

  public GeoLocationPlace city(City city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "")
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public GeoLocationPlace postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public GeoLocationPlace postCodeConfidence(String postCodeConfidence) {
    this.postCodeConfidence = postCodeConfidence;
    return this;
  }

   /**
   * Get postCodeConfidence
   * @return postCodeConfidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCodeConfidence() {
    return postCodeConfidence;
  }

  public void setPostCodeConfidence(String postCodeConfidence) {
    this.postCodeConfidence = postCodeConfidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationPlace geoLocationPlace = (GeoLocationPlace) o;
    return Objects.equals(this.continent, geoLocationPlace.continent) &&
        Objects.equals(this.country, geoLocationPlace.country) &&
        Objects.equals(this.consistencyCode, geoLocationPlace.consistencyCode) &&
        Objects.equals(this.region, geoLocationPlace.region) &&
        Objects.equals(this.state, geoLocationPlace.state) &&
        Objects.equals(this.city, geoLocationPlace.city) &&
        Objects.equals(this.postCode, geoLocationPlace.postCode) &&
        Objects.equals(this.postCodeConfidence, geoLocationPlace.postCodeConfidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continent, country, consistencyCode, region, state, city, postCode, postCodeConfidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationPlace {\n");
    
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    consistencyCode: ").append(toIndentedString(consistencyCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCodeConfidence: ").append(toIndentedString(postCodeConfidence)).append("\n");
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

