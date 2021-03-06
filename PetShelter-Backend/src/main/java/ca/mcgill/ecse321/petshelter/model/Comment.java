package ca.mcgill.ecse321.petshelter.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Comment {
	private Date datePosted;

	public void setDatePosted(Date value) {
		this.datePosted = value;
	}

	public Date getDatePosted() {
		return this.datePosted;
	}

	private long id;

	public void setId(long value) {
		this.id = value;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return this.id;
	}

	private String text;

	public void setText(String value) {
		this.text = value;
	}

	public String getText() {
		return this.text;
	}
    
    private Time time;
    
    public void setTime(Time value) {
        this.time = value;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    private User user;
    
    @ManyToOne
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Override
    public String toString() {
        return "Comment{" +
                "datePosted=" + datePosted +
                ", id=" + id +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", user=" + user +
                '}';
    }
}
