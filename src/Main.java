import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Добавила несколько сотрудников, чтобы в дальнейшем в задачах обозначать ответственного
         * Добавила дженерик по id (чтобы можно было указать разный тип данных)
         */
        Employee<Integer> kazakov = new Employee<>(1,"Казаков Виталий", 25, "курьер", 5);
        Employee<String> turina = new Employee<>("num","Турина Татьяна", 33, "бухгалтер", 10);
        Employee<Integer> mitin = new Employee<>(345, "Митин Матвей", 43, "проектный менеджер", 14);
        Employee<String> sivkina = new Employee<>("num2", "Сивкина Кира", 30, "операционный директор", 7);


        /**
         * Создала несколько объектов классов Visit и Meetings
         */

        Visit visit1 = new Visit("Отпуск", "12.02.2023", 80, true, true, kazakov, "Шри-Ланка", "самолёт");
        Visit visit2 = new Visit("Командировка", "15.02.2023",56, false, true, turina, "Смоленск", "поезд");
        Visit visit3 = new Visit("Форум", "7.02.2023", 112, false, false, mitin, "Санкт-Петербург", "машина");

        Meetings meetings1 = new Meetings("Планёрка", "12.02.2023", 2, false, false, sivkina, true);
        Meetings meetings2 = new Meetings("Собеседование", "21.01.2023", 1.5, true, true, null, false);
        Meetings meetings3 = new Meetings("Поход к врачу", "16.02.2023", 1, true, false, null, true);


        /**
         * Создали календарь и добавили туда задачи
         */
        Calendar<Tasks> calendar = new Calendar<>(new ArrayList<>());
        calendar.addTask(visit1);
        calendar.addTask(meetings1);
        calendar.addTask(visit2);
        calendar.addTask(meetings2);
        calendar.addTask(visit3);
        calendar.addTask(meetings3);

        System.out.println(calendar);

        /**
         * Вызвали нотификацию для задачи
         */
        calendar.notificationON(meetings3);






    }
}