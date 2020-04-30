package security.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 校验用户名密码
 * @author wangjiantao
 * @date 2020/4/29 17:19
 */
@Component
public class UserDetailService implements UserDetailsService {

    // 日志
    Logger logger = LoggerFactory.getLogger(getClass());

    // 密码加密
    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("登录的用户名：" + username);
        // 根据用户名去数据库查找用户信息（过程略）

        // 模拟从数据库中取出被加密的密码
        String password = passwordEncoder.encode("123456");

        // 以下字段根据从数据库中取出的信息设置以下字段值（简写，过程略）

        // 判断账户过期的方法（如果没有过期的业务判断，直接返回true就可以了）
        boolean isAccountNonExpired = true;
        // 判断账户是否冻结了
        boolean isAccountNonLocked = true;
        // 判断密码过期的方法（如果没有过期的业务判断，直接返回true就可以了 比如30天修改密码）
        boolean isCredentialsNonExpired = true;
        // 判断账户是否被删了
        boolean isEnabled = true;

        return new User(username,
                password,
                isAccountNonExpired,
                isAccountNonLocked,
                isCredentialsNonExpired,
                isEnabled,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
