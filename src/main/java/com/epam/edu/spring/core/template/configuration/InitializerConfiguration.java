package com.epam.edu.spring.core.template.configuration;

import com.epam.edu.spring.core.template.entity.Color;
import com.epam.edu.spring.core.template.service.ItemService;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import com.epam.edu.spring.core.template.validator.ItemValidator;
import com.epam.edu.spring.core.template.validator.SimpleItemValidator;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
public class InitializerConfiguration {

    @Lazy
    @Component
    @Scope("prototype")
    public class ColorFactory {

        public Color getColor() {
            Color[] colors = Color.values();
            return colors[new Random().nextInt(colors.length)];
        }
    }

    @Bean
    public ItemValidator itemValidator(){
        return new SimpleItemValidator();
    }
    @Bean
    public ItemService itemService(){
        return new SimpleItemService();
    }

    @Bean
    public SimpleItemService simpleItemServiceConstructor(){
        return new SimpleItemService(itemService(),itemValidator());
    }

    @Bean
    public SimpleItemService simpleItemServiceSetters(){
        SimpleItemService simpleItemService = new SimpleItemService();
        simpleItemService.setItemService(itemService());
        simpleItemService.setItemValidator(itemValidator());
        return simpleItemService;
    }

}

