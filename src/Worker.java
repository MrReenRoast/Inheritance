public class Worker extends Person {
    private double hourlyPayRate;
    double regularHours = 40.0;
    double overTimeRate = 1.5;

    public Worker(String ID, String firstName, String lastName, String Title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, Title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    double calculateWeeklyPay(double hoursWorked){
        double totalPay = 0.0;
            if (hoursWorked < regularHours) {
                totalPay = hoursWorked * hourlyPayRate;
            } else {
                double overtimeHours = hoursWorked - regularHours;
                totalPay = (regularHours * hourlyPayRate) + (overtimeHours * hourlyPayRate * overTimeRate);
            }
            return totalPay;
    }
    void displayWeeklyPay(double hoursWorked){
        double regularPay, overTimePay = 0.0;
        double overTimeHours = 0.0;

        if (hoursWorked <= regularHours) {
            regularPay = hoursWorked * hourlyPayRate;
        } else {
            regularPay = regularHours * hourlyPayRate;
            overTimeHours = hoursWorked - regularHours;
            overTimePay = overTimeHours * hourlyPayRate * overTimeRate;
        }

        double totalPay = regularPay + overTimePay;

        System.out.println(getFirstName() + " " + getLastName() + ":");
        System.out.println("Hours worked: " + hoursWorked + " " + "Regular Hours: " +  regularHours + " " + "Regular Pay: " + regularPay + " " + "Overtime Hours: " + overTimeHours + " " + "Overtime Pay: " + overTimePay + " "+ "Total Pay: " + totalPay);
    }
    public String toCSV(){
        String csv = super.toCSV();
        return csv + ", " + hourlyPayRate;
    }
    public String toJSON(){
        String json = super.toJSON();
        String retString = "";
        char DQ = '"';
        retString =  json;
        retString += DQ + "hourlyPayRate" + DQ + ":" + DQ + this.hourlyPayRate + DQ + ",";

        return retString;
    }
    public String toXML(){
        String xml = super.toXML();
        String retString = "";

        retString = xml;
        retString += "<hourlyPayRate>" + this.hourlyPayRate + "</hourlyPayRate>";

        return retString;
    }
}