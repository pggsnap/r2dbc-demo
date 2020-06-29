package me.pggsnap.demos.r2dbc.config;

import io.r2dbc.pool.PoolingConnectionFactoryProvider;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
/**
 * @author pggsnap
 * @date 2020/6/27
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource.userdb")
public class PostgresqlConnectionConfig {
    private String driver;
    private String database;
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String protocol;

//    @Bean
//    public ConnectionFactory connectionFactory() {
//        PostgresqlConnectionConfiguration configuration = PostgresqlConnectionConfiguration
//                .builder()
//                .host(this.host)
//                .port(this.port)
//                .database(this.database)
//                .username(this.username)
//                .password(this.password)
//                .build();
//        return new PostgresqlConnectionFactory(configuration);
//    }

    @Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactoryOptions connectionFactoryOptions = ConnectionFactoryOptions
                .builder()
                .option(ConnectionFactoryOptions.HOST, this.host)
                .option(ConnectionFactoryOptions.PORT, this.port)
                .option(ConnectionFactoryOptions.DATABASE, this.database)
                .option(ConnectionFactoryOptions.DRIVER, this.driver)
                .option(ConnectionFactoryOptions.USER, this.username)
                .option(ConnectionFactoryOptions.PASSWORD, this.password)
                .option(ConnectionFactoryOptions.PROTOCOL, this.protocol)
                .option(PoolingConnectionFactoryProvider.MAX_SIZE, 10)
                .option(PoolingConnectionFactoryProvider.INITIAL_SIZE, 10)
                .option(PoolingConnectionFactoryProvider.MAX_LIFE_TIME, Duration.ofHours(1))
                .option(PoolingConnectionFactoryProvider.MAX_IDLE_TIME, Duration.ofMinutes(1))
                .build();
        PoolingConnectionFactoryProvider provider = new PoolingConnectionFactoryProvider();
        return provider.create(connectionFactoryOptions);
    }

    public String getDriver() {
        return driver;
    }

    public String getDatabase() {
        return database;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}