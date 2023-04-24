package com.app.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.company.Employee;

public interface DeSerialization {
	static Map<Integer, Employee> testDeSerialization(String fn) {
		File f = new File(fn);
		if (f.isFile() && f.canRead()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fn))) {
				return (Map<Integer, Employee>) in.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return new HashMap<>();
	}

}
