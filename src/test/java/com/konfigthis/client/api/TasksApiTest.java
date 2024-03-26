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
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Tasks;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Disabled
public class TasksApiTest {

    private static TasksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TasksApi(apiClient);
    }

    /**
     * Mark a task as complete
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeTaskTest() throws ApiException {
        String taskId = null;
        Tasks response = api.completeTask(taskId)
                .execute();
        // TODO: test validations
    }

    /**
     * Read my tasks
     *
     * &lt;b&gt;Supported user types:&lt;/b&gt; Employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeTasksTest() throws ApiException {
        Tasks response = api.getEmployeeTasks()
                .execute();
        // TODO: test validations
    }

    /**
     * Read all open tasks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOpenTasksTest() throws ApiException {
        Tasks response = api.getOpenTasks()
                .execute();
        // TODO: test validations
    }

    /**
     * Read tasks of a specific employee 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readEmployeeTasksTest() throws ApiException {
        String id = null;
        String taskStatus = null;
        Tasks response = api.readEmployeeTasks(id)
                .taskStatus(taskStatus)
                .execute();
        // TODO: test validations
    }

}
