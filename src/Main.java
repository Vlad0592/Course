public class Main {


    //    public static String resultFIO(Employee[] employee) {
//        double tmp_id = 0;
//        String tmp = employee[0].getFIO();
//        for (int i = 1; i < employee.length; i++) {
//            tmp_id = employee[i].getId();
//            System.out.println(employee[i].getFIO());
//        }
//        return tmp;
//    }

    public static String resultFioFIO(Employee[] employee) {
        double tmp_id = 0;
        String tmp = employee[0].getFIO();
        for (int i = 1; i < employee.length; i++) {
            tmp_id = employee[i].getId();
            System.out.println(employee[i].getFIO());
        }
        return tmp;
    }

    public static int resultFio(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].toString());
        return 0;
    }


    public static String resultFioToString(Employee[] employee, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                return employee[i].toString();
            }
        }
        return "none";
    }


    public static int salarySum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        //System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }

    public static int salaryMin(Employee[] employee) {
        int tmp_id = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp > employee[i].getSalary()) {
                tmp_id = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }
        //System.out.println("min"+ tmp);
        return tmp_id;
    }

    public static int salaryAverage(Employee[] employee) {
        //System.out.println(salarySum(employee ) / employee.length);
        return salarySum(employee) / employee.length;
    }

    public static int salaryMax(Employee[] employee) {
        int tmp_id = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp < employee[i].getSalary()) {
                tmp_id = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }
        //System.out.println("max"+ tmp);
        return tmp_id;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("bobych", 1, 1_000); // и таких ровно 10
        employee[1] = new Employee("bobych", 2, 50);
        employee[2] = new Employee("bobych", 3, 100);
        employee[3] = new Employee("bobych", 4, 200);
        employee[4] = new Employee("bobych", 5, 2400);
        employee[5] = new Employee("bobych", 5, 111);
        employee[6] = new Employee("bobych", 1, 525);
        employee[7] = new Employee("bobych", 2, 240);
        employee[8] = new Employee("bobych", 3, 230);
        employee[9] = new Employee("bobych", 4, 250);


//        //IntSummaryStatistics result = Arrays.stream(employee).collect(Collectors.summarizingInt(Employee::getSalary));
//        System.out.println(result.getSum());
//        System.out.println(result.getMin());
//        System.out.println(result.getMax());
//        System.out.println(result.getAverage());


        System.out.println(resultFio(employee));
        System.out.println(resultFioFIO(employee));
        System.out.println("sum = " + salarySum(employee));
        System.out.println("ave = " + salaryAverage(employee));
        System.out.println(" min " + resultFioToString(employee, salaryMin(employee)));
        System.out.println(" max " + resultFioToString(employee, salaryMax(employee)));
//        System.out.println(resultFIO(employee));
//        System.out.println(resultFIO(t));

        System.out.println("===");



    }


}