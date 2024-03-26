/*
 * Bob API
 * Access your employees data with the Bob API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * EmploymentEntryAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentEntryAllOf {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SALARY_PAY_TYPE = "salaryPayType";
  @SerializedName(SERIALIZED_NAME_SALARY_PAY_TYPE)
  private String salaryPayType;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public EmploymentEntryAllOf() {
  }

  public EmploymentEntryAllOf contract(String contract) {
    
    
    
    
    this.contract = contract;
    return this;
  }

   /**
   * Contract.
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    
    
    
    this.contract = contract;
  }


  public EmploymentEntryAllOf type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public EmploymentEntryAllOf salaryPayType(String salaryPayType) {
    
    
    
    
    this.salaryPayType = salaryPayType;
    return this;
  }

   /**
   * Salary pay type.
   * @return salaryPayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Salary pay type.")

  public String getSalaryPayType() {
    return salaryPayType;
  }


  public void setSalaryPayType(String salaryPayType) {
    
    
    
    this.salaryPayType = salaryPayType;
  }


  public EmploymentEntryAllOf effectiveDate(LocalDate effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The date this entry becomes effective.
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date this entry becomes effective.")

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(LocalDate effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EmploymentEntryAllOf instance itself
   */
  public EmploymentEntryAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentEntryAllOf employmentEntryAllOf = (EmploymentEntryAllOf) o;
    return Objects.equals(this.contract, employmentEntryAllOf.contract) &&
        Objects.equals(this.type, employmentEntryAllOf.type) &&
        Objects.equals(this.salaryPayType, employmentEntryAllOf.salaryPayType) &&
        Objects.equals(this.effectiveDate, employmentEntryAllOf.effectiveDate)&&
        Objects.equals(this.additionalProperties, employmentEntryAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, type, salaryPayType, effectiveDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentEntryAllOf {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    salaryPayType: ").append(toIndentedString(salaryPayType)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("contract");
    openapiFields.add("type");
    openapiFields.add("salaryPayType");
    openapiFields.add("effectiveDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentEntryAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentEntryAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentEntryAllOf is not found in the empty JSON string", EmploymentEntryAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("salaryPayType") != null && !jsonObj.get("salaryPayType").isJsonNull()) && !jsonObj.get("salaryPayType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salaryPayType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salaryPayType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentEntryAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentEntryAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentEntryAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentEntryAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentEntryAllOf>() {
           @Override
           public void write(JsonWriter out, EmploymentEntryAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EmploymentEntryAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentEntryAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmploymentEntryAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentEntryAllOf
  * @throws IOException if the JSON string is invalid with respect to EmploymentEntryAllOf
  */
  public static EmploymentEntryAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentEntryAllOf.class);
  }

 /**
  * Convert an instance of EmploymentEntryAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
