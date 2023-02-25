public class Tasks {
    private String name;
    private String date;
    private double duration;
    private boolean personal;
    private boolean priority;
    private Employee responsible;

    /**
     *
     * @param name название задачи
     * @param date дата начала задачи
     * @param duration длительность задачи
     * @param personal булевая переменная: личная / рабочая задача
     * @param priority булевая переменная: приоритетная / не приоритетная
     * @param responsible ответственный (из класса Employee)
     */
    public Tasks(String name, String date, double duration, boolean personal, boolean priority, Employee responsible) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.personal = personal;
        this.priority = priority;
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Название задачи: " + name +
                ", дата начала задачи: " + date +
                ", длительность задачи: " + duration +
                ", личная задача: " + personal +
                ", приоритетная задача: " + priority +
                ", ответственный за задачу: " + responsible;
    }

    public String getName(){
        return name;
    }

    public void setName(String nameSet){
        this.name = nameSet;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String dateSet){
        this.date = dateSet;
    }

    public double getDuration(){
        return duration;
    }

    public void setDuration(double durationSet){
        this.duration = durationSet;
    }

    public boolean getPersonal(){
        return personal;
    }

    public void setPersonal(boolean personalSet){
        this.personal = personalSet;
    }

    public boolean getPriority(){
        return priority;
    }

    public void setPriority(boolean prioritySet){
        this.priority = prioritySet;
    }

    public Employee getResponsible(){
        return responsible;
    }

    public void setResponsible(Employee responsibleSet){
        this.responsible = responsibleSet;
    }

}
