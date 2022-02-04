package model;




  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {

    @Id @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String Fname;
    @Column(name ="last_name")
    private String Lname;
    @Column(name ="email")
    private String email;
    @Column(name ="phone")
    private Integer phone;

   


	public Trainer(long id,String fname, String lname, String email, Integer phone) {
		this.id = id;
		this.Fname = fname;
		this.Lname = lname;
		this.email = email;
		this.phone = phone;
	}


	public Trainer(String fname, String lname, String email, Integer phone) {
		super();
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.phone = phone;
	}


	public Trainer() {
    }
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFname() {
        return Fname;
    }
    public void setFname(String fname) {
        Fname = fname;
    }
    public String getLname() {
        return Lname;
    }
    public void setLname(String lname) {
        Lname = lname;
    }
    public String getEmial() {
        return email;
    }
    public void setEmial(String email) {
        this.email = email;
    }
    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }


	@Override
	public String toString() {
		return "Trainer [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", phone=" + phone
				+ "]";
	}

}

