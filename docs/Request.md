

# Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **Long** |  |  [optional] |
|**employeeId** | **UUID** | Employee ID. |  [optional] |
|**policyType** | **String** | Request policy type, e.g. Holiday, Sick or any defined custom type. |  [optional] |
|**policyTypeDisplayName** | **String** | Display name for the policy type. This will be translated based on the locale. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested. |  [optional] |
|**startDate** | **LocalDate** | Date of the first day of the time off (not relevant for requests using the hours type). |  [optional] |
|**startPortion** | **String** | What portion of the first day is included - all_day, morning or afternoon (relevant for request using the days type). |  [optional] |
|**endDate** | **LocalDate** | Date of the last day of the time off (not relevant for requests using the hours type). |  [optional] |
|**endPortion** | **String** | What portion of the last day is included - all_day, morning or afternoon (relevant for requests using the days type). |  [optional] |
|**dayPortion** | **String** | What portion of the request&#39;s days is included - morning or afternoon (relevant for requests using the portionOnRange type). |  [optional] |
|**date** | **LocalDate** | Date of the time off (relevant for request using the hours type) |  [optional] |
|**hoursOnDate** | **Integer** | The time off duration in hours for the date (relevant for request using the hours type). |  [optional] |
|**minutes** | **Integer** | Relevant for request using the hours type. |  [optional] |
|**dailyHours** | **Double** | The time off duration in hours for every day in the request (relevant for requests using the hoursOnRange type). |  [optional] |
|**status** | **String** | Request status. This can be either Approved or Pending. |  [optional] |
|**employeeDisplayName** | **String** | Employee display name. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |
| PORTIONONRANGE | &quot;portionOnRange&quot; |
| HOURSONRANGE | &quot;hoursOnRange&quot; |



