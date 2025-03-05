package  com.sj.demo.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Project {

    String projectCode;
    String name;
    String client;
    String buLeadName;


}
