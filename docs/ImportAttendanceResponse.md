

# ImportAttendanceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Import status |  [optional] |
|**total** | **Double** | Total number of clock-in and clock-out events received |  [optional] |
|**imported** | **Double** | Number of clock-in/clock-out events imported |  [optional] |
|**notImported** | **Double** | Number of clock-in/clock-out events which were not imported |  [optional] |
|**errors** | **List&lt;String&gt;** | List of all errors received in the process |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |
| PARTIAL_SUCCESS | &quot;partial_success&quot; |



