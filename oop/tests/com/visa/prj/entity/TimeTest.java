package com.visa.prj.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTimeTimeTime() {
		assertEquals(new Time(8,15), Time.addTime(new Time(4,30), new Time(3,45)));
	}

	@Test
	public void testAddTimeTime() {
		assertEquals(new Time(8,15),new Time(4,30).addTime(new Time(3,45)));
	}

}
