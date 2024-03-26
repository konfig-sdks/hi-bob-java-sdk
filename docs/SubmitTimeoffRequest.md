

# SubmitTimeoffRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Request reason. |  [optional] |
|**policyType** | **String** | Request policy type, e.g. Holiday, Sick or any custom type defined. |  |
|**requestRangeType** | [**RequestRangeTypeEnum**](#RequestRangeTypeEnum) | The type of request duration.&lt;br&gt; Select &lt;b&gt;hours&lt;/b&gt; when the request is for X hours during the day requested (This is supported only for policy types measured in hours).&lt;br&gt; Select &lt;b&gt;portionOnRange&lt;/b&gt; when the  request is for every morning or every afternoon during the days requested.&lt;br&gt; Select &lt;b&gt;hoursOnRange&lt;/b&gt; when the request is for X hours every day during the days requested (This is supported only for policy types measured in hours) |  [optional] |
|**startDate** | **LocalDate** | Date of the first day of the time off (not relevant for requests using the hours type). |  |
|**startDatePortion** | [**StartDatePortionEnum**](#StartDatePortionEnum) | Portion of the first day - relevant for requests in days. |  [optional] |
|**endDate** | **LocalDate** | Date of the last day of the time off (not relevant for requests using                                                the hours type). |  [optional] |
|**hours** | **Integer** | This field is mandatory if the requestRangeType is set to &#39;hours&#39;. |  [optional] |
|**minutes** | **Integer** | Relevant if requestRangeType is set to &#39;hours&#39;. |  [optional] |
|**endDatePortion** | [**EndDatePortionEnum**](#EndDatePortionEnum) | Portion of the last day - relevant for requests in days. |  [optional] |
|**dayPortion** | [**DayPortionEnum**](#DayPortionEnum) | Select &lt;b&gt;morning&lt;/b&gt; when the request is for mornings on the days requested. Select &lt;b&gt;afternoon&lt;/b&gt; when the request is for afternoons on the days requested.&lt;br&gt; This is mandatory if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;portionOnRange&lt;/b&gt;. |  [optional] |
|**dailyHours** | **Integer** | Enter the number of hours when the request is for X hours on the days requested.&lt;br&gt; This is mandatory if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;hoursOnRange&lt;/b&gt;. |  [optional] |
|**dailyMinutes** | **Integer** | Enter the number of minutes when the request is for X hours and X minutes on the days requested.&lt;br&gt; This is relevant if the &lt;b&gt;requestRangeType&lt;/b&gt; is &lt;b&gt;hoursOnRange&lt;/b&gt; and the amount requested is not a full hour or hours. |  [optional] |
|**skipManagerApproval** | **Boolean** | Admins only can skip the approval policy. Setting this field to true will create an approved request. |  [optional] |
|**approver** | **String** | The employee ID of the user to be set as the approver for this request. This is relevant if &#39;skipManagerApproval&#39; is set to true.&lt;br&gt;Please note that the user calling the API with this param must have permission to import time off requests. |  [optional] |
|**reasonCode** | **Integer** | The reason code ID taken from the policy type&#39;s reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes |  [optional] |



## Enum: RequestRangeTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |
| PORTIONONRANGE | &quot;portionOnRange&quot; |
| HOURSONRANGE | &quot;hoursOnRange&quot; |



## Enum: StartDatePortionEnum

| Name | Value |
|---- | -----|
| ALL_DAY | &quot;all_day&quot; |
| MORNING | &quot;morning&quot; |
| AFTERNOON | &quot;afternoon&quot; |



## Enum: EndDatePortionEnum

| Name | Value |
|---- | -----|
| ALL_DAY | &quot;all_day&quot; |
| MORNING | &quot;morning&quot; |
| AFTERNOON | &quot;afternoon&quot; |



## Enum: DayPortionEnum

| Name | Value |
|---- | -----|
| MORNING | &quot;morning&quot; |
| AFTERNOON | &quot;afternoon&quot; |



