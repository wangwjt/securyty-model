### security 鉴权、认证模块 + 案例

### 踩坑如下
1. Security-Oauth2配置在security-app里，security-demo依赖security-app,需要在security-demo的启动类上加上包扫描注解，否则OAuth2配置不生效
2. 使用platform-bom自动管理版本依赖要注意：platform-bom管理springboot版本，而springboot版本还需要与springCloud版本兼容。
   可以参考：https://blog.csdn.net/nnsword/article/details/86979647 或 https://spring.io/projects/platform#learn
3. 如果启动类上加了@ComponentScan(basePackages = {})注解，springboot就不会扫描Application所在的包及子包的文件,需要将controller所在的包加入到注解@ComponentScan的大括号中