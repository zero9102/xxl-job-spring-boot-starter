package com.zero9102.xxljob.config;

import java.io.Serializable;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zero9102  2020-12-02
 */
@ConfigurationProperties(prefix = XxlJobProperties.PREFIX)
public class XxlJobProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String PREFIX = "xxl.job";
    /**
     *  开启自动装配
     */
    private boolean enabled;
    /**
     *  xxl-job-admin serverAdd.
     *  http://127.0.0.1:8080/xxl-job-admin
     */
    private String adminAddresses;

    /**
     *  xxl-job accessToken
     */
    private String accessToken;

    /**
     *  执行器AppName[选填]:执行器心跳注册分组依据,为空则关闭自动注册(xxl-job executor app name)
     */
    private String executorAppName;

    /**
     *  执行器注册[选填]:优先使用该配置作为注册地址,为空时使用内嵌服务 IP:PORT 作为注册地址
     *  从而更灵活的支持容器类型执行器动态IP和动态映射端口问题
     */
    private String executorAddress;

    /**
     *  执行器IP[选填]:默认为空表示自动获取IP,多网卡时可手动设置指定IP,该IP不会绑定Host仅作为通讯实用.
     *  地址信息用于'执行器注册'和'调度中心请求并触发任务'.
     */
    private String executorIp;

    /**
     *  执行器端口号[选填]:小于等于0则自动获取,默认端口为9999,单机部署多个执行器时,注意要配置不同执行器端口.
     */
    private int executorPort;

    /**
     *  执行器运行日志文件存储磁盘路径[选填]:需要对该路径拥有读写权限,为空则使用默认路径.
     */
    private String executorLogPath;

    /**
     *  执行器日志文件保存天数[选填],过期日志自动清理,限制值大于等于3时生效;否则,如-1,关闭自动清理功能.
     */
    private int executorLogRetentionDays=30;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAdminAddresses() {
        return adminAddresses;
    }

    public void setAdminAddresses(String adminAddresses) {
        this.adminAddresses = adminAddresses;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExecutorAppName() {
        return executorAppName;
    }

    public void setExecutorAppName(String executorAppName) {
        this.executorAppName = executorAppName;
    }

    public String getExecutorAddress() {
        return executorAddress;
    }

    public void setExecutorAddress(String executorAddress) {
        this.executorAddress = executorAddress;
    }

    public String getExecutorIp() {
        return executorIp;
    }

    public void setExecutorIp(String executorIp) {
        this.executorIp = executorIp;
    }

    public int getExecutorPort() {
        return executorPort;
    }

    public void setExecutorPort(int executorPort) {
        this.executorPort = executorPort;
    }

    public String getExecutorLogPath() {
        return executorLogPath;
    }

    public void setExecutorLogPath(String executorLogPath) {
        this.executorLogPath = executorLogPath;
    }

    public int getExecutorLogRetentionDays() {
        return executorLogRetentionDays;
    }

    public void setExecutorLogRetentionDays(int executorLogRetentionDays) {
        this.executorLogRetentionDays = executorLogRetentionDays;
    }

    @Override
    public String toString() {
        return "XxlJobProperties{" +
                "enabled=" + enabled +
                ", adminAddresses='" + adminAddresses + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", executorAppName='" + executorAppName + '\'' +
                ", executorAddress='" + executorAddress + '\'' +
                ", executorIp='" + executorIp + '\'' +
                ", executorPort=" + executorPort +
                ", executorLogPath='" + executorLogPath + '\'' +
                ", executorLogRetentionDays=" + executorLogRetentionDays +
                '}';
    }
}
