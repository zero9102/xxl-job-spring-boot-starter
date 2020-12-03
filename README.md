# xxl-job-spring-boot-starter
## 简介
一个简单的xxl-job spring-boot-starter, 直接配置即可以使用xxl-job
# 使用方法 (usage):
 ```
    <groupId>com.github.zero9102</groupId>
    <artifactId>xxl-job-spring-boot-starter</artifactId>
    <version>2.2.0</version>
 ```
## 相关版本信息

| 项目 | 版本  | 说明 | GAV |
| -----:| --------- | ----------- | ------- |
| xxl-job-core | 2.2.0 |xxl-job-core模块|xxl-job-core|
|spring-boot |2.2.6.RELEASE|spring-boot 版本信息|spring-boot GAV|
|xxl-job-admin|2.2.0|xxl-job-admin 模块| xxl-job-admin GAV|

> \# 配置例子: application.properties

`# 开启xxl-job 自动注册功能`

xxl.job.enabled=true

> \# xxl-job-admin address url(管理端地址)

xxl.job.admin-addresses=http://127.0.0.1:8080/xxl-job-admin

> \# xxl-job http accessToken, 生产环境一定请添加上你的accessToken 值,安全。

xxl.job.access-token=5@)1#!$QwseF

> \# xxl-job 执行器AppName [选填]：执行器心跳注册分组依据；为空则关闭自动注册

xxl.job.executor-app-name=xxl-job-executor-sample

> \# 执行器注册 [选填]：优先使用该配置作为注册地址，为空时使用内嵌服务 IP:PORT 作为注册地址。从而更灵活的支持容器类型执行器动态IP和动态映射端口问题。

xxl.job.executorAddress=

> \# 执行器IP [选填]：默认为空表示自动获取IP，多网卡时可手动设置指定IP，该IP不会绑定Host仅作为通讯实用；地址信息用于 '执行器注册'和 '调度中心请求并触发任务'；

xxl.job.executor-ip=

> \# 执行器端口号 [选填]：小于等于0则自动获取；默认端口为9999，单机部署多个执行器时，注意要配置不同执行器端口

xxl.job.executor-port=9999

> \# 执行器运行日志文件存储磁盘路径 [选填] ：需要对该路径拥有读写权限；为空则使用默认路径；

xxl.job.executor-log-path=/data/applogs/xxl-job/jobhandler

> \# 执行器日志文件保存天数 [选填]:过期日志自动清理, 限制值大于等于3时生效; 否则, 如-1, 关闭自动清理功能;

xxl.job.executor-log-retention-days=30

> \# 详细请看官方作者使用文档.

[xxl-job官方文档](https://www.xuxueli.com/xxl-job/)

## License
GPL3.0，纯粹开源分享,感谢大家 [Star](https://github.com/zero9102/xxl-job-spring-boot-starter/stargazers) & [Fork](https://github.com/zero9102/xxl-job-spring-boot-starter/network/members) 的支持。

