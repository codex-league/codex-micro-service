package pub.codex.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import pub.codex.index.EnableCodexLeague;

@ComponentScan("pub.codex.**")
@EnableEurekaServer
@SpringBootApplication
@EnableCodexLeague // 添加codex启用信息
public class CoreApplication {
        public static void main(String[] args) {
            SpringApplication.run(CoreApplication.class, args);
        }
}
