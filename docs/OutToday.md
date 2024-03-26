

# OutToday


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **UUID** | Employee ID. |  [optional] |
|**employeeDisplayName** | **String** | Employee display name. |  [optional] |
|**employeeEmail** | **String** | Employee email address. |  [optional] |
|**policyTypeDisplayName** | **String** | Display name of the policy type. |  [optional] |
|**startDate** | **LocalDate** | Date of the first day of the time off (not relevant for requests using the hours type). |  [optional] |
|**startDatePortion** | **String** | What portion of the first day is included - all_day, morning or afternoon (relevant for request using the days type). |  [optional] |
|**endDate** | **LocalDate** | Date of the last day of the time off (not relevant for requests using the hours type). |  [optional] |
|**endDatePortion** | **String** | What portion of the last day is included - all_day, morning or afternoon (relevant for request using the days type). |  [optional] |
|**requestRangeType** | [**RequestRangeTypeEnum**](#RequestRangeTypeEnum) | The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested. |  [optional] |
|**dayPortion** | **String** | What portion of the request&#39;s days is included - morning or afternoon (relevant for request using the portionOnRange type). |  [optional] |
|**dailyHours** | **Double** | The time off duration in hours for every request&#39;s days (relevant for requests with hoursOnRange type). |  [optional] |
|**date** | **LocalDate** | Date of the time off (relevant for requests using the hours type). |  [optional] |
|**hours** | **Integer** | The time off duration in hours for the date (relevant for requests with hours type). |  [optional] |
|**minutes** | **Integer** | Relevant for requests using the hours type. |  [optional] |



## Enum: RequestRangeTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |
| PORTIONONRANGE | &quot;portionOnRange&quot; |
| HOURSONRANGE | &quot;hoursOnRange&quot; |



