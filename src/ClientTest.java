import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) throws ParseException {
		Address address = new Address();
		address.setStreet("Rajakkapalli");
		address.setZipcode(506164L);
		address.setAddressLine1("Regonda");
		address.setAddressLine2("Warangal");

		Set<String> skills = new LinkedHashSet<String>();
		skills.add("MicroServices");
		skills.add("Springboot");

		Date dob = MyUtil.stringToDate("22/06/1990");
		Employee employee = new Employee("Prabhanjan", "SSE", 50000, dob, skills, address);
		System.out.println("Name: " + employee.getName());
		employee.getSkills().add("Hibernate");
		System.out.println(skills);

		System.out.println("FlatMap");
		List<Detail> details = new ArrayList<Detail>();
		List<String> parts1 = Arrays.asList("Part_1", "Part_2", "Part_3");
		List<String> parts2 = Arrays.asList("Part_1", "Part_2", "Part_3", "Part_4", "Part_5");
		Detail detail1 = new Detail(1001, parts1);
		Detail detail2 = new Detail(1002, parts2);
		details.add(detail1);
		details.add(detail2);
		Stream<String> flatMapDetail = details.stream().flatMap(element -> element.getParts().stream());
		flatMapDetail.forEach(System.out::println);

	}
}
