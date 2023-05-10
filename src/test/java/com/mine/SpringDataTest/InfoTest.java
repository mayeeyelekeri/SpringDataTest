package com.mine.SpringDataTest;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mine.SpringDataTest.Model.Info;
import com.mine.SpringDataTest.Model.Technology;

class InfoTest {

	static Info info; 
	static Technology tech; 
	
	// test data 
	static String techType = "Java"; 
	static String techCategory = "Spring";
	static int techId = 90; 
	
	static int infoId = 45; 
	static String subject = "My machine is not working"; 
	static String description = "Just reboot"; 
	
	@BeforeAll 
	public static void before() {
		
		tech = new Technology(); 
		tech.setTechnologyType(techType);
		tech.setCategory(techCategory);
		tech.setTechnologyId(techId);
		
		info = new Info(); 
		info.setId(infoId);
		info.setSubject(subject);
		info.setDescription(description);
		info.setTechnology(tech);
	}
	
	@Test
	void infoIdTest() {
		assertEquals(info.getId(), infoId); 
	}

	@Test
	void infoSubjectTest() {
		assertEquals(info.getSubject(), subject); 
	}
	
	@Test
	void infoDescriptionTest() {
		assertEquals(info.getDescription(), description); 
	}
	
	@Test
	void InfoTechIdTest() {
		assertEquals(info.getTechnology().getTechnologyId(), techId); 
	}
	
	@Test
	void InfoTechCategoryTest() {
		assertEquals(info.getTechnology().getCategory(), techCategory); 
	}
	
	@Test
	void InfoTechTypeTest() {
		assertEquals(info.getTechnology().getTechnologyType(), techType); 
	}
}
