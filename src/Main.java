import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String[] args) throws IOException, ClassNotFoundException {

        File     file = new File( "save.txt");
        Employee employee = new Employee("Rob", 94, 1500);
        System.out.println(employee);

        Methods.serialize ( employee , file );
        System.out.println(Methods.deserialize(file));

        File            file1          = new File("saveListOfEmployee.txt");
        List <Employee> listOfEmployee = new ArrayList <> ();

        listOfEmployee.add( new Employee ("Robert", 98, 2500));
        listOfEmployee.add( new Employee ("Umberto", 96, 3500));
        listOfEmployee.add( new Employee ("Riko", 97, 4500));
        listOfEmployee.add( new Employee ("Rouse", 95, 5500));

        Methods.serialize ( (Serializable) listOfEmployee , file1 );
        System.out.println(Methods.deserialize(file1));


    }
}
