

# GetPositionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fields** | **List&lt;String&gt;** | Array of field ids (paths) to fetch for the positions.&lt;br /&gt; Minimum 1 up to 50 fields. Any invalid number of fields will get a response of 400 HTTP error.&lt;br /&gt; You can include only the field ids listed in the [Positions Fields Metadata API](https://apidocs.hibob.com/reference/get_metadata-objects-position). |  |
|**filters** | **List&lt;FilterInstruction&gt;** |  |  |
|**includeHumanReadable** | **Boolean** | Whether to include the additional \&quot;humanReadable\&quot; entry in the response. |  [optional] |



