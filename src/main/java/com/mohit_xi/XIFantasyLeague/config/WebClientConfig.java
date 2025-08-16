package com.mohit_xi.XIFantasyLeague.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@AllArgsConstructor
public class WebClientConfig {

    @Bean
    public WebClient footballApiClient(FootballApiProperties footballApiProperties){
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer ->
                        configurer.defaultCodecs().maxInMemorySize(10 * 1024 * 1024)
                )
                .build();
       
        return WebClient.builder()
                .baseUrl(footballApiProperties.getBaseUrl())
                .exchangeStrategies(strategies)
                .build();
    }
}
