package model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    public Admin(String fullName, String email, String passWord) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = passWord;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  Admin() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmial() {
        return email;
    }

    public void setEmial(String email) {
        this.email  = email;
    }

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + "]";
	}


}
