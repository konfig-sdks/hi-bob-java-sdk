# PayrollApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEquityGrant**](PayrollApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee. |
| [**createNewSalaryEntry**](PayrollApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee. |
| [**createTrainingRecord**](PayrollApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee |
| [**createVariablePayment**](PayrollApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee. |
| [**deleteEquityGrant**](PayrollApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee. |
| [**deleteSalaryEntry**](PayrollApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list. |
| [**deleteTrainingRecord**](PayrollApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee. |
| [**deleteTrainingRecord_0**](PayrollApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee. |
| [**getSalaryHistory**](PayrollApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history. |
| [**listEquityGrants**](PayrollApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants. |
| [**listTrainingRecords**](PayrollApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records. |
| [**listVariablePayments**](PayrollApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments |
| [**readHistory**](PayrollApi.md#readHistory) | **GET** /payroll/history | Read payroll history. |
| [**updateEquityGrantForEmployee**](PayrollApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee |


<a name="createEquityGrant"></a>
# **createEquityGrant**
> createEquityGrant(id, entry).execute();

Creates a new equity grant for a given employee.

&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Double quantity = 3.4D; // The number of equities granted.
    String equityType = "equityType_example"; // The type of the grant.
    String id = "id_example"; // Employee ID.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    LocalDate vestingCommencementDate = LocalDate.now(); // Vesting commencement date.
    String consentNumber = "consentNumber_example"; // Consent number.
    LocalDate grantDate = LocalDate.now(); // Date the equity was granted.
    LocalDate optionExpiration = LocalDate.now(); // Date the options expire.
    CurrencyValue exercisePrice = new CurrencyValue();
    String vestingTerm = "vestingTerm_example"; // Terms for exercising this grant.
    String grantType = "grantType_example"; // Grant type. One of: Initial Grant, Merit Grant
    Double vestingSchedule = 3.4D; // The vesting schedule ID assigned to this grant.
    Double grantNumber = 3.4D; // The Grant number for employee.
    String grantStatus = "grantStatus_example"; // Grant status. one of: Granted, Pending Approval
    try {
      client
              .payroll
              .createEquityGrant(quantity, equityType, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .vestingCommencementDate(vestingCommencementDate)
              .consentNumber(consentNumber)
              .grantDate(grantDate)
              .optionExpiration(optionExpiration)
              .exercisePrice(exercisePrice)
              .vestingTerm(vestingTerm)
              .grantType(grantType)
              .vestingSchedule(vestingSchedule)
              .grantNumber(grantNumber)
              .grantStatus(grantStatus)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .createEquityGrant(quantity, equityType, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .vestingCommencementDate(vestingCommencementDate)
              .consentNumber(consentNumber)
              .grantDate(grantDate)
              .optionExpiration(optionExpiration)
              .exercisePrice(exercisePrice)
              .vestingTerm(vestingTerm)
              .grantType(grantType)
              .vestingSchedule(vestingSchedule)
              .grantNumber(grantNumber)
              .grantStatus(grantStatus)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createEquityGrant");
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
| **entry** | [**EquityEntry**](EquityEntry.md)| Equity grant to add. | |

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
| **200** | Entry added successfully. |  -  |

<a name="createNewSalaryEntry"></a>
# **createNewSalaryEntry**
> createNewSalaryEntry(id, entry).execute();

Creates a new salary entry for a given employee.

&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    CurrencyValue base = new CurrencyValue();
    String payPeriod = "payPeriod_example"; // Represents the period for this salary entry. This can be one of: Annual, Hourly, Daily, Weekly, Monthly.
    String id = "id_example"; // Employee ID.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String payFrequency = "payFrequency_example"; // Represents the frequency the salary is paid. This can be one of: Weekly, Monthly, Pro rata, Every two weeks, Twice a month, Every four weeks.
    try {
      client
              .payroll
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createNewSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createNewSalaryEntry");
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
| **entry** | [**SalaryEntry**](SalaryEntry.md)| Salary entry to add. This must not conflict with another entry on the same effective date. | |

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
| **200** | Entry added successfully. |  -  |

<a name="createTrainingRecord"></a>
# **createTrainingRecord**
> createTrainingRecord(id, entry).execute();

Creates a new training records for a given employee

&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String description = "description_example"; // Further description about the training entry.
    String name = "name_example"; // The name of the training entry. The name must be an item in the training list field.
    CurrencyValue cost = new CurrencyValue();
    String status = "status_example"; // The status of the training entry
    String frequency = "frequency_example"; // The frequency of the training entry. The name must be of an item in the frequency list field.
    LocalDate startDate = LocalDate.now(); // The date this entry becomes effective.
    LocalDate endDate = LocalDate.now(); // The date of training completion.
    Double documentId = 3.4D; // ID of the document attached to this training entry.
    try {
      client
              .payroll
              .createTrainingRecord(id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .description(description)
              .name(name)
              .cost(cost)
              .status(status)
              .frequency(frequency)
              .startDate(startDate)
              .endDate(endDate)
              .documentId(documentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .createTrainingRecord(id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .description(description)
              .name(name)
              .cost(cost)
              .status(status)
              .frequency(frequency)
              .startDate(startDate)
              .endDate(endDate)
              .documentId(documentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createTrainingRecord");
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
| **entry** | [**TrainingEntry**](TrainingEntry.md)| Training entry to add. | |

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
| **200** | Entry added successfully. |  -  |

<a name="createVariablePayment"></a>
# **createVariablePayment**
> createVariablePayment(id, entry).execute();

Creates a new variable payment for a given employee.

&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;:The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    CurrencyValue amount = new CurrencyValue();
    String paymentPeriod = "paymentPeriod_example"; // This represents the period for this variable entry. It can be one of: Annual, Half-Yearly, Quarterly, Monthly.
    String id = "id_example"; // Employee ID.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String variableType = "variableType_example"; // The type of variable pay.
    Double companyPercent = 3.4D; // The employee's company on-target weight, in percent.
    Double departmentPercent = 3.4D; // The employee's department on-target weight, in percent.
    Double individualPercent = 3.4D; // The employee's individual on-target weight, in percent.
    try {
      client
              .payroll
              .createVariablePayment(amount, paymentPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .variableType(variableType)
              .companyPercent(companyPercent)
              .departmentPercent(departmentPercent)
              .individualPercent(individualPercent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createVariablePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .createVariablePayment(amount, paymentPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .variableType(variableType)
              .companyPercent(companyPercent)
              .departmentPercent(departmentPercent)
              .individualPercent(individualPercent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#createVariablePayment");
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
| **entry** | [**VariableEntry**](VariableEntry.md)| Variable payment to add. | |

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
| **200** | Entry added successfully |  -  |

<a name="deleteEquityGrant"></a>
# **deleteEquityGrant**
> deleteEquityGrant(id, entryId).execute();

Deletes an equity grant for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Integer entryId = 56; // The Entry ID to delete.
    try {
      client
              .payroll
              .deleteEquityGrant(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteEquityGrant(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteEquityGrant");
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
| **entryId** | **Integer**| The Entry ID to delete. | |

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
| **200** | Entry deleted successfully. |  -  |

<a name="deleteSalaryEntry"></a>
# **deleteSalaryEntry**
> deleteSalaryEntry(id, entryId).execute();

Deletes a salary entry from the employee&#39;s list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Integer entryId = 56; // The entry ID to delete.
    try {
      client
              .payroll
              .deleteSalaryEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteSalaryEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteSalaryEntry");
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
| **entryId** | **Integer**| The entry ID to delete. | |

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
| **200** | Entry deleted successfully. |  -  |

<a name="deleteTrainingRecord"></a>
# **deleteTrainingRecord**
> deleteTrainingRecord(id, entryId).execute();

Deletes a training record for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Integer entryId = 56; // The Entry ID to delete.
    try {
      client
              .payroll
              .deleteTrainingRecord(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteTrainingRecord(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteTrainingRecord");
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
| **entryId** | **Integer**| The Entry ID to delete. | |

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
| **200** | Entry deleted successfully. |  -  |

<a name="deleteTrainingRecord_0"></a>
# **deleteTrainingRecord_0**
> deleteTrainingRecord_0(id, entryId).execute();

Deletes any training records for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Integer entryId = 56; // The Entry ID to delete.
    try {
      client
              .payroll
              .deleteTrainingRecord_0(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteTrainingRecord_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteTrainingRecord_0(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteTrainingRecord_0");
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
| **entryId** | **Integer**| The Entry ID to delete. | |

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
| **200** | Entry deleted successfully. |  -  |

<a name="getSalaryHistory"></a>
# **getSalaryHistory**
> SalaryEntries getSalaryHistory(id).execute();

List employee&#39;s salary history.

Returns a list of salary history entries for a given employee.&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    try {
      SalaryEntries result = client
              .payroll
              .getSalaryHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getSalaryHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalaryEntries> response = client
              .payroll
              .getSalaryHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getSalaryHistory");
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

### Return type

[**SalaryEntries**](SalaryEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of salary entries. |  -  |

<a name="listEquityGrants"></a>
# **listEquityGrants**
> EquityEntries listEquityGrants(id).execute();

List the employee&#39;s equity grants.

Returns a list of equity grants for a given employee.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    try {
      EquityEntries result = client
              .payroll
              .listEquityGrants(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listEquityGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EquityEntries> response = client
              .payroll
              .listEquityGrants(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listEquityGrants");
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

### Return type

[**EquityEntries**](EquityEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of salary equity grants. |  -  |

<a name="listTrainingRecords"></a>
# **listTrainingRecords**
> TrainingEntries listTrainingRecords(id).execute();

List the employee&#39;s training records.

Returns a list of training records for a given employee&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    try {
      TrainingEntries result = client
              .payroll
              .listTrainingRecords(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listTrainingRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingEntries> response = client
              .payroll
              .listTrainingRecords(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listTrainingRecords");
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

### Return type

[**TrainingEntries**](TrainingEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of training records. |  -  |

<a name="listVariablePayments"></a>
# **listVariablePayments**
> VariableEntries listVariablePayments(id).execute();

List employee&#39;s variable payments

Returns a list of variable payments for a given employee.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    try {
      VariableEntries result = client
              .payroll
              .listVariablePayments(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listVariablePayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VariableEntries> response = client
              .payroll
              .listVariablePayments(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listVariablePayments");
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

### Return type

[**VariableEntries**](VariableEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of variable payments. |  -  |

<a name="readHistory"></a>
# **readHistory**
> Employees readHistory().department(department).showInactive(showInactive).execute();

Read payroll history.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String department = "department_example"; // filter payroll for specific department.
    Boolean showInactive = true; // Whether to include inactive employees in the response.
    try {
      Employees result = client
              .payroll
              .readHistory()
              .department(department)
              .showInactive(showInactive)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#readHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employees> response = client
              .payroll
              .readHistory()
              .department(department)
              .showInactive(showInactive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#readHistory");
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
| **department** | **String**| filter payroll for specific department. | [optional] |
| **showInactive** | **Boolean**| Whether to include inactive employees in the response. | [optional] |

### Return type

[**Employees**](Employees.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payroll data. |  -  |
| **0** | Unexpected error |  -  |

<a name="updateEquityGrantForEmployee"></a>
# **updateEquityGrantForEmployee**
> updateEquityGrantForEmployee(id, entryId, body).execute();

Updates an equity grant for an employee

&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;. - Basic: [] - Bearer: []

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    Double quantity = 3.4D; // The number of equities granted.
    String equityType = "equityType_example"; // The type of the grant.
    String id = "id_example"; // Employee ID
    Integer entryId = 56; // The entry ID to update.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    LocalDate vestingCommencementDate = LocalDate.now(); // Vesting commencement date.
    String consentNumber = "consentNumber_example"; // Consent number.
    LocalDate grantDate = LocalDate.now(); // Date the equity was granted.
    LocalDate optionExpiration = LocalDate.now(); // Date the options expire.
    CurrencyValue exercisePrice = new CurrencyValue();
    String vestingTerm = "vestingTerm_example"; // Terms for exercising this grant.
    String grantType = "grantType_example"; // Grant type. One of: Initial Grant, Merit Grant
    Double vestingSchedule = 3.4D; // The vesting schedule ID assigned to this grant.
    Double grantNumber = 3.4D; // The Grant number for employee.
    String grantStatus = "grantStatus_example"; // Grant status. one of: Granted, Pending Approval
    try {
      client
              .payroll
              .updateEquityGrantForEmployee(quantity, equityType, id, entryId)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .vestingCommencementDate(vestingCommencementDate)
              .consentNumber(consentNumber)
              .grantDate(grantDate)
              .optionExpiration(optionExpiration)
              .exercisePrice(exercisePrice)
              .vestingTerm(vestingTerm)
              .grantType(grantType)
              .vestingSchedule(vestingSchedule)
              .grantNumber(grantNumber)
              .grantStatus(grantStatus)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#updateEquityGrantForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .updateEquityGrantForEmployee(quantity, equityType, id, entryId)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .vestingCommencementDate(vestingCommencementDate)
              .consentNumber(consentNumber)
              .grantDate(grantDate)
              .optionExpiration(optionExpiration)
              .exercisePrice(exercisePrice)
              .vestingTerm(vestingTerm)
              .grantType(grantType)
              .vestingSchedule(vestingSchedule)
              .grantNumber(grantNumber)
              .grantStatus(grantStatus)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#updateEquityGrantForEmployee");
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
| **id** | **String**| Employee ID | |
| **entryId** | **Integer**| The entry ID to update. | |
| **body** | [**EquityEntry**](EquityEntry.md)|  | |

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
| **200** | Entry updated successfully. |  -  |

