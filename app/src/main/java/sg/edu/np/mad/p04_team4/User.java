package sg.edu.np.mad.p04_team4;
import java.io.Serializable;
public class User implements Serializable{
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public User_events events;
    public User(){}

    public User(String name, String description, int id, boolean followed,User_events events) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
        this.events = events;

    }
    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
        this.events = new User_events(true,true,true);


    }
}