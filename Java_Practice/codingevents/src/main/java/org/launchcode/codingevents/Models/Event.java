package org.launchcode.codingevents.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;



@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;
    private static int nextId = 1;

    @NotBlank(message="Name is required")
    @Size(min = 3, max = 50, message="Name must be between 3 and 50 characters.")
    private String name;
    @Size(max=500, message="Description too long. Please use 500 characters or less.")
    private String description;

    @NotBlank(message="Email is required.")
    @Email(message="Please format this like an actual email.")
    private String contactEmail;

    @NotBlank(message="Please specify a location for your event which is not the ether.")
    private String eventLocation;
    private boolean registrationRequirement = true;
    @Min(1)
    private int numberOfAttendees;
    private EventType type;


    public Event(String name, String description, String contactEmail, EventType type, String eventLocation, boolean registrationRequirement, int numberOfAttendees) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
        this.eventLocation = eventLocation;
        this.registrationRequirement = registrationRequirement;
        this.numberOfAttendees = numberOfAttendees;
    }

    public Event(){}

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public boolean isRegistrationRequirement() {
        return registrationRequirement;
    }

    public void setRegistrationRequirement(boolean registrationRequirement) {
        this.registrationRequirement = registrationRequirement;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
