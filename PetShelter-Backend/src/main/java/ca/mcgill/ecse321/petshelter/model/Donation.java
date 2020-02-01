package ca.mcgill.ecse321.petshelter.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author louis
 *
 */
@Entity
public class Donation{
   private double amount;

public void setAmount(double value) {
    this.amount = value;
}
public double getAmount() {
    return this.amount;
}
private long id;

public void setId(long value) {
    this.id = value;
}
@Id
public long getId() {
    return this.id;
}
private Date date;

public void setDate(Date value) {
    this.date = value;
}
public Date getDate() {
    return this.date;
}
private User user;

@ManyToOne
public User getUser() {
   return this.user;
}

public void setUser(User user) {
   this.user = user;
}

private Time time;

public void setTime(Time value) {
    this.time = value;
}
public Time getTime() {
    return this.time;
}
}