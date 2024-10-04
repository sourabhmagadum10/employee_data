package employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeCollection {
	  private final Map<String, List<Employee>> collections;

	    public EmployeeCollection() {
	        collections = new HashMap<>();
	    }

	    public void createCollection(String p_collection_name) {
	        getCollections().put(p_collection_name, new ArrayList<>());
	        System.out.println("Collection '" + p_collection_name + "' created.");
	    }

	    public void indexData(String p_collection_name, String p_exclude_column) {
	        if (getCollections().containsKey(p_collection_name)) {
	            System.out.println("Indexed data in '" + p_collection_name + "', excluding '" + p_exclude_column + "'.");
	        } else {
	            System.out.println("Collection does not exist.");
	        }
	    }

	    public List<Employee> searchByColumn(String p_collection_name, String p_column_name, String p_column_value) {
	        if (getCollections().containsKey(p_collection_name)) {
	            List<Employee> results = new ArrayList<>();
	            for (Employee emp : getCollections().get(p_collection_name)) {
	                switch (p_column_name) {
	                    case "Department":
	                        if (emp.getEmpDepartment() != null && emp.getEmpDepartment().equals(p_column_value)) {
	                            results.add(emp);
	                        }
	                        break;
	                    case "Gender":
	                        if (emp.getEmpGender() != null && emp.getEmpGender().equals(p_column_value)) {
	                            results.add(emp);
	                        }
	                        break;
	                }
	            }
	            System.out.println("Search in '" + p_collection_name + "' for '" + p_column_name + "' = '" + p_column_value + "': " + results);
	            return results;
	        } else {
	            System.out.println("Collection '" + p_collection_name + "' does not exist.");
	            return new ArrayList<>();
	        }
	    }

	    public int getEmpCount(String p_collection_name) {
	        if (getCollections().containsKey(p_collection_name)) {
	            int count = getCollections().get(p_collection_name).size();
	            System.out.println("Employee count in '" + p_collection_name + "': " + count);
	            return count;
	        } else {
	            System.out.println("Collection '" + p_collection_name + "' does not exist.");
	            return 0;
	        }
	    }

	    public void delEmpById(String p_collection_name, String p_employee_id) {
	        if (getCollections().containsKey(p_collection_name)) {
	            List<Employee> empList = getCollections().get(p_collection_name);
	            int beforeCount = empList.size();
	            empList.removeIf(emp -> emp.getEmpId().equals(p_employee_id));
	            int afterCount = empList.size();
	            System.out.println("Deleted ID '" + p_employee_id + "' from '" + p_collection_name + "'. Before: " + beforeCount + ", After: " + afterCount + ".");
	        } else {
	            System.out.println("Collection '" + p_collection_name + "' does not exist.");
	        }
	    }

	    public void getDepFacet(String p_collection_name) {
	        if (getCollections().containsKey(p_collection_name)) {
	            Map<String, Integer> departmentCount = new HashMap<>();
	            for (Employee emp : getCollections().get(p_collection_name)) {
	                if (emp.getEmpDepartment() != null) 
	                    departmentCount.put(emp.getEmpDepartment(), departmentCount.getOrDefault(emp.getEmpDepartment(), 0) + 1);
	                
	            }
	            System.out.println("Department facet for '" + p_collection_name + "': " + departmentCount);
	        } else 
	            System.out.println("Collection does not exist.");
	        
	    }

		public Map<String, List<Employee>> getCollections() {
			return collections;
		}

}
