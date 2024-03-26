

# Policy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Policy description. |  [optional] |
|**name** | **String** |  |  [optional] |
|**allowance** | **Double** | Base annual allowance. |  [optional] |
|**maxBalance** | **Double** | Maximum balance at the end of the cycle. |  [optional] |
|**minBalance** | **Double** | Minimum balance cap. |  [optional] |
|**yosIncrease** | [**List&lt;YearsOfServiceIncrements&gt;**](YearsOfServiceIncrements.md) |  |  [optional] |
|**minTimeOffRequestDuration** | [**MinTimeOffRequestDurationEnum**](#MinTimeOffRequestDurationEnum) | The shortest amount of time employees can request. |  [optional] |
|**approvalRequired** | **Boolean** | Requests require approval. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) |  |  [optional] |



## Enum: MinTimeOffRequestDurationEnum

| Name | Value |
|---- | -----|
| FULLDAY | &quot;fullDay&quot; |
| HALFDAY | &quot;halfDay&quot; |
| FULLHOUR | &quot;fullHour&quot; |
| HALFHOUR | &quot;halfHour&quot; |
| QUARTERHOUR | &quot;quarterHour&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |



