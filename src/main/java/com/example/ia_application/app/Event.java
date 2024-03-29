package com.example.ia_application.app;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Duration duration;

    public Event(){}

    public Event(String name, String description, LocalDate startDate, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = Duration.between(startTime, endTime);
    }

    public Event(String name, String description, LocalDate startDate, LocalTime startTime, Duration duration) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.startTime = startTime;
        this.duration = duration;
        this.endTime = startTime.plus(duration);
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setStartTime(Duration duration) {
        this.startTime = endTime.minus(duration);
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setEndTime(Duration duration) {
        this.endTime = startTime.plus(duration);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setDuration() {
        this.duration = Duration.between(startTime, endTime);
    }

    public void addToDB(){}

    public void  printEvent(){
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Start Date: " + startDate);
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Duration: " + duration);
    }



}
