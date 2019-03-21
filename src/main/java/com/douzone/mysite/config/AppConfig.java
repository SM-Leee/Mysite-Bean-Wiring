package com.douzone.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.app.DBConfig;
import com.douzone.config.app.MyBatisConfig;

@Configuration
@ComponentScan(value={"com.douzone.mysite.service", "com.douzone.mysite.repository"})  // 이러한 설정을 하였으면 Dao를 만들어서 설정을 해줘야지 구동이 된다.
@Import(value= {DBConfig.class, MyBatisConfig.class})
public class AppConfig {
	
}
