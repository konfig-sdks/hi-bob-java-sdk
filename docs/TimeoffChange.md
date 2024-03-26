

# TimeoffChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | Change type - created, canceled or deleted. |  [optional] |
|**employeeId** | **UUID** | Employee ID |  [optional] |
|**employeeDisplayName** | **String** | Employee display name. |  [optional] |
|**employeeEmail** | **String** | Employee email address. |  [optional] |
|**requestId** | **Integer** | TimeOff Request ID. |  [optional] |
|**policyTypeDisplayName** | **String** | Display name of the policy type. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested. |  [optional] |
|**startDate** | **LocalDate** | Date of the first day of the time off (not relevant for requests using the hours type). |  [optional] |
|**startPortion** | **String** | What portion of the first day is included - all_day, morning or afternoon (relevant for requests using the Days type). |  [optional] |
|**endDate** | **LocalDate** | Date of the last day of the time off (not relevant for requests using the hours type). |  [optional] |
|**endPortion** | **String** | What portion of the last day is included - all_day, morning or afternoon (relevant for requests using the Days type). |  [optional] |
|**dayPortion** | **String** | What portion of the request&#39;s days is included - morning or afternoon (relevant for requests using the portionOnRange type). |  [optional] |
|**date** | **LocalDate** | Date of the time off (relevant for requests using the Hours type) |  [optional] |
|**hoursOnDate** | **Integer** | The time off duration in hours for the date (relevant for requests using the Hours type). |  [optional] |
|**dailyHours** | **Double** | The time off duration in hours for every day in the request (relevant for requests using the hoursOnRange type) |  [optional] |
|**durationUnit** | [**DurationUnitEnum**](#DurationUnitEnum) | The unit used for the totalDuration and totalCost - either &#39;days&#39; or &#39;hours&#39; |  [optional] |
|**totalDuration** | **Double** | The total amount of time the request covers, including regular days off such as weekends |  [optional] |
|**totalCost** | **Double** | The amount that will be deducted from the balance |  [optional] |
|**changeReason** | **String** | Request change reason |  [optional] |



## Enum: ChangeTypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;Created&quot; |
| CANCELED | &quot;Canceled&quot; |
| DELETED | &quot;Deleted&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |
| PORTIONONRANGE | &quot;portionOnRange&quot; |
| HOURSONRANGE | &quot;hoursOnRange&quot; |



## Enum: DurationUnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |



