package com.example.xmltodatabase;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;

public class Marsh {
    public static void main(String[] args) throws Exception{
        JAXBContext contextObj = JAXBContext.newInstance(Employee.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        Employee emp1 = new Employee(2,"D","M");

        marshallerObj.marshal(emp1, new FileOutputStream("employee2.xml"));
    }
}
