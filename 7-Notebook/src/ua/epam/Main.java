package ua.epam;
import ua.epam.model.Model;
import ua.epam.controller.Controller;

public class Main {


        public static void main(String[] args) {
            // write your code here
            View view = new View();
            Model model = new Model();
            Controller controller = new Controller(view,model);
            controller.processUser();


        }

}
