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
 * VariableEntry
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VariableEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private CurrencyValue amount;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variableType";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private String variableType;

  public static final String SERIALIZED_NAME_PAYMENT_PERIOD = "paymentPeriod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PERIOD)
  private String paymentPeriod;

  public static final String SERIALIZED_NAME_COMPANY_PERCENT = "companyPercent";
  @SerializedName(SERIALIZED_NAME_COMPANY_PERCENT)
  private Double companyPercent;

  public static final String SERIALIZED_NAME_DEPARTMENT_PERCENT = "departmentPercent";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_PERCENT)
  private Double departmentPercent;

  public static final String SERIALIZED_NAME_INDIVIDUAL_PERCENT = "individualPercent";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_PERCENT)
  private Double individualPercent;

  public VariableEntry() {
  }

  public VariableEntry id(Integer id) {
    
    
    
    
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


  public VariableEntry reason(String reason) {
    
    
    
    
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


  public VariableEntry effectiveDate(LocalDate effectiveDate) {
    
    
    
    
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


  public VariableEntry amount(CurrencyValue amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencyValue getAmount() {
    return amount;
  }


  public void setAmount(CurrencyValue amount) {
    
    
    
    this.amount = amount;
  }


  public VariableEntry variableType(String variableType) {
    
    
    
    
    this.variableType = variableType;
    return this;
  }

   /**
   * The type of variable pay.
   * @return variableType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of variable pay.")

  public String getVariableType() {
    return variableType;
  }


  public void setVariableType(String variableType) {
    
    
    
    this.variableType = variableType;
  }


  public VariableEntry paymentPeriod(String paymentPeriod) {
    
    
    
    
    this.paymentPeriod = paymentPeriod;
    return this;
  }

   /**
   * This represents the period for this variable entry. It can be one of: Annual, Half-Yearly, Quarterly, Monthly.
   * @return paymentPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This represents the period for this variable entry. It can be one of: Annual, Half-Yearly, Quarterly, Monthly.")

  public String getPaymentPeriod() {
    return paymentPeriod;
  }


  public void setPaymentPeriod(String paymentPeriod) {
    
    
    
    this.paymentPeriod = paymentPeriod;
  }


  public VariableEntry companyPercent(Double companyPercent) {
    
    
    
    
    this.companyPercent = companyPercent;
    return this;
  }

  public VariableEntry companyPercent(Integer companyPercent) {
    
    
    
    
    this.companyPercent = companyPercent.doubleValue();
    return this;
  }

   /**
   * The employee&#39;s company on-target weight, in percent.
   * @return companyPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's company on-target weight, in percent.")

  public Double getCompanyPercent() {
    return companyPercent;
  }


  public void setCompanyPercent(Double companyPercent) {
    
    
    
    this.companyPercent = companyPercent;
  }


  public VariableEntry departmentPercent(Double departmentPercent) {
    
    
    
    
    this.departmentPercent = departmentPercent;
    return this;
  }

  public VariableEntry departmentPercent(Integer departmentPercent) {
    
    
    
    
    this.departmentPercent = departmentPercent.doubleValue();
    return this;
  }

   /**
   * The employee&#39;s department on-target weight, in percent.
   * @return departmentPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's department on-target weight, in percent.")

  public Double getDepartmentPercent() {
    return departmentPercent;
  }


  public void setDepartmentPercent(Double departmentPercent) {
    
    
    
    this.departmentPercent = departmentPercent;
  }


  public VariableEntry individualPercent(Double individualPercent) {
    
    
    
    
    this.individualPercent = individualPercent;
    return this;
  }

  public VariableEntry individualPercent(Integer individualPercent) {
    
    
    
    
    this.individualPercent = individualPercent.doubleValue();
    return this;
  }

   /**
   * The employee&#39;s individual on-target weight, in percent.
   * @return individualPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's individual on-target weight, in percent.")

  public Double getIndividualPercent() {
    return individualPercent;
  }


  public void setIndividualPercent(Double individualPercent) {
    
    
    
    this.individualPercent = individualPercent;
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
   * @return the VariableEntry instance itself
   */
  public VariableEntry putAdditionalProperty(String key, Object value) {
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
    VariableEntry variableEntry = (VariableEntry) o;
    return Objects.equals(this.id, variableEntry.id) &&
        Objects.equals(this.reason, variableEntry.reason) &&
        Objects.equals(this.effectiveDate, variableEntry.effectiveDate) &&
        Objects.equals(this.amount, variableEntry.amount) &&
        Objects.equals(this.variableType, variableEntry.variableType) &&
        Objects.equals(this.paymentPeriod, variableEntry.paymentPeriod) &&
        Objects.equals(this.companyPercent, variableEntry.companyPercent) &&
        Objects.equals(this.departmentPercent, variableEntry.departmentPercent) &&
        Objects.equals(this.individualPercent, variableEntry.individualPercent)&&
        Objects.equals(this.additionalProperties, variableEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reason, effectiveDate, amount, variableType, paymentPeriod, companyPercent, departmentPercent, individualPercent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
    sb.append("    paymentPeriod: ").append(toIndentedString(paymentPeriod)).append("\n");
    sb.append("    companyPercent: ").append(toIndentedString(companyPercent)).append("\n");
    sb.append("    departmentPercent: ").append(toIndentedString(departmentPercent)).append("\n");
    sb.append("    individualPercent: ").append(toIndentedString(individualPercent)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("variableType");
    openapiFields.add("paymentPeriod");
    openapiFields.add("companyPercent");
    openapiFields.add("departmentPercent");
    openapiFields.add("individualPercent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effectiveDate");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("paymentPeriod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VariableEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VariableEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableEntry is not found in the empty JSON string", VariableEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VariableEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the required field `amount`
      CurrencyValue.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      if ((jsonObj.get("variableType") != null && !jsonObj.get("variableType").isJsonNull()) && !jsonObj.get("variableType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableType").toString()));
      }
      if (!jsonObj.get("paymentPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentPeriod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableEntry>() {
           @Override
           public void write(JsonWriter out, VariableEntry value) throws IOException {
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
           public VariableEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VariableEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VariableEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VariableEntry
  * @throws IOException if the JSON string is invalid with respect to VariableEntry
  */
  public static VariableEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableEntry.class);
  }

 /**
  * Convert an instance of VariableEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

