package exam.findsuitablejob;

public class Contract {
    String degree;
   private int numberOfEmployees;
    int contractPeriod;
   static int goalSalary = 4000;
   private int leastAmountOfMonthes = 6;
   private int maximumAmountOfMonthes = 12;
Contract(String degree , int numberOfEmployees , int contractPeriod){
    this.degree = degree;
    if(isBetween(numberOfEmployees , 15 , 40)) {
        this.numberOfEmployees = numberOfEmployees;
    }
    else{
        throw new IllegalArgumentException();
    }
    if(isBetween(contractPeriod , leastAmountOfMonthes , maximumAmountOfMonthes) ) {
        this.contractPeriod = contractPeriod;
    }

}
Contract(){
    this.numberOfEmployees = 20;
    this.degree = "Master";
    this.contractPeriod = 12;
}
public static boolean isBetween(int number , int min , int max){
if( number >= min && number <= max){
    return true;
}
return false;
}
@Override
public String toString(){
    return this.degree + "-" + this.numberOfEmployees + "-" + this.contractPeriod;
}
    public static void setGoalSalary(int goalSalary) {
        Contract.goalSalary = goalSalary;
    }

    public String getDegree() {
        return degree;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public static int getGoalSalary() {
        return goalSalary;
    }
}
