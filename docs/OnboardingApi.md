# OnboardingApi

All URIs are relative to *https://api.hibob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWizardSummary**](OnboardingApi.md#getWizardSummary) | **GET** /onboarding/wizards | Get a summary of all onboarding wizards. |


<a name="getWizardSummary"></a>
# **getWizardSummary**
> OnboardingWizards getWizardSummary().execute();

Get a summary of all onboarding wizards.

Wizard info includes Wizard ID, name and description.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HiBob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
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
      OnboardingWizards result = client
              .onboarding
              .getWizardSummary()
              .execute();
      System.out.println(result);
      System.out.println(result.getWizards());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#getWizardSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnboardingWizards> response = client
              .onboarding
              .getWizardSummary()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#getWizardSummary");
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

[**OnboardingWizards**](OnboardingWizards.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onboarding Wizards |  -  |
| **0** | Unexpected error |  -  |

