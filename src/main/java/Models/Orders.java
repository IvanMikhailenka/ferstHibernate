package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 29.07.2016.
 */
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @OneToMany
    @JoinColumn(name = "products_list")
    private List<Product> productsList = new ArrayList<Product>();
    public Orders() {
    }
/**------------------------------------------------------------------------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }
}
