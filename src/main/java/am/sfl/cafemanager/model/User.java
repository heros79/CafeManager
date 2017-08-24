package am.sfl.cafemanager.model;


import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean Object that represents User (Manager or Witer)
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Entity
@Table(name = "users")
public class User {

    public enum Role {
        ROLE_USER, ROLE_ADMIN
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String passwordHash;

    @Column(name = "role")
    private Role role;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL)
    private Set<TableC> tableCSet;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<TableC> getTableCSet() {
        return tableCSet;
    }

    public void setTableCSet(Set<TableC> tableCSet) {
        this.tableCSet = tableCSet;
    }

}
