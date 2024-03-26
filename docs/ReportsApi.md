# ReportsApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadById**](ReportsApi.md#downloadById) | **GET** /company/reports/{reportId}/download | Download the report by ID |
| [**downloadReportFile**](ReportsApi.md#downloadReportFile) | **GET** /company/reports/download/{reportName} | Download report by file URL |
| [**getDownloadUrl**](ReportsApi.md#getDownloadUrl) | **GET** /company/reports/{reportId}/download-async | Get the report download URL for polling |
| [**listAccessibleReports**](ReportsApi.md#listAccessibleReports) | **GET** /company/reports | Read company reports |


<a name="downloadById"></a>
# **downloadById**
> File downloadById(reportId, format).includeInfo(includeInfo).locale(locale).humanReadable(humanReadable).execute();

Download the report by ID

Returns a report data file in the specified format.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    Double reportId = 3.4D; // Report ID
    String format = "csv"; // File format
    Boolean includeInfo = true; // Should include info.
    String locale = "locale_example"; // Requested language for the report columns in the format of locale (e.g. fr-FR). If this is not provided, the user preferences locale is used.
    String humanReadable = "humanReadable_example"; // Optional field. Only enforced when <i><b>format</b></i> is <i>json</i>. <br> <b>If not sent:</b> supply machine-readable values only. <br> <br> Possible values: <br>  <br> <b>APPEND</b> - include the additional \"humanReadable\" JSON node in the response. <br>  <br> <b>REPLACE</b> - supply humanReadable values in JSON instead of machine-readable format. <br>
    try {
      File result = client
              .reports
              .downloadById(reportId, format)
              .includeInfo(includeInfo)
              .locale(locale)
              .humanReadable(humanReadable)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .reports
              .downloadById(reportId, format)
              .includeInfo(includeInfo)
              .locale(locale)
              .humanReadable(humanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadById");
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
| **reportId** | **Double**| Report ID | |
| **format** | **String**| File format | [enum: csv, xlsx, json] |
| **includeInfo** | **Boolean**| Should include info. | [optional] |
| **locale** | **String**| Requested language for the report columns in the format of locale (e.g. fr-FR). If this is not provided, the user preferences locale is used. | [optional] |
| **humanReadable** | **String**| Optional field. Only enforced when &lt;i&gt;&lt;b&gt;format&lt;/b&gt;&lt;/i&gt; is &lt;i&gt;json&lt;/i&gt;. &lt;br&gt; &lt;b&gt;If not sent:&lt;/b&gt; supply machine-readable values only. &lt;br&gt; &lt;br&gt; Possible values: &lt;br&gt;  &lt;br&gt; &lt;b&gt;APPEND&lt;/b&gt; - include the additional \&quot;humanReadable\&quot; JSON node in the response. &lt;br&gt;  &lt;br&gt; &lt;b&gt;REPLACE&lt;/b&gt; - supply humanReadable values in JSON instead of machine-readable format. &lt;br&gt; | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Includes the report name and execution date in the report file. By default this is set to True. |  -  |
| **0** | Unexpected error |  -  |

<a name="downloadReportFile"></a>
# **downloadReportFile**
> File downloadReportFile(reportName).execute();

Download report by file URL

Returns the report data file when it is ready. If the file is not ready yet the response will be 204. It will then have to try again.&lt;br /&gt;(This URL is the response of the previous API: https://api.hibob.com/v1/company/reports/reportId/download-async)&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    String reportName = "reportName_example"; // Report name
    try {
      File result = client
              .reports
              .downloadReportFile(reportName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadReportFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .reports
              .downloadReportFile(reportName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadReportFile");
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
| **reportName** | **String**| Report name | |

### Return type

[**File**](File.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Include the report name and execution date in the report file. This defaults to true. |  -  |
| **204** | The file is not yet ready, please try again. |  -  |
| **0** | Unexpected error |  -  |

<a name="getDownloadUrl"></a>
# **getDownloadUrl**
> getDownloadUrl(reportId, format).includeInfo(includeInfo).locale(locale).humanReadable(humanReadable).execute();

Get the report download URL for polling

Returns the polling URL report file of the specified format under \&quot;Location\&quot; in the response header.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    Double reportId = 3.4D; // Report id
    String format = "csv"; // File format
    Boolean includeInfo = true; // Should include info
    String locale = "locale_example"; // Requested language for the report columns in the format of the locale (e.g. fr-FR). If this is not provided, the user preferences locale is used.
    String humanReadable = "humanReadable_example"; // Optional field. Only enforced when <i><b>format</b></i> is <i>json</i>. <br> <b>If not sent:</b> supply machine-readable values only. <br> <br> Possible values: <br>  <br> <b>APPEND</b> - include the additional \"humanReadable\" JSON node in the response. <br>  <br> <b>REPLACE</b> - supply humanReadable values in JSON instead of machine-readable format. <br>
    try {
      client
              .reports
              .getDownloadUrl(reportId, format)
              .includeInfo(includeInfo)
              .locale(locale)
              .humanReadable(humanReadable)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDownloadUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reports
              .getDownloadUrl(reportId, format)
              .includeInfo(includeInfo)
              .locale(locale)
              .humanReadable(humanReadable)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDownloadUrl");
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
| **reportId** | **Double**| Report id | |
| **format** | **String**| File format | [enum: csv, xlsx] |
| **includeInfo** | **Boolean**| Should include info | [optional] |
| **locale** | **String**| Requested language for the report columns in the format of the locale (e.g. fr-FR). If this is not provided, the user preferences locale is used. | [optional] |
| **humanReadable** | **String**| Optional field. Only enforced when &lt;i&gt;&lt;b&gt;format&lt;/b&gt;&lt;/i&gt; is &lt;i&gt;json&lt;/i&gt;. &lt;br&gt; &lt;b&gt;If not sent:&lt;/b&gt; supply machine-readable values only. &lt;br&gt; &lt;br&gt; Possible values: &lt;br&gt;  &lt;br&gt; &lt;b&gt;APPEND&lt;/b&gt; - include the additional \&quot;humanReadable\&quot; JSON node in the response. &lt;br&gt;  &lt;br&gt; &lt;b&gt;REPLACE&lt;/b&gt; - supply humanReadable values in JSON instead of machine-readable format. &lt;br&gt; | [optional] |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report URL under \&quot;Location\&quot; in the response header. |  -  |
| **0** | Unexpected error |  -  |

<a name="listAccessibleReports"></a>
# **listAccessibleReports**
> Reports listAccessibleReports().execute();

Read company reports

Returns a list of all the defined company reports. The data is filtered based on the access level of the user. Only viewable categories are returned.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    try {
      Reports result = client
              .reports
              .listAccessibleReports()
              .execute();
      System.out.println(result);
      System.out.println(result.getViews());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listAccessibleReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Reports> response = client
              .reports
              .listAccessibleReports()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listAccessibleReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Reports**](Reports.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Company Reports |  -  |
| **0** | Unexpected error |  -  |

