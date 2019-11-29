package pub.codex.core;

import com.sun.jersey.spi.container.WebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import pub.codex.index.EnableCodexLeague;

@EnableEurekaServer
@SpringBootApplication
@EnableCodexLeague // 添加codex启用信息
public class CoreApplication {
        public static void main(String[] args) {
            SpringApplication.run(CoreApplication.class, args);
        }
}
