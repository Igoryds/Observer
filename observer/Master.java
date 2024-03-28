package observer;

public class Master implements Observer{

    private String name;
    private int salary;
    private VacancyType profession;
    private boolean hasAcceptJob;

    public boolean isHasAcceptJob() {
        return hasAcceptJob;
    }

    public VacancyType getProfession() {
        return profession;
    }

    public Master(String name, VacancyType profession){
        this.name = name;
        salary = 50000;
        this.profession = profession;
        hasAcceptJob = false;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!hasAcceptJob) {
            if (this.salary <= vacancy.getSalary() && profession.equals(vacancy.getVacancyType())){
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
                this.salary = vacancy.getSalary();
                hasAcceptJob = true;
            }
            else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
            }
        } else {
            System.out.printf("Специалист %s: Я уже нашел работу!\n",
            name);
        }
    }
        

}
