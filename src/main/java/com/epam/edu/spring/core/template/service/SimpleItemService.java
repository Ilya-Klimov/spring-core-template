package com.epam.edu.spring.core.template.service;

import com.epam.edu.spring.core.template.entity.Item;
import com.epam.edu.spring.core.template.validator.ItemValidator;

public class SimpleItemService implements ItemService {

    private ItemService itemService;
    private ItemValidator itemValidator;

    @Override
    public Item getById(long id) {
        return null;
    }

    @Override
    public boolean createItem(Item item) {
        return false;
    }
}
