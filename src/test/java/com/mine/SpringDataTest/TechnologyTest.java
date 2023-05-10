package com.mine.SpringDataTest;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.mine.SpringDataTest.Model.*;

public class TechnologyTest {

	static Technology tech; 
	
	// test data 
	static String techType = "Java"; 
	static String techCategory = "Spring";
	static int techId = 90; 
	
	@BeforeAll 
	public static void before() {
		
		tech = new Technology(); 
		tech.setTechnologyType(techType);
		tech.setCategory(techCategory);
		tech.setTechnologyId(techId);
	}
	
	@Test
	void techIdTest() {
		assertEquals(tech.getTechnologyId(), techId); 
	}
	
	@Test
	void techCategoryTest() {
		assertEquals(tech.getCategory(), techCategory); 
	}
	
	@Test
	void techTypeTest() {
		assertEquals(tech.getTechnologyType(), techType); 
	}
	
}
