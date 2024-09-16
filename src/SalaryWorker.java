public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String Title, int YOB, double annualSalary) {
        super(ID, firstName, lastName, Title, YOB, annualSalary);
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    void displayWeeklyPay(double hoursWorked) {
        System.out.println(getFirstName() + " " + getLastName() + ":");
        System.out.println("Weekly Pay: " + calculateWeeklyPay(hoursWorked));
    }
    public String toCSV(){
        String csv = super.toCSV();
        return csv + ", " + annualSalary;
    }
    public String toJSON(){
        String json = super.toJSON();
        String retString = "";
        char DQ = '"';
        retString =  json;
        retString += DQ + "annualSalary" + DQ + ":" + DQ + this.annualSalary + DQ + ",";

        return retString;
    }
    public String toXML(){
        String xml = super.toXML();
        String retString = "";

        retString = xml;
        retString += "<annualSalary>" + this.annualSalary + "</annualSalary>";

        return retString;
    }
}