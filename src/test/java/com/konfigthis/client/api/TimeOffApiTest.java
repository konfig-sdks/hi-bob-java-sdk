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
import com.konfigthis.client.model.AdjustmentRequest;
import com.konfigthis.client.model.BalanceResult;
import com.konfigthis.client.model.Error;
import java.time.LocalDate;
import com.konfigthis.client.model.OutTodays;
import com.konfigthis.client.model.Policy;
import com.konfigthis.client.model.PolicyNames;
import com.konfigthis.client.model.PolicyType;
import com.konfigthis.client.model.PolicyTypes;
import com.konfigthis.client.model.ReasonCodes;
import com.konfigthis.client.model.ReasonCodesNames;
import com.konfigthis.client.model.Requests;
import com.konfigthis.client.model.SubmitTimeoffRequest;
import com.konfigthis.client.model.SubmitTimeoffRequestDiffHours;
import com.konfigthis.client.model.SubmitTimeoffRequestDiffHoursDurationsInner;
import com.konfigthis.client.model.TimeoffChanges;
import com.konfigthis.client.model.TimeoffRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeOffApi
 */
@Disabled
public class TimeOffApiTest {

    private static TimeOffApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeOffApi(apiClient);
    }

    /**
     * Add a list of reason codes for a given policy type.
     *
     * Add a list of reason codes for a given policy type.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addReasonCodesTest() throws ApiException {
        String policyType = null;
        List<String> reasonCodes = null;
        api.addReasonCodes(policyType)
                .reasonCodes(reasonCodes)
                .execute();
        // TODO: test validations
    }

    /**
     * Cancel an existing timeoff request
     *
     * Cancels an existing time off request.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelRequestTest() throws ApiException {
        String id = null;
        Integer requestId = null;
        api.cancelRequest(id, requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a balance adjustment.
     *
     * Create a balance adjustment for a given employee for a given effective date.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBalanceAdjustmentTest() throws ApiException {
        String id = null;
        String adjustmentType = null;
        String policyType = null;
        LocalDate effectiveDate = null;
        Double amount = null;
        String reason = null;
        api.createBalanceAdjustment(id)
                .adjustmentType(adjustmentType)
                .policyType(policyType)
                .effectiveDate(effectiveDate)
                .amount(amount)
                .reason(reason)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the details of an existing timeoff request.
     *
     * Supplies detailed info about an existing time off request.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsOfRequestTest() throws ApiException {
        String id = null;
        Integer requestId = null;
        TimeoffRequest response = api.getDetailsOfRequest(id, requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the balance for a given employee
     *
     * Retrieve the balance for a given employee, for a given policy type, as of a given date.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeBalanceTest() throws ApiException {
        String id = null;
        String policyType = null;
        LocalDate date = null;
        BalanceResult response = api.getEmployeeBalance(id, policyType, date)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all new/deleted time off requests since the specified date.
     *
     * Returns the list of time off requests that are pending, approved or canceled since the specified date.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNewDeletedRequestsSinceDateTest() throws ApiException {
        LocalDate since = null;
        Boolean includePending = null;
        TimeoffChanges response = api.getNewDeletedRequestsSinceDate(since)
                .includePending(includePending)
                .execute();
        // TODO: test validations
    }

    /**
     * Read a list of who&#39;s out of the office today or on the specified date.
     *
     * Returns the list of people that have a time off request today or on the specified date.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOutOfOfficeTest() throws ApiException {
        LocalDate today = null;
        Boolean includeHourly = null;
        Boolean includePrivate = null;
        Integer siteId = null;
        OutTodays response = api.getOutOfOffice()
                .today(today)
                .includeHourly(includeHourly)
                .includePrivate(includePrivate)
                .siteId(siteId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Policy type details
     *
     * Get details about a given policy type.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPolicyDetailsTest() throws ApiException {
        String policyType = null;
        PolicyType response = api.getPolicyDetails(policyType)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Policy details.
     *
     * Get details about a given policy.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPolicyDetails_0Test() throws ApiException {
        String policyName = null;
        Policy response = api.getPolicyDetails_0(policyName)
                .execute();
        // TODO: test validations
    }

    /**
     * Read a list of who&#39;s out of the office.
     *
     * Returns time off information for a given date range.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWhosOutTest() throws ApiException {
        LocalDate from = null;
        LocalDate to = null;
        Boolean includeHourly = null;
        Boolean includePrivate = null;
        Boolean includePending = null;
        Requests response = api.getWhosOut(from, to)
                .includeHourly(includeHourly)
                .includePrivate(includePrivate)
                .includePending(includePending)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of policy names for a given policy type.
     *
     * Get a list of policy names for the user&#39;s defined policy type.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPolicyTypeNamesTest() throws ApiException {
        String policyTypeName = null;
        PolicyNames response = api.listPolicyTypeNames(policyTypeName)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all policy types names.
     *
     * Get a list of all policy type names.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPolicyTypesNamesTest() throws ApiException {
        PolicyTypes response = api.listPolicyTypesNames()
                .execute();
        // TODO: test validations
    }

    /**
     * Get Policy type reason codes
     *
     * Get list of reason codes for a given policy type.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listReasonCodesTest() throws ApiException {
        String policyType = null;
        ReasonCodes response = api.listReasonCodes(policyType)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit a new time off request.
     *
     * Submits a new timeoff request.&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitNewRequestTest() throws ApiException {
        String policyType = null;
        LocalDate startDate = null;
        String id = null;
        String description = null;
        String requestRangeType = null;
        String startDatePortion = null;
        LocalDate endDate = null;
        Integer hours = null;
        Integer minutes = null;
        String endDatePortion = null;
        String dayPortion = null;
        Integer dailyHours = null;
        Integer dailyMinutes = null;
        Boolean skipManagerApproval = null;
        String approver = null;
        Integer reasonCode = null;
        api.submitNewRequest(policyType, startDate, id)
                .description(description)
                .requestRangeType(requestRangeType)
                .startDatePortion(startDatePortion)
                .endDate(endDate)
                .hours(hours)
                .minutes(minutes)
                .endDatePortion(endDatePortion)
                .dayPortion(dayPortion)
                .dailyHours(dailyHours)
                .dailyMinutes(dailyMinutes)
                .skipManagerApproval(skipManagerApproval)
                .approver(approver)
                .reasonCode(reasonCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit a new time off request of different hours per day.
     *
     * Submits a new timeoff request of different hours per day.&lt;br /&gt;&lt;b&gt;Supported user types:&lt;/b&gt; Employee, Service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitNewRequestDiffHoursTest() throws ApiException {
        String policyType = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<SubmitTimeoffRequestDiffHoursDurationsInner> durations = null;
        String id = null;
        String description = null;
        Boolean skipManagerApproval = null;
        String approver = null;
        Integer reasonCode = null;
        api.submitNewRequestDiffHours(policyType, startDate, endDate, durations, id)
                .description(description)
                .skipManagerApproval(skipManagerApproval)
                .approver(approver)
                .reasonCode(reasonCode)
                .execute();
        // TODO: test validations
    }

}
