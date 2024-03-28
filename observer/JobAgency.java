package observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(Vacancy vacancy){


        for (Observer observer : observers){
            if (vacancy.getVacancyType().equals(observer.getProfession())) {
                observer.receiveOffer(vacancy);
            }
            

        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer.isHasAcceptJob()) {
            observers.remove(observer); 
        }

    }

}
