package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.hibob.com/v1";
        
        // Configure HTTP basic authorization: Basic
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        
        configuration.bearer  = "YOUR API KEY";
        HiBob client = new HiBob(configuration);
        assertNotNull(client);
    }
}
