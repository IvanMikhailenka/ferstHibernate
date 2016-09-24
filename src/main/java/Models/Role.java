package Models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Ivan on 28.07.2016.
 */

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roleSet")
    private Set<User> userSet;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
