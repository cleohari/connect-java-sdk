/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class UpdateItemModifierListsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public UpdateItemModifierListsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public UpdateItemModifierListsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of `Error`s encountered.
   * @return errors
  **/
  @ApiModelProperty(value = "The set of `Error`s encountered.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public UpdateItemModifierListsResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The database [timestamp](#workingwithdates) of this update in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The database [timestamp](#workingwithdates) of this update in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateItemModifierListsResponse updateItemModifierListsResponse = (UpdateItemModifierListsResponse) o;
    return Objects.equals(this.errors, updateItemModifierListsResponse.errors) &&
        Objects.equals(this.updatedAt, updateItemModifierListsResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateItemModifierListsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

