# codex 微服务(Microservices) 脚手架

## 概述

> 你可以使用本脚手架快速搭建你所需要的微服务框架；  
  脚手架使用了模拟业务，便于理解各模块工程的类别及功能；
  
  
  
## 模块工程结构图

```text

  【codex-micro-service】            //主工程
            |
            |【codex-server-config】    // 外部配置 【8100】
            |【codex-server-eureka】    // 注册中心 【8200】
            |
            |【codex-service-demo】     // 演示模块  【6000】
            |
            

```



##### 端口信息

模块|开发端口|集群端口|说明
--|--|--|--
codex-server-eureka|8100|          |
codex-server-eureka|8200|8200、8201|eureka监控地址






  