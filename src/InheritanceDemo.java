import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker w1, w2, w3;
        SalaryWorker s1, s2, s3;
        ArrayList<Worker> work = new ArrayList<>();
        w1 = new Worker("000001", "Ryan", "Rofe", "Mr.", 2002, 20);
        w2 = new Worker("000002", "John", "Doe", "Mr.", 2000, 16);
        w3 = new Worker("000003", "Jane", "Doe", "Mrs.", 2001, 22);
        s1 = new SalaryWorker("000004", "Bryan", "Brofe", "Mr.", 2002, 50000);
        s2 = new SalaryWorker("000005", "Carina", "Dison", "Ms.", 2003, 60000);
        s3 = new SalaryWorker("000006", "Freddie", "Mercury", "Mr.", 1946, 100000);
        work.add(w1);
        work.add(w2);
        work.add(w3);
        work.add(s1);
        work.add(s2);
        work.add(s3);

        double[] hoursWorked = {40.0, 50.0, 40.0};

        for (int week = 0; week < hoursWorked.length; week++) {
            System.out.println("Week " + (week + 1) + ":");
            System.out.println("===========================================");
            for (Worker w : work) {
                w.displayWeeklyPay(hoursWorked[week]);
            }
        }
    }
}