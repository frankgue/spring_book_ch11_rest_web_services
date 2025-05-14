package com.wiley.beginningspring.ch11;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class DeleteUserTest {
    @Test
    public void deleteUserWorksOK(){
        RestTemplate template = new RestTemplate();
        template.delete("http://localhost:8080/basic_rest_service_war/rest/users/3");

        ResponseEntity<List> resultList = template.getForEntity("http://localhost:8080/basic_rest_service_war/rest/users", List.class);
        assertNotNull(resultList);
        assertNotNull(resultList.getBody());
        assertThat(resultList.getBody().size(), is(2));
    }
}
