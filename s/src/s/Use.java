package s;

public class Use extends Thread {

	public static void main(String[] args) throws Exception {
		
	EmpReg e=new EmpReg();
	e.emp();
	}
}
		/*EmpOperations ops = new EmpOperations();
		ArrayList<Employee> emps = new ArrayList<Employee>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("MENU");
			System.out.println("1.customer ststus");
			System.out.println("2.List products");
			System.out.println("3.add the product");
			System.out.println("4.Delete product");
			System.out.println("5.Update shelf");
			System.out.println("6.Back Up EMployee Data");
			System.out.println("7.Restore Employee Data");
			System.out.println("8.Exit");

			System.out.println("Enter Option from 1 - 8: ");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Empoyee Id, Name and Salary: ");

				int empId = Integer.parseInt(br.readLine());
				String empName = br.readLine();
				double salary = Double.parseDouble(br.readLine());

				Employee emp = new Employee(empId, empName, salary);

				boolean status = ops.addEmployee(emp, emps);
				if (status != true) {
					System.out.println("Employee Already Exists");
				} else {
					System.out.println("Employee added successfully");
				}

				break;
			case 2:
				ops.listEmployees(emps);
				break;
			case 3:
				System.out.println("Enter emplyee id to Find: ");
				empId = sc.nextInt();
				emp = ops.findEmployeeByEmpId(empId, emps);
				if (emp != null) {
					System.out.println("Employee Id: " + emp.getEmpId());
					System.out.println("Name: " + emp.getEmpName());
					System.out.println("Salary: " + emp.getSalary());
				} else {
					System.out.println("Employee Id " + empId
							+ " Does not Exists in the List");
				}

				break;
			case 4:
				System.out.println("Enter emplyee id to delete: ");
				empId = sc.nextInt();
				status = ops.deleteEmployee(empId, emps);
				if (status == true) {
					System.out.println("Employee Id " + empId + " is Deleted");
				} else {
					System.out.println("Employee Id " + empId
							+ " Doent not exists in the List");
				}
				break;
			case 5:
				System.out.println("Enter emplyee id to update: ");
				empId = sc.nextInt();
				status = ops.updateEmployee(empId, emps);

				if (status == true) {
					System.out.println("Record updated");
				} else {
					System.out.println("Employee Id not found");
				}

				break;
			case 6:
				ops.backUp(emps);
				break;
			case 7:
				ops.restore(emps);
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid Choice. try Again: ");
			} // end of switch

		}// end of while

		
		 * Employee e1 = new Employee(1024, "James", 10038); Employee e2 = new
		 * Employee(1025, "Praveen", 15638); Employee e3 = new Employee(1026,
		 * "Prashanth", 50038); Employee e4 = new Employee(1027, "John", 1834);
		 * Employee e5 = new Employee(1028, "Gorav", 374638);
		 

		
		 * emps.add(e1); emps.add(e2); emps.add(e3); emps.add(e4); emps.add(e5);
		 * emps.add(e1);
		 

	}

}
*/

