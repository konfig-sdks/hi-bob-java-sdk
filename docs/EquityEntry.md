

# EquityEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | ID. |  [optional] |
|**reason** | **String** | The reason for this change. |  [optional] |
|**effectiveDate** | **LocalDate** | The date this entry becomes effective. |  |
|**quantity** | **Double** | The number of equities granted. |  |
|**equityType** | **String** | The type of the grant. |  |
|**vestingCommencementDate** | **LocalDate** | Vesting commencement date. |  [optional] |
|**consentNumber** | **String** | Consent number. |  [optional] |
|**grantDate** | **LocalDate** | Date the equity was granted. |  [optional] |
|**optionExpiration** | **LocalDate** | Date the options expire. |  [optional] |
|**exercisePrice** | [**CurrencyValue**](CurrencyValue.md) |  |  [optional] |
|**vestingTerm** | **String** | Terms for exercising this grant. |  [optional] |
|**grantType** | **String** | Grant type. One of: Initial Grant, Merit Grant |  [optional] |
|**vestingSchedule** | **Double** | The vesting schedule ID assigned to this grant. |  [optional] |
|**grantNumber** | **Double** | The Grant number for employee. |  [optional] |
|**grantStatus** | **String** | Grant status. one of: Granted, Pending Approval |  [optional] |



