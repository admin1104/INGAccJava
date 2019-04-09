package com.ing.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ing.AbstractTest;
import com.ing.dto.LoginDto;
import com.ing.dto.LoginResponseDto;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BankControllerTest extends AbstractTest {

	@Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	
	@Test
	public void saveStockDetailsTest() throws Exception {
	   String uri = "/api/v1/login";
	   LoginDto login = new LoginDto();
	   login.setUserName(123);
	   login.setPassword("AdminPwd");
	   
	   
	   String inputJson = super.mapToJson(login);
	   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	      .contentType(MediaType.APPLICATION_JSON_VALUE)
	      .content(inputJson)).andReturn();
	   
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(200, status);
	   String content = mvcResult.getResponse().getContentAsString();
	   LoginResponseDto lr = super.mapFromJson(content, LoginResponseDto.class);
	   assertNotNull(lr);
	   assertEquals("Admin", lr.getRole());
	   assertEquals(9876543, lr.getAccountNumber());
	   assertEquals("Advitha", lr.getAccountHolderName());
	}

}