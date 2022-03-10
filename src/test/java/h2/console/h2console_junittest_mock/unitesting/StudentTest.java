package h2.console.h2console_junittest_mock.unitesting;

import h2.console.h2console_junittest_mock.entities.Student;
import h2.console.h2console_junittest_mock.repositories.StudentRepository;
import static org.junit.jupiter.api.Assertions.*;

import h2.console.h2console_junittest_mock.services.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class StudentTest {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    public void test_size_getList() {
//        System.out.println(studentService);
//        int expected = studentService.findAll().size();
//        assertEquals(expected, 2);
//    }

    @Test
    public void test_getList() throws Exception {
//        when(studentService.findAll()).thenReturn(
//                Arrays.asList(new Student(1, "Nguyen Van A")),
//                Arrays.asList(new Student(2, "Nguyen Van B"))
//        );

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/student/list")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc
                .perform(requestBuilder)
                .andExpect(status().is(200))
                .andExpect(content().json("[{\"id\":1,\"name\":\"Nguyen Van A\"},{\"id\":2,\"name\":\"Nguyen Van B\"}]"))
                .andReturn();
    }
}
