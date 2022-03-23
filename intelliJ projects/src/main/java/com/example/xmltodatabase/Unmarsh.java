package com.example.xmltodatabase;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.jar.JarException;
/*
public class Unmarsh {
    public static void main(String[] args) throws JAXBException, IOException {
        try{
            File file = new File("employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getId() + " " + e.getFirstName() + " " + e.getLastName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}

 */
