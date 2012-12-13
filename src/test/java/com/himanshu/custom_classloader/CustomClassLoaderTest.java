package com.himanshu.custom_classloader;

import static org.junit.Assert.*;

import org.junit.Test;


public class CustomClassLoaderTest {

	@Test
	public void test() throws ClassNotFoundException {
		CustomClassLoader test = new CustomClassLoader();
		Class clazz = test.loadClass("com.himanshu.custom_classloader.SampleClass");
		assertTrue(clazz.getCanonicalName().equalsIgnoreCase(SampleClass.class.getCanonicalName()));
	}

	@Test
	public void testSystemResourceClassLoad() throws ClassNotFoundException {
		CustomClassLoader test = new CustomClassLoader();
		Class clazz = test.loadClassFromFileSystem("com.himanshu.rest.cxf.TimeService", "F:\\Dev_RnD\\rest-cxf\\rest-cxf-webapp\\target\\classes\\com\\himanshu\\rest\\cxf\\TimeService.class");
		System.out.println(clazz);
	}
}
