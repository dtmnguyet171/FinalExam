package Assignment;

public class Exercise5 {
    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
        question7();
    }

    public static void question1() {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        System.out.println(department1.toString());
    }

    public static void question2() {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department[] departments = {department1, department2};
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public static void question3() {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department[] departments = {department1, department2};
        for (Department department : departments) {
            System.out.println(department.hashCode());
        }
    }
    public static void question4(){
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        if (department1.departmentName.equals("Phòng A")){
            System.out.println("Phòng A");
        } else {
            System.out.println("Không phải phòng A");
        }
    }
    public static void question5(){
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        if (department1.departmentName.equals(department2.departmentName)){
            System.out.println("Hai phòng ban giống nhau");
        } else {
            System.out.println("Hai phòng ban khác nhau");
        }
    }
    public static void question6(){
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Finance";

        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Accounting";

        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "IT";

        Department[] departments = {department1,department2,department3,department4,department5};
        for (int i = 0; i<departments.length; i++){
            char firstChar1 = departments[i].departmentName.charAt(0);
            for (int j=0; j<departments.length-1; j++){
                char firstChar2 = departments[j].departmentName.charAt(0);
                if (firstChar1 < firstChar2){
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        for (Department department : departments){
            System.out.println(department);
        }
    }
    public static void question7(){
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";

        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Accounting";

        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Waiting room";


//        String[] words = string.split(" ");
//        String reverse = "";
//        for (int i = (words.length-1); i >=0; i--){
//            String word = words[i];
//            reverse += word + " ";

        Department[] departments = {department1,department2,department3,department4,department5};
        String reverse = "";
        for (int i = 0; i<departments.length; i++){
            String[] words = departments[i].departmentName.split(" ");
            for (int j = (words.length-1); i >=0; i--){
                String word = words[i];
                reverse += word + " ";
            }
        }
        System.out.println(reverse);
//        for (int i = 0; i<departments.length; i++){
//            char firstChar1 = departments[i].departmentName.charAt(0);
//            for (int j=0; j<departments.length-1; j++){
//                char firstChar2 = departments[j].departmentName.charAt(0);
//                if (firstChar1 < firstChar2){
//                    Department temp = departments[i];
//                    departments[i] = departments[j];
//                    departments[j] = temp;
//                }
//            }
//        }
//        for (Department department : departments){
//            System.out.println(department.departmentName);
//        }
    }
}
