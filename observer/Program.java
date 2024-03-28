package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();     
        
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        // Student student = new Student("Student #1");
        Master master1 = new Master("Master #1", VacancyType.Manadger);
        Master master2 = new Master("Master #2", VacancyType.ITSpecialist);
        Engineer engineer1 = new Engineer("Engineer #1", VacancyType.ITSpecialist);

        publisher.registerObserver(engineer1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        // publisher.registerObserver(student);
    
        for (int i = 0; i < 3; i++){
            publisher.removeObserver(engineer1);
            publisher.removeObserver(master1);
            publisher.removeObserver(master2);
            google.needEmployee(VacancyType.ITSpecialist);
            yandex.needEmployee(VacancyType.Manadger);
            geekBrains.needEmployee(VacancyType.Cleaner);
        }
    }

}
