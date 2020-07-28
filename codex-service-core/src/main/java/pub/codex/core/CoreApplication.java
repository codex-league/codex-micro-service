package pub.codex.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import pub.codex.index.EnableCodexLeague;

@ComponentScan("pub.codex.**")
@SpringBootApplication
@EnableCodexLeague // 添加codex启用信息
@EnableDiscoveryClient
public class CoreApplication {
        public static void main(String[] args) {
            SpringApplication.run(CoreApplication.class, args);
        }
}
