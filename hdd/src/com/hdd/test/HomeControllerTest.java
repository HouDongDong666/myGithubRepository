package com.hdd.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.hdd.controller.HomeController;

public class HomeControllerTest {

	@Test
	public void homeTest(){
		HomeController  homeController = new HomeController();
		MockMvc mock =MockMvcBuilders.standaloneSetup(homeController).build();
		try {
			ResultActions t =  mock.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
			System.out.println(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
