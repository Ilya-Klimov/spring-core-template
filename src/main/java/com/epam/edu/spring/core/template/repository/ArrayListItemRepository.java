package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * Репозиторий, основанный на классе ArrayList.
 * initialSequence должен браться из application.properties
 */

public class ArrayListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    List<Item> arrayList = new ArrayList<>();
    @Value("${initial.sequence}")
 String initialSequenceFromProperties;
    @Override
    public Item getById(long id) {

        for (Item element: arrayList) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    @Override
    public boolean createItem(Item item) {
        setInitialSequence(Integer.valueOf(initialSequenceFromProperties));
        item.setId(initialSequence);
        if (getById(item.getId())==null){
            arrayList.add(item);
            setHolder();
            return true;
        } else {
            return false;
        }
    }

    void setInitialSequence(int val) {
      this.initialSequence = val;
        //TODO
    }

    void setHolder() {
        this.holder = arrayList;
        //TODO
    }
}
