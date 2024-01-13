package ru.practicum.ewm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.practicum.ewm.client.EndpointHitClient;

@Configuration
@PropertySource("classpath:application.properties")
public class EndpointHitClientConfig {
    private final String serverUrl;

    public EndpointHitClientConfig(@Value("${stats-server.url}") String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Bean
    public EndpointHitClient createEndpointHitClient() {
        return new EndpointHitClient(serverUrl);
    }
}
