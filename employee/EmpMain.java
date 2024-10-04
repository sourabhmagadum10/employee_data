package employee;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCollection empCollection = new EmployeeCollection();
		
		
        String v_nameCollection = "Hash_<sourabh>";
        String v_phoneCollection = "Hash_<2434>";

        
        empCollection.createCollection(v_nameCollection);
        empCollection.createCollection(v_phoneCollection);
        empCollection.getEmpCount(v_nameCollection);
        empCollection.indexData(v_nameCollection, "Department");
        empCollection.indexData(v_phoneCollection, "Gender");
        
        empCollection.getCollections().get(v_nameCollection).add(new Employee("E02001", "Sagar", "BE", "Male"));
        empCollection.getCollections().get(v_nameCollection).add(new Employee("E02002", "Sanika", "Civil", "Female"));
        empCollection.getCollections().get(v_nameCollection).add(new Employee("E02003", "Rohit", "IT", "Male"));

        empCollection.delEmpById(v_nameCollection, "E02003");
        empCollection.getEmpCount(v_nameCollection);
        empCollection.searchByColumn(v_nameCollection, "Department", "IT");
        empCollection.searchByColumn(v_nameCollection, "Gender", "Male");
        empCollection.searchByColumn(v_phoneCollection, "Department", "IT");
        empCollection.getDepFacet(v_nameCollection);
        empCollection.getDepFacet(v_phoneCollection);

	}

}
