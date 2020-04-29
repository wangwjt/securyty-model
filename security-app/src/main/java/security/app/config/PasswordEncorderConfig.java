package security.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Spring boot 2.0.X引用的security 依赖是 spring security 5.X版本，
 * 此版本需要提供一个PasswordEncorder的实例，否则后台报错误
 * @author wangjiantao
 * @date 2020/4/29 16:15
 */
@Configuration
public class PasswordEncorderConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
