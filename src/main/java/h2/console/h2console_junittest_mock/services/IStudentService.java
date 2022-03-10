package h2.console.h2console_junittest_mock.services;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService<T> {

    void save(T t);

    List<T> findAll();
}
