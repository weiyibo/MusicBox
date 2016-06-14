package com.musicbox.test;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicBoxTest {
	
	private ApplicationContext ctx = null;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testDataSource() {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource);
	}

}
