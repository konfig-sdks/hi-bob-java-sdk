

# ImportAttendanceData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idType** | **String** | The ID type used to identify the employee. Can be one of: \&quot;bobId\&quot;, \&quot;email\&quot;, \&quot;idInCompany\&quot;, or a custom field.&lt;br/&gt;For &lt;b&gt;custom fields&lt;/b&gt; a forward slash separator should be used.&lt;br/&gt;In order to use a specific custom field to identify an employee, for example a custom field called \&quot;Payroll integration ID\&quot;:&lt;ul&gt;&lt;li&gt;Query the field name via the &lt;a href&#x3D;&#39;https://apidocs.hibob.com/reference/get_company-people-fields&#39;&gt;\&quot;Get all company fields\&quot;&lt;/a&gt;&lt;/li&gt;&lt;li&gt;In the response the name will look like &lt;b&gt;\&quot;identification.custom.Payroll Integration ID_1RNhIIf\&quot;&lt;/b&gt;&lt;/li&gt;&lt;li&gt;The value to use should be: &lt;b&gt;\&quot;/identification/custom/Payroll Integration ID_1RNhI\&quot;&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt; |  |
|**requests** | [**List&lt;ImportAttendanceEvent&gt;**](ImportAttendanceEvent.md) | List of attendance events |  |
|**dateTimeFormat** | **String** | Allows to set custom date format for the date-time values sent in the requests |  [optional] |



