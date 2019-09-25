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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Retrieves a list of refunds taken by the account making the request.  Max results per page: 100
 */
@ApiModel(description = "Retrieves a list of refunds taken by the account making the request.  Max results per page: 100")

public class ListPaymentsRequest {
  @JsonProperty("begin_time")
  private String beginTime = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("sort_order")
  private String sortOrder = null;

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("last_4")
  private String last4 = null;

  @JsonProperty("card_brand")
  private String cardBrand = null;

  public ListPaymentsRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Timestamp for the beginning of the reporting period, in RFC 3339 format. Inclusive. Default: The current time minus one year.
   * @return beginTime
  **/
  @ApiModelProperty(value = "Timestamp for the beginning of the reporting period, in RFC 3339 format. Inclusive. Default: The current time minus one year.")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public ListPaymentsRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp for the end of the requested reporting period, in RFC 3339 format.  Default: The current time.
   * @return endTime
  **/
  @ApiModelProperty(value = "Timestamp for the end of the requested reporting period, in RFC 3339 format.  Default: The current time.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ListPaymentsRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public ListPaymentsRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ListPaymentsRequest locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * ID of location associated with payment
   * @return locationId
  **/
  @ApiModelProperty(value = "ID of location associated with payment")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public ListPaymentsRequest total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * The exact amount in the total_money for a `Payment`.
   * minimum: 0
   * @return total
  **/
  @ApiModelProperty(value = "The exact amount in the total_money for a `Payment`.")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public ListPaymentsRequest last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 digits of `Payment` card.
   * @return last4
  **/
  @ApiModelProperty(value = "The last 4 digits of `Payment` card.")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public ListPaymentsRequest cardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * The brand of `Payment` card. For example, `VISA`
   * @return cardBrand
  **/
  @ApiModelProperty(value = "The brand of `Payment` card. For example, `VISA`")
  public String getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentsRequest listPaymentsRequest = (ListPaymentsRequest) o;
    return Objects.equals(this.beginTime, listPaymentsRequest.beginTime) &&
        Objects.equals(this.endTime, listPaymentsRequest.endTime) &&
        Objects.equals(this.sortOrder, listPaymentsRequest.sortOrder) &&
        Objects.equals(this.cursor, listPaymentsRequest.cursor) &&
        Objects.equals(this.locationId, listPaymentsRequest.locationId) &&
        Objects.equals(this.total, listPaymentsRequest.total) &&
        Objects.equals(this.last4, listPaymentsRequest.last4) &&
        Objects.equals(this.cardBrand, listPaymentsRequest.cardBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime, sortOrder, cursor, locationId, total, last4, cardBrand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentsRequest {\n");
    
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
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

