class Student {
    String name;
    int subject1;
    int subject2;
    int subject3;
    public Student(){
        name = "Aviraj";
        subject1 = 92;
        subject2 = 98;
        subject3 = 98;

    }
   
    public float printAverage(){
        float avg = (subject1+subject2+subject3)/3.0f;
        return avg;
    }



    public static void main(String[] args) {
        Student st = new Student();
       
        float avg = st.printAverage();
        System.out.println("Percentage of "+st.name +" is "+avg);


    }

}