
import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.entity.Color;
import com.epam.edu.spring.core.template.entity.Item;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  static  org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MainConfiguration.class)
public class RepositoryTests {


    @Autowired
    ItemRepository itemRepository;

    private  Item item;

    @Test
    public  void getByIdTest(){
        itemRepository.createItem(item);
        assertEquals(item,itemRepository.getById(42));
    }

    @BeforeEach
    public  void itemSetup(){
         item = new Item(13,"name",156,Color.BLUE);
    }

}
