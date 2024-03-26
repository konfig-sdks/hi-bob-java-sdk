

# Field


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the field. |  [optional] |
|**id** | **String** | ID of the field. |  [optional] |
|**category** | **String** | Category of the field. |  [optional] |
|**name** | **String** | Name of the field. |  [optional] |
|**jsonPath** | **String** | A dot-separated path of this field value in the employee JSON returned by the /v1/profiles endpoint. |  [optional] |
|**type** | **String** | The type of the field. Supported field types: text, text-area, number, date, list, multi-list, hierarchy-list, currency, employee-reference, document. |  [optional] |
|**typeData** | [**FieldTypeData**](FieldTypeData.md) |  |  [optional] |
|**historical** | **Boolean** | When true, this field keeps the history of its values, each being active starting from a certain date. The default value is false. |  [optional] |



