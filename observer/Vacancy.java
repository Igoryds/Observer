package observer;

public class Vacancy {
    private String companyName;
    private int salary;
    private VacancyType vacancyType;


    public Vacancy (String companyName, int salary, VacancyType vacancyType){
        this.companyName = companyName;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }
}
