package com.konfigthis.client;

import com.konfigthis.client.api.AttendanceApi;
import com.konfigthis.client.api.CustomTablesApi;
import com.konfigthis.client.api.DocumentsApi;
import com.konfigthis.client.api.MetadataApi;
import com.konfigthis.client.api.ObjectsApi;
import com.konfigthis.client.api.OnboardingApi;
import com.konfigthis.client.api.PayrollApi;
import com.konfigthis.client.api.PeopleApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.TablesApi;
import com.konfigthis.client.api.TasksApi;
import com.konfigthis.client.api.TimeOffApi;

public class HiBob {
    private ApiClient apiClient;
    public final AttendanceApi attendance;
    public final CustomTablesApi customTables;
    public final DocumentsApi documents;
    public final MetadataApi metadata;
    public final ObjectsApi objects;
    public final OnboardingApi onboarding;
    public final PayrollApi payroll;
    public final PeopleApi people;
    public final ReportsApi reports;
    public final TablesApi tables;
    public final TasksApi tasks;
    public final TimeOffApi timeOff;

    public HiBob() {
        this(null);
    }

    public HiBob(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.attendance = new AttendanceApi(this.apiClient);
        this.customTables = new CustomTablesApi(this.apiClient);
        this.documents = new DocumentsApi(this.apiClient);
        this.metadata = new MetadataApi(this.apiClient);
        this.objects = new ObjectsApi(this.apiClient);
        this.onboarding = new OnboardingApi(this.apiClient);
        this.payroll = new PayrollApi(this.apiClient);
        this.people = new PeopleApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.tables = new TablesApi(this.apiClient);
        this.tasks = new TasksApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
    }

}
