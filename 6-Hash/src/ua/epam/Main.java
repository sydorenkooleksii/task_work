package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here


        EpamEmployee epamEmployee = new EpamEmployee("Alex",12,"Kpi","Not");
//        RDEmployee rdEmployee = new RDEmployee("Alex",12,"Kpi","Not", RDEmployee.Specialization.AT);

        EpamEmployee rdEmployee = new EpamEmployee("Alex",12,"Kpi","Not");

        System.out.println(epamEmployee == rdEmployee);
        System.out.println(epamEmployee.equals(rdEmployee));
        System.out.println(epamEmployee.hashCode() == rdEmployee.hashCode() );
        System.out.println(epamEmployee.hashCode());
        System.out.println(rdEmployee.hashCode());



    }
}
