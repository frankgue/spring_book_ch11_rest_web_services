package com.wiley.beginningspring.ch11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ListUsersTest.class,
        AddUserTest.class,
        UpdateUserTest.class,
        DeleteUserTest.class,
})
public class UserRestControllerTestSuite {
}
