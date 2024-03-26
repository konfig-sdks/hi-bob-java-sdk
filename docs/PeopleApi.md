# PeopleApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployeeRecord**](PeopleApi.md#createEmployeeRecord) | **POST** /people | Create company employee. |
| [**createEmploymentEntry**](PeopleApi.md#createEmploymentEntry) | **POST** /people/{id}/employment | Creates a new employment entry for a given employee. |
| [**createEquityGrant**](PeopleApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee. |
| [**createNewSalaryEntry**](PeopleApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee. |
| [**createTrainingRecord**](PeopleApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee |
| [**createVariablePayment**](PeopleApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee. |
| [**createWorkEntry**](PeopleApi.md#createWorkEntry) | **POST** /people/{id}/work | Creates a new work entry for a given employee. |
| [**deleteEmploymentEntry**](PeopleApi.md#deleteEmploymentEntry) | **DELETE** /people/{id}/employment/{entry_id} | Deletes an employment entry from a given employee&#39;s employment history. |
| [**deleteEquityGrant**](PeopleApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee. |
| [**deleteSalaryEntry**](PeopleApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list. |
| [**deleteTrainingRecord**](PeopleApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee. |
| [**deleteTrainingRecord_0**](PeopleApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee. |
| [**deleteWorkEntry**](PeopleApi.md#deleteWorkEntry) | **DELETE** /people/{id}/work/{entry_id} | Deletes a work entry from a given employee&#39;s work history. |
| [**getAvatarUrl**](PeopleApi.md#getAvatarUrl) | **GET** /avatars/{employeeId} | Read avatar for an employee ID. |
| [**getAvatarUrl_0**](PeopleApi.md#getAvatarUrl_0) | **GET** /my/avatar | Read avatar for logged-in user |
| [**getEmailAvatar**](PeopleApi.md#getEmailAvatar) | **GET** /avatars | Read avatar for an employee email |
| [**getEmploymentHistory**](PeopleApi.md#getEmploymentHistory) | **GET** /people/{id}/employment | List employee&#39;s employment history. |
| [**getSalaryHistory**](PeopleApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history. |
| [**getWorkHistory**](PeopleApi.md#getWorkHistory) | **GET** /people/{id}/work | List employee&#39;s work history |
| [**inviteEmployeeWizard**](PeopleApi.md#inviteEmployeeWizard) | **POST** /employees/{employeeId}/invitations | Invite an employee with a welcome wizard ID. |
| [**listActiveEmployees**](PeopleApi.md#listActiveEmployees) | **GET** /profiles | Read the public profile section of all active employees. |
| [**listEmployeeLifecycle**](PeopleApi.md#listEmployeeLifecycle) | **GET** /people/{id}/lifecycle | List employee&#39;s life-cycle status history. |
| [**listEmployees**](PeopleApi.md#listEmployees) | **GET** /people | Read all company employees |
| [**listEquityGrants**](PeopleApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants. |
| [**listTrainingRecords**](PeopleApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records. |
| [**listVariablePayments**](PeopleApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments |
| [**readEmployeeById**](PeopleApi.md#readEmployeeById) | **GET** /people/{identifier} | Read company employee by ID. |
| [**readEmployeeFields**](PeopleApi.md#readEmployeeFields) | **POST** /people/{identifier} | Read company employee fields by employee ID. |
| [**revokeAccessToEmployee**](PeopleApi.md#revokeAccessToEmployee) | **POST** /employees/{identifier}/uninvite | Revoke access to Bob for an employee. |
| [**searchEmployees**](PeopleApi.md#searchEmployees) | **POST** /people/search | Search for employees |
| [**setStartDate**](PeopleApi.md#setStartDate) | **POST** /employees/{employeeId}/start-date | Set or update an employee&#39;s start date. |
| [**terminateEmployee**](PeopleApi.md#terminateEmployee) | **POST** /employees/{identifier}/terminate | Terminate company employee. |
| [**updateEmail**](PeopleApi.md#updateEmail) | **PUT** /people/{id}/email | Update an employee&#39;s email address. |
| [**updateEmployeeRecord**](PeopleApi.md#updateEmployeeRecord) | **PUT** /people/{identifier} | Update company employee. |
| [**updateEmploymentEntry**](PeopleApi.md#updateEmploymentEntry) | **PUT** /people/{id}/employment/{entry_id} | Updates an employment entry from a given employee&#39;s employment history. |
| [**updateEquityGrantForEmployee**](PeopleApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee |
| [**updateWorkEntry**](PeopleApi.md#updateWorkEntry) | **PUT** /people/{id}/work/{entry_id} | Updates a work entry from employee&#39;s work history |
| [**uploadEmployeeAvatarUrl**](PeopleApi.md#uploadEmployeeAvatarUrl) | **PUT** /avatars/{employeeId} | Upload employee&#39;s avatar by image url |


<a name="createEmployeeRecord"></a>
# **createEmployeeRecord**
> Employee createEmployeeRecord(body).execute();

Create company employee.

&lt;b&gt;Note:&lt;/b&gt; Changes to this API are planned to take effect on May 31, 2024.  Make sure to review all of the details in the &lt;a href&#x3D;&#39;https://help.hibob.com/hc/en-us/articles/19726260483601&#39;&gt;Working pattern API Changes&lt;/a&gt;  article in the help center.&lt;br&gt; &lt;br&gt;This creates a new employee record in Bob. You can include only the fields listed in the  [Fields Metadata API](https://apidocs.hibob.com/reference/get_company-people-fields).  &lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String firstName = "firstName_example"; // Employee's first name.
    String surname = "surname_example"; // Employee's surname.
    String email = "email_example"; // Employee's email address.
    CreateEmployeeRequestWork work = new CreateEmployeeRequestWork();
    try {
      Employee result = client
              .people
              .createEmployeeRecord(firstName, surname, email)
              .work(work)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getSurname());
      System.out.println(result.getEmail());
      System.out.println(result.getDisplayName());
      System.out.println(result.getPersonal());
      System.out.println(result.getAbout());
      System.out.println(result.getWork());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createEmployeeRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employee> response = client
              .people
              .createEmployeeRecord(firstName, surname, email)
              .work(work)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createEmployeeRecord");
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
| **body** | [**CreateEmployeeRequest**](CreateEmployeeRequest.md)|  | |

### Return type

[**Employee**](Employee.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee |  -  |

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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .createEmploymentEntry(effectiveDate, id)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .createEmploymentEntry(effectiveDate, id)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createEmploymentEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#createEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#createEquityGrant");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createNewSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .createNewSalaryEntry(base, payPeriod, id)
              .id(id)
              .reason(reason)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createNewSalaryEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#createTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#createTrainingRecord");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#createVariablePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#createVariablePayment");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#createWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#createWorkEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteEmploymentEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteEmploymentEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteEmploymentEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteEquityGrant(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteEquityGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteEquityGrant(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteEquityGrant");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteSalaryEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteSalaryEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteSalaryEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteSalaryEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteTrainingRecord(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteTrainingRecord(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTrainingRecord");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteTrainingRecord_0(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTrainingRecord_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteTrainingRecord_0(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTrainingRecord_0");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .deleteWorkEntry(id, entryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .deleteWorkEntry(id, entryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteWorkEntry");
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

<a name="getAvatarUrl"></a>
# **getAvatarUrl**
> getAvatarUrl(employeeId).execute();

Read avatar for an employee ID.

Returns the avatar image URL of the employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String employeeId = "employeeId_example"; // employee id
    try {
      client
              .people
              .getAvatarUrl(employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAvatarUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .getAvatarUrl(employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAvatarUrl");
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
| **employeeId** | **String**| employee id | |

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
| **200** | URL of the emloyee avatar. |  -  |

<a name="getAvatarUrl_0"></a>
# **getAvatarUrl_0**
> getAvatarUrl_0().execute();

Read avatar for logged-in user

Returns the avatar image URL of the logged-in user.&lt;b&gt;Supported user types:&lt;/b&gt; Employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.hibob.com/v1";
    
    configuration.bearer  = "YOUR API KEY";
    HiBob client = new HiBob(configuration);
    try {
      client
              .people
              .getAvatarUrl_0()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAvatarUrl_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .getAvatarUrl_0()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getAvatarUrl_0");
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

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | URL of logged-in user avatar |  -  |

<a name="getEmailAvatar"></a>
# **getEmailAvatar**
> getEmailAvatar().email(email).execute();

Read avatar for an employee email

Returns the avatar image URL of the employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String email = "email_example"; // Employee email.
    try {
      client
              .people
              .getEmailAvatar()
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getEmailAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .getEmailAvatar()
              .email(email)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getEmailAvatar");
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
| **email** | **String**| Employee email. | [optional] |

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
| **200** | URL of the emloyee avatar. |  -  |

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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .getEmploymentHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getEmploymentHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentEntries> response = client
              .people
              .getEmploymentHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getEmploymentHistory");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .getSalaryHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getSalaryHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SalaryEntries> response = client
              .people
              .getSalaryHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getSalaryHistory");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .getWorkHistory(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkEntries> response = client
              .people
              .getWorkHistory(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getWorkHistory");
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

<a name="inviteEmployeeWizard"></a>
# **inviteEmployeeWizard**
> inviteEmployeeWizard(employeeId, body).execute();

Invite an employee with a welcome wizard ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Integer welcomeWizardId = 56; // The Welcome wizard ID.
    String employeeId = "employeeId_example"; // Employee ID.
    try {
      client
              .people
              .inviteEmployeeWizard(welcomeWizardId, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#inviteEmployeeWizard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .inviteEmployeeWizard(welcomeWizardId, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#inviteEmployeeWizard");
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
| **body** | [**InvitationByWizard**](InvitationByWizard.md)|  | |

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
| **200** | Invitation submitted successfully. |  -  |
| **0** | Unexpected error. |  -  |

<a name="listActiveEmployees"></a>
# **listActiveEmployees**
> EmployeesProfiles listActiveEmployees().sortBy(sortBy).execute();

Read the public profile section of all active employees.

Returns the public section of all  active employees of the logged-in user company.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value. Use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String sortBy = "sortBy_example"; // Optional field name to sort by. This defaults to firstName.
    try {
      EmployeesProfiles result = client
              .people
              .listActiveEmployees()
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listActiveEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesProfiles> response = client
              .people
              .listActiveEmployees()
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listActiveEmployees");
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
| **sortBy** | **String**| Optional field name to sort by. This defaults to firstName. | [optional] |

### Return type

[**EmployeesProfiles**](EmployeesProfiles.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee profiles |  -  |
| **0** | Unexpected error |  -  |

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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .listEmployeeLifecycle(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEmployeeLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LifeCycleEntries> response = client
              .people
              .listEmployeeLifecycle(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEmployeeLifecycle");
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

<a name="listEmployees"></a>
# **listEmployees**
> Employees listEmployees().showInactive(showInactive).humanReadable(humanReadable).includeHumanReadable(includeHumanReadable).execute();

Read all company employees

&lt;b&gt;Note:&lt;/b&gt; Deprecated at the end of March 2024. Please use &lt;b&gt;/people/search&lt;/b&gt; (\&quot;Search for employees\&quot;) instead. &lt;br/&gt;&lt;br/&gt; This returns a list of all active employees. The data is filtered based on the access level of the logged-in user. Only viewable categories are returned.&lt;br /&gt;&lt;br&gt; &lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Boolean showInactive = true; // Should include inactive employees.
    Boolean humanReadable = false; // Whether to supply humanReadable values in JSON instead of machine-readable format (default).
    Boolean includeHumanReadable = false; // Whether to include the additional \"humanReadable\" JSON node in the response.
    try {
      Employees result = client
              .people
              .listEmployees()
              .showInactive(showInactive)
              .humanReadable(humanReadable)
              .includeHumanReadable(includeHumanReadable)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employees> response = client
              .people
              .listEmployees()
              .showInactive(showInactive)
              .humanReadable(humanReadable)
              .includeHumanReadable(includeHumanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEmployees");
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
| **showInactive** | **Boolean**| Should include inactive employees. | [optional] |
| **humanReadable** | **Boolean**| Whether to supply humanReadable values in JSON instead of machine-readable format (default). | [optional] [default to false] |
| **includeHumanReadable** | **Boolean**| Whether to include the additional \&quot;humanReadable\&quot; JSON node in the response. | [optional] [default to false] |

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
| **200** | All employees. |  -  |
| **0** | Unexpected error. |  -  |

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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .listEquityGrants(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEquityGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EquityEntries> response = client
              .people
              .listEquityGrants(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listEquityGrants");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .listTrainingRecords(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTrainingRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingEntries> response = client
              .people
              .listTrainingRecords(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTrainingRecords");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .listVariablePayments(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listVariablePayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VariableEntries> response = client
              .people
              .listVariablePayments(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listVariablePayments");
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

<a name="readEmployeeById"></a>
# **readEmployeeById**
> Employees readEmployeeById(identifier, fields).humanReadable(humanReadable).includeHumanReadable(includeHumanReadable).execute();

Read company employee by ID.

&lt;b&gt;Note:&lt;/b&gt; Deprecated at the end of March 2024. Please use &lt;b&gt;POST /people/{identifier}&lt;/b&gt; (\&quot;Read company employee fields by ID.\&quot;) instead. &lt;br/&gt;&lt;br/&gt; Returns the employee by the specified ID.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String identifier = "identifier_example"; // employee id
    List<String> fields = Arrays.asList(); // Whether to supply fields (paths) instead of empty list as a default in order  to not exceed data permitted.
    Boolean humanReadable = false; // Whether to supply humanReadable values in JSON instead of machine-readable (default) format.
    Boolean includeHumanReadable = false; // Whether to include the additional \"humanReadable\" JSON node in the response.
    try {
      Employees result = client
              .people
              .readEmployeeById(identifier, fields)
              .humanReadable(humanReadable)
              .includeHumanReadable(includeHumanReadable)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#readEmployeeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employees> response = client
              .people
              .readEmployeeById(identifier, fields)
              .humanReadable(humanReadable)
              .includeHumanReadable(includeHumanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#readEmployeeById");
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
| **identifier** | **String**| employee id | |
| **fields** | [**List&lt;String&gt;**](String.md)| Whether to supply fields (paths) instead of empty list as a default in order  to not exceed data permitted. | |
| **humanReadable** | **Boolean**| Whether to supply humanReadable values in JSON instead of machine-readable (default) format. | [optional] [default to false] |
| **includeHumanReadable** | **Boolean**| Whether to include the additional \&quot;humanReadable\&quot; JSON node in the response. | [optional] [default to false] |

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
| **200** | Employee |  -  |
| **0** | Unexpected error. |  -  |

<a name="readEmployeeFields"></a>
# **readEmployeeFields**
> Employees readEmployeeFields(identifier).readSingleEmployeeRequestReference(readSingleEmployeeRequestReference).execute();

Read company employee fields by employee ID.

&lt;b&gt;Note:&lt;/b&gt; Changes to this API are planned to take effect on May 31, 2024.  Make sure to review all of the details in the &lt;a href&#x3D;&#39;https://help.hibob.com/hc/en-us/articles/19726260483601&#39;&gt;Working pattern API Changes&lt;/a&gt;  article in the help center.&lt;br&gt; &lt;br&gt;Returns the employee&#39;s fields by the specified ID or email.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String identifier = "identifier_example"; // employee ID or email
    List<String> fields = Arrays.asList(); // Optional array of employee field paths that's are required in response. If you don't specify fields - only basic fields and categories are returned: <br/><b>Basic fields:</b>  <ul>                       <li>ID</li>                       <li>Company ID</li>                       <li>Email</li>                       <li>First name</li>                       <li>Last name</li>                       <li>Display name</li>                       <li>Middle name</li>                       <li>Creation timestamp</li>                       <li>Avatar URL</li> </ul> <br/><b>Basic Categories:</b> <ul>                       <li>About</li>                       <li>Employment</li>                       <li>Work</li> </ul>
    String humanReadable = "humanReadable_example"; // Optional field.  <br> <b>If not sent:</b> supply machine-readable values only. <br> <br> Possible values: <br>  <br> <b>APPEND</b> - include the additional \\\"humanReadable\\\" JSON node in the response. <br>  <br> <b>REPLACE</b> - supply humanReadable values in JSON instead of machine-readable format. <br>
    try {
      Employees result = client
              .people
              .readEmployeeFields(identifier)
              .fields(fields)
              .humanReadable(humanReadable)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#readEmployeeFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employees> response = client
              .people
              .readEmployeeFields(identifier)
              .fields(fields)
              .humanReadable(humanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#readEmployeeFields");
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
| **identifier** | **String**| employee ID or email | |
| **readSingleEmployeeRequestReference** | [**ReadSingleEmployeeRequestReference**](ReadSingleEmployeeRequestReference.md)| Read request content that allows you to select fields and other options | [optional] |

### Return type

[**Employees**](Employees.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee |  -  |
| **0** | Unexpected error. |  -  |

<a name="revokeAccessToEmployee"></a>
# **revokeAccessToEmployee**
> revokeAccessToEmployee(identifier).execute();

Revoke access to Bob for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String identifier = "identifier_example"; // employee id
    try {
      client
              .people
              .revokeAccessToEmployee(identifier)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#revokeAccessToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .revokeAccessToEmployee(identifier)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#revokeAccessToEmployee");
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
| **identifier** | **String**| employee id | |

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
| **200** | Revoke access successful. |  -  |
| **0** | Unexpected error. |  -  |

<a name="searchEmployees"></a>
# **searchEmployees**
> Employees searchEmployees(readEmployeesRequestReference).execute();

Search for employees

&lt;b&gt;Note:&lt;/b&gt; Changes to this API are planned to take effect on May 31, 2024.  Make sure to review all of the details in the &lt;a href&#x3D;&#39;https://help.hibob.com/hc/en-us/articles/19726260483601&#39;&gt;Working pattern API Changes&lt;/a&gt;  article in the help center.&lt;br&gt; &lt;br&gt;This API returns a list of requested employees with requested fields.  The data is filtered based on the requested fields and access level of the logged-in user.  Only viewable categories are returned.&lt;br /&gt; &lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    List<String> fields = Arrays.asList(); // Optional array of employee field paths that's are required in response. If you don't specify fields - only basic fields and categories are returned: <br/><b>Basic fields:</b>  <ul>                       <li>ID</li>                       <li>Company ID</li>                       <li>Email</li>                       <li>First name</li>                       <li>Last name</li>                       <li>Display name</li>                       <li>Middle name</li>                       <li>Creation timestamp</li>                       <li>Avatar URL</li> </ul> <br/><b>Basic Categories:</b> <ul>                       <li>About</li>                       <li>Employment</li>                       <li>Work</li> </ul>
    List<EmployeeFilter> filters = Arrays.asList(); // Optional list of filters for filtering employees. We currently support up to one filter.
    Boolean showInactive = true; // <br>Optional field. <br>Default value = false. <br>Defines whether response should include inactive employees.
    String humanReadable = "humanReadable_example"; // Optional field.  <br> <b>If not sent:</b> supply machine-readable values only. <br> <br> Possible values: <br>  <br> <b>APPEND</b> - include the additional \\\"humanReadable\\\" JSON node in the response. <br>  <br> <b>REPLACE</b> - supply humanReadable values in JSON instead of machine-readable format. <br>
    try {
      Employees result = client
              .people
              .searchEmployees()
              .fields(fields)
              .filters(filters)
              .showInactive(showInactive)
              .humanReadable(humanReadable)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#searchEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employees> response = client
              .people
              .searchEmployees()
              .fields(fields)
              .filters(filters)
              .showInactive(showInactive)
              .humanReadable(humanReadable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#searchEmployees");
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
| **readEmployeesRequestReference** | [**ReadEmployeesRequestReference**](ReadEmployeesRequestReference.md)| Read request content that allows you to select fields and other options | |

### Return type

[**Employees**](Employees.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested employees. |  -  |
| **0** | Unexpected error. |  -  |

<a name="setStartDate"></a>
# **setStartDate**
> setStartDate(employeeId, body).execute();

Set or update an employee&#39;s start date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    LocalDate startDate = LocalDate.now(); // The date this entry becomes effective.
    String employeeId = "employeeId_example"; // employee ID
    String reason = "reason_example"; // Additional info for the start date update.
    try {
      client
              .people
              .setStartDate(startDate, employeeId)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#setStartDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .setStartDate(startDate, employeeId)
              .reason(reason)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#setStartDate");
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
| **employeeId** | **String**| employee ID | |
| **body** | [**StartDateUpdate**](StartDateUpdate.md)|  | |

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
| **200** | Start date was set successfully. |  -  |
| **0** | Unexpected error. |  -  |

<a name="terminateEmployee"></a>
# **terminateEmployee**
> terminateEmployee(identifier, body).execute();

Terminate company employee.

This changes the employee’s status to Terminated according to specified termination date. &lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    LocalDate terminationDate = LocalDate.now(); // The employee's termination date
    String identifier = "identifier_example"; // Employee ID.
    String terminationReason = "terminationReason_example"; // The ID of the 'terminationReason' list entry
    String reasonType = "reasonType_example"; // The ID of the 'lifecycleReasonType' list entry
    EmployeeTerminationNoticePeriod noticePeriod = new EmployeeTerminationNoticePeriod();
    LocalDate lastDayOfWork = LocalDate.now();
    try {
      client
              .people
              .terminateEmployee(terminationDate, identifier)
              .terminationReason(terminationReason)
              .reasonType(reasonType)
              .noticePeriod(noticePeriod)
              .lastDayOfWork(lastDayOfWork)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#terminateEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .terminateEmployee(terminationDate, identifier)
              .terminationReason(terminationReason)
              .reasonType(reasonType)
              .noticePeriod(noticePeriod)
              .lastDayOfWork(lastDayOfWork)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#terminateEmployee");
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
| **identifier** | **String**| Employee ID. | |
| **body** | [**EmployeeTermination**](EmployeeTermination.md)|  | |

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
| **200** | Termination entry added successfully. |  -  |

<a name="updateEmail"></a>
# **updateEmail**
> updateEmail(id, body).execute();

Update an employee&#39;s email address.

Change an employee&#39;s email address. If you cannot change the self email an invitation will be sent to the new address to verify the email if the employee is invited/active.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String email = "email_example"; // new email
    try {
      client
              .people
              .updateEmail(id)
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .updateEmail(id)
              .email(email)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmail");
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
| **body** | [**ChangeEmail**](ChangeEmail.md)|  | |

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
| **200** | Invitation sent successfully. |  -  |

<a name="updateEmployeeRecord"></a>
# **updateEmployeeRecord**
> updateEmployeeRecord(identifier, body).execute();

Update company employee.

&lt;b&gt;Note:&lt;/b&gt; Changes to this API are planned to take effect on May 31, 2024.  Make sure to review all of the details in the &lt;a href&#x3D;&#39;https://help.hibob.com/hc/en-us/articles/19726260483601&#39;&gt;Working pattern API Changes&lt;/a&gt;  article in the help center.&lt;br&gt; &lt;br&gt;This updates the employee record in Bob. You can include only the fields listed in the  [Fields Metadata API](https://apidocs.hibob.com/reference/get_company-people-fields) where historical is equal to false.  &lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String identifier = "identifier_example"; // Employee ID.
    String firstName = "firstName_example";
    PeopleUpdateEmployeeRecordRequestPersonal personal = new PeopleUpdateEmployeeRecordRequestPersonal();
    PeopleUpdateEmployeeRecordRequestAbout about = new PeopleUpdateEmployeeRecordRequestAbout();
    try {
      client
              .people
              .updateEmployeeRecord(identifier)
              .firstName(firstName)
              .personal(personal)
              .about(about)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmployeeRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .updateEmployeeRecord(identifier)
              .firstName(firstName)
              .personal(personal)
              .about(about)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmployeeRecord");
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
| **identifier** | **String**| Employee ID. | |
| **body** | [**PeopleUpdateEmployeeRecordRequest**](PeopleUpdateEmployeeRecordRequest.md)| Use Fields Metadata API for available field definitions | |

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
| **200** | Employee updated successfully. |  -  |
| **304** | If employee data not modified. |  -  |

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
import com.konfigthis.client.api.PeopleApi;
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
              .people
              .updateEmploymentEntry(effectiveDate, id, entryId)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmploymentEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .updateEmploymentEntry(effectiveDate, id, entryId)
              .id(id)
              .reason(reason)
              .contract(contract)
              .type(type)
              .salaryPayType(salaryPayType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateEmploymentEntry");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#updateEquityGrantForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#updateEquityGrantForEmployee");
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
import com.konfigthis.client.api.PeopleApi;
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
              .people
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
      System.err.println("Exception when calling PeopleApi#updateWorkEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
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
      System.err.println("Exception when calling PeopleApi#updateWorkEntry");
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

<a name="uploadEmployeeAvatarUrl"></a>
# **uploadEmployeeAvatarUrl**
> uploadEmployeeAvatarUrl(employeeId, body).execute();

Upload employee&#39;s avatar by image url

Upload an employee&#39;s Avatar by providing a URL to the image to upload.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String url = "url_example"; // The URL of the source of the avatar image.
    String employeeId = "employeeId_example"; // Employee ID.
    try {
      client
              .people
              .uploadEmployeeAvatarUrl(url, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#uploadEmployeeAvatarUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .people
              .uploadEmployeeAvatarUrl(url, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#uploadEmployeeAvatarUrl");
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
| **body** | [**UploadAvatar**](UploadAvatar.md)|  | |

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
| **200** | Avatar Uploaded successfully |  -  |

