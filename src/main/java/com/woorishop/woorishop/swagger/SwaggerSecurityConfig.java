package com.woorishop.woorishop.swagger;

// @Configuration
// @EnableWebSecurity
public class SwaggerSecurityConfig {

    // @Bean
    // public UserDetailsService userDetailsService() {
    //     UserDetails user = User.builder()
    //             .username("admin")
    //             .password(passwordEncoder().encode("1234")) // 비밀번호를 인코딩하여 저장
    //             .roles("ADMIN")
    //             .build();

    //     return new InMemoryUserDetailsManager(user);
    // }

    // @Bean
    // public AuthenticationEntryPoint authenticationEntryPoint() {
    //     BasicAuthenticationEntryPoint entryPoint = new BasicAuthenticationEntryPoint();
    //     entryPoint.setRealmName("My Realm");
    //     return entryPoint;
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }

}
// deprecatedJava