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
import com.konfigthis.client.model.CurrencyValue;
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
 * SalaryEntry
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SalaryEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private CurrencyValue base;

  public static final String SERIALIZED_NAME_PAY_PERIOD = "payPeriod";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD)
  private String payPeriod;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "payFrequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;

  public SalaryEntry() {
  }

  public SalaryEntry id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public SalaryEntry reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for this change.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for this change.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public SalaryEntry effectiveDate(LocalDate effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The date this entry becomes effective.
   * @return effectiveDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date this entry becomes effective.")

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(LocalDate effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public SalaryEntry base(CurrencyValue base) {
    
    
    
    
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencyValue getBase() {
    return base;
  }


  public void setBase(CurrencyValue base) {
    
    
    
    this.base = base;
  }


  public SalaryEntry payPeriod(String payPeriod) {
    
    
    
    
    this.payPeriod = payPeriod;
    return this;
  }

   /**
   * Represents the period for this salary entry. This can be one of: Annual, Hourly, Daily, Weekly, Monthly.
   * @return payPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the period for this salary entry. This can be one of: Annual, Hourly, Daily, Weekly, Monthly.")

  public String getPayPeriod() {
    return payPeriod;
  }


  public void setPayPeriod(String payPeriod) {
    
    
    
    this.payPeriod = payPeriod;
  }


  public SalaryEntry payFrequency(String payFrequency) {
    
    
    
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Represents the frequency the salary is paid. This can be one of: Weekly, Monthly, Pro rata, Every two weeks, Twice a month, Every four weeks.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the frequency the salary is paid. This can be one of: Weekly, Monthly, Pro rata, Every two weeks, Twice a month, Every four weeks.")

  public String getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(String payFrequency) {
    
    
    
    this.payFrequency = payFrequency;
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
   * @return the SalaryEntry instance itself
   */
  public SalaryEntry putAdditionalProperty(String key, Object value) {
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
    SalaryEntry salaryEntry = (SalaryEntry) o;
    return Objects.equals(this.id, salaryEntry.id) &&
        Objects.equals(this.reason, salaryEntry.reason) &&
        Objects.equals(this.effectiveDate, salaryEntry.effectiveDate) &&
        Objects.equals(this.base, salaryEntry.base) &&
        Objects.equals(this.payPeriod, salaryEntry.payPeriod) &&
        Objects.equals(this.payFrequency, salaryEntry.payFrequency)&&
        Objects.equals(this.additionalProperties, salaryEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reason, effectiveDate, base, payPeriod, payFrequency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    payPeriod: ").append(toIndentedString(payPeriod)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("reason");
    openapiFields.add("effectiveDate");
    openapiFields.add("base");
    openapiFields.add("payPeriod");
    openapiFields.add("payFrequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effectiveDate");
    openapiRequiredFields.add("base");
    openapiRequiredFields.add("payPeriod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SalaryEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SalaryEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SalaryEntry is not found in the empty JSON string", SalaryEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SalaryEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the required field `base`
      CurrencyValue.validateJsonObject(jsonObj.getAsJsonObject("base"));
      if (!jsonObj.get("payPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payPeriod").toString()));
      }
      if ((jsonObj.get("payFrequency") != null && !jsonObj.get("payFrequency").isJsonNull()) && !jsonObj.get("payFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payFrequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SalaryEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SalaryEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SalaryEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SalaryEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<SalaryEntry>() {
           @Override
           public void write(JsonWriter out, SalaryEntry value) throws IOException {
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
           public SalaryEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SalaryEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SalaryEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SalaryEntry
  * @throws IOException if the JSON string is invalid with respect to SalaryEntry
  */
  public static SalaryEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SalaryEntry.class);
  }

 /**
  * Convert an instance of SalaryEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

