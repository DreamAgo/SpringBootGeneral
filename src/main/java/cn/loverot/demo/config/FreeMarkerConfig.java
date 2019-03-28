package cn.loverot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class FreeMarkerConfig {

    @Autowired
    private freemarker.template.Configuration configuration;

    // Spring 初始化的时候加载配置
    @PostConstruct
    public void setConfigure() throws Exception {

        configuration.setBooleanFormat("yes,no");
        configuration.setDateFormat("yyyy-MM-dd");
        configuration.setDateTimeFormat("HH:mm:ss");

    }
}
