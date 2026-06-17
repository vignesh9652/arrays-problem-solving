public  class Hello {
    class Student {
        int id;
        String name;

        // method
        void display() {
            System.out.println(id + " " + name);
        }
    }

    public void main(String[] args) {

        Student s1 = new Student();  // object creation

        s1.id = 101;
        s1.name = "Balu";

        s1.display();  // method call
    }
}
