# TablesApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmploymentEntry**](TablesApi.md#createEmploymentEntry) | **POST** /people/{id}/employment | Creates a new employment entry for a given employee. |
| [**createEquityGrant**](TablesApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee. |
| [**createNewSalaryEntry**](TablesApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee. |
| [**createTrainingRecord**](TablesApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee |
| [**createVariablePayment**](TablesApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee. |
| [**createWorkEntry**](TablesApi.md#createWorkEntry) | **POST** /people/{id}/work | Creates a new work entry for a given employee. |
| [**deleteEmploymentEntry**](TablesApi.md#deleteEmploymentEntry) | **DELETE** /people/{id}/employment/{entry_id} | Deletes an employment entry from a given employee&#39;s employment history. |
| [**deleteEquityGrant**](TablesApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee. |
| [**deleteSalaryEntry**](TablesApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list. |
| [**deleteTrainingRecord**](TablesApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee. |
| [**deleteTrainingRecord_0**](TablesApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee. |
| [**deleteWorkEntry**](TablesApi.md#deleteWorkEntry) | **DELETE** /people/{id}/work/{entry_id} | Deletes a work entry from a given employee&#39;s work history. |
| [**getEmploymentHistory**](TablesApi.md#getEmploymentHistory) | **GET** /people/{id}/employment | List employee&#39;s employment history. |
| [**getSalaryHistory**](TablesApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history. |
| [**getWorkHistory**](TablesApi.md#getWorkHistory) | **GET** /people/{id}/work | List employee&#39;s work history |
| [**listEmployeeLifecycle**](TablesApi.md#listEmployeeLifecycle) | **GET** /people/{id}/lifecycle | List employee&#39;s life-cycle status history. |
| [**listEquityGrants**](TablesApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants. |
| [**listTrainingRecords**](TablesApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records. |
| [**listVariablePayments**](TablesApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments |
| [**updateEmploymentEntry**](TablesApi.md#updateEmploymentEntry) | **PUT** /people/{id}/employment/{entry_id} | Updates an employment entry from a given employee&#39;s employment history. |
| [**updateEquityGrantForEmployee**](TablesApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee |
| [**updateWorkEntry**](TablesApi.md#updateWorkEntry) | **PUT** /people/{id}/work/{entry_id} | Updates a work entry from employee&#39;s work history |


<a name="createEmploymentEntry"></a>
# **createEmploymentEntry**
> createEmploymentEntry(id, entry).execute();

Creates a new employment entry for a given employee.

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
import com.konfigthis.client.api.TablesApi;
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
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String id = "id_example"; // employee id
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    String contract = "contract_example"; // Contract.
    String type = "type_example"; // Type.
    String salaryPayType = "salaryPayType_example"; // Salary pay type.
    try {
      client
              .tables
              .createEmploymentEntry(effectiveDate, id)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .createEmploymentEntry(effectiveDate, id)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createEmploymentEntry");
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
| **entry** | [**EmploymentEntry**](EmploymentEntry.md)| Employment entry to add. This must not conflict with another entry on the same effective date. | |

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
import com.konfigthis.client.api.TablesApi;
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
              .tables
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
      System.err.println("Exception when calling TablesApi#createEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
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
      System.err.println("Exception when calling TablesApi#createEquityGrant");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createNewSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createNewSalaryEntry");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
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
      System.err.println("Exception when calling TablesApi#createTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
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
      System.err.println("Exception when calling TablesApi#createTrainingRecord");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
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
      System.err.println("Exception when calling TablesApi#createVariablePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
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
      System.err.println("Exception when calling TablesApi#createVariablePayment");
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

<a name="createWorkEntry"></a>
# **createWorkEntry**
> createWorkEntry(id, entry).execute();

Creates a new work entry for a given employee.

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
import com.konfigthis.client.api.TablesApi;
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
    String title = "title_example"; // The employee's job title.
    String department = "department_example"; // The employee's department.
    String site = "site_example"; // The employee's site.
    Integer siteId = 56; // The employee's site ID.
    WorkEntryAllOfReportsTo reportsTo = new WorkEntryAllOfReportsTo();
    Object customColumns = null;
    try {
      client
              .tables
              .createWorkEntry(id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .title(title)
              .department(department)
              .site(site)
              .siteId(siteId)
              .reportsTo(reportsTo)
              .customColumns(customColumns)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .createWorkEntry(id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .title(title)
              .department(department)
              .site(site)
              .siteId(siteId)
              .reportsTo(reportsTo)
              .customColumns(customColumns)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#createWorkEntry");
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
| **entry** | [**WorkEntry**](WorkEntry.md)| Work entry to add. This must not conflict with another entry on the same effective date. | |

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

<a name="deleteEmploymentEntry"></a>
# **deleteEmploymentEntry**
> deleteEmploymentEntry(id, entryId).execute();

Deletes an employment entry from a given employee&#39;s employment history.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .deleteEmploymentEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteEmploymentEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteEmploymentEntry");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .deleteEquityGrant(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteEquityGrant(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteEquityGrant");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .deleteSalaryEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteSalaryEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteSalaryEntry");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .deleteTrainingRecord(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteTrainingRecord(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteTrainingRecord");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .deleteTrainingRecord_0(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteTrainingRecord_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteTrainingRecord_0(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteTrainingRecord_0");
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

<a name="deleteWorkEntry"></a>
# **deleteWorkEntry**
> deleteWorkEntry(id, entryId).execute();

Deletes a work entry from a given employee&#39;s work history.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
    Integer entryId = 56; // The entry ID to delete
    try {
      client
              .tables
              .deleteWorkEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .deleteWorkEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#deleteWorkEntry");
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
| **entryId** | **Integer**| The entry ID to delete | |

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

<a name="getEmploymentHistory"></a>
# **getEmploymentHistory**
> EmploymentEntries getEmploymentHistory(id).execute();

List employee&#39;s employment history.

&lt;b&gt;Note:&lt;/b&gt; Changes to this API are planned to take effect on May 31, 2024.  Make sure to review all of the details in the &lt;a href&#x3D;&#39;https://help.hibob.com/hc/en-us/articles/19726260483601&#39;&gt;Working pattern API Changes&lt;/a&gt;  article in the help center.&lt;br&gt; &lt;br&gt;Returns a list of employment history entries for a given employee.&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
    try {
      EmploymentEntries result = client
              .tables
              .getEmploymentHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getEmploymentHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentEntries> response = client
              .tables
              .getEmploymentHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getEmploymentHistory");
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

### Return type

[**EmploymentEntries**](EmploymentEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of employment history entries. |  -  |

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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .getSalaryHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getSalaryHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalaryEntries> response = client
              .tables
              .getSalaryHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getSalaryHistory");
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

<a name="getWorkHistory"></a>
# **getWorkHistory**
> WorkEntries getWorkHistory(id).execute();

List employee&#39;s work history

Returns a list of work history entries for a given employee.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
      WorkEntries result = client
              .tables
              .getWorkHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getWorkHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntries> response = client
              .tables
              .getWorkHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#getWorkHistory");
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

[**WorkEntries**](WorkEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of work history entries. |  -  |

<a name="listEmployeeLifecycle"></a>
# **listEmployeeLifecycle**
> LifeCycleEntries listEmployeeLifecycle(id).execute();

List employee&#39;s life-cycle status history.

Returns a list of life-cycle history entries for a given employee.&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: TThe values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
      LifeCycleEntries result = client
              .tables
              .listEmployeeLifecycle(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listEmployeeLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LifeCycleEntries> response = client
              .tables
              .listEmployeeLifecycle(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listEmployeeLifecycle");
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

[**LifeCycleEntries**](LifeCycleEntries.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of life-cycle history entries. |  -  |

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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .listEquityGrants(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listEquityGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EquityEntries> response = client
              .tables
              .listEquityGrants(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listEquityGrants");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .listTrainingRecords(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listTrainingRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingEntries> response = client
              .tables
              .listTrainingRecords(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listTrainingRecords");
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
import com.konfigthis.client.api.TablesApi;
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
              .tables
              .listVariablePayments(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listVariablePayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VariableEntries> response = client
              .tables
              .listVariablePayments(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#listVariablePayments");
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

<a name="updateEmploymentEntry"></a>
# **updateEmploymentEntry**
> updateEmploymentEntry(id, entryId, body).execute();

Updates an employment entry from a given employee&#39;s employment history.

&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TablesApi;
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
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String id = "id_example"; // Employee ID.
    Integer entryId = 56; // The entry ID to update.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    String contract = "contract_example"; // Contract.
    String type = "type_example"; // Type.
    String salaryPayType = "salaryPayType_example"; // Salary pay type.
    try {
      client
              .tables
              .updateEmploymentEntry(effectiveDate, id, entryId)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#updateEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .updateEmploymentEntry(effectiveDate, id, entryId)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#updateEmploymentEntry");
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
| **entryId** | **Integer**| The entry ID to update. | |
| **body** | [**EmploymentEntry**](EmploymentEntry.md)|  | |

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
import com.konfigthis.client.api.TablesApi;
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
              .tables
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
      System.err.println("Exception when calling TablesApi#updateEquityGrantForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
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
      System.err.println("Exception when calling TablesApi#updateEquityGrantForEmployee");
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

<a name="updateWorkEntry"></a>
# **updateWorkEntry**
> updateWorkEntry(id, entryId, body).execute();

Updates a work entry from employee&#39;s work history

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
import com.konfigthis.client.api.TablesApi;
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
    Integer entryId = 56; // The entry ID to update.
    Integer id = 56; // ID.
    String reason = "reason_example"; // The reason for this change.
    LocalDate effectiveDate = LocalDate.now(); // The date this entry becomes effective.
    String title = "title_example"; // The employee's job title.
    String department = "department_example"; // The employee's department.
    String site = "site_example"; // The employee's site.
    Integer siteId = 56; // The employee's site ID.
    WorkEntryAllOfReportsTo reportsTo = new WorkEntryAllOfReportsTo();
    Object customColumns = null;
    try {
      client
              .tables
              .updateWorkEntry(id, entryId)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .title(title)
              .department(department)
              .site(site)
              .siteId(siteId)
              .reportsTo(reportsTo)
              .customColumns(customColumns)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#updateWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tables
              .updateWorkEntry(id, entryId)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .title(title)
              .department(department)
              .site(site)
              .siteId(siteId)
              .reportsTo(reportsTo)
              .customColumns(customColumns)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TablesApi#updateWorkEntry");
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
| **entryId** | **Integer**| The entry ID to update. | |
| **body** | [**WorkEntry**](WorkEntry.md)|  | |

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
| **404** | Requested entry not found. Nothing was changed |  -  |

