package controller;


import com.example.friday.FridayApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes= {FridayApplication.class})
public class ControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void Hello() throws Exception{
        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port +"/api/hello").toString(), String.class);
                         System.out.println("Response Body: " + response.getBody());
                        assertEquals("friday for springBoot", response.getBody());

        
    }
}
