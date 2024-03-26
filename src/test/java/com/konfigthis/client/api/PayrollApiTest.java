/*
 * Bob API
 * Access your employees data with the Bob API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CurrencyValue;
import com.konfigthis.client.model.Employees;
import com.konfigthis.client.model.EquityEntries;
import com.konfigthis.client.model.EquityEntry;
import com.konfigthis.client.model.Error;
import java.time.LocalDate;
import com.konfigthis.client.model.SalaryEntries;
import com.konfigthis.client.model.SalaryEntry;
import com.konfigthis.client.model.TrainingEntries;
import com.konfigthis.client.model.TrainingEntry;
import com.konfigthis.client.model.VariableEntries;
import com.konfigthis.client.model.VariableEntry;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayrollApi
 */
@Disabled
public class PayrollApiTest {

    private static PayrollApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PayrollApi(apiClient);
    }

    /**
     * Creates a new equity grant for a given employee.
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEquityGrantTest() throws ApiException {
        Double quantity = null;
        String equityType = null;
        String id = null;
        Integer id = null;
        String reason = null;
        LocalDate effectiveDate = null;
        LocalDate vestingCommencementDate = null;
        String consentNumber = null;
        LocalDate grantDate = null;
        LocalDate optionExpiration = null;
        CurrencyValue exercisePrice = null;
        String vestingTerm = null;
        String grantType = null;
        Double vestingSchedule = null;
        Double grantNumber = null;
        String grantStatus = null;
        api.createEquityGrant(quantity, equityType, id)
                .id(id)
                .reason(reason)
                .effectiveDate(effectiveDate)
                .vestingCommencementDate(vestingCommencementDate)
                .consentNumber(consentNumber)
                .grantDate(grantDate)
                .optionExpiration(optionExpiration)
                .exercisePrice(exercisePrice)
                .vestingTerm(vestingTerm)
                .grantType(grantType)
                .vestingSchedule(vestingSchedule)
                .grantNumber(grantNumber)
                .grantStatus(grantStatus)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new salary entry for a given employee.
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewSalaryEntryTest() throws ApiException {
        CurrencyValue base = null;
        String payPeriod = null;
        String id = null;
        Integer id = null;
        String reason = null;
        LocalDate effectiveDate = null;
        String payFrequency = null;
        api.createNewSalaryEntry(base, payPeriod, id)
                .id(id)
                .reason(reason)
                .effectiveDate(effectiveDate)
                .payFrequency(payFrequency)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new training records for a given employee
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTrainingRecordTest() throws ApiException {
        String id = null;
        Integer id = null;
        String reason = null;
        LocalDate effectiveDate = null;
        String description = null;
        String name = null;
        CurrencyValue cost = null;
        String status = null;
        String frequency = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Double documentId = null;
        api.createTrainingRecord(id)
                .id(id)
                .reason(reason)
                .effectiveDate(effectiveDate)
                .description(description)
                .name(name)
                .cost(cost)
                .status(status)
                .frequency(frequency)
                .startDate(startDate)
                .endDate(endDate)
                .documentId(documentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a new variable payment for a given employee.
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;:The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVariablePaymentTest() throws ApiException {
        CurrencyValue amount = null;
        String paymentPeriod = null;
        String id = null;
        Integer id = null;
        String reason = null;
        LocalDate effectiveDate = null;
        String variableType = null;
        Double companyPercent = null;
        Double departmentPercent = null;
        Double individualPercent = null;
        api.createVariablePayment(amount, paymentPeriod, id)
                .id(id)
                .reason(reason)
                .effectiveDate(effectiveDate)
                .variableType(variableType)
                .companyPercent(companyPercent)
                .departmentPercent(departmentPercent)
                .individualPercent(individualPercent)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes an equity grant for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEquityGrantTest() throws ApiException {
        String id = null;
        Integer entryId = null;
        api.deleteEquityGrant(id, entryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes a salary entry from the employee&#39;s list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSalaryEntryTest() throws ApiException {
        String id = null;
        Integer entryId = null;
        api.deleteSalaryEntry(id, entryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes a training record for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTrainingRecordTest() throws ApiException {
        String id = null;
        Integer entryId = null;
        api.deleteTrainingRecord(id, entryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes any training records for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTrainingRecord_0Test() throws ApiException {
        String id = null;
        Integer entryId = null;
        api.deleteTrainingRecord_0(id, entryId)
                .execute();
        // TODO: test validations
    }

    /**
     * List employee&#39;s salary history.
     *
     * Returns a list of salary history entries for a given employee.&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSalaryHistoryTest() throws ApiException {
        String id = null;
        SalaryEntries response = api.getSalaryHistory(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List the employee&#39;s equity grants.
     *
     * Returns a list of equity grants for a given employee.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEquityGrantsTest() throws ApiException {
        String id = null;
        EquityEntries response = api.listEquityGrants(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List the employee&#39;s training records.
     *
     * Returns a list of training records for a given employee&lt;br /&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTrainingRecordsTest() throws ApiException {
        String id = null;
        TrainingEntries response = api.listTrainingRecords(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List employee&#39;s variable payments
     *
     * Returns a list of variable payments for a given employee.&lt;br /&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVariablePaymentsTest() throws ApiException {
        String id = null;
        VariableEntries response = api.listVariablePayments(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Read payroll history.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readHistoryTest() throws ApiException {
        String department = null;
        Boolean showInactive = null;
        Employees response = api.readHistory()
                .department(department)
                .showInactive(showInactive)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates an equity grant for an employee
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Note&lt;/b&gt;: The values of the list fields represent the list item ID and not the list item value. To obtain the corresponding list item value, use the HiBob metadata API to determine the field list name. Then, use the list item ID to locate the list item value. For more information, see &lt;a href&#x3D;&#39;https://apidocs.hibob.com/docs/how-to-work-with-lists-public-api&#39;&gt;How to work with lists Public API&lt;/a&gt;. - Basic: [] - Bearer: []
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEquityGrantForEmployeeTest() throws ApiException {
        Double quantity = null;
        String equityType = null;
        String id = null;
        Integer entryId = null;
        Integer id = null;
        String reason = null;
        LocalDate effectiveDate = null;
        LocalDate vestingCommencementDate = null;
        String consentNumber = null;
        LocalDate grantDate = null;
        LocalDate optionExpiration = null;
        CurrencyValue exercisePrice = null;
        String vestingTerm = null;
        String grantType = null;
        Double vestingSchedule = null;
        Double grantNumber = null;
        String grantStatus = null;
        api.updateEquityGrantForEmployee(quantity, equityType, id, entryId)
                .id(id)
                .reason(reason)
                .effectiveDate(effectiveDate)
                .vestingCommencementDate(vestingCommencementDate)
                .consentNumber(consentNumber)
                .grantDate(grantDate)
                .optionExpiration(optionExpiration)
                .exercisePrice(exercisePrice)
                .vestingTerm(vestingTerm)
                .grantType(grantType)
                .vestingSchedule(vestingSchedule)
                .grantNumber(grantNumber)
                .grantStatus(grantStatus)
                .execute();
        // TODO: test validations
    }

}