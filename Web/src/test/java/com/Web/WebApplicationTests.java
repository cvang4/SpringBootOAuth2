package com.Web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@SpringBootTest
public class WebApplicationTests {

	@MockBean
	ClientRegistrationRepository clientRegistrationRepository;

	@Test
	public void contextLoads() {
	}

}
