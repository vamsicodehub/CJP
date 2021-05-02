package com.vamsi.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationUIDSender
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
	Employee employee = new Employee("vamsi", 3103);
	@SuppressWarnings("resource")
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
	objectOutputStream.writeObject(employee);
    }

}

