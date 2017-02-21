package com.custom.mytags.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mytags.xml.A;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fanlinlong on 2017/2/14.
 */
@RunWith(SpringRunner.class) // 使用junit4进行测试
@ContextConfiguration("classpath:test.xml")
public class MyTagsTest {

	@Autowired
	private A a;

	@Test
	public void tagsTest() {
		System.out.println(a);
	}
}