package com.training.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Books {

	private HashMap<String, ArrayList<String>> bookList;

	public Books() {
		bookList = new HashMap<String, ArrayList<String>>();
		init();
	}

	private void init() {
		ArrayList<String> fiction = new ArrayList<>();
		fiction.add("HP 1");
		fiction.add("HP 2");
		fiction.add("HP 3");
		bookList.put("Fiction", fiction);

		ArrayList<String> nonFiction = new ArrayList<>();
		nonFiction.add("Wings of fire");
		nonFiction.add("Vision 2020");
		nonFiction.add("Gandhi");
		bookList.put("non-Fiction", nonFiction);
	}

	public void printBooks() {
		Set<Map.Entry<String, ArrayList<String>>> list = bookList.entrySet();
		for (Map.Entry<String, ArrayList<String>> words : list) {
			System.out.println(words.getKey() + " : " + words.getValue());
		}
	}

	public void printBooks(String type) {

		System.out.println(bookList.get(type));
	}

	public static void main(String[] args) {

		Books books = new Books();
		books.printBooks();
		
		books.printBooks("non-Fiction");

	}
}
