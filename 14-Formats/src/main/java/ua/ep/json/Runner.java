package ua.ep.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;

/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Runner {

    public static void main(String args[]) throws Exception {
        Student student = new Student(11, "Bob", "Sinclar", "2009-08-9");
        JSONObject json = new JSONObject();
        json.put("idStudent", student.getIdStudent());
        json.put("firstName", student.getFirstName());
        json.put("lastName", student.getLastName());
        json.put("dateOfStart", student.getDateOfStart());
        System.out.println(json.toJSONString());
        String jString = json.toJSONString();

        ObjectMapper mapper = new ObjectMapper();
        Student wasRead = mapper.readValue(jString, Student.class);
        System.out.println(wasRead);

        String jsonInString = mapper.writeValueAsString(student);
        System.out.println(jsonInString);
        mapper.writeValue(new File("file.json"), student);
    }
}
