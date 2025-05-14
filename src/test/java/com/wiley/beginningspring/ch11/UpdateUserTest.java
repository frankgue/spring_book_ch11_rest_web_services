package com.wiley.beginningspring.ch11;

import com.wiley.beginningspring.ch11.Model.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class UpdateUserTest {
    @Test
    public void updateUserWorksOK(){
        RestTemplate template = new RestTemplate();
        User user = new User(3, "Jean GUEKENG");
        template.put("http://localhost:8080/basic_rest_service_war/rest/users/3", user);
    }
}
