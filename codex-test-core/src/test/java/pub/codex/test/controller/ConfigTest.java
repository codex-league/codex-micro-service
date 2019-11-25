package pub.codex.test.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

    @Value("${version}")
    String version;

    /**
     * 测试分布式配置版本参数是否为空
     */
    @Test
    public void configTest() {
        Assert.assertNotNull(version);
    }
}