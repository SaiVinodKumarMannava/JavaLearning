import java.util.Scanner;

public class employee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //scanner class
        emp_deatil e= new emp_deatil();    //method calling
        int op=1;
        while(op!=0){
            System.out.println("1.Add Employeee id");
            System.out.println("2.Search employee");
            //System.out.println("3.Add Salary");
            System.out.println("3.display Employee");
            System.out.println("0.Exist");
            op=sc.nextInt();
            sc.nextLine();
            if(op == 1)
            {
             e.addempid();
            }
            if(op == 2)
            {
                e.search_ename();
            }
            if(op == 3){
                e.display();
            }
        }

    }
}

class emp_deatils      // first class need to initiate variables and getter and setter methods
{
    int eid;
    String ename;
    int esalary;
    emp_deatils() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number");
        eid = sc.nextInt();
        System.out.println("Enter Employee Salary");
        esalary = sc.nextInt();
        System.out.println("Enter Employee Name");
        ename = sc.next();

    }
    int geteid()
    {
        return this.eid;
    }
    String getename()
    {
        return this.ename;
    }
    int getesalary()
    {
        return this.esalary;
    }
    void seteid(int eid)
    {
        this.eid=eid;
    }
    void setename(String ename)
    {
        this.ename=ename;
    }
    void setesalary(int esalary)
    {
        this.esalary=esalary;
    }


}
class emp_deatil     //Second class need to be different class (inheratie class)
{     //in this class we need to write the entire java code
    public emp_deatils emp_list[]=new emp_deatils[50]; //Creating an array to store the data
    int a=0;
    public void addempid()  // this method should be called in the main class with the help of object
    {
        emp_deatils e= new emp_deatils();
        if(this.a<50){
            this.emp_list[this.a]=e;
            this.a++;
        }
    }
    void display()   // This method has the opertion like what code we write in the code should display output
    {
        System.out.println("| eid || ename || esalary |");
        for(int i=0;i<=a;i++){
            System.out.println("|    "+this.emp_list[i].geteid()+" || "+this.emp_list[i].getename()+" || "+this.emp_list[i].getesalary()+" | ");
        }
    }
    void search_ename(){
        System.out.println("Enter employee name");
        Scanner sc=new Scanner(System.in);
        String ename=sc.nextLine();
        System.out.println("| eid|| ename || esalary |");
        for(int i=0;i<a;i++){
            if(emp_list[i].equals(ename));
            {
                System.out.println("|  "+this.emp_list[i].geteid()+" || " +this.emp_list[i].getename()+" || "+this.emp_list[i].getesalary()+"   ");

            }
        }
        // 1.Need to change the employee salary
        //2. Search by salary.

}

}