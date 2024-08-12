import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String>list1=new ArrayList<>();
		list1.add("hyd");
		list1.add("pune");
		
		Employee e1=new Employee(1,"mahi",list1);
		
		List<String>list2=new ArrayList<>();
		list2.add("bangalore");
		list2.add("pune");
		
		Employee e2=new Employee(2,"kiran",list2);
		
		List<String>list3=new ArrayList<>();
		list3.add("bangalore");
		list3.add("pune");
		Employee e3=new Employee(3,"mahesh",list3);
		
		
		List<Employee>employeelist=Arrays.asList(e1,e2,e3);
		
		//System.out.println(employeelist);
//		
//		List<Integer>ids=new ArrayList<>();
//		
//		for(Employee employee:employeelist) {
//		
//			ids.add(employee.getId());
//		}
//		System.out.println(ids);
		
		//System.out.println(employeelist.stream().map(emp->emp.getId()).collect(Collectors.toList()));
		
//		System.out.println(employeelist.stream().map(emp->emp.getcities()).collect(Collectors.toList()));
//		
//		System.out.println(employeelist.stream().map(emp->emp.getcities()).collect(Collectors.toSet()));
//		
		List<String>citiesworked = employeelist.stream().flatMap(emp->emp.getcities().stream()).collect(Collectors.toList());
		System.out.println(citiesworked);
		
		Set<String>citiesworked1 = employeelist.stream().flatMap(emp->emp.getcities().stream()).collect(Collectors.toSet());
		System.out.println(citiesworked1);
		
		

	}

}
