package com.tylersadler.domain;

import org.springframework.test.util.ReflectionTestUtils;
import static org.junit.Assert.assertEquals;

public abstract class AbstractDomainTest <T>{
    protected void baseTestSetGetVariables(T testObject, Class<?> type, Object testValue, String... fields){
        for (String field: fields) {
            ReflectionTestUtils.invokeSetterMethod(testObject, field, testValue, type);
            assertEquals(testValue, ReflectionTestUtils.invokeGetterMethod(testObject, field));
        }
    }

    public abstract void testSetGetVariables();
}