package com.wiley.beginningspring.ch11;

import com.wiley.beginningspring.ch11.Model.User;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotNull;

public class AddUserTest {
    @Test
    public void addUserWorksOK(){
        RestTemplate template = new RestTemplate();
        User user = new User(3, "Ludovic JONGO", "123 Main Street");
        ResponseEntity<Void> resultSave = template.postForEntity("http://localhost:8080/basic_rest_service_war/rest/users", user, Void.class);
        assertNotNull(resultSave);
    }
}
