# CustomTablesApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEntry**](CustomTablesApi.md#createNewEntry) | **POST** /people/custom-tables/{employee_id}/{custom_table_id} | Create new custom table entry |
| [**deleteEntryById**](CustomTablesApi.md#deleteEntryById) | **DELETE** /people/custom-tables/{employee_id}/{custom_table_id}/{entry_id} | Delete custom table entry |
| [**readEntries**](CustomTablesApi.md#readEntries) | **GET** /people/custom-tables/{employee_id}/{custom_table_id} | Read all entries of the given custom table |
| [**updateEntry**](CustomTablesApi.md#updateEntry) | **PUT** /people/custom-tables/{employee_id}/{custom_table_id}/{entry_id} | Update custom table entry |


<a name="createNewEntry"></a>
# **createNewEntry**
> createNewEntry(employeeId, customTableId, values).execute();

Create new custom table entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomTablesApi;
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
    String employeeId = "employeeId_example"; // Employee ID.
    String customTableId = "customTableId_example"; // The ID of custom table.
    String RAW_BODY = "RAW_BODY_example";
    try {
      client
              .customTables
              .createNewEntry(employeeId, customTableId)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#createNewEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customTables
              .createNewEntry(employeeId, customTableId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#createNewEntry");
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
| **employeeId** | **String**| Employee ID. | |
| **customTableId** | **String**| The ID of custom table. | |
| **values** | [**CustomTablesCreateNewEntryRequest**](CustomTablesCreateNewEntryRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entry created successfully |  -  |

<a name="deleteEntryById"></a>
# **deleteEntryById**
> deleteEntryById(employeeId, customTableId, entryId).execute();

Delete custom table entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomTablesApi;
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
    String employeeId = "employeeId_example"; // Employee ID.
    String customTableId = "customTableId_example"; // The ID of custom table.
    String entryId = "entryId_example"; // The ID of custom table entry.
    try {
      client
              .customTables
              .deleteEntryById(employeeId, customTableId, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#deleteEntryById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customTables
              .deleteEntryById(employeeId, customTableId, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#deleteEntryById");
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
| **employeeId** | **String**| Employee ID. | |
| **customTableId** | **String**| The ID of custom table. | |
| **entryId** | **String**| The ID of custom table entry. | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entry deleted successfully |  -  |

<a name="readEntries"></a>
# **readEntries**
> CustomTableEntriesList readEntries(employeeId, customTableId).includeHumanReadable(includeHumanReadable).execute();

Read all entries of the given custom table

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomTablesApi;
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
    String employeeId = "employeeId_example"; // Employee ID.
    String customTableId = "customTableId_example"; // The ID of custom table.
    Boolean includeHumanReadable = false; // Whether to include the additional \"humanReadable\" JSON node in the response.
    try {
      CustomTableEntriesList result = client
              .customTables
              .readEntries(employeeId, customTableId)
              .includeHumanReadable(includeHumanReadable)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#readEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomTableEntriesList> response = client
              .customTables
              .readEntries(employeeId, customTableId)
              .includeHumanReadable(includeHumanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#readEntries");
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
| **employeeId** | **String**| Employee ID. | |
| **customTableId** | **String**| The ID of custom table. | |
| **includeHumanReadable** | **Boolean**| Whether to include the additional \&quot;humanReadable\&quot; JSON node in the response. | [optional] [default to false] |

### Return type

[**CustomTableEntriesList**](CustomTableEntriesList.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="updateEntry"></a>
# **updateEntry**
> updateEntry(employeeId, customTableId, entryId).entry(entry).execute();

Update custom table entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomTablesApi;
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
    String employeeId = "employeeId_example"; // Employee ID.
    String customTableId = "customTableId_example"; // The ID of custom table.
    String entryId = "entryId_example"; // The ID of custom table entry.
    String RAW_BODY = "RAW_BODY_example";
    try {
      client
              .customTables
              .updateEntry(employeeId, customTableId, entryId)
              .RAW_BODY(RAW_BODY)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#updateEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customTables
              .updateEntry(employeeId, customTableId, entryId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomTablesApi#updateEntry");
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
| **employeeId** | **String**| Employee ID. | |
| **customTableId** | **String**| The ID of custom table. | |
| **entryId** | **String**| The ID of custom table entry. | |
| **entry** | [**CustomTablesUpdateEntryRequest**](CustomTablesUpdateEntryRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entry updated successfully |  -  |

