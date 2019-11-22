package pub.codex.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * codex demo 入口类
 */
@SpringBootApplication
public class CodexDemoApplication {

    public static void main(String[] args) {


//        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext();
//        a.setId("aaaa");
//        a.refresh();
//
//        AnnotationConfigApplicationContext b = new AnnotationConfigApplicationContext();
//        b.setId("bbb");
//        b.refresh();
//

        SpringApplication.run(CodexDemoApplication.class, args);


//        SpringApplication springApplication = new SpringApplication(CodexDemoApplication.class);
//
//        ConfigurableEnvironment configurableEnvironment = new SpringApplicationBuilder(CodexDemoApplication.class).parent(a).
//                run(args).getEnvironment();
//
//        System.out.println(configurableEnvironment);

    }


}
