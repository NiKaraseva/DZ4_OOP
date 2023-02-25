import java.util.ArrayList;
import java.util.List;


public class Employee<S> {

    private S id;
    String name;
    int age;
    String post;
    int experience;

    /**
     *
     * @param id добавила дженерик по id
     * @param name имя сотрудника
     * @param age возраст сотрудника
     * @param post должность сотрудника
     * @param experience опыт
     */
    public Employee(S id, String name, int age, String post, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.post = post;
        this.experience = experience;
    }


    @Override
    public String toString() {
        return name;

    }

    public String getName(){
        return name;
    }

    public void setName(String nameSet){
        this.name = nameSet;
    }

    public S getId(){
        return id;
    }

    public void setId(S idSet){
        this.id = idSet;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int ageSet){
        this.age = ageSet;
    }

    public String getPost(){
        return post;
    }

    public void setPost(String postSet){
        this.post = postSet;
    }

    public int getExperience(){
        return experience;
    }

    public void setExperience(int experienceSet){
        this.experience = experienceSet;
    }
}
