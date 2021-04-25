package exam.findsuitablejob;

public class Employee implements Employable , Comparable {
String employeeName = "0";
int salary = 0;
private Employee(String employeeName , int salary){
    if(employeeName == null){
        throw new IllegalArgumentException();
    }
    this.employeeName = employeeName;
    this.salary = salary;
}
static Employee make(String data){
StringBuilder temp = new StringBuilder();
temp.append(data);
    int i = 0;

if (Integer.parseInt(data.split(",")[1]) < 0){
    return null;
}
else {

    try {
        i = Integer.parseInt(data.split(",")[1]);
    } catch (NumberFormatException e) {
        System.out.println("Not an integer");
    }
}
return new Employee(data.split(",")[0] , i);

}
@Override
public boolean equals(Object a){
    Employee b = (Employee)a;
if(b.employeeName.equals(this.employeeName) && b.salary == this.salary){
    return true;
}
return false;
}

@Override
public String toString(){
return this.employeeName + "," + this.salary;
}
@Override
public int hashCode(){
    return this.hashCode();
}
    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }
   public void getHiredAt(Position a){
    this.salary = this.salary + a.salary;

   }
   public double getSalaryIncrease(double IncreaseRate){
    if(IncreaseRate < 1.1){
        throw new IllegalArgumentException();
    }
   return  this.salary * IncreaseRate;
   }
   public int compareTo(Employee a){
if(this.salary > a.salary){
    return 1;
}
else if(this.salary < a.salary){
    return -1;
}
else if(this.salary == a.salary){
    return 0;
}
return -1;
   }
}
