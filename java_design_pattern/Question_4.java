class Student{
    private String name;
    private String phone;
    private String school;
    private String rollNo;
    private String subject;
    private String address;
    
    Student(StudentBuilder studentBuilder){
        name=studentBuilder.name;
        phone=studentBuilder.phone;
        school=studentBuilder.school;
        rollNo=studentBuilder.rollNo;
        subject=studentBuilder.subject;
        address=studentBuilder.address;
    }
    
    public String getName() {
        return name;
    }
    
    public static class StudentBuilder{
        private String name;
        private String phone;
        private String school;
        private String rollNo;
        private String subject;
        private String address;
        
        
        StudentBuilder(String name){
            this.name=name;
        }
    
        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
    
        public StudentBuilder setSchool(String school) {
            this.school = school;
            return this;
        }
    
        public StudentBuilder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }
    
        public StudentBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }
    
        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        
        public Student build(){
            return new Student(this);
        }
    }
}
public class Question_4 {
    
    public static void main(String[] args) {
        //Implement Builder pattern to create a student object with more than 6 fields.
        
        Student student = new Student.StudentBuilder("demo").setAddress("delhi").build();
        System.out.println(student.getName());
    }
    
}
