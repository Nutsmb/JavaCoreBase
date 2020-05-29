package Lesson5;

public class Employee {
    String FIO;
    String position;
    String email;
    long tel;
    int salary;
    int age;

    public Employee(String _FIO, String _position, String _email, long _tel, int _salary, int _age) {
        FIO = _FIO;
        position = _position;
        email = _email;
        tel = _tel;
        salary = _salary;
        age = _age;
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", 892312312, 30000, 30);
        persArray[1] = new Employee("Sergeeva Anna", "Team Leader", " seranna@mailbox.com ", 892376439, 50000, 42);
        persArray[2] = new Employee("Korshun Nikola", "Programmer", " kornikola@mailbox.com ", 898923571, 40000, 21);
        persArray[3] = new Employee("Mironov Andrey", "Director", " mirandrey@mailbox.com ", 893927164, 70000, 56);
        persArray[4] = new Employee("Jekolov Alex", "Tech.leader", " jekalex@mailbox.com ", 896630261, 60000, 39);


        for(int i = 0; i < persArray.length; i++){
            if(persArray[i].getAge() > 40){
                persArray[i].getPersonInfo();
                System.out.println();
            }
        }
    }

    public void getPersonInfo() {
        System.out.println("Сотрудник "+ this.getFIO() + " (возраст " + this.getAge() + ")" + " на позиции " + this.getPosition() + " с зарплатой " + this.getSalary());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Tel.: " + this.getTel());
    }

    public String getFIO() {
        return this.FIO;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public long getTel() {
        return this.tel;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setFIO(String _FIO) {
        this.FIO = _FIO;
    }

    public void setPosition(String _position) {
        this.position = _position;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public void setTel(long _tel) {
        this.tel = _tel;
    }

    public void setSalary(int _salary) {
        this.salary = _salary;
    }

    public void setAge(int _age) {
        this.age = _age;
    }
}
