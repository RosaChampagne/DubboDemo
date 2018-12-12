package cn.com.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class DubboConsumerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboConsumerApp.class).web(WebApplicationType.NONE).run(args);
    }
}
