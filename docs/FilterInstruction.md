

# FilterInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldId** | **String** | The field id (path) to filter by.&lt;br /&gt; Supported fields: “/position/status”, \&quot;/position/name\&quot;.&lt;br /&gt;Any other path will get a response of 400 HTTP error. |  |
|**operator** | **String** | Supported operators: “equals”, \&quot;notEqual\&quot;.&lt;br /&gt;Any other operator will get a response of 400 HTTP error. |  |
|**values** | **List&lt;String&gt;** | List of values to compare.&lt;br /&gt;Empty list will result in 400 HTTP error. |  |



