package com.example.xmltodatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.jar.JarException;

@SpringBootApplication
public class XmlToDatabaseApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(XmlToDatabaseApplication.class, args);

        }

        @Bean
        public CommandLineRunner run(EmployeeRepository repository){
        return (args -> {
           insertJavaAdvocates(repository);
           System.out.println(repository.findAll());
        });
        }

        private void insertJavaAdvocates(EmployeeRepository repository){
            try {
                File file = new File("employee.xml");
                JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
                System.out.println(e.getId() + " " + e.getFirstName() + " " + e.getLastName());


                repository.save(new Employee(e.getId(), e.getFirstName(), e.getLastName()));
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
    }

