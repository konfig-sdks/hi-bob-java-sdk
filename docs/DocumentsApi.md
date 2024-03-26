# DocumentsApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEmployeeConfidentialDoc**](DocumentsApi.md#deleteEmployeeConfidentialDoc) | **DELETE** /docs/people/{id}/confidential/{docId} | Delete a specific document from the employee&#39;s confidential folder. |
| [**downloadLinks**](DocumentsApi.md#downloadLinks) | **GET** /docs/people/{id} | Download employee&#39;s documents |
| [**removeEmployeeSharedDocument**](DocumentsApi.md#removeEmployeeSharedDocument) | **DELETE** /docs/people/{id}/shared/{docId} | Delete specific document from the employee&#39;s shared folder. |
| [**uploadConfidentialFile**](DocumentsApi.md#uploadConfidentialFile) | **POST** /docs/people/{id}/confidential/upload | Upload a file to the employee&#39;s confidential folder. |
| [**uploadToConfidentialFolder**](DocumentsApi.md#uploadToConfidentialFolder) | **POST** /docs/people/{id}/confidential | Upload a document to the employee&#39;s confidential folder |
| [**uploadToSharedFolder**](DocumentsApi.md#uploadToSharedFolder) | **POST** /docs/people/{id}/shared | Upload a document to the employee&#39;s shared folder |
| [**uploadToSharedFolder_0**](DocumentsApi.md#uploadToSharedFolder_0) | **POST** /docs/people/{id}/shared/upload | Upload a file to the employee&#39;s shared folder. |


<a name="deleteEmployeeConfidentialDoc"></a>
# **deleteEmployeeConfidentialDoc**
> deleteEmployeeConfidentialDoc(id, docId).execute();

Delete a specific document from the employee&#39;s confidential folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    String docId = "docId_example"; // Document ID.
    try {
      client
              .documents
              .deleteEmployeeConfidentialDoc(id, docId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteEmployeeConfidentialDoc");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .deleteEmployeeConfidentialDoc(id, docId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteEmployeeConfidentialDoc");
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
| **docId** | **String**| Document ID. | |

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
| **200** | Delete success. |  -  |
| **0** | Unexpected error. |  -  |

<a name="downloadLinks"></a>
# **downloadLinks**
> EmployeeDocumentResponse downloadLinks(id).execute();

Download employee&#39;s documents

Returns a list of documents and download links.&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
      EmployeeDocumentResponse result = client
              .documents
              .downloadLinks(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDocuments());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#downloadLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDocumentResponse> response = client
              .documents
              .downloadLinks(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#downloadLinks");
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

[**EmployeeDocumentResponse**](EmployeeDocumentResponse.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of the documents&#39; names and download links. |  -  |
| **0** | Unexpected error |  -  |

<a name="removeEmployeeSharedDocument"></a>
# **removeEmployeeSharedDocument**
> removeEmployeeSharedDocument(id, docId).execute();

Delete specific document from the employee&#39;s shared folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    String docId = "docId_example"; // Document ID.
    try {
      client
              .documents
              .removeEmployeeSharedDocument(id, docId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#removeEmployeeSharedDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .removeEmployeeSharedDocument(id, docId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#removeEmployeeSharedDocument");
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
| **docId** | **String**| Document ID. | |

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
| **200** | Delete success. |  -  |
| **0** | Unexpected error. |  -  |

<a name="uploadConfidentialFile"></a>
# **uploadConfidentialFile**
> uploadConfidentialFile(id, _file, documentsUploadConfidentialFileRequest).execute();

Upload a file to the employee&#39;s confidential folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    File _file = new File("/path/to/file"); // The file to upload.
    try {
      client
              .documents
              .uploadConfidentialFile(id, _file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadConfidentialFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .uploadConfidentialFile(id, _file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadConfidentialFile");
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
| **_file** | **File**| The file to upload. | |
| **documentsUploadConfidentialFileRequest** | [**DocumentsUploadConfidentialFileRequest**](DocumentsUploadConfidentialFileRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Uploaded document ID. |  -  |
| **0** | Unexpected error |  -  |

<a name="uploadToConfidentialFolder"></a>
# **uploadToConfidentialFolder**
> uploadToConfidentialFolder(id, document).execute();

Upload a document to the employee&#39;s confidential folder

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    List<String> tags = Arrays.asList(); // Tags to.
    String documentName = "documentName_example"; // Document name.
    String documentUrl = "documentUrl_example"; // URL of the document to upload.
    try {
      client
              .documents
              .uploadToConfidentialFolder(id)
              .tags(tags)
              .documentName(documentName)
              .documentUrl(documentUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToConfidentialFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .uploadToConfidentialFolder(id)
              .tags(tags)
              .documentName(documentName)
              .documentUrl(documentUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToConfidentialFolder");
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
| **document** | [**AddDocument**](AddDocument.md)| Document to upload. | |

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
| **200** | Upload success. |  -  |
| **0** | Unexpected error. |  -  |

<a name="uploadToSharedFolder"></a>
# **uploadToSharedFolder**
> uploadToSharedFolder(id, document).execute();

Upload a document to the employee&#39;s shared folder

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    List<String> tags = Arrays.asList(); // Tags to.
    String documentName = "documentName_example"; // Document name.
    String documentUrl = "documentUrl_example"; // URL of the document to upload.
    try {
      client
              .documents
              .uploadToSharedFolder(id)
              .tags(tags)
              .documentName(documentName)
              .documentUrl(documentUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToSharedFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .uploadToSharedFolder(id)
              .tags(tags)
              .documentName(documentName)
              .documentUrl(documentUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToSharedFolder");
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
| **document** | [**AddDocument**](AddDocument.md)| Document to upload. | |

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
| **200** | Upload success. |  -  |
| **0** | Unexpected error. |  -  |

<a name="uploadToSharedFolder_0"></a>
# **uploadToSharedFolder_0**
> uploadToSharedFolder_0(id, _file, documentsUploadToSharedFolderRequest).execute();

Upload a file to the employee&#39;s shared folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    File _file = new File("/path/to/file"); // The file to upload.
    try {
      client
              .documents
              .uploadToSharedFolder_0(id, _file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToSharedFolder_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .documents
              .uploadToSharedFolder_0(id, _file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadToSharedFolder_0");
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
| **_file** | **File**| The file to upload. | |
| **documentsUploadToSharedFolderRequest** | [**DocumentsUploadToSharedFolderRequest**](DocumentsUploadToSharedFolderRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Uploaded document ID. |  -  |
| **0** | Unexpected error. |  -  |

