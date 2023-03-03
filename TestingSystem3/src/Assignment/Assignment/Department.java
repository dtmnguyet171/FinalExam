package Assignment;

public class Department {
    int departmentId;
    String departmentName;

    @Override
    public String toString() {
        return "Thông tin phòng ban thứ " + departmentId + " là:"
                + "\nDepartmentId: " + departmentId
                + "\nDepartmentName: " + departmentName;
    }
}

