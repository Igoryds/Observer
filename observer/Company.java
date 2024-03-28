package observer;

import java.util.Random;

public class Company{

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(VacancyType vacancyType){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(name, salary, vacancyType);
        jobAgency.sendOffer(vacancy);
    }

}
