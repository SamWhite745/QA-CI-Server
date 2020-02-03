package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class InteractionTest {
	private Interaction interaction;
	@Before
	public void setUp() {
		interaction = new Interaction();
	}
	
	@Test
	public void greetingTest() {
		assertEquals("Hi friend", interaction.greeting());
	}

	@Test
	public void insultTest() {
		assertEquals("Is trash", interaction.insult());
	}
}
