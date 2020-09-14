/*
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * import java.util.function.Function; import java.util.function.Predicate;
 * public class Test { public static void main(String[] args) {
 * ArrayList<Employee> list = new ArrayList<Employee>(); populate(list);
 * Predicate<String> p = Predicate.isEqual("Prabhanjan");
 * System.out.println(p.test("Naveen")); Predicate<Employee>
 * emp1=emp->emp.designation.equals("SSE"); display(emp1,list);
 * Predicate<Employee> emp2 = emp->emp.city.equals("Hyd"); display(emp2,list);
 * Predicate<Employee>emp3=emp->emp.salary<=20000; display(emp3,list);
 * Function<Employee, Employee> f=e-> { e.salary=e.salary+477; return e; };
 * ArrayList<Employee>l2=new ArrayList<Employee>(); list.forEach(e1-> {
 * if(emp3.test(e1)) { f.apply(e1); l2.add(e1); } } );
 * System.out.println("After Increment salary"); System.out.println(list);
 * System.out.println("Employees whose salary incremented");
 * System.out.println(l2); } private static void display(Predicate<Employee>
 * emp, ArrayList<Employee> list) { list.forEach(employee->{
 * if(emp.test(employee)) { System.out.println("display-method-print"
 * +employee); } } ); } private static void populate(ArrayList<Employee> list) {
 * list.add(new Employee("Durga", "SSE", 30000, "Hyd")); list.add(new
 * Employee("Mahesh", "SE", 20000, "Hyd")); list.add(new Employee("Naresh",
 * "ASE", 10000, "Hyd")); list.add(new Employee("Avinash", "SSE", 40000,
 * "Pune")); list.add(new Employee("Pavan", "SE", 25000, "Mumbai"));
 * System.out.println("populate-method-print" +list); } }
 */