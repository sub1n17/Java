package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 25));
		persons.add(new Person("김춘추", 23));
		persons.add(new Person("장보고", 35));
		persons.add(new Person("강감찬", 45));
		persons.add(new Person("이순신", 55));
		
		System.out.println(persons); // [Person [name=김유신, age=25], Person [name=김춘추, age=23] ...
	
	
		// mapXXX() - 하나의 원소를 다른 값으로 변환
		persons
			.stream()
			.map(person -> {
				return person.getName();
			})
			.forEach(name -> {
				System.out.print(name + ", ");
			}
		);
		System.out.println("\n"); // 김유신, 김춘추, 장보고, 강감찬, 이순신
		
		int sum = persons
					.stream()
					.mapToInt(person -> {
						return person.getAge();
					})
					.sum();
		System.out.println("전체 나이 합 : " + sum); // 전체 나이 합 : 183
		
		
		// flatMap() - 하나의 원소를 하나 이상 다른 값으로 변환
		List<String> cities = List.of("서울,대전", "대구,부산", "광주,인천", "울산,수원", "양산,김해");
		System.out.println(cities); // [서울,대전, 대구,부산, 광주,인천, 울산,수원, 양산,김해]
		System.out.println(cities.size()); // 5
		
		List<String> resultList = cities
									.stream()
									.flatMap(city -> {
										String[] values = city.split(",");
										return Arrays.stream(values);
									})
									.collect(Collectors.toList());
		
		System.out.println(resultList); // [서울, 대전, 대구, 부산, 광주, 인천, 울산, 수원, 양산, 김해]
		System.out.println(resultList.size()); // 10
				
	
	
	
	
	
	
	}
}
