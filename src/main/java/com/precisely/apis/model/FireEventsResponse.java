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
import com.precisely.apis.model.FireEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FireEventsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class FireEventsResponse {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private List<FireEvent> event = null;

  public FireEventsResponse() { 
  }

  public FireEventsResponse event(List<FireEvent> event) {
    
    this.event = event;
    return this;
  }

  public FireEventsResponse addEventItem(FireEvent eventItem) {
    if (this.event == null) {
      this.event = new ArrayList<FireEvent>();
    }
    this.event.add(eventItem);
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FireEvent> getEvent() {
    return event;
  }


  public void setEvent(List<FireEvent> event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireEventsResponse fireEventsResponse = (FireEventsResponse) o;
    return Objects.equals(this.event, fireEventsResponse.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireEventsResponse {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

