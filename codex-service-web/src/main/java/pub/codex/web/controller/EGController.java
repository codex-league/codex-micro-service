package pub.codex.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class EGController {

    @Value("${useLocalCache}")
    private boolean useLocalCache;

    @Autowired
    private RestTemplate restTemplate;


    /**
     * 示例 读取分布式配置值
     */
    @RequestMapping("/eg-config")
    public boolean get() {
        return useLocalCache;
    }


    /**
     * 示例 服务发现"依赖调用"
     *
     * @param str
     * @return
     */
    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://codex-service-core/echo/" + str, String.class);
    }

}
