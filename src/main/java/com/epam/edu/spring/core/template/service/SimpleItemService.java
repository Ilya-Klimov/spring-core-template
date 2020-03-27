package com.epam.edu.spring.core.template.service;

import com.epam.edu.spring.core.template.entity.Item;
import com.epam.edu.spring.core.template.validator.ItemValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SimpleItemService implements ItemService {

    private ItemService itemService;
    private ItemValidator itemValidator;

    @Autowired
    public SimpleItemService(ItemService itemService, ItemValidator itemValidator) {
        this.itemService = itemService;
        this.itemValidator = itemValidator;
    }

    public SimpleItemService() {
    }


    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }


    public void setItemValidator(ItemValidator itemValidator) {
        this.itemValidator = itemValidator;
    }

    public ItemService getItemService() {
        return itemService;
    }

    public ItemValidator getItemValidator() {
        return itemValidator;
    }


    @Override
    public Item getById(long id) {
        return null;
    }

    @Override
    public boolean createItem(Item item) {
        return false;
    }
}
