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
import com.squareup.connect.models.Money;
import com.squareup.connect.models.OrderFulfillment;
import com.squareup.connect.models.OrderLineItem;
import com.squareup.connect.models.OrderLineItemDiscount;
import com.squareup.connect.models.OrderLineItemTax;
import com.squareup.connect.models.OrderMoneyAmounts;
import com.squareup.connect.models.OrderReturn;
import com.squareup.connect.models.OrderRoundingAdjustment;
import com.squareup.connect.models.OrderServiceCharge;
import com.squareup.connect.models.OrderSource;
import com.squareup.connect.models.Refund;
import com.squareup.connect.models.Tender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains all information related to a single order to process with Square, including line items that specify the products to purchase. Order objects also include information on any associated tenders, refunds, and returns.  All Connect V2 Transactions have all been converted to Orders including all associated itemization data.
 */
@ApiModel(description = "Contains all information related to a single order to process with Square, including line items that specify the products to purchase. Order objects also include information on any associated tenders, refunds, and returns.  All Connect V2 Transactions have all been converted to Orders including all associated itemization data.")

public class Order {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("source")
  private OrderSource source = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("line_items")
  private List<OrderLineItem> lineItems = new ArrayList<OrderLineItem>();

  @JsonProperty("taxes")
  private List<OrderLineItemTax> taxes = new ArrayList<OrderLineItemTax>();

  @JsonProperty("discounts")
  private List<OrderLineItemDiscount> discounts = new ArrayList<OrderLineItemDiscount>();

  @JsonProperty("service_charges")
  private List<OrderServiceCharge> serviceCharges = new ArrayList<OrderServiceCharge>();

  @JsonProperty("fulfillments")
  private List<OrderFulfillment> fulfillments = new ArrayList<OrderFulfillment>();

  @JsonProperty("returns")
  private List<OrderReturn> returns = new ArrayList<OrderReturn>();

  @JsonProperty("return_amounts")
  private OrderMoneyAmounts returnAmounts = null;

  @JsonProperty("net_amounts")
  private OrderMoneyAmounts netAmounts = null;

  @JsonProperty("rounding_adjustment")
  private OrderRoundingAdjustment roundingAdjustment = null;

  @JsonProperty("tenders")
  private List<Tender> tenders = new ArrayList<Tender>();

  @JsonProperty("refunds")
  private List<Refund> refunds = new ArrayList<Refund>();

  @JsonProperty("metadata")
  private Map<String, String> metadata = new HashMap<String, String>();

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("closed_at")
  private String closedAt = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("total_money")
  private Money totalMoney = null;

  @JsonProperty("total_tax_money")
  private Money totalTaxMoney = null;

  @JsonProperty("total_discount_money")
  private Money totalDiscountMoney = null;

  @JsonProperty("total_service_charge_money")
  private Money totalServiceChargeMoney = null;

  public Order id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The order's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The order's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the merchant location this order is associated with.
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the merchant location this order is associated with.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Order referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * A client specified identifier to associate an entity in another system with this order.
   * @return referenceId
  **/
  @ApiModelProperty(value = "A client specified identifier to associate an entity in another system with this order.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Order source(OrderSource source) {
    this.source = source;
    return this;
  }

   /**
   * The origination details of the order.
   * @return source
  **/
  @ApiModelProperty(value = "The origination details of the order.")
  public OrderSource getSource() {
    return source;
  }

  public void setSource(OrderSource source) {
    this.source = source;
  }

  public Order customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The `Customer` ID of the customer associated with the order.
   * @return customerId
  **/
  @ApiModelProperty(value = "The `Customer` ID of the customer associated with the order.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Order lineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Order addLineItemsItem(OrderLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items included in the order.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items included in the order.")
  public List<OrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Order taxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public Order addTaxesItem(OrderLineItemTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * The list of all taxes associated with the order.  Taxes can be scoped to either `ORDER` or `LINE_ITEM`. For taxes with `LINE_ITEM` scope, an `OrderLineItemAppliedTax` must be added to each line item that the tax applies to. For taxes with `ORDER` scope, the server will generate an `OrderLineItemAppliedTax` for every line item.  On reads, each tax in the list will include the total amount of that tax applied to the order.  __IMPORTANT__: If `LINE_ITEM` scope is set on any taxes in this field, usage of the deprecated `line_items.taxes` field will result in an error. Please use `line_items.applied_taxes` instead.
   * @return taxes
  **/
  @ApiModelProperty(value = "The list of all taxes associated with the order.  Taxes can be scoped to either `ORDER` or `LINE_ITEM`. For taxes with `LINE_ITEM` scope, an `OrderLineItemAppliedTax` must be added to each line item that the tax applies to. For taxes with `ORDER` scope, the server will generate an `OrderLineItemAppliedTax` for every line item.  On reads, each tax in the list will include the total amount of that tax applied to the order.  __IMPORTANT__: If `LINE_ITEM` scope is set on any taxes in this field, usage of the deprecated `line_items.taxes` field will result in an error. Please use `line_items.applied_taxes` instead.")
  public List<OrderLineItemTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
  }

  public Order discounts(List<OrderLineItemDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public Order addDiscountsItem(OrderLineItemDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * The list of all discounts associated with the order.  Discounts can be scoped to either `ORDER` or `LINE_ITEM`. For discounts scoped to `LINE_ITEM`, an `OrderLineItemAppliedDiscount` must be added to each line item that the discount applies to. For discounts with `ORDER` scope, the server will generate an `OrderLineItemAppliedDiscount` for every line item.  __IMPORTANT__: If `LINE_ITEM` scope is set on any discounts in this field, usage of the deprecated `line_items.discounts` field will result in an error. Please use `line_items.applied_discounts` instead.
   * @return discounts
  **/
  @ApiModelProperty(value = "The list of all discounts associated with the order.  Discounts can be scoped to either `ORDER` or `LINE_ITEM`. For discounts scoped to `LINE_ITEM`, an `OrderLineItemAppliedDiscount` must be added to each line item that the discount applies to. For discounts with `ORDER` scope, the server will generate an `OrderLineItemAppliedDiscount` for every line item.  __IMPORTANT__: If `LINE_ITEM` scope is set on any discounts in this field, usage of the deprecated `line_items.discounts` field will result in an error. Please use `line_items.applied_discounts` instead.")
  public List<OrderLineItemDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<OrderLineItemDiscount> discounts) {
    this.discounts = discounts;
  }

  public Order serviceCharges(List<OrderServiceCharge> serviceCharges) {
    this.serviceCharges = serviceCharges;
    return this;
  }

  public Order addServiceChargesItem(OrderServiceCharge serviceChargesItem) {
    this.serviceCharges.add(serviceChargesItem);
    return this;
  }

   /**
   * A list of service charges applied to the order.
   * @return serviceCharges
  **/
  @ApiModelProperty(value = "A list of service charges applied to the order.")
  public List<OrderServiceCharge> getServiceCharges() {
    return serviceCharges;
  }

  public void setServiceCharges(List<OrderServiceCharge> serviceCharges) {
    this.serviceCharges = serviceCharges;
  }

  public Order fulfillments(List<OrderFulfillment> fulfillments) {
    this.fulfillments = fulfillments;
    return this;
  }

  public Order addFulfillmentsItem(OrderFulfillment fulfillmentsItem) {
    this.fulfillments.add(fulfillmentsItem);
    return this;
  }

   /**
   * Details on order fulfillment.  Orders can only be created with at most one fulfillment. However, orders returned by the API may contain multiple fulfillments.
   * @return fulfillments
  **/
  @ApiModelProperty(value = "Details on order fulfillment.  Orders can only be created with at most one fulfillment. However, orders returned by the API may contain multiple fulfillments.")
  public List<OrderFulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<OrderFulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  public Order returns(List<OrderReturn> returns) {
    this.returns = returns;
    return this;
  }

  public Order addReturnsItem(OrderReturn returnsItem) {
    this.returns.add(returnsItem);
    return this;
  }

   /**
   * Collection of items from sale Orders being returned in this one. Normally part of an Itemized Return or Exchange.  There will be exactly one `Return` object per sale Order being referenced.
   * @return returns
  **/
  @ApiModelProperty(value = "Collection of items from sale Orders being returned in this one. Normally part of an Itemized Return or Exchange.  There will be exactly one `Return` object per sale Order being referenced.")
  public List<OrderReturn> getReturns() {
    return returns;
  }

  public void setReturns(List<OrderReturn> returns) {
    this.returns = returns;
  }

  public Order returnAmounts(OrderMoneyAmounts returnAmounts) {
    this.returnAmounts = returnAmounts;
    return this;
  }

   /**
   * Rollup of returned money amounts.
   * @return returnAmounts
  **/
  @ApiModelProperty(value = "Rollup of returned money amounts.")
  public OrderMoneyAmounts getReturnAmounts() {
    return returnAmounts;
  }

  public void setReturnAmounts(OrderMoneyAmounts returnAmounts) {
    this.returnAmounts = returnAmounts;
  }

  public Order netAmounts(OrderMoneyAmounts netAmounts) {
    this.netAmounts = netAmounts;
    return this;
  }

   /**
   * Net money amounts (sale money - return money).
   * @return netAmounts
  **/
  @ApiModelProperty(value = "Net money amounts (sale money - return money).")
  public OrderMoneyAmounts getNetAmounts() {
    return netAmounts;
  }

  public void setNetAmounts(OrderMoneyAmounts netAmounts) {
    this.netAmounts = netAmounts;
  }

  public Order roundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
    this.roundingAdjustment = roundingAdjustment;
    return this;
  }

   /**
   * A positive or negative rounding adjustment to the total of the order, commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency.
   * @return roundingAdjustment
  **/
  @ApiModelProperty(value = "A positive or negative rounding adjustment to the total of the order, commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency.")
  public OrderRoundingAdjustment getRoundingAdjustment() {
    return roundingAdjustment;
  }

  public void setRoundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
    this.roundingAdjustment = roundingAdjustment;
  }

  public Order tenders(List<Tender> tenders) {
    this.tenders = tenders;
    return this;
  }

  public Order addTendersItem(Tender tendersItem) {
    this.tenders.add(tendersItem);
    return this;
  }

   /**
   * The Tenders which were used to pay for the Order.
   * @return tenders
  **/
  @ApiModelProperty(value = "The Tenders which were used to pay for the Order.")
  public List<Tender> getTenders() {
    return tenders;
  }

  public void setTenders(List<Tender> tenders) {
    this.tenders = tenders;
  }

  public Order refunds(List<Refund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public Order addRefundsItem(Refund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * The Refunds that are part of this Order.
   * @return refunds
  **/
  @ApiModelProperty(value = "The Refunds that are part of this Order.")
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  public Order metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Order putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Application-defined data attached to this order. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.
   * @return metadata
  **/
  @ApiModelProperty(value = "Application-defined data attached to this order. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Order createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp for when the order was created. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return createdAt
  **/
  @ApiModelProperty(value = "Timestamp for when the order was created. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Order updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp for when the order was last updated. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Timestamp for when the order was last updated. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Order closedAt(String closedAt) {
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Timestamp for when the order was closed. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return closedAt
  **/
  @ApiModelProperty(value = "Timestamp for when the order was closed. In RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(String closedAt) {
    this.closedAt = closedAt;
  }

  public Order state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the order. `OPEN`,`COMPLETED`,`CANCELED` See [OrderState](#type-orderstate) for possible values
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the order. `OPEN`,`COMPLETED`,`CANCELED` See [OrderState](#type-orderstate) for possible values")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Order version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version number which is incremented each time an update is committed to the order. Orders that were not created through the API will not include a version and thus cannot be updated.  [Read more about working with versions](https://developer.squareup.com/docs/orders-api/manage-orders#update-orders).
   * @return version
  **/
  @ApiModelProperty(value = "Version number which is incremented each time an update is committed to the order. Orders that were not created through the API will not include a version and thus cannot be updated.  [Read more about working with versions](https://developer.squareup.com/docs/orders-api/manage-orders#update-orders).")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Order totalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total amount of money to collect for the order.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total amount of money to collect for the order.")
  public Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
  }

  public Order totalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
    return this;
  }

   /**
   * The total tax amount of money to collect for the order.
   * @return totalTaxMoney
  **/
  @ApiModelProperty(value = "The total tax amount of money to collect for the order.")
  public Money getTotalTaxMoney() {
    return totalTaxMoney;
  }

  public void setTotalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
  }

  public Order totalDiscountMoney(Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
    return this;
  }

   /**
   * The total discount amount of money to collect for the order.
   * @return totalDiscountMoney
  **/
  @ApiModelProperty(value = "The total discount amount of money to collect for the order.")
  public Money getTotalDiscountMoney() {
    return totalDiscountMoney;
  }

  public void setTotalDiscountMoney(Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
  }

  public Order totalServiceChargeMoney(Money totalServiceChargeMoney) {
    this.totalServiceChargeMoney = totalServiceChargeMoney;
    return this;
  }

   /**
   * The total amount of money collected in service charges for the order.  Note: `total_service_charge_money` is the sum of `applied_money` fields for each individual service charge. Therefore, `total_service_charge_money` will only include inclusive tax amounts, not additive tax amounts.
   * @return totalServiceChargeMoney
  **/
  @ApiModelProperty(value = "The total amount of money collected in service charges for the order.  Note: `total_service_charge_money` is the sum of `applied_money` fields for each individual service charge. Therefore, `total_service_charge_money` will only include inclusive tax amounts, not additive tax amounts.")
  public Money getTotalServiceChargeMoney() {
    return totalServiceChargeMoney;
  }

  public void setTotalServiceChargeMoney(Money totalServiceChargeMoney) {
    this.totalServiceChargeMoney = totalServiceChargeMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.locationId, order.locationId) &&
        Objects.equals(this.referenceId, order.referenceId) &&
        Objects.equals(this.source, order.source) &&
        Objects.equals(this.customerId, order.customerId) &&
        Objects.equals(this.lineItems, order.lineItems) &&
        Objects.equals(this.taxes, order.taxes) &&
        Objects.equals(this.discounts, order.discounts) &&
        Objects.equals(this.serviceCharges, order.serviceCharges) &&
        Objects.equals(this.fulfillments, order.fulfillments) &&
        Objects.equals(this.returns, order.returns) &&
        Objects.equals(this.returnAmounts, order.returnAmounts) &&
        Objects.equals(this.netAmounts, order.netAmounts) &&
        Objects.equals(this.roundingAdjustment, order.roundingAdjustment) &&
        Objects.equals(this.tenders, order.tenders) &&
        Objects.equals(this.refunds, order.refunds) &&
        Objects.equals(this.metadata, order.metadata) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.updatedAt, order.updatedAt) &&
        Objects.equals(this.closedAt, order.closedAt) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.version, order.version) &&
        Objects.equals(this.totalMoney, order.totalMoney) &&
        Objects.equals(this.totalTaxMoney, order.totalTaxMoney) &&
        Objects.equals(this.totalDiscountMoney, order.totalDiscountMoney) &&
        Objects.equals(this.totalServiceChargeMoney, order.totalServiceChargeMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, referenceId, source, customerId, lineItems, taxes, discounts, serviceCharges, fulfillments, returns, returnAmounts, netAmounts, roundingAdjustment, tenders, refunds, metadata, createdAt, updatedAt, closedAt, state, version, totalMoney, totalTaxMoney, totalDiscountMoney, totalServiceChargeMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    serviceCharges: ").append(toIndentedString(serviceCharges)).append("\n");
    sb.append("    fulfillments: ").append(toIndentedString(fulfillments)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    returnAmounts: ").append(toIndentedString(returnAmounts)).append("\n");
    sb.append("    netAmounts: ").append(toIndentedString(netAmounts)).append("\n");
    sb.append("    roundingAdjustment: ").append(toIndentedString(roundingAdjustment)).append("\n");
    sb.append("    tenders: ").append(toIndentedString(tenders)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    totalTaxMoney: ").append(toIndentedString(totalTaxMoney)).append("\n");
    sb.append("    totalDiscountMoney: ").append(toIndentedString(totalDiscountMoney)).append("\n");
    sb.append("    totalServiceChargeMoney: ").append(toIndentedString(totalServiceChargeMoney)).append("\n");
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

