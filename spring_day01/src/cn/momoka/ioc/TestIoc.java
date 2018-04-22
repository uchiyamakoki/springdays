package cn.momoka.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.momoka.bean.Bean2;

public class TestIoc {

		@Test
		public void testUser(){
			//1.加载spring配置文件，根据创建对象
			ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
			//2.得到配置创建的对象
			User user=(User) context.getBean("user");
			System.out.println(user);
			user.add();
		}
		
		@Test
		public void test2(){
			//1.加载spring配置文件，根据创建对象
			ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
			
			Bean2 bean2=(Bean2) context.getBean("bean2");
			System.out.println(bean2);
		}
}
