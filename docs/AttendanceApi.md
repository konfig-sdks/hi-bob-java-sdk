# AttendanceApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importData**](AttendanceApi.md#importData) | **POST** /attendance/import/{importMethod} | Import attendance data |


<a name="importData"></a>
# **importData**
> ImportAttendanceResponse importData(importMethod, body).execute();

Import attendance data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.hibob.com/v1";
    
    // Configure HTTP basic authorization: Basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    HiBob client = new HiBob(configuration);
    String idType = "idType_example"; // The ID type used to identify the employee. Can be one of: \\\"bobId\\\", \\\"email\\\", \\\"idInCompany\\\", or a custom field.<br/>For <b>custom fields</b> a forward slash separator should be used.<br/>In order to use a specific custom field to identify an employee, for example a custom field called \\\"Payroll integration ID\\\":<ul><li>Query the field name via the <a href='https://apidocs.hibob.com/reference/get_company-people-fields'>\\\"Get all company fields\\\"</a></li><li>In the response the name will look like <b>\\\"identification.custom.Payroll Integration ID_1RNhIIf\\\"</b></li><li>The value to use should be: <b>\\\"/identification/custom/Payroll Integration ID_1RNhI\\\"</b></li></ul>
    List<ImportAttendanceEvent> requests = Arrays.asList(); // List of attendance events
    String importMethod = "aggregate"; // Indicates if the provided data should be processed via an aggregation engine or immediately. <ul>Aggregate - will add the logs to a temporary location, and an aggregation job will process the data asynchronously.</ul><ul>Immediate - will insert the records as-is.</ul>
    String dateTimeFormat = "dateTimeFormat_example"; // Allows to set custom date format for the date-time values sent in the requests
    try {
      ImportAttendanceResponse result = client
              .attendance
              .importData(idType, requests, importMethod)
              .dateTimeFormat(dateTimeFormat)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getTotal());
      System.out.println(result.getImported());
      System.out.println(result.getNotImported());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#importData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportAttendanceResponse> response = client
              .attendance
              .importData(idType, requests, importMethod)
              .dateTimeFormat(dateTimeFormat)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#importData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **importMethod** | **String**| Indicates if the provided data should be processed via an aggregation engine or immediately. &lt;ul&gt;Aggregate - will add the logs to a temporary location, and an aggregation job will process the data asynchronously.&lt;/ul&gt;&lt;ul&gt;Immediate - will insert the records as-is.&lt;/ul&gt; | [enum: aggregate, immediate] |
| **body** | [**ImportAttendanceData**](ImportAttendanceData.md)|  | |

### Return type

[**ImportAttendanceResponse**](ImportAttendanceResponse.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Records imported |  -  |
| **400** | Bad request, see error description. |  -  |
| **403** | Forbidden. Authorization is implemented using a service user with attendance management permissions. |  -  |

