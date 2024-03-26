

# ReadEmployeesRequestReference


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fields** | **List&lt;String&gt;** | Optional array of employee field paths that&#39;s are required in response. If you don&#39;t specify fields - only basic fields and categories are returned: &lt;br/&gt;&lt;b&gt;Basic fields:&lt;/b&gt;  &lt;ul&gt;                       &lt;li&gt;ID&lt;/li&gt;                       &lt;li&gt;Company ID&lt;/li&gt;                       &lt;li&gt;Email&lt;/li&gt;                       &lt;li&gt;First name&lt;/li&gt;                       &lt;li&gt;Last name&lt;/li&gt;                       &lt;li&gt;Display name&lt;/li&gt;                       &lt;li&gt;Middle name&lt;/li&gt;                       &lt;li&gt;Creation timestamp&lt;/li&gt;                       &lt;li&gt;Avatar URL&lt;/li&gt; &lt;/ul&gt; &lt;br/&gt;&lt;b&gt;Basic Categories:&lt;/b&gt; &lt;ul&gt;                       &lt;li&gt;About&lt;/li&gt;                       &lt;li&gt;Employment&lt;/li&gt;                       &lt;li&gt;Work&lt;/li&gt; &lt;/ul&gt; |  [optional] |
|**filters** | [**List&lt;EmployeeFilter&gt;**](EmployeeFilter.md) | Optional list of filters for filtering employees. We currently support up to one filter. |  [optional] |
|**showInactive** | **Boolean** | &lt;br&gt;Optional field. &lt;br&gt;Default value &#x3D; false. &lt;br&gt;Defines whether response should include inactive employees. |  [optional] |
|**humanReadable** | **String** | Optional field.  &lt;br&gt; &lt;b&gt;If not sent:&lt;/b&gt; supply machine-readable values only. &lt;br&gt; &lt;br&gt; Possible values: &lt;br&gt;  &lt;br&gt; &lt;b&gt;APPEND&lt;/b&gt; - include the additional \&quot;humanReadable\&quot; JSON node in the response. &lt;br&gt;  &lt;br&gt; &lt;b&gt;REPLACE&lt;/b&gt; - supply humanReadable values in JSON instead of machine-readable format. &lt;br&gt; |  [optional] |



