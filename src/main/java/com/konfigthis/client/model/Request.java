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
import java.util.UUID;

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
 * Request
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Request {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private Long requestId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public static final String SERIALIZED_NAME_POLICY_TYPE_DISPLAY_NAME = "policyTypeDisplayName";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_DISPLAY_NAME)
  private String policyTypeDisplayName;

  /**
   * The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    DAYS("days"),
    
    HOURS("hours"),
    
    PORTIONONRANGE("portionOnRange"),
    
    HOURSONRANGE("hoursOnRange");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_START_PORTION = "startPortion";
  @SerializedName(SERIALIZED_NAME_START_PORTION)
  private String startPortion;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_END_PORTION = "endPortion";
  @SerializedName(SERIALIZED_NAME_END_PORTION)
  private String endPortion;

  public static final String SERIALIZED_NAME_DAY_PORTION = "dayPortion";
  @SerializedName(SERIALIZED_NAME_DAY_PORTION)
  private String dayPortion;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_HOURS_ON_DATE = "hoursOnDate";
  @SerializedName(SERIALIZED_NAME_HOURS_ON_DATE)
  private Integer hoursOnDate;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Integer minutes;

  public static final String SERIALIZED_NAME_DAILY_HOURS = "dailyHours";
  @SerializedName(SERIALIZED_NAME_DAILY_HOURS)
  private Double dailyHours;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EMPLOYEE_DISPLAY_NAME = "employeeDisplayName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DISPLAY_NAME)
  private String employeeDisplayName;

  public Request() {
  }

  public Request requestId(Long requestId) {
    
    
    
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRequestId() {
    return requestId;
  }


  public void setRequestId(Long requestId) {
    
    
    
    this.requestId = requestId;
  }


  public Request employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Employee ID.
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee ID.")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public Request policyType(String policyType) {
    
    
    
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Request policy type, e.g. Holiday, Sick or any defined custom type.
   * @return policyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request policy type, e.g. Holiday, Sick or any defined custom type.")

  public String getPolicyType() {
    return policyType;
  }


  public void setPolicyType(String policyType) {
    
    
    
    this.policyType = policyType;
  }


  public Request policyTypeDisplayName(String policyTypeDisplayName) {
    
    
    
    
    this.policyTypeDisplayName = policyTypeDisplayName;
    return this;
  }

   /**
   * Display name for the policy type. This will be translated based on the locale.
   * @return policyTypeDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name for the policy type. This will be translated based on the locale.")

  public String getPolicyTypeDisplayName() {
    return policyTypeDisplayName;
  }


  public void setPolicyTypeDisplayName(String policyTypeDisplayName) {
    
    
    
    this.policyTypeDisplayName = policyTypeDisplayName;
  }


  public Request type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of request duration.<br> <b>portionOnRange</b> is when the request is for every morning or every afternoon during the days requested.<br> <b>hoursOnRange</b> is when the request is for X hours every day during the days requested.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public Request startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of the first day of the time off (not relevant for requests using the hours type).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the first day of the time off (not relevant for requests using the hours type).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public Request startPortion(String startPortion) {
    
    
    
    
    this.startPortion = startPortion;
    return this;
  }

   /**
   * What portion of the first day is included - all_day, morning or afternoon (relevant for request using the days type).
   * @return startPortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What portion of the first day is included - all_day, morning or afternoon (relevant for request using the days type).")

  public String getStartPortion() {
    return startPortion;
  }


  public void setStartPortion(String startPortion) {
    
    
    
    this.startPortion = startPortion;
  }


  public Request endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date of the last day of the time off (not relevant for requests using the hours type).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last day of the time off (not relevant for requests using the hours type).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public Request endPortion(String endPortion) {
    
    
    
    
    this.endPortion = endPortion;
    return this;
  }

   /**
   * What portion of the last day is included - all_day, morning or afternoon (relevant for requests using the days type).
   * @return endPortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What portion of the last day is included - all_day, morning or afternoon (relevant for requests using the days type).")

  public String getEndPortion() {
    return endPortion;
  }


  public void setEndPortion(String endPortion) {
    
    
    
    this.endPortion = endPortion;
  }


  public Request dayPortion(String dayPortion) {
    
    
    
    
    this.dayPortion = dayPortion;
    return this;
  }

   /**
   * What portion of the request&#39;s days is included - morning or afternoon (relevant for requests using the portionOnRange type).
   * @return dayPortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What portion of the request's days is included - morning or afternoon (relevant for requests using the portionOnRange type).")

  public String getDayPortion() {
    return dayPortion;
  }


  public void setDayPortion(String dayPortion) {
    
    
    
    this.dayPortion = dayPortion;
  }


  public Request date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of the time off (relevant for request using the hours type)
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the time off (relevant for request using the hours type)")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public Request hoursOnDate(Integer hoursOnDate) {
    
    
    
    
    this.hoursOnDate = hoursOnDate;
    return this;
  }

   /**
   * The time off duration in hours for the date (relevant for request using the hours type).
   * @return hoursOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time off duration in hours for the date (relevant for request using the hours type).")

  public Integer getHoursOnDate() {
    return hoursOnDate;
  }


  public void setHoursOnDate(Integer hoursOnDate) {
    
    
    
    this.hoursOnDate = hoursOnDate;
  }


  public Request minutes(Integer minutes) {
    
    
    
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Relevant for request using the hours type.
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relevant for request using the hours type.")

  public Integer getMinutes() {
    return minutes;
  }


  public void setMinutes(Integer minutes) {
    
    
    
    this.minutes = minutes;
  }


  public Request dailyHours(Double dailyHours) {
    
    
    
    
    this.dailyHours = dailyHours;
    return this;
  }

  public Request dailyHours(Integer dailyHours) {
    
    
    
    
    this.dailyHours = dailyHours.doubleValue();
    return this;
  }

   /**
   * The time off duration in hours for every day in the request (relevant for requests using the hoursOnRange type).
   * @return dailyHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time off duration in hours for every day in the request (relevant for requests using the hoursOnRange type).")

  public Double getDailyHours() {
    return dailyHours;
  }


  public void setDailyHours(Double dailyHours) {
    
    
    
    this.dailyHours = dailyHours;
  }


  public Request status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Request status. This can be either Approved or Pending.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request status. This can be either Approved or Pending.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public Request employeeDisplayName(String employeeDisplayName) {
    
    
    
    
    this.employeeDisplayName = employeeDisplayName;
    return this;
  }

   /**
   * Employee display name.
   * @return employeeDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee display name.")

  public String getEmployeeDisplayName() {
    return employeeDisplayName;
  }


  public void setEmployeeDisplayName(String employeeDisplayName) {
    
    
    
    this.employeeDisplayName = employeeDisplayName;
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
   * @return the Request instance itself
   */
  public Request putAdditionalProperty(String key, Object value) {
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
    Request request = (Request) o;
    return Objects.equals(this.requestId, request.requestId) &&
        Objects.equals(this.employeeId, request.employeeId) &&
        Objects.equals(this.policyType, request.policyType) &&
        Objects.equals(this.policyTypeDisplayName, request.policyTypeDisplayName) &&
        Objects.equals(this.type, request.type) &&
        Objects.equals(this.startDate, request.startDate) &&
        Objects.equals(this.startPortion, request.startPortion) &&
        Objects.equals(this.endDate, request.endDate) &&
        Objects.equals(this.endPortion, request.endPortion) &&
        Objects.equals(this.dayPortion, request.dayPortion) &&
        Objects.equals(this.date, request.date) &&
        Objects.equals(this.hoursOnDate, request.hoursOnDate) &&
        Objects.equals(this.minutes, request.minutes) &&
        Objects.equals(this.dailyHours, request.dailyHours) &&
        Objects.equals(this.status, request.status) &&
        Objects.equals(this.employeeDisplayName, request.employeeDisplayName)&&
        Objects.equals(this.additionalProperties, request.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, employeeId, policyType, policyTypeDisplayName, type, startDate, startPortion, endDate, endPortion, dayPortion, date, hoursOnDate, minutes, dailyHours, status, employeeDisplayName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    policyTypeDisplayName: ").append(toIndentedString(policyTypeDisplayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startPortion: ").append(toIndentedString(startPortion)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endPortion: ").append(toIndentedString(endPortion)).append("\n");
    sb.append("    dayPortion: ").append(toIndentedString(dayPortion)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hoursOnDate: ").append(toIndentedString(hoursOnDate)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    dailyHours: ").append(toIndentedString(dailyHours)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    employeeDisplayName: ").append(toIndentedString(employeeDisplayName)).append("\n");
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
    openapiFields.add("requestId");
    openapiFields.add("employeeId");
    openapiFields.add("policyType");
    openapiFields.add("policyTypeDisplayName");
    openapiFields.add("type");
    openapiFields.add("startDate");
    openapiFields.add("startPortion");
    openapiFields.add("endDate");
    openapiFields.add("endPortion");
    openapiFields.add("dayPortion");
    openapiFields.add("date");
    openapiFields.add("hoursOnDate");
    openapiFields.add("minutes");
    openapiFields.add("dailyHours");
    openapiFields.add("status");
    openapiFields.add("employeeDisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Request is not found in the empty JSON string", Request.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("policyType") != null && !jsonObj.get("policyType").isJsonNull()) && !jsonObj.get("policyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyType").toString()));
      }
      if ((jsonObj.get("policyTypeDisplayName") != null && !jsonObj.get("policyTypeDisplayName").isJsonNull()) && !jsonObj.get("policyTypeDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyTypeDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyTypeDisplayName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("startPortion") != null && !jsonObj.get("startPortion").isJsonNull()) && !jsonObj.get("startPortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startPortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startPortion").toString()));
      }
      if ((jsonObj.get("endPortion") != null && !jsonObj.get("endPortion").isJsonNull()) && !jsonObj.get("endPortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endPortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endPortion").toString()));
      }
      if ((jsonObj.get("dayPortion") != null && !jsonObj.get("dayPortion").isJsonNull()) && !jsonObj.get("dayPortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dayPortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dayPortion").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("employeeDisplayName") != null && !jsonObj.get("employeeDisplayName").isJsonNull()) && !jsonObj.get("employeeDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeDisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Request.class));

       return (TypeAdapter<T>) new TypeAdapter<Request>() {
           @Override
           public void write(JsonWriter out, Request value) throws IOException {
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
           public Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Request instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Request
  * @throws IOException if the JSON string is invalid with respect to Request
  */
  public static Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Request.class);
  }

 /**
  * Convert an instance of Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
