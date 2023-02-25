import java.util.ArrayList;
import java.util.List;

/**
 * Cоздали календарь с дженериком (содержащийся в Tasks)
 * @param <T>
 */
public class Calendar <T extends Tasks>{
    private boolean notification;
    private List<T> task = new ArrayList<>();

    public Calendar(List<T> task) {
        this.task = task;
    }

    public void addTask(T someTask){
        task.add(someTask);
    }

    public void removeTask(T someTask){
        task.remove(someTask);
    }

    /**
     * Функция, позволяющая включить нотификацию у конкретной задачи и уведомить, если до ДДЛ 1 день
     */
    public void notificationON(T obj){
        if (!notification) {
            notification = true;
            if (obj.getDuration() == 1) {
                System.out.println("До ДДЛ остался всего 1 день, поторопись!");
            }
        }
        else {
            notification = false;
        }
    }


    @Override
    public String toString() {
        return "Задача добавлена: " + task;
    }
}
