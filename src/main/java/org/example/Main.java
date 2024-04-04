package org.example;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();

		Person person = new Person("Ignacio", 24);
		String json = gson.toJson(person);

		System.out.println(json);
	}
}