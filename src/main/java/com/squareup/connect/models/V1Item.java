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
import com.squareup.connect.models.V1Category;
import com.squareup.connect.models.V1Fee;
import com.squareup.connect.models.V1ItemImage;
import com.squareup.connect.models.V1Variation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Item
 */

public class V1Item {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * The item's type. This value is NORMAL for almost all items.
   */
  public enum TypeEnum {
    NORMAL("NORMAL"),
    
    GIFT_CARD("GIFT_CARD"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * The color of the discount's display label in Square Register, if not the default color. The default color is 9da2a6.
   */
  public enum ColorEnum {
    _9DA2A6("9da2a6"),
    
    _4AB200("4ab200"),
    
    _0B8000("0b8000"),
    
    _2952CC("2952cc"),
    
    A82EE5("a82ee5"),
    
    E5457A("e5457a"),
    
    B21212("b21212"),
    
    _593C00("593c00"),
    
    E5BF00("e5BF00");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("color")
  private ColorEnum color = null;

  @JsonProperty("abbreviation")
  private String abbreviation = null;

  /**
   * Indicates whether the item is viewable from the merchant's online store (PUBLIC) or PRIVATE.
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("visibility")
  private VisibilityEnum visibility = null;

  @JsonProperty("available_online")
  private Boolean availableOnline = null;

  @JsonProperty("master_image")
  private V1ItemImage masterImage = null;

  @JsonProperty("category")
  private V1Category category = null;

  @JsonProperty("variations")
  private List<V1Variation> variations = new ArrayList<V1Variation>();

  @JsonProperty("modifier_lists")
  private List<V1Variation> modifierLists = new ArrayList<V1Variation>();

  @JsonProperty("fees")
  private List<V1Fee> fees = new ArrayList<V1Fee>();

  @JsonProperty("taxable")
  private Boolean taxable = null;

  public V1Item id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item's ID. Must be unique among all entity IDs ever provided on behalf of the merchant. You can never reuse an ID. This value can include alphanumeric characters, dashes (-), and underscores (_).
   * @return id
  **/
  @ApiModelProperty(value = "The item's ID. Must be unique among all entity IDs ever provided on behalf of the merchant. You can never reuse an ID. This value can include alphanumeric characters, dashes (-), and underscores (_).")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Item name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item's name.
   * @return name
  **/
  @ApiModelProperty(value = "The item's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Item description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The item's description.
   * @return description
  **/
  @ApiModelProperty(value = "The item's description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1Item type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The item's type. This value is NORMAL for almost all items.
   * @return type
  **/
  @ApiModelProperty(value = "The item's type. This value is NORMAL for almost all items.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1Item color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the discount's display label in Square Register, if not the default color. The default color is 9da2a6.
   * @return color
  **/
  @ApiModelProperty(value = "The color of the discount's display label in Square Register, if not the default color. The default color is 9da2a6.")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public V1Item abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * The text of the item's display label in Square Register. Only up to the first five characters of the string are used.
   * @return abbreviation
  **/
  @ApiModelProperty(value = "The text of the item's display label in Square Register. Only up to the first five characters of the string are used.")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public V1Item visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Indicates whether the item is viewable from the merchant's online store (PUBLIC) or PRIVATE.
   * @return visibility
  **/
  @ApiModelProperty(value = "Indicates whether the item is viewable from the merchant's online store (PUBLIC) or PRIVATE.")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public V1Item availableOnline(Boolean availableOnline) {
    this.availableOnline = availableOnline;
    return this;
  }

   /**
   * If true, the item can be added to shipping orders from the merchant's online store.
   * @return availableOnline
  **/
  @ApiModelProperty(value = "If true, the item can be added to shipping orders from the merchant's online store.")
  public Boolean getAvailableOnline() {
    return availableOnline;
  }

  public void setAvailableOnline(Boolean availableOnline) {
    this.availableOnline = availableOnline;
  }

  public V1Item masterImage(V1ItemImage masterImage) {
    this.masterImage = masterImage;
    return this;
  }

   /**
   * The item's master image, if any.
   * @return masterImage
  **/
  @ApiModelProperty(value = "The item's master image, if any.")
  public V1ItemImage getMasterImage() {
    return masterImage;
  }

  public void setMasterImage(V1ItemImage masterImage) {
    this.masterImage = masterImage;
  }

  public V1Item category(V1Category category) {
    this.category = category;
    return this;
  }

   /**
   * The category the item belongs to, if any.
   * @return category
  **/
  @ApiModelProperty(value = "The category the item belongs to, if any.")
  public V1Category getCategory() {
    return category;
  }

  public void setCategory(V1Category category) {
    this.category = category;
  }

  public V1Item variations(List<V1Variation> variations) {
    this.variations = variations;
    return this;
  }

  public V1Item addVariationsItem(V1Variation variationsItem) {
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * The item's variations. You must specify at least one variation.
   * @return variations
  **/
  @ApiModelProperty(value = "The item's variations. You must specify at least one variation.")
  public List<V1Variation> getVariations() {
    return variations;
  }

  public void setVariations(List<V1Variation> variations) {
    this.variations = variations;
  }

  public V1Item modifierLists(List<V1Variation> modifierLists) {
    this.modifierLists = modifierLists;
    return this;
  }

  public V1Item addModifierListsItem(V1Variation modifierListsItem) {
    this.modifierLists.add(modifierListsItem);
    return this;
  }

   /**
   * The modifier lists that apply to the item, if any.
   * @return modifierLists
  **/
  @ApiModelProperty(value = "The modifier lists that apply to the item, if any.")
  public List<V1Variation> getModifierLists() {
    return modifierLists;
  }

  public void setModifierLists(List<V1Variation> modifierLists) {
    this.modifierLists = modifierLists;
  }

  public V1Item fees(List<V1Fee> fees) {
    this.fees = fees;
    return this;
  }

  public V1Item addFeesItem(V1Fee feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * The fees that apply to the item, if any.
   * @return fees
  **/
  @ApiModelProperty(value = "The fees that apply to the item, if any.")
  public List<V1Fee> getFees() {
    return fees;
  }

  public void setFees(List<V1Fee> fees) {
    this.fees = fees;
  }

  public V1Item taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Deprecated. This field is not used.
   * @return taxable
  **/
  @ApiModelProperty(value = "Deprecated. This field is not used.")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Item v1Item = (V1Item) o;
    return Objects.equals(this.id, v1Item.id) &&
        Objects.equals(this.name, v1Item.name) &&
        Objects.equals(this.description, v1Item.description) &&
        Objects.equals(this.type, v1Item.type) &&
        Objects.equals(this.color, v1Item.color) &&
        Objects.equals(this.abbreviation, v1Item.abbreviation) &&
        Objects.equals(this.visibility, v1Item.visibility) &&
        Objects.equals(this.availableOnline, v1Item.availableOnline) &&
        Objects.equals(this.masterImage, v1Item.masterImage) &&
        Objects.equals(this.category, v1Item.category) &&
        Objects.equals(this.variations, v1Item.variations) &&
        Objects.equals(this.modifierLists, v1Item.modifierLists) &&
        Objects.equals(this.fees, v1Item.fees) &&
        Objects.equals(this.taxable, v1Item.taxable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, color, abbreviation, visibility, availableOnline, masterImage, category, variations, modifierLists, fees, taxable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    availableOnline: ").append(toIndentedString(availableOnline)).append("\n");
    sb.append("    masterImage: ").append(toIndentedString(masterImage)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    modifierLists: ").append(toIndentedString(modifierLists)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
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

