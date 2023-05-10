package com.mine.SpringDataTest;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mine.SpringDataTest.Model.Problem;
import com.mine.SpringDataTest.Model.Technology;

class ProblemTest {

	static Problem prob; 
	static Technology tech; 
	
	// test data 
	static String techType = "Java"; 
	static String techCategory = "Spring";
	static int techId = 90; 
	
	static int problemId = 45; 
	static String problem = "My machine is not working"; 
	static String solution = "Just reboot"; 
	
	@BeforeAll 
	public static void before() {
		
		tech = new Technology(); 
		tech.setTechnologyType(techType);
		tech.setCategory(techCategory);
		tech.setTechnologyId(techId);
		
		prob = new Problem(); 
		prob.setId(problemId);
		prob.setProblem(problem);
		prob.setSolution(solution);
		prob.setTechnology(tech);
	}
	
	@Test
	void problemIdTest() {
		assertEquals(prob.getId(), problemId); 
	}

	@Test
	void problemTest() {
		assertEquals(prob.getProblem(), problem); 
	}
	
	@Test
	void problemDescTest() {
		assertEquals(prob.getSolution(), solution); 
	}
	
	@Test
	void problemTechIdTest() {
		assertEquals(prob.getTechnology().getTechnologyId(), techId); 
	}
	
	@Test
	void problemTechCategoryTest() {
		assertEquals(prob.getTechnology().getCategory(), techCategory); 
	}
	
	@Test
	void problemTechTypeTest() {
		assertEquals(prob.getTechnology().getTechnologyType(), techType); 
	}
}
