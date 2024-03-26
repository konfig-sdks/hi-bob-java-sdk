# TasksApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeTask**](TasksApi.md#completeTask) | **POST** /tasks/{taskId}/complete | Mark a task as complete |
| [**getEmployeeTasks**](TasksApi.md#getEmployeeTasks) | **GET** /my/tasks | Read my tasks |
| [**getOpenTasks**](TasksApi.md#getOpenTasks) | **GET** /tasks | Read all open tasks. |
| [**readEmployeeTasks**](TasksApi.md#readEmployeeTasks) | **GET** /tasks/people/{id} | Read tasks of a specific employee  |


<a name="completeTask"></a>
# **completeTask**
> Tasks completeTask(taskId).execute();

Mark a task as complete

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String taskId = "taskId_example"; // task id
    try {
      Tasks result = client
              .tasks
              .completeTask(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#completeTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tasks> response = client
              .tasks
              .completeTask(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#completeTask");
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
| **taskId** | **String**| task id | |

### Return type

[**Tasks**](Tasks.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Marks a task as complete. |  -  |
| **0** | Unexpected error |  -  |

<a name="getEmployeeTasks"></a>
# **getEmployeeTasks**
> Tasks getEmployeeTasks().execute();

Read my tasks

&lt;b&gt;Supported user types:&lt;/b&gt; Employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
      Tasks result = client
              .tasks
              .getEmployeeTasks()
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getEmployeeTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tasks> response = client
              .tasks
              .getEmployeeTasks()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getEmployeeTasks");
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

[**Tasks**](Tasks.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The logged-in user&#39;s tasks. |  -  |

<a name="getOpenTasks"></a>
# **getOpenTasks**
> Tasks getOpenTasks().execute();

Read all open tasks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
      Tasks result = client
              .tasks
              .getOpenTasks()
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getOpenTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tasks> response = client
              .tasks
              .getOpenTasks()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getOpenTasks");
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

[**Tasks**](Tasks.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All open tasks for this company. |  -  |

<a name="readEmployeeTasks"></a>
# **readEmployeeTasks**
> Tasks readEmployeeTasks(id).taskStatus(taskStatus).execute();

Read tasks of a specific employee 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String taskStatus = "open"; // filter tasks by open / closed status. Not sending task_status will return all tasks.
    try {
      Tasks result = client
              .tasks
              .readEmployeeTasks(id)
              .taskStatus(taskStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#readEmployeeTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tasks> response = client
              .tasks
              .readEmployeeTasks(id)
              .taskStatus(taskStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#readEmployeeTasks");
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
| **taskStatus** | **String**| filter tasks by open / closed status. Not sending task_status will return all tasks. | [optional] [enum: open, closed] |

### Return type

[**Tasks**](Tasks.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All of a specific employee&#39;s open tasks. |  -  |
| **0** | Unexpected error |  -  |

