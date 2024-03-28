package observer;

public interface Observer {

    void receiveOffer(Vacancy vacancy);
    VacancyType getProfession();
    boolean isHasAcceptJob();

}
