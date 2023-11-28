public class Employee {
    private boolean isSenior;
    private boolean isPartTime;
    private int monthsInCompany;

    public Employee(boolean isSenior, boolean isPartTime, int monthsInCompany) {
        this.isSenior = isSenior;
        this.isPartTime = isPartTime;
        this.monthsInCompany = monthsInCompany;
    }
    public Employee() {
    }

    public boolean isSenior() {
        return isSenior;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public int getMonthsInCompany() {
        return monthsInCompany;
    }

    public boolean getBonus(Employee employee){
        System.out.println("This program tests if a company's employee will get bonus");
        return employee.isSenior() || (!employee.isPartTime && employee.monthsInCompany>=6);
    }
}
