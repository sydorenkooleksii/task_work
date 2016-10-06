package ua.ep.csv;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Reader {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Create the CSVFormat object
        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');

        //initialize the CSVParser object
       CSVParser parser = new CSVParser(new FileReader("src\\main\\resources\\Student.csv"), format);

        List<Student> emps = new ArrayList<Student>();
        for(CSVRecord record : parser){
            Student st = new Student();
            st.setIdStudent(Integer.parseInt(record.get("idStudent")));
            st.setFirstName(record.get("firstName"));
            st.setLastName(record.get("lastName"));
            st.setDateOfStart(record.get("dateOfStart"));
            emps.add(st);
        }
        //close the parser
        parser.close();

        System.out.println(emps);

    }


}
