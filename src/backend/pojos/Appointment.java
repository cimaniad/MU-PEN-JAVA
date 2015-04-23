/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.pojos;

import java.util.Date;

/**
 *
 * @author jorge
 */
public class Appointment {
    
    private int idAppointment;
    private int idPatient;
    private int idHealthProfessional;
    private Date date;
    private String hour;
    private boolean okay;
    private String description;

    public Appointment() {
    }

    public Appointment(int idAppointment, int idPatient, int idHealthProfessional, Date date, String hour, boolean okay, String description) {
        this.idAppointment = idAppointment;
        this.idPatient = idPatient;
        this.idHealthProfessional = idHealthProfessional;
        this.date = date;
        this.hour = hour;
        this.okay = okay;
        this.description = description;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    

    public int getIdPatient() {
        return idPatient;
    }

    

    public int getIdHealthProfessional() {
        return idHealthProfessional;
    }

    public void setIdHealthProfessional(int idHealthProfessional) {
        this.idHealthProfessional = idHealthProfessional;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean getOkay() {
        return okay;
    }

    public void setOkay(boolean okay) {
        this.okay = okay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Appointment{" + "idAppointment=" + idAppointment + ", idPatient=" + idPatient + ", idHealthProfessional=" + idHealthProfessional + ", date=" + date + ", hour=" + hour + ", okay=" + okay + ", description=" + description + '}';
    }
    
    
    
}
