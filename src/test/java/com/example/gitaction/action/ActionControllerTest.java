package com.example.gitaction.action;

import com.example.gitaction.GitactionApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest(classes = GitactionApplication.class)

@WebMvcTest(ActionController.class)
@DisplayName("ActionControllerTest")
class ActionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("plus")
    void hello() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/action/plus"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("3"));
    }

    @Test
    @DisplayName("minus")
    void minus() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/action/minus"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("8"));
    }
}