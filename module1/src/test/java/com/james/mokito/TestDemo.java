package com.james.mokito;

import com.james.function.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestDemo {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this); // let annotation can be used directly
    }

    @Test
    public void testOfDemo(){
        Student student = mock(Student.class,RETURNS_SMART_NULLS);
        when(student.study()).thenReturn("tom");
        assertThat(student.study(),equalTo("tom"));
    }
}
