import java.util.Comparator;

public class Employee implements Comparable<Employee> {
 private int empID = 1;
 private String empName = "Xiaolong Zhang";

 public Employee(int empID, String empName) {
 super();
 this.empID = empID;
 this.empName = empName;
 }

 public int getEmpID() {
 return empID;
 }

 public void setEmpID(int empID) {
 this.empID = empID;
 }

 public String getEmpName() {
 return empName;
 }

 public void setEmpName(String empName) {
 this.empName = empName;
 }

 @Override
 public int compareTo(Employee emp) {
 int compID = emp.getEmpID();
 return compID - this.empID;
 }
 
 public Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {

 @Override
 public int compare(Employee o1, Employee o2) {
 String empName1 = o1.getEmpName();
 String empName2 = o2.getEmpName();
 return empName1.compareTo(empName2);
 }
 };
}
