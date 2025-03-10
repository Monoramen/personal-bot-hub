package com.monora.personalbothub.bot_impl.configuration;


import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@PropertySource("classpath:application.yml")
@ComponentScan(basePackages = "com.monora.personalbothub")
@EnableScheduling
public class TelegramBotConfig {

    @Value("${telegram.bot.token}")
    private String token;

    @Value("${telegram.bot.name}")
    private String tgBotName;

    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(token);
    }


    public String getToken() {
        return token;
    }

}
