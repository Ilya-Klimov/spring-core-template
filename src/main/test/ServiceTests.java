import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest(classes = MainConfiguration.class)

public class ServiceTests {

    @Autowired
    private ApplicationContext ctx;

    private SimpleItemService simpleItemService;


    @Test
    public void testSimpleItemServiceWithConstructor(){
       simpleItemService = (SimpleItemService) ctx.getBean("simpleItemServiceConstructor");
        assertNotNull(simpleItemService.getItemService());
        assertNotNull(simpleItemService.getItemValidator());
    }

    @Test
    public void testSimpleItemServiceWithSetters(){
        simpleItemService = (SimpleItemService) ctx.getBean("simpleItemServiceSetters");
        assertNotNull(simpleItemService.getItemService());
        assertNotNull(simpleItemService.getItemValidator());
    }
}
