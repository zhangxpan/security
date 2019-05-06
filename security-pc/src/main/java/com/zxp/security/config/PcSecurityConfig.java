package com.zxp.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class PcSecurityConfig extends WebSecurityConfigurerAdapter {
    //表单登陆
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        Logger logger = LoggerFactory.getLogger(PcSecurityConfig.class);
        logger.info("----http----"+http);
        http.formLogin()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
