

# TimeoffRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The request description. |  [optional] |
|**employeeId** | **UUID** | Employee ID. |  [optional] |
|**requestId** | **Integer** | Time Off Request ID. |  [optional] |
|**policyTypeDisplayName** | **String** | Display name of the policy type. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of request duration.&lt;br&gt; &lt;b&gt;portionOnRange&lt;/b&gt; is when the request is for every morning or every afternoon during the days requested.&lt;br&gt; &lt;b&gt;hoursOnRange&lt;/b&gt; is when the request is for X hours every day during the days requested. |  [optional] |
|**startDate** | **LocalDate** | Date of the first day of the time off  (not relevant for requests using the hours type). |  [optional] |
|**startDatePortion** | **String** | What portion of the first day is included - all_day, morning or afternoon (relevant for requests using the Days type). |  [optional] |
|**endDate** | **LocalDate** | Date of the last day of the time off (not relevant for requests using                                                the hours type). |  [optional] |
|**endDatePortion** | **String** | What portion of the last day is included - all_day, morning or afternoon (relevant for requests using the Days type). |  [optional] |
|**dayPortion** | **String** | What portion of the request&#39;s days is included - morning or afternoon (relevant for requests using the portionOnRange type). |  [optional] |
|**approved** | **Boolean** | Whether the request is approved (and hence publicly visible). |  [optional] |
|**date** | **LocalDate** | Date of the time off (relevant for requests using the Hours type). |  [optional] |
|**hoursOnDate** | **Integer** | The time off duration in hours for the date (relevant for requests using the Hours type) |  [optional] |
|**dailyHours** | **Double** | The time off duration in hours for every day in the request (relevant for requests using the hoursOnRange type). |  [optional] |
|**durationUnit** | [**DurationUnitEnum**](#DurationUnitEnum) | The unit used for the totalDuration and totalCost - either &#39;days&#39; or &#39;hours&#39; |  [optional] |
|**totalDuration** | **Double** | The total amount of time the request covers, including regular days off such as weekends |  [optional] |
|**totalCost** | **Double** | The amount that will be deducted from the balance |  [optional] |
|**status** | **String** | Request status. This can be approved, pending, canceled, etc. |  [optional] |
|**hasAttachment** | **Boolean** | Whether the request has attachments |  [optional] |
|**reasonCode** | **String** | The reason code taken from the policy type&#39;s reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes |  [optional] |
|**attachmentLinks** | [**List&lt;TimeoffRequestAttachmentLinksInner&gt;**](TimeoffRequestAttachmentLinksInner.md) | Attachments with download links |  [optional] |



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



