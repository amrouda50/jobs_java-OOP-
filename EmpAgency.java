package exam.findsuitablejob;
import java.io.*;
import java.util.*;
public class EmpAgency extends Contract {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    EmpAgency(String degree , int contractPeriod , ArrayList<Employee> employees){
        super.degree = degree;
        super.contractPeriod = contractPeriod;
        for(int i = 0 ; i < employees.size() ; i++){
            this.employees.add(employees.get(i));
        }
    }
    public void load(String filename){

        try {
            BufferedReader fr = new BufferedReader(new FileReader(new File(filename)));
            String l;
            while ((l = fr.readLine()) != null) {
                employees.add(Employee.make(l));

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        catch(IOException e ){
            System.out.println("Input Output exception called");
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }
    public void hire(Position a){
        for(int i = 0 ; i < employees.size() ; i++){
            //sorting
for(int j = 0 ;j < (employees.size() - i); j++){
if(employees.get(j).salary > employees.get(j+1).salary){
Employee temp = employees.get(j);
    employees.set(j , employees.get(j+1));
    employees.set(j+1 , temp) ;
}
}
for(int in = 0 ; in < employees.size() ; in++){
    if(employees.get(in).salary <= goalSalary){
        employees.get(in).getHiredAt(a);
        employees.remove(in);
    }
}
        }
    }
    public double getMaxIncrease(double a){
        if(employees.size() == 0) {
            throw new IllegalArgumentException();
        }
        double maxval = employees.get(0).getSalaryIncrease(a);
       for(int i = 0 ; i < employees.size(); i++){
           if( employees.get(i).getSalaryIncrease(a) > maxval){
               maxval = employees.get(i).getSalaryIncrease(a);
           }

       }
       return maxval;

    }
    @Override
    public String toString(){
      for(int i = 0 ; i < employees.size() ; i++){
          System.out.println(employees.get(i).employeeName + "," + employees.get(i).salary);
      }
        return "";
    }

    }

