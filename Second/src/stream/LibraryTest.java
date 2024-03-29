package stream;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	public Book(String name, int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book [name]=" + name ;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}
public class LibraryTest {

	public static void main(String[] args) {
		List <Book> bookList=new ArrayList<Book>();
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		int total;
		total=bookList.stream().mapToInt(c->c.getPrice()).sum();
		
		System.out.println("모든 책의 가격의 합은 "+total+"원입니다.");
		
		bookList.stream().filter(c->(c.getPrice()>=20000)).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
