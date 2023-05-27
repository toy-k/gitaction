package com.example.gitaction.action;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("ActionControllerTest")
class ActionControllerTest {

    @Autowired private ActionController actionController;

    @Test
    @DisplayName("plus")
    void hello() {

        Long result = actionController.hello();
        assertEquals(3L, result);
    }

    @Test
    @DisplayName("minus")
    void minus() {

            Long result = actionController.minus();
            assertEquals(8L, result);
    }
}