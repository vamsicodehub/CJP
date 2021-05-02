package com.vamsi.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationUIDReceiver
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
	FileInputStream fileInputStream = new FileInputStream("Employee.ser");
	@SuppressWarnings("resource")
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	Employee employee = (Employee) objectInputStream.readObject();
	System.out.println(employee);
    }
}
