package  com.sj.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

    public static List<Students> getAllEmployee() {
        return Stream.of(
                        new Students(6, "Sangram", "civil", 500000, Arrays.asList("9545956079", "0008991989")),
                        new Students(8, "Sangram5", "civil1", 1000000, Arrays.asList("954589568", "000000989")),
                        new Students(4, "Sangram3", "civil2", 100000, Arrays.asList("8963256079", "7852919839")),
                        new Students(2, "Sangram0", "civil3", 2500000, Arrays.asList("9535956079", "7896991989")),
                        new Students(3, "Sangram7", "civil4", 700000, Arrays.asList("9896396079", "134991989")))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Students> list = getAllEmployee();

        //List<Students>  convert List<String> -> data transformation
        //mapping - dept -> dept.getDept() -----one to one mapping
        List<String> depts = list.stream().map(dept -> dept.getDept())
                .collect(Collectors.toList());
        System.out.println("department list :- " + depts);

        //no -> no.getPhoneNumbers()  --- one to many mappings
        List<List<String>> phoneNumbers = list.stream().map(no -> no.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //no -> no.getPhoneNumbers().stream()) ----one to many mapping
        List<String> phNo = list.stream().flatMap(no -> no.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phNo);


    }

}
