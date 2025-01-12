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
 * SubmitTimeoffRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SubmitTimeoffRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  /**
   * The type of request duration.&lt;br&gt; Select &lt;b&gt;hours&lt;/b&gt; when the request is for X hours during the day requested (This is supported only for policy types measured in hours).&lt;br&gt; Select &lt;b&gt;portionOnRange&lt;/b&gt; when the  request is for every morning or every afternoon during the days requested.&lt;br&gt; Select &lt;b&gt;hoursOnRange&lt;/b&gt; when the request is for X hours every day during the days requested (This is supported only for policy types measured in hours)
   */
  @JsonAdapter(RequestRangeTypeEnum.Adapter.class)
 public enum RequestRangeTypeEnum {
    DAYS("days"),
    
    HOURS("hours"),
    
    PORTIONONRANGE("portionOnRange"),
    
    HOURSONRANGE("hoursOnRange");

    private String value;

    RequestRangeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestRangeTypeEnum fromValue(String value) {
      for (RequestRangeTypeEnum b : RequestRangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestRangeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestRangeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestRangeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestRangeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUEST_RANGE_TYPE = "requestRangeType";
  @SerializedName(SERIALIZED_NAME_REQUEST_RANGE_TYPE)
  private RequestRangeTypeEnum requestRangeType = RequestRangeTypeEnum.DAYS;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  /**
   * Portion of the first day - relevant for requests in days.
   */
  @JsonAdapter(StartDatePortionEnum.Adapter.class)
 public enum StartDatePortionEnum {
    ALL_DAY("all_day"),
    
    MORNING("morning"),
    
    AFTERNOON("afternoon");

    private String value;

    StartDatePortionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StartDatePortionEnum fromValue(String value) {
      for (StartDatePortionEnum b : StartDatePortionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StartDatePortionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StartDatePortionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StartDatePortionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StartDatePortionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_START_DATE_PORTION = "startDatePortion";
  @SerializedName(SERIALIZED_NAME_START_DATE_PORTION)
  private StartDatePortionEnum startDatePortion = StartDatePortionEnum.ALL_DAY;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Integer hours;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Integer minutes;

  /**
   * Portion of the last day - relevant for requests in days.
   */
  @JsonAdapter(EndDatePortionEnum.Adapter.class)
 public enum EndDatePortionEnum {
    ALL_DAY("all_day"),
    
    MORNING("morning"),
    
    AFTERNOON("afternoon");

    private String value;

    EndDatePortionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EndDatePortionEnum fromValue(String value) {
      for (EndDatePortionEnum b : EndDatePortionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EndDatePortionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndDatePortionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EndDatePortionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EndDatePortionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_END_DATE_PORTION = "endDatePortion";
  @SerializedName(SERIALIZED_NAME_END_DATE_PORTION)
  private EndDatePortionEnum endDatePortion = EndDatePortionEnum.ALL_DAY;

  /**
   * Select &lt;b&gt;morning&lt;/b&gt; when the request is for mornings on the days requested. Select &lt;b&gt;afternoon&lt;/b&gt; when the request is for afternoons on the days requested.&lt;br&gt; This is mandatory if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;portionOnRange&lt;/b&gt;.
   */
  @JsonAdapter(DayPortionEnum.Adapter.class)
 public enum DayPortionEnum {
    MORNING("morning"),
    
    AFTERNOON("afternoon");

    private String value;

    DayPortionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayPortionEnum fromValue(String value) {
      for (DayPortionEnum b : DayPortionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayPortionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayPortionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayPortionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DayPortionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAY_PORTION = "dayPortion";
  @SerializedName(SERIALIZED_NAME_DAY_PORTION)
  private DayPortionEnum dayPortion;

  public static final String SERIALIZED_NAME_DAILY_HOURS = "dailyHours";
  @SerializedName(SERIALIZED_NAME_DAILY_HOURS)
  private Integer dailyHours;

  public static final String SERIALIZED_NAME_DAILY_MINUTES = "dailyMinutes";
  @SerializedName(SERIALIZED_NAME_DAILY_MINUTES)
  private Integer dailyMinutes;

  public static final String SERIALIZED_NAME_SKIP_MANAGER_APPROVAL = "skipManagerApproval";
  @SerializedName(SERIALIZED_NAME_SKIP_MANAGER_APPROVAL)
  private Boolean skipManagerApproval = false;

  public static final String SERIALIZED_NAME_APPROVER = "approver";
  @SerializedName(SERIALIZED_NAME_APPROVER)
  private String approver;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private Integer reasonCode;

  public SubmitTimeoffRequest() {
  }

  public SubmitTimeoffRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Request reason.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request reason.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SubmitTimeoffRequest policyType(String policyType) {
    
    
    
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Request policy type, e.g. Holiday, Sick or any custom type defined.
   * @return policyType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request policy type, e.g. Holiday, Sick or any custom type defined.")

  public String getPolicyType() {
    return policyType;
  }


  public void setPolicyType(String policyType) {
    
    
    
    this.policyType = policyType;
  }


  public SubmitTimeoffRequest requestRangeType(RequestRangeTypeEnum requestRangeType) {
    
    
    
    
    this.requestRangeType = requestRangeType;
    return this;
  }

   /**
   * The type of request duration.&lt;br&gt; Select &lt;b&gt;hours&lt;/b&gt; when the request is for X hours during the day requested (This is supported only for policy types measured in hours).&lt;br&gt; Select &lt;b&gt;portionOnRange&lt;/b&gt; when the  request is for every morning or every afternoon during the days requested.&lt;br&gt; Select &lt;b&gt;hoursOnRange&lt;/b&gt; when the request is for X hours every day during the days requested (This is supported only for policy types measured in hours)
   * @return requestRangeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAYS", value = "The type of request duration.<br> Select <b>hours</b> when the request is for X hours during the day requested (This is supported only for policy types measured in hours).<br> Select <b>portionOnRange</b> when the  request is for every morning or every afternoon during the days requested.<br> Select <b>hoursOnRange</b> when the request is for X hours every day during the days requested (This is supported only for policy types measured in hours)")

  public RequestRangeTypeEnum getRequestRangeType() {
    return requestRangeType;
  }


  public void setRequestRangeType(RequestRangeTypeEnum requestRangeType) {
    
    
    
    this.requestRangeType = requestRangeType;
  }


  public SubmitTimeoffRequest startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of the first day of the time off (not relevant for requests using the hours type).
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the first day of the time off (not relevant for requests using the hours type).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public SubmitTimeoffRequest startDatePortion(StartDatePortionEnum startDatePortion) {
    
    
    
    
    this.startDatePortion = startDatePortion;
    return this;
  }

   /**
   * Portion of the first day - relevant for requests in days.
   * @return startDatePortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALL_DAY", value = "Portion of the first day - relevant for requests in days.")

  public StartDatePortionEnum getStartDatePortion() {
    return startDatePortion;
  }


  public void setStartDatePortion(StartDatePortionEnum startDatePortion) {
    
    
    
    this.startDatePortion = startDatePortion;
  }


  public SubmitTimeoffRequest endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date of the last day of the time off (not relevant for requests using                                                the hours type).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last day of the time off (not relevant for requests using                                                the hours type).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public SubmitTimeoffRequest hours(Integer hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * This field is mandatory if the requestRangeType is set to &#39;hours&#39;.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is mandatory if the requestRangeType is set to 'hours'.")

  public Integer getHours() {
    return hours;
  }


  public void setHours(Integer hours) {
    
    
    
    this.hours = hours;
  }


  public SubmitTimeoffRequest minutes(Integer minutes) {
    
    
    
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Relevant if requestRangeType is set to &#39;hours&#39;.
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relevant if requestRangeType is set to 'hours'.")

  public Integer getMinutes() {
    return minutes;
  }


  public void setMinutes(Integer minutes) {
    
    
    
    this.minutes = minutes;
  }


  public SubmitTimeoffRequest endDatePortion(EndDatePortionEnum endDatePortion) {
    
    
    
    
    this.endDatePortion = endDatePortion;
    return this;
  }

   /**
   * Portion of the last day - relevant for requests in days.
   * @return endDatePortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALL_DAY", value = "Portion of the last day - relevant for requests in days.")

  public EndDatePortionEnum getEndDatePortion() {
    return endDatePortion;
  }


  public void setEndDatePortion(EndDatePortionEnum endDatePortion) {
    
    
    
    this.endDatePortion = endDatePortion;
  }


  public SubmitTimeoffRequest dayPortion(DayPortionEnum dayPortion) {
    
    
    
    
    this.dayPortion = dayPortion;
    return this;
  }

   /**
   * Select &lt;b&gt;morning&lt;/b&gt; when the request is for mornings on the days requested. Select &lt;b&gt;afternoon&lt;/b&gt; when the request is for afternoons on the days requested.&lt;br&gt; This is mandatory if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;portionOnRange&lt;/b&gt;.
   * @return dayPortion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Select <b>morning</b> when the request is for mornings on the days requested. Select <b>afternoon</b> when the request is for afternoons on the days requested.<br> This is mandatory if the <b>requestRangeType</b> is <b>portionOnRange</b>.")

  public DayPortionEnum getDayPortion() {
    return dayPortion;
  }


  public void setDayPortion(DayPortionEnum dayPortion) {
    
    
    
    this.dayPortion = dayPortion;
  }


  public SubmitTimeoffRequest dailyHours(Integer dailyHours) {
    
    
    
    
    this.dailyHours = dailyHours;
    return this;
  }

   /**
   * Enter the number of hours when the request is for X hours on the days requested.&lt;br&gt; This is mandatory if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;hoursOnRange&lt;/b&gt;.
   * @return dailyHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enter the number of hours when the request is for X hours on the days requested.<br> This is mandatory if the <b>requestRangeType</b> is <b>hoursOnRange</b>.")

  public Integer getDailyHours() {
    return dailyHours;
  }


  public void setDailyHours(Integer dailyHours) {
    
    
    
    this.dailyHours = dailyHours;
  }


  public SubmitTimeoffRequest dailyMinutes(Integer dailyMinutes) {
    
    
    
    
    this.dailyMinutes = dailyMinutes;
    return this;
  }

   /**
   * Enter the number of minutes when the request is for X hours and X minutes on the days requested.&lt;br&gt; This is relevant if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;hoursOnRange&lt;/b&gt; and the amount requested is not a full hour or hours.
   * @return dailyMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enter the number of minutes when the request is for X hours and X minutes on the days requested.<br> This is relevant if the <b>requestRangeType</b> is <b>hoursOnRange</b> and the amount requested is not a full hour or hours.")

  public Integer getDailyMinutes() {
    return dailyMinutes;
  }


  public void setDailyMinutes(Integer dailyMinutes) {
    
    
    
    this.dailyMinutes = dailyMinutes;
  }


  public SubmitTimeoffRequest skipManagerApproval(Boolean skipManagerApproval) {
    
    
    
    
    this.skipManagerApproval = skipManagerApproval;
    return this;
  }

   /**
   * Admins only can skip the approval policy. Setting this field to true will create an approved request.
   * @return skipManagerApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Admins only can skip the approval policy. Setting this field to true will create an approved request.")

  public Boolean getSkipManagerApproval() {
    return skipManagerApproval;
  }


  public void setSkipManagerApproval(Boolean skipManagerApproval) {
    
    
    
    this.skipManagerApproval = skipManagerApproval;
  }


  public SubmitTimeoffRequest approver(String approver) {
    
    
    
    
    this.approver = approver;
    return this;
  }

   /**
   * The employee ID of the user to be set as the approver for this request. This is relevant if &#39;skipManagerApproval&#39; is set to true.&lt;br&gt;Please note that the user calling the API with this param must have permission to import time off requests.
   * @return approver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee ID of the user to be set as the approver for this request. This is relevant if 'skipManagerApproval' is set to true.<br>Please note that the user calling the API with this param must have permission to import time off requests.")

  public String getApprover() {
    return approver;
  }


  public void setApprover(String approver) {
    
    
    
    this.approver = approver;
  }


  public SubmitTimeoffRequest reasonCode(Integer reasonCode) {
    
    
    
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The reason code ID taken from the policy type&#39;s reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason code ID taken from the policy type's reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes")

  public Integer getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(Integer reasonCode) {
    
    
    
    this.reasonCode = reasonCode;
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
   * @return the SubmitTimeoffRequest instance itself
   */
  public SubmitTimeoffRequest putAdditionalProperty(String key, Object value) {
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
    SubmitTimeoffRequest submitTimeoffRequest = (SubmitTimeoffRequest) o;
    return Objects.equals(this.description, submitTimeoffRequest.description) &&
        Objects.equals(this.policyType, submitTimeoffRequest.policyType) &&
        Objects.equals(this.requestRangeType, submitTimeoffRequest.requestRangeType) &&
        Objects.equals(this.startDate, submitTimeoffRequest.startDate) &&
        Objects.equals(this.startDatePortion, submitTimeoffRequest.startDatePortion) &&
        Objects.equals(this.endDate, submitTimeoffRequest.endDate) &&
        Objects.equals(this.hours, submitTimeoffRequest.hours) &&
        Objects.equals(this.minutes, submitTimeoffRequest.minutes) &&
        Objects.equals(this.endDatePortion, submitTimeoffRequest.endDatePortion) &&
        Objects.equals(this.dayPortion, submitTimeoffRequest.dayPortion) &&
        Objects.equals(this.dailyHours, submitTimeoffRequest.dailyHours) &&
        Objects.equals(this.dailyMinutes, submitTimeoffRequest.dailyMinutes) &&
        Objects.equals(this.skipManagerApproval, submitTimeoffRequest.skipManagerApproval) &&
        Objects.equals(this.approver, submitTimeoffRequest.approver) &&
        Objects.equals(this.reasonCode, submitTimeoffRequest.reasonCode)&&
        Objects.equals(this.additionalProperties, submitTimeoffRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, policyType, requestRangeType, startDate, startDatePortion, endDate, hours, minutes, endDatePortion, dayPortion, dailyHours, dailyMinutes, skipManagerApproval, approver, reasonCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitTimeoffRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    requestRangeType: ").append(toIndentedString(requestRangeType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDatePortion: ").append(toIndentedString(startDatePortion)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    endDatePortion: ").append(toIndentedString(endDatePortion)).append("\n");
    sb.append("    dayPortion: ").append(toIndentedString(dayPortion)).append("\n");
    sb.append("    dailyHours: ").append(toIndentedString(dailyHours)).append("\n");
    sb.append("    dailyMinutes: ").append(toIndentedString(dailyMinutes)).append("\n");
    sb.append("    skipManagerApproval: ").append(toIndentedString(skipManagerApproval)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("policyType");
    openapiFields.add("requestRangeType");
    openapiFields.add("startDate");
    openapiFields.add("startDatePortion");
    openapiFields.add("endDate");
    openapiFields.add("hours");
    openapiFields.add("minutes");
    openapiFields.add("endDatePortion");
    openapiFields.add("dayPortion");
    openapiFields.add("dailyHours");
    openapiFields.add("dailyMinutes");
    openapiFields.add("skipManagerApproval");
    openapiFields.add("approver");
    openapiFields.add("reasonCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("policyType");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitTimeoffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubmitTimeoffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitTimeoffRequest is not found in the empty JSON string", SubmitTimeoffRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitTimeoffRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("policyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyType").toString()));
      }
      if ((jsonObj.get("requestRangeType") != null && !jsonObj.get("requestRangeType").isJsonNull()) && !jsonObj.get("requestRangeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestRangeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestRangeType").toString()));
      }
      if ((jsonObj.get("startDatePortion") != null && !jsonObj.get("startDatePortion").isJsonNull()) && !jsonObj.get("startDatePortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDatePortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDatePortion").toString()));
      }
      if ((jsonObj.get("endDatePortion") != null && !jsonObj.get("endDatePortion").isJsonNull()) && !jsonObj.get("endDatePortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDatePortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDatePortion").toString()));
      }
      if ((jsonObj.get("dayPortion") != null && !jsonObj.get("dayPortion").isJsonNull()) && !jsonObj.get("dayPortion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dayPortion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dayPortion").toString()));
      }
      if ((jsonObj.get("approver") != null && !jsonObj.get("approver").isJsonNull()) && !jsonObj.get("approver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approver").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitTimeoffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitTimeoffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitTimeoffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitTimeoffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitTimeoffRequest>() {
           @Override
           public void write(JsonWriter out, SubmitTimeoffRequest value) throws IOException {
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
           public SubmitTimeoffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubmitTimeoffRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubmitTimeoffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitTimeoffRequest
  * @throws IOException if the JSON string is invalid with respect to SubmitTimeoffRequest
  */
  public static SubmitTimeoffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitTimeoffRequest.class);
  }

 /**
  * Convert an instance of SubmitTimeoffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

