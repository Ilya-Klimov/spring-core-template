import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.repository.ArrayListItemRepository;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import com.epam.edu.spring.core.template.repository.LinkedListItemRepository;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  static  org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = MainConfiguration.class)
public class ConfigurationTests {

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    LinkedListItemRepository linkedListItemRepository;
    @Autowired
    ArrayListItemRepository arrayListItemRepository;


    @Test
    public void  itemRepositoryBeanExistTest(){
      assertNotNull(itemRepository);
    }

    @Test
    public void linkedListItemRepositoryBeanExistTest(){
        assertNotNull(linkedListItemRepository);
    }
    @Test
    public void  arrayListItemRepositoryBeanExistTest(){
        assertNotNull(arrayListItemRepository);
    }

}
