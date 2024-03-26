# ObjectsApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchCompanyPositions**](ObjectsApi.md#searchCompanyPositions) | **POST** /objects/position/search | Read company positions |


<a name="searchCompanyPositions"></a>
# **searchCompanyPositions**
> List&lt;PositionEntriesInner&gt; searchCompanyPositions(body).execute();

Read company positions

Returns a list of the company positions, filtered by the specified attributes.  &lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectsApi;
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
    List<String> fields = Arrays.asList(); // Array of field ids (paths) to fetch for the positions.<br /> Minimum 1 up to 50 fields. Any invalid number of fields will get a response of 400 HTTP error.<br /> You can include only the field ids listed in the [Positions Fields Metadata API](https://apidocs.hibob.com/reference/get_metadata-objects-position).
    List<FilterInstruction> filters = Arrays.asList();
    Boolean includeHumanReadable = false; // Whether to include the additional \\\"humanReadable\\\" entry in the response.
    try {
      List<PositionEntriesInner> result = client
              .objects
              .searchCompanyPositions(fields, filters)
              .includeHumanReadable(includeHumanReadable)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#searchCompanyPositions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PositionEntriesInner>> response = client
              .objects
              .searchCompanyPositions(fields, filters)
              .includeHumanReadable(includeHumanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#searchCompanyPositions");
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
| **body** | [**GetPositionsRequest**](GetPositionsRequest.md)|  | |

### Return type

[**List&lt;PositionEntriesInner&gt;**](PositionEntriesInner.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Positions |  -  |
| **0** | Unexpected error. |  -  |

