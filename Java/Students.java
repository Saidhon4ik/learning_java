public class Students extends Person{
    double gpa;

    Students(String first, String last, double gpa)
    {
        super(first,last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + " " + this.last + " 's gpa is " + this.gpa );
    }
}
