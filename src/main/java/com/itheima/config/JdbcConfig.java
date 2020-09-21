package com.itheima.config;

//@Configuration
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {


    /*@Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }*/

    /*@Bean
    public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());

        return dataSource;
    }*/

    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DruidDataSource dataSource(){
        return new DruidDataSource();
    }*/

}
