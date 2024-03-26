

# PolicyType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**activity** | [**ActivityEnum**](#ActivityEnum) | Activity type. |  [optional] |
|**bookingWorkDaysOnly** | **Boolean** | Requests will be deducted from the balance only for working days. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) |  |  [optional] |



## Enum: ActivityEnum

| Name | Value |
|---- | -----|
| PAIDTIMEOFF | &quot;paidTimeoff&quot; |
| UNPAIDTIMEOFF | &quot;unpaidTimeoff&quot; |
| WORKTIME | &quot;workTime&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |



