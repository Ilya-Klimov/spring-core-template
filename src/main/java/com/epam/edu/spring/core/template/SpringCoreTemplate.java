package com.epam.edu.spring.core.template;

import com.epam.edu.spring.core.template.configuration.InitializerConfiguration;
import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.entity.Color;
import com.epam.edu.spring.core.template.entity.Item;
import com.epam.edu.spring.core.template.repository.ArrayListItemRepository;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import com.epam.edu.spring.core.template.repository.LinkedListItemRepository;
import com.epam.edu.spring.core.template.service.ItemService;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import com.epam.edu.spring.core.template.validator.ItemValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class SpringCoreTemplate {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);

		InitializerConfiguration.ColorFactory colorFactory1 = ctx.getBean(InitializerConfiguration.ColorFactory.class);
		InitializerConfiguration.ColorFactory colorFactory2 = ctx.getBean(InitializerConfiguration.ColorFactory.class);

		ItemService itemService = (ItemService) ctx.getBean("itemService");
		ItemValidator itemValidator = (ItemValidator) ctx.getBean("itemValidator");

		SimpleItemService simpleItemService = (SimpleItemService) ctx.getBean("simpleItemServiceSetters");
		SimpleItemService simpleItemService1 = (SimpleItemService) ctx.getBean("simpleItemServiceConstructor");

		ItemRepository itemRepository = (ItemRepository) ctx.getBean("itemRepository");

	}

}
