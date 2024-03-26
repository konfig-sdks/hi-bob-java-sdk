<div align="center">

[![Visit Hibob](./header.png)](https://hibob.com)

# [Hibob](https://hibob.com)

Access your employees data with the Bob API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=HiBob&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>hi-bob-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:hi-bob-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hi-bob-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.hibob.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttendanceApi* | [**importData**](docs/AttendanceApi.md#importData) | **POST** /attendance/import/{importMethod} | Import attendance data
*CustomTablesApi* | [**createNewEntry**](docs/CustomTablesApi.md#createNewEntry) | **POST** /people/custom-tables/{employee_id}/{custom_table_id} | Create new custom table entry
*CustomTablesApi* | [**deleteEntryById**](docs/CustomTablesApi.md#deleteEntryById) | **DELETE** /people/custom-tables/{employee_id}/{custom_table_id}/{entry_id} | Delete custom table entry
*CustomTablesApi* | [**readEntries**](docs/CustomTablesApi.md#readEntries) | **GET** /people/custom-tables/{employee_id}/{custom_table_id} | Read all entries of the given custom table
*CustomTablesApi* | [**updateEntry**](docs/CustomTablesApi.md#updateEntry) | **PUT** /people/custom-tables/{employee_id}/{custom_table_id}/{entry_id} | Update custom table entry
*DocumentsApi* | [**deleteEmployeeConfidentialDoc**](docs/DocumentsApi.md#deleteEmployeeConfidentialDoc) | **DELETE** /docs/people/{id}/confidential/{docId} | Delete a specific document from the employee&#39;s confidential folder.
*DocumentsApi* | [**downloadLinks**](docs/DocumentsApi.md#downloadLinks) | **GET** /docs/people/{id} | Download employee&#39;s documents
*DocumentsApi* | [**removeEmployeeSharedDocument**](docs/DocumentsApi.md#removeEmployeeSharedDocument) | **DELETE** /docs/people/{id}/shared/{docId} | Delete specific document from the employee&#39;s shared folder.
*DocumentsApi* | [**uploadConfidentialFile**](docs/DocumentsApi.md#uploadConfidentialFile) | **POST** /docs/people/{id}/confidential/upload | Upload a file to the employee&#39;s confidential folder.
*DocumentsApi* | [**uploadToConfidentialFolder**](docs/DocumentsApi.md#uploadToConfidentialFolder) | **POST** /docs/people/{id}/confidential | Upload a document to the employee&#39;s confidential folder
*DocumentsApi* | [**uploadToSharedFolder**](docs/DocumentsApi.md#uploadToSharedFolder) | **POST** /docs/people/{id}/shared | Upload a document to the employee&#39;s shared folder
*DocumentsApi* | [**uploadToSharedFolder_0**](docs/DocumentsApi.md#uploadToSharedFolder_0) | **POST** /docs/people/{id}/shared/upload | Upload a file to the employee&#39;s shared folder.
*MetadataApi* | [**addNewField**](docs/MetadataApi.md#addNewField) | **POST** /company/people/fields | Create a new field.
*MetadataApi* | [**addNewItemToNamedList**](docs/MetadataApi.md#addNewItemToNamedList) | **POST** /company/named-lists/{listName} | Add a new item to an existing list.
*MetadataApi* | [**deleteField**](docs/MetadataApi.md#deleteField) | **DELETE** /company/people/fields/{fieldId} | Delete an existing field.
*MetadataApi* | [**deleteItemFromCompanyNamedList**](docs/MetadataApi.md#deleteItemFromCompanyNamedList) | **DELETE** /company/named-lists/{listName}/{itemId} | Delete an item from an existing list.
*MetadataApi* | [**getCompanyFields**](docs/MetadataApi.md#getCompanyFields) | **GET** /company/people/fields | Get all company fields.
*MetadataApi* | [**getCompanyNamedLists**](docs/MetadataApi.md#getCompanyNamedLists) | **GET** /company/named-lists | Get all company lists
*MetadataApi* | [**getCustomTableMetadata**](docs/MetadataApi.md#getCustomTableMetadata) | **GET** /people/custom-tables/metadata | Read metadata of custom tables defined
*MetadataApi* | [**getNamedList**](docs/MetadataApi.md#getNamedList) | **GET** /company/named-lists/{listName} | Get a specific company list by name.
*MetadataApi* | [**getPositionFields**](docs/MetadataApi.md#getPositionFields) | **GET** /metadata/objects/position | Get all positions fields
*MetadataApi* | [**getTableDetails**](docs/MetadataApi.md#getTableDetails) | **GET** /people/custom-tables/metadata/{custom_table_id} | Read metadata for specific custom table
*MetadataApi* | [**updateField**](docs/MetadataApi.md#updateField) | **PUT** /company/people/fields/{fieldId} | Update an existing field
*MetadataApi* | [**updateItemFromNamedList**](docs/MetadataApi.md#updateItemFromNamedList) | **PUT** /company/named-lists/{listName}/{itemId} | Update an existing item from a list.
*ObjectsApi* | [**searchCompanyPositions**](docs/ObjectsApi.md#searchCompanyPositions) | **POST** /objects/position/search | Read company positions
*OnboardingApi* | [**getWizardSummary**](docs/OnboardingApi.md#getWizardSummary) | **GET** /onboarding/wizards | Get a summary of all onboarding wizards.
*PayrollApi* | [**createEquityGrant**](docs/PayrollApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee.
*PayrollApi* | [**createNewSalaryEntry**](docs/PayrollApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee.
*PayrollApi* | [**createTrainingRecord**](docs/PayrollApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee
*PayrollApi* | [**createVariablePayment**](docs/PayrollApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee.
*PayrollApi* | [**deleteEquityGrant**](docs/PayrollApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee.
*PayrollApi* | [**deleteSalaryEntry**](docs/PayrollApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list.
*PayrollApi* | [**deleteTrainingRecord**](docs/PayrollApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee.
*PayrollApi* | [**deleteTrainingRecord_0**](docs/PayrollApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee.
*PayrollApi* | [**getSalaryHistory**](docs/PayrollApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history.
*PayrollApi* | [**listEquityGrants**](docs/PayrollApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants.
*PayrollApi* | [**listTrainingRecords**](docs/PayrollApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records.
*PayrollApi* | [**listVariablePayments**](docs/PayrollApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments
*PayrollApi* | [**readHistory**](docs/PayrollApi.md#readHistory) | **GET** /payroll/history | Read payroll history.
*PayrollApi* | [**updateEquityGrantForEmployee**](docs/PayrollApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee
*PeopleApi* | [**createEmployeeRecord**](docs/PeopleApi.md#createEmployeeRecord) | **POST** /people | Create company employee.
*PeopleApi* | [**createEmploymentEntry**](docs/PeopleApi.md#createEmploymentEntry) | **POST** /people/{id}/employment | Creates a new employment entry for a given employee.
*PeopleApi* | [**createEquityGrant**](docs/PeopleApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee.
*PeopleApi* | [**createNewSalaryEntry**](docs/PeopleApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee.
*PeopleApi* | [**createTrainingRecord**](docs/PeopleApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee
*PeopleApi* | [**createVariablePayment**](docs/PeopleApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee.
*PeopleApi* | [**createWorkEntry**](docs/PeopleApi.md#createWorkEntry) | **POST** /people/{id}/work | Creates a new work entry for a given employee.
*PeopleApi* | [**deleteEmploymentEntry**](docs/PeopleApi.md#deleteEmploymentEntry) | **DELETE** /people/{id}/employment/{entry_id} | Deletes an employment entry from a given employee&#39;s employment history.
*PeopleApi* | [**deleteEquityGrant**](docs/PeopleApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee.
*PeopleApi* | [**deleteSalaryEntry**](docs/PeopleApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list.
*PeopleApi* | [**deleteTrainingRecord**](docs/PeopleApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee.
*PeopleApi* | [**deleteTrainingRecord_0**](docs/PeopleApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee.
*PeopleApi* | [**deleteWorkEntry**](docs/PeopleApi.md#deleteWorkEntry) | **DELETE** /people/{id}/work/{entry_id} | Deletes a work entry from a given employee&#39;s work history.
*PeopleApi* | [**getAvatarUrl**](docs/PeopleApi.md#getAvatarUrl) | **GET** /avatars/{employeeId} | Read avatar for an employee ID.
*PeopleApi* | [**getAvatarUrl_0**](docs/PeopleApi.md#getAvatarUrl_0) | **GET** /my/avatar | Read avatar for logged-in user
*PeopleApi* | [**getEmailAvatar**](docs/PeopleApi.md#getEmailAvatar) | **GET** /avatars | Read avatar for an employee email
*PeopleApi* | [**getEmploymentHistory**](docs/PeopleApi.md#getEmploymentHistory) | **GET** /people/{id}/employment | List employee&#39;s employment history.
*PeopleApi* | [**getSalaryHistory**](docs/PeopleApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history.
*PeopleApi* | [**getWorkHistory**](docs/PeopleApi.md#getWorkHistory) | **GET** /people/{id}/work | List employee&#39;s work history
*PeopleApi* | [**inviteEmployeeWizard**](docs/PeopleApi.md#inviteEmployeeWizard) | **POST** /employees/{employeeId}/invitations | Invite an employee with a welcome wizard ID.
*PeopleApi* | [**listActiveEmployees**](docs/PeopleApi.md#listActiveEmployees) | **GET** /profiles | Read the public profile section of all active employees.
*PeopleApi* | [**listEmployeeLifecycle**](docs/PeopleApi.md#listEmployeeLifecycle) | **GET** /people/{id}/lifecycle | List employee&#39;s life-cycle status history.
*PeopleApi* | [**listEmployees**](docs/PeopleApi.md#listEmployees) | **GET** /people | Read all company employees
*PeopleApi* | [**listEquityGrants**](docs/PeopleApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants.
*PeopleApi* | [**listTrainingRecords**](docs/PeopleApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records.
*PeopleApi* | [**listVariablePayments**](docs/PeopleApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments
*PeopleApi* | [**readEmployeeById**](docs/PeopleApi.md#readEmployeeById) | **GET** /people/{identifier} | Read company employee by ID.
*PeopleApi* | [**readEmployeeFields**](docs/PeopleApi.md#readEmployeeFields) | **POST** /people/{identifier} | Read company employee fields by employee ID.
*PeopleApi* | [**revokeAccessToEmployee**](docs/PeopleApi.md#revokeAccessToEmployee) | **POST** /employees/{identifier}/uninvite | Revoke access to Bob for an employee.
*PeopleApi* | [**searchEmployees**](docs/PeopleApi.md#searchEmployees) | **POST** /people/search | Search for employees
*PeopleApi* | [**setStartDate**](docs/PeopleApi.md#setStartDate) | **POST** /employees/{employeeId}/start-date | Set or update an employee&#39;s start date.
*PeopleApi* | [**terminateEmployee**](docs/PeopleApi.md#terminateEmployee) | **POST** /employees/{identifier}/terminate | Terminate company employee.
*PeopleApi* | [**updateEmail**](docs/PeopleApi.md#updateEmail) | **PUT** /people/{id}/email | Update an employee&#39;s email address.
*PeopleApi* | [**updateEmployeeRecord**](docs/PeopleApi.md#updateEmployeeRecord) | **PUT** /people/{identifier} | Update company employee.
*PeopleApi* | [**updateEmploymentEntry**](docs/PeopleApi.md#updateEmploymentEntry) | **PUT** /people/{id}/employment/{entry_id} | Updates an employment entry from a given employee&#39;s employment history.
*PeopleApi* | [**updateEquityGrantForEmployee**](docs/PeopleApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee
*PeopleApi* | [**updateWorkEntry**](docs/PeopleApi.md#updateWorkEntry) | **PUT** /people/{id}/work/{entry_id} | Updates a work entry from employee&#39;s work history
*PeopleApi* | [**uploadEmployeeAvatarUrl**](docs/PeopleApi.md#uploadEmployeeAvatarUrl) | **PUT** /avatars/{employeeId} | Upload employee&#39;s avatar by image url
*ReportsApi* | [**downloadById**](docs/ReportsApi.md#downloadById) | **GET** /company/reports/{reportId}/download | Download the report by ID
*ReportsApi* | [**downloadReportFile**](docs/ReportsApi.md#downloadReportFile) | **GET** /company/reports/download/{reportName} | Download report by file URL
*ReportsApi* | [**getDownloadUrl**](docs/ReportsApi.md#getDownloadUrl) | **GET** /company/reports/{reportId}/download-async | Get the report download URL for polling
*ReportsApi* | [**listAccessibleReports**](docs/ReportsApi.md#listAccessibleReports) | **GET** /company/reports | Read company reports
*TablesApi* | [**createEmploymentEntry**](docs/TablesApi.md#createEmploymentEntry) | **POST** /people/{id}/employment | Creates a new employment entry for a given employee.
*TablesApi* | [**createEquityGrant**](docs/TablesApi.md#createEquityGrant) | **POST** /people/{id}/equities | Creates a new equity grant for a given employee.
*TablesApi* | [**createNewSalaryEntry**](docs/TablesApi.md#createNewSalaryEntry) | **POST** /people/{id}/salaries | Creates a new salary entry for a given employee.
*TablesApi* | [**createTrainingRecord**](docs/TablesApi.md#createTrainingRecord) | **POST** /people/{id}/training | Creates a new training records for a given employee
*TablesApi* | [**createVariablePayment**](docs/TablesApi.md#createVariablePayment) | **POST** /people/{id}/variable | Creates a new variable payment for a given employee.
*TablesApi* | [**createWorkEntry**](docs/TablesApi.md#createWorkEntry) | **POST** /people/{id}/work | Creates a new work entry for a given employee.
*TablesApi* | [**deleteEmploymentEntry**](docs/TablesApi.md#deleteEmploymentEntry) | **DELETE** /people/{id}/employment/{entry_id} | Deletes an employment entry from a given employee&#39;s employment history.
*TablesApi* | [**deleteEquityGrant**](docs/TablesApi.md#deleteEquityGrant) | **DELETE** /people/{id}/equities/{entry_id} | Deletes an equity grant for an employee.
*TablesApi* | [**deleteSalaryEntry**](docs/TablesApi.md#deleteSalaryEntry) | **DELETE** /people/{id}/salaries/{entry_id} | Deletes a salary entry from the employee&#39;s list.
*TablesApi* | [**deleteTrainingRecord**](docs/TablesApi.md#deleteTrainingRecord) | **DELETE** /people/{id}/variable/{entry_id} | Deletes a training record for an employee.
*TablesApi* | [**deleteTrainingRecord_0**](docs/TablesApi.md#deleteTrainingRecord_0) | **DELETE** /people/{id}/training/{entry_id} | Deletes any training records for an employee.
*TablesApi* | [**deleteWorkEntry**](docs/TablesApi.md#deleteWorkEntry) | **DELETE** /people/{id}/work/{entry_id} | Deletes a work entry from a given employee&#39;s work history.
*TablesApi* | [**getEmploymentHistory**](docs/TablesApi.md#getEmploymentHistory) | **GET** /people/{id}/employment | List employee&#39;s employment history.
*TablesApi* | [**getSalaryHistory**](docs/TablesApi.md#getSalaryHistory) | **GET** /people/{id}/salaries | List employee&#39;s salary history.
*TablesApi* | [**getWorkHistory**](docs/TablesApi.md#getWorkHistory) | **GET** /people/{id}/work | List employee&#39;s work history
*TablesApi* | [**listEmployeeLifecycle**](docs/TablesApi.md#listEmployeeLifecycle) | **GET** /people/{id}/lifecycle | List employee&#39;s life-cycle status history.
*TablesApi* | [**listEquityGrants**](docs/TablesApi.md#listEquityGrants) | **GET** /people/{id}/equities | List the employee&#39;s equity grants.
*TablesApi* | [**listTrainingRecords**](docs/TablesApi.md#listTrainingRecords) | **GET** /people/{id}/training | List the employee&#39;s training records.
*TablesApi* | [**listVariablePayments**](docs/TablesApi.md#listVariablePayments) | **GET** /people/{id}/variable | List employee&#39;s variable payments
*TablesApi* | [**updateEmploymentEntry**](docs/TablesApi.md#updateEmploymentEntry) | **PUT** /people/{id}/employment/{entry_id} | Updates an employment entry from a given employee&#39;s employment history.
*TablesApi* | [**updateEquityGrantForEmployee**](docs/TablesApi.md#updateEquityGrantForEmployee) | **PUT** /people/{id}/equities/{entry_id} | Updates an equity grant for an employee
*TablesApi* | [**updateWorkEntry**](docs/TablesApi.md#updateWorkEntry) | **PUT** /people/{id}/work/{entry_id} | Updates a work entry from employee&#39;s work history
*TasksApi* | [**completeTask**](docs/TasksApi.md#completeTask) | **POST** /tasks/{taskId}/complete | Mark a task as complete
*TasksApi* | [**getEmployeeTasks**](docs/TasksApi.md#getEmployeeTasks) | **GET** /my/tasks | Read my tasks
*TasksApi* | [**getOpenTasks**](docs/TasksApi.md#getOpenTasks) | **GET** /tasks | Read all open tasks.
*TasksApi* | [**readEmployeeTasks**](docs/TasksApi.md#readEmployeeTasks) | **GET** /tasks/people/{id} | Read tasks of a specific employee 
*TimeOffApi* | [**addReasonCodes**](docs/TimeOffApi.md#addReasonCodes) | **POST** /timeoff/policy-types/{policyType}/reason-codes | Add a list of reason codes for a given policy type.
*TimeOffApi* | [**cancelRequest**](docs/TimeOffApi.md#cancelRequest) | **DELETE** /timeoff/employees/{id}/requests/{requestId} | Cancel an existing timeoff request
*TimeOffApi* | [**createBalanceAdjustment**](docs/TimeOffApi.md#createBalanceAdjustment) | **POST** /timeoff/employees/{id}/adjustments | Create a balance adjustment.
*TimeOffApi* | [**getDetailsOfRequest**](docs/TimeOffApi.md#getDetailsOfRequest) | **GET** /timeoff/employees/{id}/requests/{requestId} | Get the details of an existing timeoff request.
*TimeOffApi* | [**getEmployeeBalance**](docs/TimeOffApi.md#getEmployeeBalance) | **GET** /timeoff/employees/{id}/balance | Get the balance for a given employee
*TimeOffApi* | [**getNewDeletedRequestsSinceDate**](docs/TimeOffApi.md#getNewDeletedRequestsSinceDate) | **GET** /timeoff/requests/changes | Get all new/deleted time off requests since the specified date.
*TimeOffApi* | [**getOutOfOffice**](docs/TimeOffApi.md#getOutOfOffice) | **GET** /timeoff/outtoday | Read a list of who&#39;s out of the office today or on the specified date.
*TimeOffApi* | [**getPolicyDetails**](docs/TimeOffApi.md#getPolicyDetails) | **GET** /timeoff/policy-types/{policyType} | Get Policy type details
*TimeOffApi* | [**getPolicyDetails_0**](docs/TimeOffApi.md#getPolicyDetails_0) | **GET** /timeoff/policies | Get Policy details.
*TimeOffApi* | [**getWhosOut**](docs/TimeOffApi.md#getWhosOut) | **GET** /timeoff/whosout | Read a list of who&#39;s out of the office.
*TimeOffApi* | [**listPolicyTypeNames**](docs/TimeOffApi.md#listPolicyTypeNames) | **GET** /timeoff/policies/names | Get a list of policy names for a given policy type.
*TimeOffApi* | [**listPolicyTypesNames**](docs/TimeOffApi.md#listPolicyTypesNames) | **GET** /timeoff/policy-types | Get all policy types names.
*TimeOffApi* | [**listReasonCodes**](docs/TimeOffApi.md#listReasonCodes) | **GET** /timeoff/policy-types/{policyType}/reason-codes | Get Policy type reason codes
*TimeOffApi* | [**submitNewRequest**](docs/TimeOffApi.md#submitNewRequest) | **POST** /timeoff/employees/{id}/requests | Submit a new time off request.
*TimeOffApi* | [**submitNewRequestDiffHours**](docs/TimeOffApi.md#submitNewRequestDiffHours) | **POST** /timeoff/employees/{id}/diffHours/requests | Submit a new time off request of different hours per day.


## Documentation for Models

 - [AboutPart](docs/AboutPart.md)
 - [AddDocument](docs/AddDocument.md)
 - [AdjustmentRequest](docs/AdjustmentRequest.md)
 - [BalanceResult](docs/BalanceResult.md)
 - [ChangeEmail](docs/ChangeEmail.md)
 - [CreateEmployeeRequest](docs/CreateEmployeeRequest.md)
 - [CreateEmployeeRequestWork](docs/CreateEmployeeRequestWork.md)
 - [CreateFieldRequest](docs/CreateFieldRequest.md)
 - [CurrencyValue](docs/CurrencyValue.md)
 - [CustomTableColumn](docs/CustomTableColumn.md)
 - [CustomTableEntriesList](docs/CustomTableEntriesList.md)
 - [CustomTableEntry](docs/CustomTableEntry.md)
 - [CustomTableMetadata](docs/CustomTableMetadata.md)
 - [CustomTableMetadataList](docs/CustomTableMetadataList.md)
 - [CustomTablesCreateNewEntryRequest](docs/CustomTablesCreateNewEntryRequest.md)
 - [CustomTablesUpdateEntryRequest](docs/CustomTablesUpdateEntryRequest.md)
 - [DocumentsUploadConfidentialFileRequest](docs/DocumentsUploadConfidentialFileRequest.md)
 - [DocumentsUploadToSharedFolderRequest](docs/DocumentsUploadToSharedFolderRequest.md)
 - [Employee](docs/Employee.md)
 - [EmployeeDocumentResponse](docs/EmployeeDocumentResponse.md)
 - [EmployeeDocumentWithDownloadLink](docs/EmployeeDocumentWithDownloadLink.md)
 - [EmployeeFilter](docs/EmployeeFilter.md)
 - [EmployeeProfile](docs/EmployeeProfile.md)
 - [EmployeeReference](docs/EmployeeReference.md)
 - [EmployeeTermination](docs/EmployeeTermination.md)
 - [EmployeeTerminationNoticePeriod](docs/EmployeeTerminationNoticePeriod.md)
 - [Employees](docs/Employees.md)
 - [EmployeesProfiles](docs/EmployeesProfiles.md)
 - [EmploymentEntries](docs/EmploymentEntries.md)
 - [EmploymentEntry](docs/EmploymentEntry.md)
 - [EmploymentEntryAllOf](docs/EmploymentEntryAllOf.md)
 - [EquityEntries](docs/EquityEntries.md)
 - [EquityEntry](docs/EquityEntry.md)
 - [EquityEntryAllOf](docs/EquityEntryAllOf.md)
 - [Error](docs/Error.md)
 - [Field](docs/Field.md)
 - [FieldId](docs/FieldId.md)
 - [FieldTypeData](docs/FieldTypeData.md)
 - [FilterInstruction](docs/FilterInstruction.md)
 - [FlatListItemId](docs/FlatListItemId.md)
 - [GetPositionsRequest](docs/GetPositionsRequest.md)
 - [ImportAttendanceData](docs/ImportAttendanceData.md)
 - [ImportAttendanceEvent](docs/ImportAttendanceEvent.md)
 - [ImportAttendanceResponse](docs/ImportAttendanceResponse.md)
 - [InvitationByWizard](docs/InvitationByWizard.md)
 - [LifeCycleEntries](docs/LifeCycleEntries.md)
 - [LifeCycleEntry](docs/LifeCycleEntry.md)
 - [LifeCycleEntryAllOf](docs/LifeCycleEntryAllOf.md)
 - [List](docs/List.md)
 - [ListItem](docs/ListItem.md)
 - [NewListItem](docs/NewListItem.md)
 - [ObjectsMetadata](docs/ObjectsMetadata.md)
 - [ObjectsMetadataFieldType](docs/ObjectsMetadataFieldType.md)
 - [ObjectsMetadataJsonPath](docs/ObjectsMetadataJsonPath.md)
 - [OnboardingWizard](docs/OnboardingWizard.md)
 - [OnboardingWizards](docs/OnboardingWizards.md)
 - [OutToday](docs/OutToday.md)
 - [OutTodays](docs/OutTodays.md)
 - [PeopleUpdateEmployeeRecordRequest](docs/PeopleUpdateEmployeeRecordRequest.md)
 - [PeopleUpdateEmployeeRecordRequestAbout](docs/PeopleUpdateEmployeeRecordRequestAbout.md)
 - [PeopleUpdateEmployeeRecordRequestPersonal](docs/PeopleUpdateEmployeeRecordRequestPersonal.md)
 - [PersonalPart](docs/PersonalPart.md)
 - [Policy](docs/Policy.md)
 - [PolicyNames](docs/PolicyNames.md)
 - [PolicyType](docs/PolicyType.md)
 - [PolicyTypes](docs/PolicyTypes.md)
 - [PositionEntriesInner](docs/PositionEntriesInner.md)
 - [ReadEmployeesRequestReference](docs/ReadEmployeesRequestReference.md)
 - [ReadSingleEmployeeRequestReference](docs/ReadSingleEmployeeRequestReference.md)
 - [ReasonCode](docs/ReasonCode.md)
 - [ReasonCodes](docs/ReasonCodes.md)
 - [ReasonCodesNames](docs/ReasonCodesNames.md)
 - [Report](docs/Report.md)
 - [Reports](docs/Reports.md)
 - [Request](docs/Request.md)
 - [Requests](docs/Requests.md)
 - [SalaryEntries](docs/SalaryEntries.md)
 - [SalaryEntry](docs/SalaryEntry.md)
 - [SalaryEntryAllOf](docs/SalaryEntryAllOf.md)
 - [StartDateUpdate](docs/StartDateUpdate.md)
 - [SubmitTimeoffRequest](docs/SubmitTimeoffRequest.md)
 - [SubmitTimeoffRequestDiffHours](docs/SubmitTimeoffRequestDiffHours.md)
 - [SubmitTimeoffRequestDiffHoursDurationsInner](docs/SubmitTimeoffRequestDiffHoursDurationsInner.md)
 - [TableEntry](docs/TableEntry.md)
 - [Task](docs/Task.md)
 - [Tasks](docs/Tasks.md)
 - [TimeoffChange](docs/TimeoffChange.md)
 - [TimeoffChanges](docs/TimeoffChanges.md)
 - [TimeoffRequest](docs/TimeoffRequest.md)
 - [TimeoffRequestAttachmentLinksInner](docs/TimeoffRequestAttachmentLinksInner.md)
 - [TrainingEntries](docs/TrainingEntries.md)
 - [TrainingEntry](docs/TrainingEntry.md)
 - [TrainingEntryAllOf](docs/TrainingEntryAllOf.md)
 - [UpdateFieldRequest](docs/UpdateFieldRequest.md)
 - [UpdateListItemRequest](docs/UpdateListItemRequest.md)
 - [UploadAvatar](docs/UploadAvatar.md)
 - [VariableEntries](docs/VariableEntries.md)
 - [VariableEntry](docs/VariableEntry.md)
 - [VariableEntryAllOf](docs/VariableEntryAllOf.md)
 - [WorkEntries](docs/WorkEntries.md)
 - [WorkEntry](docs/WorkEntry.md)
 - [WorkEntryAllOf](docs/WorkEntryAllOf.md)
 - [WorkEntryAllOfReportsTo](docs/WorkEntryAllOfReportsTo.md)
 - [WorkPart](docs/WorkPart.md)
 - [YearsOfServiceIncrements](docs/YearsOfServiceIncrements.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
