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
 * PolicyType
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PolicyType {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Activity type.
   */
  @JsonAdapter(ActivityEnum.Adapter.class)
 public enum ActivityEnum {
    PAIDTIMEOFF("paidTimeoff"),
    
    UNPAIDTIMEOFF("unpaidTimeoff"),
    
    WORKTIME("workTime");

    private String value;

    ActivityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivityEnum fromValue(String value) {
      for (ActivityEnum b : ActivityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActivityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private ActivityEnum activity;

  public static final String SERIALIZED_NAME_BOOKING_WORK_DAYS_ONLY = "bookingWorkDaysOnly";
  @SerializedName(SERIALIZED_NAME_BOOKING_WORK_DAYS_ONLY)
  private Boolean bookingWorkDaysOnly;

  /**
   * Gets or Sets unit
   */
  @JsonAdapter(UnitEnum.Adapter.class)
 public enum UnitEnum {
    DAYS("days"),
    
    HOURS("hours");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  public PolicyType() {
  }

  public PolicyType name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PolicyType activity(ActivityEnum activity) {
    
    
    
    
    this.activity = activity;
    return this;
  }

   /**
   * Activity type.
   * @return activity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Activity type.")

  public ActivityEnum getActivity() {
    return activity;
  }


  public void setActivity(ActivityEnum activity) {
    
    
    
    this.activity = activity;
  }


  public PolicyType bookingWorkDaysOnly(Boolean bookingWorkDaysOnly) {
    
    
    
    
    this.bookingWorkDaysOnly = bookingWorkDaysOnly;
    return this;
  }

   /**
   * Requests will be deducted from the balance only for working days.
   * @return bookingWorkDaysOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests will be deducted from the balance only for working days.")

  public Boolean getBookingWorkDaysOnly() {
    return bookingWorkDaysOnly;
  }


  public void setBookingWorkDaysOnly(Boolean bookingWorkDaysOnly) {
    
    
    
    this.bookingWorkDaysOnly = bookingWorkDaysOnly;
  }


  public PolicyType unit(UnitEnum unit) {
    
    
    
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
    
    
    
    this.unit = unit;
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
   * @return the PolicyType instance itself
   */
  public PolicyType putAdditionalProperty(String key, Object value) {
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
    PolicyType policyType = (PolicyType) o;
    return Objects.equals(this.name, policyType.name) &&
        Objects.equals(this.activity, policyType.activity) &&
        Objects.equals(this.bookingWorkDaysOnly, policyType.bookingWorkDaysOnly) &&
        Objects.equals(this.unit, policyType.unit)&&
        Objects.equals(this.additionalProperties, policyType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activity, bookingWorkDaysOnly, unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    bookingWorkDaysOnly: ").append(toIndentedString(bookingWorkDaysOnly)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("activity");
    openapiFields.add("bookingWorkDaysOnly");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PolicyType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PolicyType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyType is not found in the empty JSON string", PolicyType.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("activity") != null && !jsonObj.get("activity").isJsonNull()) && !jsonObj.get("activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyType.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyType>() {
           @Override
           public void write(JsonWriter out, PolicyType value) throws IOException {
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
           public PolicyType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PolicyType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PolicyType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyType
  * @throws IOException if the JSON string is invalid with respect to PolicyType
  */
  public static PolicyType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyType.class);
  }

 /**
  * Convert an instance of PolicyType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
