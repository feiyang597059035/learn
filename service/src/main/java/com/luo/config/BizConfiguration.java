package com.luo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.luo"})
/*@ImportResource(locations = "classpath:/biz-service.xml")
// 如果不使用Gconfig，则需要下面的配置
@EnableConfigurationProperties(BizConfiguration.GPayProperty.class)
@Import({RocketMQConfiguration.class, DalConfiguration.class, HessianConfiguration.class,StartQuartzJobListener.class})*/
//@PropertySource(value= {"classpath:application-biz.properties","classpath:redis-inventory.properties"})
public class BizConfiguration {

}
