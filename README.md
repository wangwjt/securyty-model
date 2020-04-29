### security 鉴权、认证模块 + 案例

### 踩坑如下
１．Security-Oauth2配置在security-app里，security-demo依赖security-app,需要在security-demo的启动类上加上包扫描注解，否则OAuth2配置不生效