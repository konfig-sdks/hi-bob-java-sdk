

# AdjustmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustmentType** | [**AdjustmentTypeEnum**](#AdjustmentTypeEnum) | Adjustment type - balance or time used. |  [optional] |
|**policyType** | **String** | Policy type name. |  [optional] |
|**effectiveDate** | **LocalDate** | The date this adjustment becomes effective. |  [optional] |
|**amount** | **Double** | The amount of days/hours to add/subtract. |  [optional] |
|**reason** | **String** | A reason for this adjustment. |  [optional] |



## Enum: AdjustmentTypeEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |
| DAYSUSED | &quot;daysUsed&quot; |



