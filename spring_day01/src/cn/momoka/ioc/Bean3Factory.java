package cn.momoka.ioc;

import cn.momoka.bean.Bean2;

public class Bean3Factory {
	//静态的方法，返回Bean2对象
	public static Bean2 getBean2(){
		return new Bean2();
	}
}
