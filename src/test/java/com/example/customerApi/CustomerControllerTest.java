package com.example.customerapi;

import com.example.customerapi.model.Customer;
import com.example.customerapi.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCreateCustomer() throws Exception {
        mockMvc.perform(post("/customers")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"firstName\": \"Emmanuel\", \"lastName\": \"Doe\", \"email\": \"Emmanuel.doe@example.com\" }"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.firstName", is("Emmanuel")));
    }

    // Additional tests for GET, PUT, DELETE...
}
