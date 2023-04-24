package com.app.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.company.Employee;

public interface Serialization {
	static void testSerialization(Map<Integer, Employee> emps, String fn) {
		File f = new File(fn);
		if(f.isFile() && f.canRead())
		{
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fn))) {
				out.writeObject(emps);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
