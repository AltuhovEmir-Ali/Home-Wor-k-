import java.util.HashMap;
import java.util.Map;
public class Library {
    private Map<String, Department> departments;

    public Library() {
        departments = new HashMap<>();
    }

    public void addDepartment(Department department) {
        departments.put(department.getName(), department);
    }

    public Department getDepartment(String name) {
        return departments.get(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Department dept : departments.values()) {
            sb.append(dept).append("\n");
        }
        return sb.toString();
    }
}
