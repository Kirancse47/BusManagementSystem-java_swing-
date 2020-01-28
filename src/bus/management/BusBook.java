/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author KIRAN
 */
@Entity
@Table(name = "bus_book", catalog = "bus_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusBook.findAll", query = "SELECT b FROM BusBook b")
    , @NamedQuery(name = "BusBook.findByBookingId", query = "SELECT b FROM BusBook b WHERE b.bookingId = :bookingId")
    , @NamedQuery(name = "BusBook.findByBookingUser", query = "SELECT b FROM BusBook b WHERE b.bookingUser = :bookingUser")
    , @NamedQuery(name = "BusBook.findByBookingTime", query = "SELECT b FROM BusBook b WHERE b.bookingTime = :bookingTime")
    , @NamedQuery(name = "BusBook.findByJourneyDate", query = "SELECT b FROM BusBook b WHERE b.journeyDate = :journeyDate")
    , @NamedQuery(name = "BusBook.findByBusNo", query = "SELECT b FROM BusBook b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusBook.findBySeat", query = "SELECT b FROM BusBook b WHERE b.seat = :seat")
    , @NamedQuery(name = "BusBook.findByPaid", query = "SELECT b FROM BusBook b WHERE b.paid = :paid")
    , @NamedQuery(name = "BusBook.findByIdNo", query = "SELECT b FROM BusBook b WHERE b.idNo = :idNo")
    , @NamedQuery(name = "BusBook.findByFirstName", query = "SELECT b FROM BusBook b WHERE b.firstName = :firstName")
    , @NamedQuery(name = "BusBook.findByLastName", query = "SELECT b FROM BusBook b WHERE b.lastName = :lastName")})
public class BusBook implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "booking_id")
    private Integer bookingId;
    @Basic(optional = false)
    @Column(name = "booking_user")
    private String bookingUser;
    @Basic(optional = false)
    @Column(name = "booking_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingTime;
    @Basic(optional = false)
    @Column(name = "journey_date")
    private String journeyDate;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "seat")
    private String seat;
    @Basic(optional = false)
    @Column(name = "paid")
    private String paid;
    @Basic(optional = false)
    @Column(name = "id_no")
    private String idNo;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;

    public BusBook() {
    }

    public BusBook(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public BusBook(Integer bookingId, String bookingUser, Date bookingTime, String journeyDate, String busNo, String seat, String paid, String idNo, String firstName, String lastName) {
        this.bookingId = bookingId;
        this.bookingUser = bookingUser;
        this.bookingTime = bookingTime;
        this.journeyDate = journeyDate;
        this.busNo = busNo;
        this.seat = seat;
        this.paid = paid;
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        Integer oldBookingId = this.bookingId;
        this.bookingId = bookingId;
        changeSupport.firePropertyChange("bookingId", oldBookingId, bookingId);
    }

    public String getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(String bookingUser) {
        String oldBookingUser = this.bookingUser;
        this.bookingUser = bookingUser;
        changeSupport.firePropertyChange("bookingUser", oldBookingUser, bookingUser);
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        Date oldBookingTime = this.bookingTime;
        this.bookingTime = bookingTime;
        changeSupport.firePropertyChange("bookingTime", oldBookingTime, bookingTime);
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        String oldJourneyDate = this.journeyDate;
        this.journeyDate = journeyDate;
        changeSupport.firePropertyChange("journeyDate", oldJourneyDate, journeyDate);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        String oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        String oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        String oldIdNo = this.idNo;
        this.idNo = idNo;
        changeSupport.firePropertyChange("idNo", oldIdNo, idNo);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusBook)) {
            return false;
        }
        BusBook other = (BusBook) object;
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.BusBook[ bookingId=" + bookingId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
