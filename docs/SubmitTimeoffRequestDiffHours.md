

# SubmitTimeoffRequestDiffHours


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Request reason. |  [optional] |
|**policyType** | **String** | Request policy type, e.g. Holiday, Sick or any custom type defined. |  |
|**startDate** | **LocalDate** | Date of the first day of the time off |  |
|**endDate** | **LocalDate** | Date of the last day of the time off. |  |
|**durations** | [**List&lt;SubmitTimeoffRequestDiffHoursDurationsInner&gt;**](SubmitTimeoffRequestDiffHoursDurationsInner.md) | Array of durations for each day in the request. |  |
|**skipManagerApproval** | **Boolean** | Admins only can skip the approval policy. Setting this field to true will create an approved request. |  [optional] |
|**approver** | **String** | The employee ID of the user to be set as the approver for this request. This is relevant if &#39;skipManagerApproval&#39; is set to true.&lt;br&gt;Please note that the user calling the API with this param must have permission to import time off requests. |  [optional] |
|**reasonCode** | **Integer** | The reason code ID taken from the policy type&#39;s reason codes list. The list is available in GET /timeoff/policy-types/{policyType}/reason-codes |  [optional] |



