class Result {
    String studentName;
    int subject_marks;
    int totalMarks=500;


    float calculateResult() {
        float per = (subject_marks/totalMarks)*100;
        return per;
    }


    void displayGrade() {
        System.out.println("Student Name: " + studentName);
        float percentage = calculateResult();
        System.out.println("Percentage: " + percentage + "%");


        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    public static void main(String[] args) {
        Result r1 = new Result();
        Result r2 = new Result();
        Result r3 = new Result();
        r1.studentName = "Ashray";
        r1.subject_marks=500;
        r2.studentName="Aniruddha";
        r2.subject_marks=250;
        r3.studentName="Aman";
        r3.subject_marks=80;

        r1.calculateResult();
        r1.displayGrade();
        r2.calculateResult();
        r2.displayGrade();
        r3.calculateResult();
        r3.displayGrade();
    }
}

