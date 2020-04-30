package security.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import security.app.handler.AuthenticationFailure;
import security.app.handler.AuthenticationSuccess;

/**
 * 资源服务器配置
 * @author wangjiantao
 * @date 2020/4/29 11:20
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private AuthenticationSuccess authenticationSuccess;

    @Autowired
    private AuthenticationFailure authenticationFailure;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()// 表单登陆
                    .loginPage("/authentication/require")// 跳转到处理登录页面的controller Url
                    .loginProcessingUrl("/authentication/form")// 配置登录表单提交的URL
                    .successHandler(authenticationSuccess)// 设置登录成功处理器
                    .failureHandler(authenticationFailure)// 设置登录失败处理器
                .and()
                .authorizeRequests()
                    .antMatchers("/authentication/form","/all")// 配置不需要认证的url
                    .permitAll()
                    .anyRequest()// 任何请求
                    .authenticated()//身份认证
                .and()
                    .csrf().disable();//暂时关掉csrf

    }
}
