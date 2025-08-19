public class Student {
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;

    }
    public static void main(String args[]){
        Student child1=new Student("naman ",89);
        Student child2=new Student("kunal ",90);
        System.out.println(child1.name+child1.marks);
        System.out.println(child2.name+child2.marks);
    }
    
}
