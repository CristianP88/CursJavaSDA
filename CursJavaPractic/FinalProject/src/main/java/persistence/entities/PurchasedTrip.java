package persistence.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "purchased_trips")
public class PurchasedTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "trips_id")
    private Trip trip;

    @Column(name = "date_of_purchase")
    private Date dateOfPurchase;

    @Column(name = "total_price")
    private double totalPrice;



    public PurchasedTrip() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}