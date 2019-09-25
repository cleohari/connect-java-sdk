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
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in requests to the [PayOrder](#endpoint-payorder) endpoint.
 */
@ApiModel(description = "Defines the fields that are included in requests to the [PayOrder](#endpoint-payorder) endpoint.")

public class PayOrderRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("order_version")
  private Integer orderVersion = null;

  @JsonProperty("payment_ids")
  private List<String> paymentIds = new ArrayList<String>();

  public PayOrderRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this request among requests you've sent. If you're unsure whether a particular payment request was completed successfully, you can reattempt it with the same idempotency key without worrying about duplicate payments.  See [Idempotency](https://developer.squareup.com/docs/working-with-apis/idempotency) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A value you specify that uniquely identifies this request among requests you've sent. If you're unsure whether a particular payment request was completed successfully, you can reattempt it with the same idempotency key without worrying about duplicate payments.  See [Idempotency](https://developer.squareup.com/docs/working-with-apis/idempotency) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public PayOrderRequest orderVersion(Integer orderVersion) {
    this.orderVersion = orderVersion;
    return this;
  }

   /**
   * The version of the order being paid. If not supplied, the latest version will be paid.
   * @return orderVersion
  **/
  @ApiModelProperty(value = "The version of the order being paid. If not supplied, the latest version will be paid.")
  public Integer getOrderVersion() {
    return orderVersion;
  }

  public void setOrderVersion(Integer orderVersion) {
    this.orderVersion = orderVersion;
  }

  public PayOrderRequest paymentIds(List<String> paymentIds) {
    this.paymentIds = paymentIds;
    return this;
  }

  public PayOrderRequest addPaymentIdsItem(String paymentIdsItem) {
    this.paymentIds.add(paymentIdsItem);
    return this;
  }

   /**
   * 
   * @return paymentIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getPaymentIds() {
    return paymentIds;
  }

  public void setPaymentIds(List<String> paymentIds) {
    this.paymentIds = paymentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayOrderRequest payOrderRequest = (PayOrderRequest) o;
    return Objects.equals(this.idempotencyKey, payOrderRequest.idempotencyKey) &&
        Objects.equals(this.orderVersion, payOrderRequest.orderVersion) &&
        Objects.equals(this.paymentIds, payOrderRequest.paymentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, orderVersion, paymentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayOrderRequest {\n");
    
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    orderVersion: ").append(toIndentedString(orderVersion)).append("\n");
    sb.append("    paymentIds: ").append(toIndentedString(paymentIds)).append("\n");
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

