# TimeOffApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReasonCodes**](TimeOffApi.md#addReasonCodes) | **POST** /timeoff/policy-types/{policyType}/reason-codes | Add a list of reason codes for a given policy type. |
| [**cancelRequest**](TimeOffApi.md#cancelRequest) | **DELETE** /timeoff/employees/{id}/requests/{requestId} | Cancel an existing timeoff request |
| [**createBalanceAdjustment**](TimeOffApi.md#createBalanceAdjustment) | **POST** /timeoff/employees/{id}/adjustments | Create a balance adjustment. |
| [**getDetailsOfRequest**](TimeOffApi.md#getDetailsOfRequest) | **GET** /timeoff/employees/{id}/requests/{requestId} | Get the details of an existing timeoff request. |
| [**getEmployeeBalance**](TimeOffApi.md#getEmployeeBalance) | **GET** /timeoff/employees/{id}/balance | Get the balance for a given employee |
| [**getNewDeletedRequestsSinceDate**](TimeOffApi.md#getNewDeletedRequestsSinceDate) | **GET** /timeoff/requests/changes | Get all new/deleted time off requests since the specified date. |
| [**getOutOfOffice**](TimeOffApi.md#getOutOfOffice) | **GET** /timeoff/outtoday | Read a list of who&#39;s out of the office today or on the specified date. |
| [**getPolicyDetails**](TimeOffApi.md#getPolicyDetails) | **GET** /timeoff/policy-types/{policyType} | Get Policy type details |
| [**getPolicyDetails_0**](TimeOffApi.md#getPolicyDetails_0) | **GET** /timeoff/policies | Get Policy details. |
| [**getWhosOut**](TimeOffApi.md#getWhosOut) | **GET** /timeoff/whosout | Read a list of who&#39;s out of the office. |
| [**listPolicyTypeNames**](TimeOffApi.md#listPolicyTypeNames) | **GET** /timeoff/policies/names | Get a list of policy names for a given policy type. |
| [**listPolicyTypesNames**](TimeOffApi.md#listPolicyTypesNames) | **GET** /timeoff/policy-types | Get all policy types names. |
| [**listReasonCodes**](TimeOffApi.md#listReasonCodes) | **GET** /timeoff/policy-types/{policyType}/reason-codes | Get Policy type reason codes |
| [**submitNewRequest**](TimeOffApi.md#submitNewRequest) | **POST** /timeoff/employees/{id}/requests | Submit a new time off request. |
| [**submitNewRequestDiffHours**](TimeOffApi.md#submitNewRequestDiffHours) | **POST** /timeoff/employees/{id}/diffHours/requests | Submit a new time off request of different hours per day. |


<a name="addReasonCodes"></a>
# **addReasonCodes**
> addReasonCodes(policyType, body).execute();

Add a list of reason codes for a given policy type.

Add a list of reason codes for a given policy type.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyType = "policyType_example"; // Policy Type name
    List<String> reasonCodes = Arrays.asList();
    try {
      client
              .timeOff
              .addReasonCodes(policyType)
              .reasonCodes(reasonCodes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#addReasonCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .addReasonCodes(policyType)
              .reasonCodes(reasonCodes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#addReasonCodes");
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
| **policyType** | **String**| Policy Type name | |
| **body** | [**ReasonCodesNames**](ReasonCodesNames.md)|  | |

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
| **200** | Submitted successfully. |  -  |
| **404** | A policy type with the specified name was not found. |  -  |

<a name="cancelRequest"></a>
# **cancelRequest**
> cancelRequest(id, requestId).execute();

Cancel an existing timeoff request

Cancels an existing time off request.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String id = "id_example"; // Employee ID.
    Integer requestId = 56; // Request ID.
    try {
      client
              .timeOff
              .cancelRequest(id, requestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#cancelRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .cancelRequest(id, requestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#cancelRequest");
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
| **id** | **String**| Employee ID. | |
| **requestId** | **Integer**| Request ID. | |

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
| **200** | Successfully canceled |  -  |

<a name="createBalanceAdjustment"></a>
# **createBalanceAdjustment**
> createBalanceAdjustment(id, body).execute();

Create a balance adjustment.

Create a balance adjustment for a given employee for a given effective date.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String id = "id_example"; // Employee ID.
    String adjustmentType = "balance"; // Adjustment type - balance or time used.
    String policyType = "policyType_example"; // Policy type name.
    LocalDate effectiveDate = LocalDate.now(); // The date this adjustment becomes effective.
    Double amount = 3.4D; // The amount of days/hours to add/subtract.
    String reason = "reason_example"; // A reason for this adjustment.
    try {
      client
              .timeOff
              .createBalanceAdjustment(id)
              .adjustmentType(adjustmentType)
              .policyType(policyType)
              .effectiveDate(effectiveDate)
              .amount(amount)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#createBalanceAdjustment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .createBalanceAdjustment(id)
              .adjustmentType(adjustmentType)
              .policyType(policyType)
              .effectiveDate(effectiveDate)
              .amount(amount)
              .reason(reason)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#createBalanceAdjustment");
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
| **id** | **String**| Employee ID. | |
| **body** | [**AdjustmentRequest**](AdjustmentRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **0** | Unexpected error. |  -  |

<a name="getDetailsOfRequest"></a>
# **getDetailsOfRequest**
> TimeoffRequest getDetailsOfRequest(id, requestId).execute();

Get the details of an existing timeoff request.

Supplies detailed info about an existing time off request.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String id = "id_example"; // employee id
    Integer requestId = 56; // request id
    try {
      TimeoffRequest result = client
              .timeOff
              .getDetailsOfRequest(id, requestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getRequestId());
      System.out.println(result.getPolicyTypeDisplayName());
      System.out.println(result.getType());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartDatePortion());
      System.out.println(result.getEndDate());
      System.out.println(result.getEndDatePortion());
      System.out.println(result.getDayPortion());
      System.out.println(result.getApproved());
      System.out.println(result.getDate());
      System.out.println(result.getHoursOnDate());
      System.out.println(result.getDailyHours());
      System.out.println(result.getDurationUnit());
      System.out.println(result.getTotalDuration());
      System.out.println(result.getTotalCost());
      System.out.println(result.getStatus());
      System.out.println(result.getHasAttachment());
      System.out.println(result.getReasonCode());
      System.out.println(result.getAttachmentLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getDetailsOfRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffRequest> response = client
              .timeOff
              .getDetailsOfRequest(id, requestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getDetailsOfRequest");
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
| **id** | **String**| employee id | |
| **requestId** | **Integer**| request id | |

### Return type

[**TimeoffRequest**](TimeoffRequest.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **404** | A request with the specified ID is not found for the specified employee. |  -  |

<a name="getEmployeeBalance"></a>
# **getEmployeeBalance**
> BalanceResult getEmployeeBalance(id, policyType, date).execute();

Get the balance for a given employee

Retrieve the balance for a given employee, for a given policy type, as of a given date.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String id = "id_example"; // Employee ID.
    String policyType = "policyType_example"; // Policy type name.
    LocalDate date = LocalDate.now(); // Point in time.
    try {
      BalanceResult result = client
              .timeOff
              .getEmployeeBalance(id, policyType, date)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getTotalBalanceAsOfDate());
      System.out.println(result.getTotalRoundedBalanceAsOfDate());
      System.out.println(result.getPointInTime());
      System.out.println(result.getStartingBalance());
      System.out.println(result.getStartingBalanceAsOf());
      System.out.println(result.getTotalTaken());
      System.out.println(result.getTotalAdminAdjustments());
      System.out.println(result.getTotalSystemAdjustments());
      System.out.println(result.getAnnualAllowance());
      System.out.println(result.getPolicy());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getEmployeeBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceResult> response = client
              .timeOff
              .getEmployeeBalance(id, policyType, date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getEmployeeBalance");
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
| **id** | **String**| Employee ID. | |
| **policyType** | **String**| Policy type name. | |
| **date** | **LocalDate**| Point in time. | |

### Return type

[**BalanceResult**](BalanceResult.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Balance result. |  -  |
| **0** | Unexpected error. |  -  |

<a name="getNewDeletedRequestsSinceDate"></a>
# **getNewDeletedRequestsSinceDate**
> TimeoffChanges getNewDeletedRequestsSinceDate(since).includePending(includePending).execute();

Get all new/deleted time off requests since the specified date.

Returns the list of time off requests that are pending, approved or canceled since the specified date.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    LocalDate since = LocalDate.now(); // Timestamp starting from which to return the changes. Should be in ISO-8601 format, e.g. 2050-04-05T14:30:24.345Z or 2050-04-05T12:30-02:00.
    Boolean includePending = false; // Optional parameter. Indicates whether to include pending requests in the results.
    try {
      TimeoffChanges result = client
              .timeOff
              .getNewDeletedRequestsSinceDate(since)
              .includePending(includePending)
              .execute();
      System.out.println(result);
      System.out.println(result.getChanges());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getNewDeletedRequestsSinceDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffChanges> response = client
              .timeOff
              .getNewDeletedRequestsSinceDate(since)
              .includePending(includePending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getNewDeletedRequestsSinceDate");
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
| **since** | **LocalDate**| Timestamp starting from which to return the changes. Should be in ISO-8601 format, e.g. 2050-04-05T14:30:24.345Z or 2050-04-05T12:30-02:00. | |
| **includePending** | **Boolean**| Optional parameter. Indicates whether to include pending requests in the results. | [optional] [default to false] |

### Return type

[**TimeoffChanges**](TimeoffChanges.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of changes |  -  |

<a name="getOutOfOffice"></a>
# **getOutOfOffice**
> OutTodays getOutOfOffice().today(today).includeHourly(includeHourly).includePrivate(includePrivate).siteId(siteId).execute();

Read a list of who&#39;s out of the office today or on the specified date.

Returns the list of people that have a time off request today or on the specified date.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    LocalDate today = LocalDate.now(); // Date to report out of the office. If not specified, the date at UTC at the time of the request is used.
    Boolean includeHourly = false; // Include Hourly Requests
    Boolean includePrivate = false; // Show the policy type's name instead of the policy's custom public name if the user has permission to view it, and the policy's custom public name exists.
    Integer siteId = 56; // The employee's site ID
    try {
      OutTodays result = client
              .timeOff
              .getOutOfOffice()
              .today(today)
              .includeHourly(includeHourly)
              .includePrivate(includePrivate)
              .siteId(siteId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOuts());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getOutOfOffice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OutTodays> response = client
              .timeOff
              .getOutOfOffice()
              .today(today)
              .includeHourly(includeHourly)
              .includePrivate(includePrivate)
              .siteId(siteId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getOutOfOffice");
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
| **today** | **LocalDate**| Date to report out of the office. If not specified, the date at UTC at the time of the request is used. | [optional] |
| **includeHourly** | **Boolean**| Include Hourly Requests | [optional] [default to false] |
| **includePrivate** | **Boolean**| Show the policy type&#39;s name instead of the policy&#39;s custom public name if the user has permission to view it, and the policy&#39;s custom public name exists. | [optional] [default to false] |
| **siteId** | **Integer**| The employee&#39;s site ID | [optional] |

### Return type

[**OutTodays**](OutTodays.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of people who have taken time off, as seen by the logged in user. |  -  |
| **0** | Unexpected error |  -  |

<a name="getPolicyDetails"></a>
# **getPolicyDetails**
> PolicyType getPolicyDetails(policyType).execute();

Get Policy type details

Get details about a given policy type.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyType = "policyType_example"; // Policy Type name
    try {
      PolicyType result = client
              .timeOff
              .getPolicyDetails(policyType)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getActivity());
      System.out.println(result.getBookingWorkDaysOnly());
      System.out.println(result.getUnit());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyType> response = client
              .timeOff
              .getPolicyDetails(policyType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicyDetails");
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
| **policyType** | **String**| Policy Type name | |

### Return type

[**PolicyType**](PolicyType.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy type |  -  |
| **404** | A policy type with the specified name was not found. |  -  |

<a name="getPolicyDetails_0"></a>
# **getPolicyDetails_0**
> Policy getPolicyDetails_0(policyName).execute();

Get Policy details.

Get details about a given policy.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyName = "policyName_example"; // Policy name.
    try {
      Policy result = client
              .timeOff
              .getPolicyDetails_0(policyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getAllowance());
      System.out.println(result.getMaxBalance());
      System.out.println(result.getMinBalance());
      System.out.println(result.getYosIncrease());
      System.out.println(result.getMinTimeOffRequestDuration());
      System.out.println(result.getApprovalRequired());
      System.out.println(result.getUnit());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicyDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .timeOff
              .getPolicyDetails_0(policyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicyDetails_0");
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
| **policyName** | **String**| Policy name. | |

### Return type

[**Policy**](Policy.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy |  -  |
| **404** | A policy with the specified name was not found. |  -  |

<a name="getWhosOut"></a>
# **getWhosOut**
> Requests getWhosOut(from, to).includeHourly(includeHourly).includePrivate(includePrivate).includePending(includePending).execute();

Read a list of who&#39;s out of the office.

Returns time off information for a given date range.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    LocalDate from = LocalDate.now(); // Start period date
    LocalDate to = LocalDate.now(); // End period date
    Boolean includeHourly = false; // Include Hourly Requests
    Boolean includePrivate = false; // Show the policy type's name instead of the policy's custom public name if the user has permission to view it, and the policy's custom public name exists.
    Boolean includePending = false; // Include Pending Requests
    try {
      Requests result = client
              .timeOff
              .getWhosOut(from, to)
              .includeHourly(includeHourly)
              .includePrivate(includePrivate)
              .includePending(includePending)
              .execute();
      System.out.println(result);
      System.out.println(result.getOuts());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getWhosOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Requests> response = client
              .timeOff
              .getWhosOut(from, to)
              .includeHourly(includeHourly)
              .includePrivate(includePrivate)
              .includePending(includePending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getWhosOut");
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
| **from** | **LocalDate**| Start period date | |
| **to** | **LocalDate**| End period date | |
| **includeHourly** | **Boolean**| Include Hourly Requests | [optional] [default to false] |
| **includePrivate** | **Boolean**| Show the policy type&#39;s name instead of the policy&#39;s custom public name if the user has permission to view it, and the policy&#39;s custom public name exists. | [optional] [default to false] |
| **includePending** | **Boolean**| Include Pending Requests | [optional] [default to false] |

### Return type

[**Requests**](Requests.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time off requests as seen by the logged in user for a given date range. |  -  |
| **0** | Unexpected error |  -  |

<a name="listPolicyTypeNames"></a>
# **listPolicyTypeNames**
> PolicyNames listPolicyTypeNames(policyTypeName).execute();

Get a list of policy names for a given policy type.

Get a list of policy names for the user&#39;s defined policy type.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyTypeName = "policyTypeName_example"; // Policy type name.
    try {
      PolicyNames result = client
              .timeOff
              .listPolicyTypeNames(policyTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolicyNames());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listPolicyTypeNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyNames> response = client
              .timeOff
              .listPolicyTypeNames(policyTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listPolicyTypeNames");
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
| **policyTypeName** | **String**| Policy type name. | |

### Return type

[**PolicyNames**](PolicyNames.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of policy names. |  -  |

<a name="listPolicyTypesNames"></a>
# **listPolicyTypesNames**
> PolicyTypes listPolicyTypesNames().execute();

Get all policy types names.

Get a list of all policy type names.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
      PolicyTypes result = client
              .timeOff
              .listPolicyTypesNames()
              .execute();
      System.out.println(result);
      System.out.println(result.getPolicyTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listPolicyTypesNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyTypes> response = client
              .timeOff
              .listPolicyTypesNames()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listPolicyTypesNames");
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

[**PolicyTypes**](PolicyTypes.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of policy types names. |  -  |
| **0** | Unexpected error. |  -  |

<a name="listReasonCodes"></a>
# **listReasonCodes**
> ReasonCodes listReasonCodes(policyType).execute();

Get Policy type reason codes

Get list of reason codes for a given policy type.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyType = "policyType_example"; // Policy Type name.
    try {
      ReasonCodes result = client
              .timeOff
              .listReasonCodes(policyType)
              .execute();
      System.out.println(result);
      System.out.println(result.getReasonCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listReasonCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReasonCodes> response = client
              .timeOff
              .listReasonCodes(policyType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listReasonCodes");
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
| **policyType** | **String**| Policy Type name. | |

### Return type

[**ReasonCodes**](ReasonCodes.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of reason codes. |  -  |
| **404** | A policy type with the specified name was not found. |  -  |

<a name="submitNewRequest"></a>
# **submitNewRequest**
> submitNewRequest(id, body).execute();

Submit a new time off request.

Submits a new timeoff request.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String policyType = "policyType_example"; // Request policy type, e.g. Holiday, Sick or any custom type defined.
    LocalDate startDate = LocalDate.now(); // Date of the first day of the time off (not relevant for requests using the hours type).
    String id = "id_example"; // Employee ID.
    String description = "description_example"; // Request reason.
    String requestRangeType = "days"; // The type of request duration.<br> Select <b>hours</b> when the request is for X hours during the day requested (This is supported only for policy types measured in hours).<br> Select <b>portionOnRange</b> when the  request is for every morning or every afternoon during the days requested.<br> Select <b>hoursOnRange</b> when the request is for X hours every day during the days requested (This is supported only for policy types measured in hours)
    String startDatePortion = "all_day"; // Portion of the first day - relevant for requests in days.
    LocalDate endDate = LocalDate.now(); // Date of the last day of the time off (not relevant for requests using                                                the hours type).
    Integer hours = 56; // This field is mandatory if the requestRangeType is set to 'hours'.
    Integer minutes = 56; // Relevant if requestRangeType is set to 'hours'.
    String endDatePortion = "all_day"; // Portion of the last day - relevant for requests in days.
    String dayPortion = "morning"; // Select <b>morning</b> when the request is for mornings on the days requested. Select <b>afternoon</b> when the request is for afternoons on the days requested.<br> This is mandatory if the <b>requestRangeType</b> is <b>portionOnRange</b>.
    Integer dailyHours = 56; // Enter the number of hours when the request is for X hours on the days requested.<br> This is mandatory if the <b>requestRangeType</b> is <b>hoursOnRange</b>.
    Integer dailyMinutes = 56; // Enter the number of minutes when the request is for X hours and X minutes on the days requested.<br> This is relevant if the <b>requestRangeType</b> is <b>hoursOnRange</b> and the amount requested is not a full hour or hours.
    Boolean skipManagerApproval = false; // Admins only can skip the approval policy. Setting this field to true will create an approved request.
    String approver = "approver_example"; // The employee ID of the user to be set as the approver for this request. This is relevant if 'skipManagerApproval' is set to true.<br>Please note that the user calling the API with this param must have permission to import time off requests.
    Integer reasonCode = 56; // The reason code ID taken from the policy type's reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes
    try {
      client
              .timeOff
              .submitNewRequest(policyType, startDate, id)
              .description(description)
              .requestRangeType(requestRangeType)
              .startDatePortion(startDatePortion)
              .endDate(endDate)
              .hours(hours)
              .minutes(minutes)
              .endDatePortion(endDatePortion)
              .dayPortion(dayPortion)
              .dailyHours(dailyHours)
              .dailyMinutes(dailyMinutes)
              .skipManagerApproval(skipManagerApproval)
              .approver(approver)
              .reasonCode(reasonCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#submitNewRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .submitNewRequest(policyType, startDate, id)
              .description(description)
              .requestRangeType(requestRangeType)
              .startDatePortion(startDatePortion)
              .endDate(endDate)
              .hours(hours)
              .minutes(minutes)
              .endDatePortion(endDatePortion)
              .dayPortion(dayPortion)
              .dailyHours(dailyHours)
              .dailyMinutes(dailyMinutes)
              .skipManagerApproval(skipManagerApproval)
              .approver(approver)
              .reasonCode(reasonCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#submitNewRequest");
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
| **id** | **String**| Employee ID. | |
| **body** | [**SubmitTimeoffRequest**](SubmitTimeoffRequest.md)|  | |

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
| **200** | Successfully submitted |  -  |

<a name="submitNewRequestDiffHours"></a>
# **submitNewRequestDiffHours**
> submitNewRequestDiffHours(id, body).execute();

Submit a new time off request of different hours per day.

Submits a new timeoff request of different hours per day.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Employee, Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    
    configuration.bearer  = "YOUR API KEY";
    HiBob client = new HiBob(configuration);
    String policyType = "policyType_example"; // Request policy type, e.g. Holiday, Sick or any custom type defined.
    LocalDate startDate = LocalDate.now(); // Date of the first day of the time off
    LocalDate endDate = LocalDate.now(); // Date of the last day of the time off.
    List<SubmitTimeoffRequestDiffHoursDurationsInner> durations = Arrays.asList(); // Array of durations for each day in the request.
    String id = "id_example"; // Employee ID.
    String description = "description_example"; // Request reason.
    Boolean skipManagerApproval = false; // Admins only can skip the approval policy. Setting this field to true will create an approved request.
    String approver = "approver_example"; // The employee ID of the user to be set as the approver for this request. This is relevant if 'skipManagerApproval' is set to true.<br>Please note that the user calling the API with this param must have permission to import time off requests.
    Integer reasonCode = 56; // The reason code ID taken from the policy type's reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes
    try {
      client
              .timeOff
              .submitNewRequestDiffHours(policyType, startDate, endDate, durations, id)
              .description(description)
              .skipManagerApproval(skipManagerApproval)
              .approver(approver)
              .reasonCode(reasonCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#submitNewRequestDiffHours");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .submitNewRequestDiffHours(policyType, startDate, endDate, durations, id)
              .description(description)
              .skipManagerApproval(skipManagerApproval)
              .approver(approver)
              .reasonCode(reasonCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#submitNewRequestDiffHours");
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
| **id** | **String**| Employee ID. | |
| **body** | [**SubmitTimeoffRequestDiffHours**](SubmitTimeoffRequestDiffHours.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully submitted |  -  |

