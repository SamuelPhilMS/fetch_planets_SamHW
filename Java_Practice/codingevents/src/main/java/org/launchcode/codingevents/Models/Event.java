package org.launchcode.codingevents.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



@Entity
public class Event extends AbstractEntity {

   private static int nextId = 1;
    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
   private EventDetails eventDetails;

    @NotBlank(message="Name is required")
    @Size(min = 3, max = 50, message="Name must be between 3 and 50 characters.")
    private String name;

    @NotBlank(message="Please specify a location for your event which is not the ether.")
    private String eventLocation;
    private boolean registrationRequirement = true;
    @Min(1)
    private int numberOfAttendees;
    @ManyToOne
    @NotNull(message="Event must be in one category.")
    private EventCategory eventCategory;

    @ManyToMany
    private final List<Tag> tags = new ArrayList<>();


    public Event(String name, String description, String contactEmail, EventCategory eventCategory, String eventLocation, boolean registrationRequirement, int numberOfAttendees) {
        this.name = name;
        this.eventCategory = eventCategory;
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

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void addTag(Tag tag){
        this.tags.add(tag);
    }

    @Override
    public String toString() {
        return name;
    }
}
