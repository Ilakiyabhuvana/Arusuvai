//package com.example.demo.config;
//
//import com.example.demo.service.Foodservice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final Foodservice foodService;
//
//    @Autowired
//    public SecurityConfig(Foodservice foodService) {
//        this.foodService = foodService;
//    }
//
//    @Bean
//    public SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .authorizeRequests()
//            //.requestMatchers("/login").permitAll() // corrected antMatchers method
//            .anyRequest().authenticated()
//            .and()
//            .formLogin().loginPage("/food/login").permitAll()
//            .and()
//            .logout().permitAll();
//
//        return http.build();
//    }
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(foodService);
//        authProvider.setPasswordEncoder(passwordEncoder()); // using method for password encoder
//        return authProvider;
//    }
//
//    @Autowired
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
