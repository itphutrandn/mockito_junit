package h2.console.h2console_junittest_mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2consoleJunitTestMockApplication {

    private static final Logger log = LoggerFactory.getLogger(H2consoleJunitTestMockApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(H2consoleJunitTestMockApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
            log.info("CommandLineRunner.run();");
            log.debug("CommandLineRunner.run();");
            log.trace("CommandLineRunner.run();");
            try {
                System.out.println(1 / 0);
            } catch(Exception e) {
                log.error("Error :", e);
            }
        };
    }
}
