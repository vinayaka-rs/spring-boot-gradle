package org.baeldung;

import org.baeldung.impls.SampleImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        SampleImpl impl = new SampleImpl();
        impl.printData();

    }
}
