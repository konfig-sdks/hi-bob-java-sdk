

# EmployeeFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldPath** | **String** | The field id (path) to filter by.&lt;br /&gt; Supported fields: “root.id”, \&quot;root.email\&quot;.&lt;br /&gt;Any other path will get a response of 400 HTTP error. |  [optional] |
|**operator** | **String** | Supported operators: “equals” &lt;br /&gt; Any other operator will get a response of 400 HTTP error. |  [optional] |
|**values** | **List&lt;String&gt;** | List of values to compare. &lt;br /&gt; Empty list will result in 400 HTTP error. |  [optional] |



