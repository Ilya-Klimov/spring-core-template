package com.epam.edu.spring.core.template.configuration;

import com.epam.edu.spring.core.template.repository.ArrayListItemRepository;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import com.epam.edu.spring.core.template.repository.LinkedListItemRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Value("${item.repository.implementation}")
    private String  itemRepositoryImplementation;

    @Bean
    public ArrayListItemRepository arrayListItemRepository(){
        return new ArrayListItemRepository();
    }

    @Bean
    public LinkedListItemRepository linkedListItemRepository(){
        return new LinkedListItemRepository();
    }

    @Bean
    public ItemRepository itemRepository(){
        if (itemRepositoryImplementation.equals("") || itemRepositoryImplementation.equals("array")){
            return arrayListItemRepository();
        } else if(itemRepositoryImplementation.equals("linked")){
            return linkedListItemRepository();
        } else {
            return null;
        }

    }
}
