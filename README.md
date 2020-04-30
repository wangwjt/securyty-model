### security 鉴权、认证模块 + 案例

### 踩坑如下
1. Security-Oauth2配置在security-app里，security-demo依赖security-app,需要在security-demo的启动类上加上包扫描注解，否则OAuth2配置不生效
2. 使用spring platform自动管理版本依赖要注意：platform-bom管理springboot版本，而springboot版本还需要与springCloud版本兼容。
   可以参考：https://blog.csdn.net/nnsword/article/details/86979647 或 https://spring.io/projects/platform#learn
3. 如果启动类上加了@ComponentScan(basePackages = {})注解，springboot就不会扫描Application所在的包及子包的文件,需要将controller所在的包加入到注解@ComponentScan的大括号中
4. 使用spring platform管理依赖，如果想要指定某个依赖（或依赖里的依赖）的版本号，需要在dependencyManagement的dependencies节点中，引入spring platform前的位置，将要修改的依赖的坐标及版本写上。比如下面例子，要使用spring-security-oauth2的2.3.3.RELEASE版，就把他写在platform前
```xml
   <!-- 依赖管理 -->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.security.oauth</groupId>
                <artifactId>spring-security-oauth2</artifactId>
                <version>2.3.3.RELEASE</version>
            </dependency>
            <dependency>
                <!-- 自动管理各个依赖版本 -->
                <groupId>io.spring.platform</groupId>
                <artifactId>platform-bom</artifactId>
                <version>Cairo-SR7</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

