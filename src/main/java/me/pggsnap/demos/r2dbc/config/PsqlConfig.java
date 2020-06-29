package me.pggsnap.demos.r2dbc.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pggsnap
 * @date 2020/6/27
 */
//@Configuration
//public class PsqlConfig {
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get(
//                ConnectionFactoryOptions
//                        .builder()
//                        .option(ConnectionFactoryOptions.DRIVER, "org.postgresql.Driver")
//                        .option(ConnectionFactoryOptions.HOST, "127.0.0.1")
//                        .option(ConnectionFactoryOptions.PORT, 5432)
//                        .option(ConnectionFactoryOptions.DATABASE, "userdb")
//                        .option(ConnectionFactoryOptions.USER, "admin")
//                        .option(ConnectionFactoryOptions.PASSWORD, "admin@123")
//                        .build());
//    }
//}
