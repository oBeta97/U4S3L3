package U4S3L3.entities;

import U4S3L3.enums.EventType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, name = "event_dt")
    private LocalDate eventDt;
    private String description;
    @Column(nullable = false, name = "event_type")
    private EventType eventType;
    @Column(nullable = false, name = "nr_max_partecipants")
    private int nrMaxPartecipants;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Event() {}

    public Event(String title, LocalDate eventDt, String description, EventType eventType, int nrMaxPartecipants, Location location) {
        this.title = title;
        this.eventDt = eventDt;
        this.description = description;
        this.eventType = eventType;
        this.nrMaxPartecipants = nrMaxPartecipants;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDt() {
        return eventDt;
    }

    public void setEventDt(LocalDate eventDt) {
        this.eventDt = eventDt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getNrMaxPartecipants() {
        return nrMaxPartecipants;
    }

    public void setNrMaxPartecipants(int nrMaxPartecipants) {
        this.nrMaxPartecipants = nrMaxPartecipants;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
