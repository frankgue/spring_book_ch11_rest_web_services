package com.wiley.beginningspring.ch11;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ListUsersTest {
    @Test
    public void listUsersWorksOK(){
        RestTemplate template = new RestTemplate();
        ResponseEntity<List> result = template.getForEntity("http://localhost:8080/basic_rest_service_war/rest/users", List.class);
       assertNotNull(result);
       assertNotNull(result.getBody());
       assertThat(result.getBody().size(), is(2));
    }
}
