package com.codex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentProperties;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }


    /**
     * 不依靠 @Profile("jdbc") 來实例化bean
     * 参考：org.springframework.cloud.config.server.config.JdbcRepositoryConfiguration
     * 上述参考可以看到 {JdbcEnvironmentRepository} 的实例化条件
     */
    @Configuration
    @ConditionalOnClass(JdbcTemplate.class)
    class JdbcRepositoryConfiguration {

        @Bean
        public JdbcEnvironmentRepository jdbcEnvironmentRepository(JdbcEnvironmentRepositoryFactory factory,
                                                                   JdbcEnvironmentProperties environmentProperties) {
            return factory.build(environmentProperties);
        }
    }

}
