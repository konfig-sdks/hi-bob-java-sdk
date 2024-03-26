# MetadataApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewField**](MetadataApi.md#addNewField) | **POST** /company/people/fields | Create a new field. |
| [**addNewItemToNamedList**](MetadataApi.md#addNewItemToNamedList) | **POST** /company/named-lists/{listName} | Add a new item to an existing list. |
| [**deleteField**](MetadataApi.md#deleteField) | **DELETE** /company/people/fields/{fieldId} | Delete an existing field. |
| [**deleteItemFromCompanyNamedList**](MetadataApi.md#deleteItemFromCompanyNamedList) | **DELETE** /company/named-lists/{listName}/{itemId} | Delete an item from an existing list. |
| [**getCompanyFields**](MetadataApi.md#getCompanyFields) | **GET** /company/people/fields | Get all company fields. |
| [**getCompanyNamedLists**](MetadataApi.md#getCompanyNamedLists) | **GET** /company/named-lists | Get all company lists |
| [**getCustomTableMetadata**](MetadataApi.md#getCustomTableMetadata) | **GET** /people/custom-tables/metadata | Read metadata of custom tables defined |
| [**getNamedList**](MetadataApi.md#getNamedList) | **GET** /company/named-lists/{listName} | Get a specific company list by name. |
| [**getPositionFields**](MetadataApi.md#getPositionFields) | **GET** /metadata/objects/position | Get all positions fields |
| [**getTableDetails**](MetadataApi.md#getTableDetails) | **GET** /people/custom-tables/metadata/{custom_table_id} | Read metadata for specific custom table |
| [**updateField**](MetadataApi.md#updateField) | **PUT** /company/people/fields/{fieldId} | Update an existing field |
| [**updateItemFromNamedList**](MetadataApi.md#updateItemFromNamedList) | **PUT** /company/named-lists/{listName}/{itemId} | Update an existing item from a list. |


<a name="addNewField"></a>
# **addNewField**
> FieldId addNewField(body).execute();

Create a new field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String name = "name_example"; // The name of the field.
    String category = "category_example"; // The category of the field.
    String type = "type_example"; // The type of field. Supported field types: text, text-area, number, date, list, multi-list, hierarchy-list, currency, employee-reference, document.
    String description = "description_example"; // The description of the field.
    String historical = "historical_example"; // When true, this field keeps the history of its values, each being active starting from a certain date. The default value is false.
    try {
      FieldId result = client
              .metadata
              .addNewField(name, category, type)
              .description(description)
              .historical(historical)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#addNewField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FieldId> response = client
              .metadata
              .addNewField(name, category, type)
              .description(description)
              .historical(historical)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#addNewField");
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
| **body** | [**CreateFieldRequest**](CreateFieldRequest.md)| The field to be created. | |

### Return type

[**FieldId**](FieldId.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The new field was successfully created. The ID of the field is returned. |  -  |
| **400** | If the category of the field is root, or historical is set to true, but the category doesn&#39;t allow it, or if the field type is not supported. |  -  |
| **404** | If the category of the field doesn&#39;t exist |  -  |

<a name="addNewItemToNamedList"></a>
# **addNewItemToNamedList**
> FlatListItemId addNewItemToNamedList(listName, body).execute();

Add a new item to an existing list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String name = "name_example"; // Name of the item.
    String listName = "listName_example"; // The internal name of the list.
    Integer parentId = 56; // ID of the new hierarchy parent node.
    try {
      FlatListItemId result = client
              .metadata
              .addNewItemToNamedList(name, listName)
              .parentId(parentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#addNewItemToNamedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FlatListItemId> response = client
              .metadata
              .addNewItemToNamedList(name, listName)
              .parentId(parentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#addNewItemToNamedList");
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
| **listName** | **String**| The internal name of the list. | |
| **body** | [**NewListItem**](NewListItem.md)| The &lt;b&gt;parentId&lt;/b&gt; attribute is optional and only applies to hierarchy lists. When &lt;b&gt;parentId&lt;/b&gt; is specified, the newly created list item will be placed under the specific hierarchy parent node. | |

### Return type

[**FlatListItemId**](FlatListItemId.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A new item is created. Please note that the ID of the newly created item may be textual or numeric depending on the list type. |  -  |
| **404** | If the list was not found. |  -  |
| **409** | If the added item already exists |  -  |

<a name="deleteField"></a>
# **deleteField**
> deleteField(fieldId).execute();

Delete an existing field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String fieldId = "fieldId_example"; // The ID of the field.
    try {
      client
              .metadata
              .deleteField(fieldId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#deleteField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadata
              .deleteField(fieldId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#deleteField");
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
| **fieldId** | **String**| The ID of the field. | |

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
| **200** | The field was deleted successfully. |  -  |
| **400** | If the field is a Bob default field. |  -  |
| **404** | If the field doesn&#39;t exist |  -  |

<a name="deleteItemFromCompanyNamedList"></a>
# **deleteItemFromCompanyNamedList**
> deleteItemFromCompanyNamedList(listName, itemId).execute();

Delete an item from an existing list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String listName = "listName_example"; // The internal name of the list.
    String itemId = "itemId_example"; // The ID of the list item.
    try {
      client
              .metadata
              .deleteItemFromCompanyNamedList(listName, itemId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#deleteItemFromCompanyNamedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadata
              .deleteItemFromCompanyNamedList(listName, itemId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#deleteItemFromCompanyNamedList");
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
| **listName** | **String**| The internal name of the list. | |
| **itemId** | **String**| The ID of the list item. | |

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
| **200** | The list item was deleted successfully. |  -  |
| **404** | If the list or item was not found |  -  |

<a name="getCompanyFields"></a>
# **getCompanyFields**
> List&lt;Field&gt; getCompanyFields().execute();

Get all company fields.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
      List<Field> result = client
              .metadata
              .getCompanyFields()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCompanyFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Field>> response = client
              .metadata
              .getCompanyFields()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCompanyFields");
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

[**List&lt;Field&gt;**](Field.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |

<a name="getCompanyNamedLists"></a>
# **getCompanyNamedLists**
> List&lt;List&gt; getCompanyNamedLists().includeArchived(includeArchived).execute();

Get all company lists

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    Boolean includeArchived = false; // Whether to include archived items in the response.
    try {
      List<List> result = client
              .metadata
              .getCompanyNamedLists()
              .includeArchived(includeArchived)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCompanyNamedLists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<List>> response = client
              .metadata
              .getCompanyNamedLists()
              .includeArchived(includeArchived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCompanyNamedLists");
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
| **includeArchived** | **Boolean**| Whether to include archived items in the response. | [optional] [default to false] |

### Return type

[**List&lt;List&gt;**](List.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getCustomTableMetadata"></a>
# **getCustomTableMetadata**
> CustomTableMetadataList getCustomTableMetadata().execute();

Read metadata of custom tables defined

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
      CustomTableMetadataList result = client
              .metadata
              .getCustomTableMetadata()
              .execute();
      System.out.println(result);
      System.out.println(result.getTables());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCustomTableMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomTableMetadataList> response = client
              .metadata
              .getCustomTableMetadata()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getCustomTableMetadata");
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

[**CustomTableMetadataList**](CustomTableMetadataList.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getNamedList"></a>
# **getNamedList**
> List getNamedList(listName).includeArchived(includeArchived).execute();

Get a specific company list by name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String listName = "listName_example"; // The internal name of the list.
    Boolean includeArchived = false; // Whether to include archived items in the response.
    try {
      List result = client
              .metadata
              .getNamedList(listName)
              .includeArchived(includeArchived)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getNamedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List> response = client
              .metadata
              .getNamedList(listName)
              .includeArchived(includeArchived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getNamedList");
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
| **listName** | **String**| The internal name of the list. | |
| **includeArchived** | **Boolean**| Whether to include archived items in the response. | [optional] [default to false] |

### Return type

[**List**](List.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Please note that the item ID may be textual or numeric depending on the list type. |  -  |
| **404** | If the list was not found. |  -  |

<a name="getPositionFields"></a>
# **getPositionFields**
> ObjectsMetadata getPositionFields().execute();

Get all positions fields

Returns a list of all fields of object type position.&lt;br/&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
      ObjectsMetadata result = client
              .metadata
              .getPositionFields()
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getFieldType());
      System.out.println(result.getJsonPath());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getPositionFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObjectsMetadata> response = client
              .metadata
              .getPositionFields()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getPositionFields");
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

[**ObjectsMetadata**](ObjectsMetadata.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error. |  -  |

<a name="getTableDetails"></a>
# **getTableDetails**
> CustomTableMetadata getTableDetails(customTableId).execute();

Read metadata for specific custom table

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String customTableId = "customTableId_example"; // The ID of custom table.
    try {
      CustomTableMetadata result = client
              .metadata
              .getTableDetails(customTableId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCategory());
      System.out.println(result.getName());
      System.out.println(result.getColumns());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getTableDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomTableMetadata> response = client
              .metadata
              .getTableDetails(customTableId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getTableDetails");
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
| **customTableId** | **String**| The ID of custom table. | |

### Return type

[**CustomTableMetadata**](CustomTableMetadata.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="updateField"></a>
# **updateField**
> updateField(fieldId, body).execute();

Update an existing field

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String fieldId = "fieldId_example"; // The ID of the field.
    String description = "description_example"; // The description of the field.
    String name = "name_example"; // The name of the field.
    try {
      client
              .metadata
              .updateField(fieldId)
              .description(description)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#updateField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadata
              .updateField(fieldId)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#updateField");
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
| **fieldId** | **String**| The ID of the field. | |
| **body** | [**UpdateFieldRequest**](UpdateFieldRequest.md)| The new name and/or description of the updated field. | |

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
| **200** | The field was updated successfully. |  -  |
| **404** | If the field doesn&#39;t exist. |  -  |

<a name="updateItemFromNamedList"></a>
# **updateItemFromNamedList**
> updateItemFromNamedList(listName, itemId, body).execute();

Update an existing item from a list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
    String listName = "listName_example"; // The internal name of the list.
    String itemId = "itemId_example"; // The ID of the list item.
    String name = "name_example"; // Name of the item.
    Integer parentId = 56; // ID of the new hierarchy parent node.
    try {
      client
              .metadata
              .updateItemFromNamedList(listName, itemId)
              .name(name)
              .parentId(parentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#updateItemFromNamedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadata
              .updateItemFromNamedList(listName, itemId)
              .name(name)
              .parentId(parentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#updateItemFromNamedList");
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
| **listName** | **String**| The internal name of the list. | |
| **itemId** | **String**| The ID of the list item. | |
| **body** | [**UpdateListItemRequest**](UpdateListItemRequest.md)| You need to provide at least one of: &lt;b&gt;name&lt;/b&gt; or &lt;b&gt;parentId&lt;/b&gt;. Providing a name will rename the list item value. Providing the parent ID will move the hierarchy list item (together with its children) under the indicated parent node. | |

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
| **200** | List item was updated successfully. |  -  |
| **404** | If the list or item was not found. |  -  |

