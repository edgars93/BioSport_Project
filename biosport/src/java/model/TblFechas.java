package model;
// Generated Nov 3, 2016 6:35:21 PM by Hibernate Tools 4.3.1



/**
 * TblFechas generated by hbm2java
 */
public class TblFechas  implements java.io.Serializable {


     private Integer id;
     private String month;
     private String day;
     private String year;
     private String hour;
     private Integer idCita;
     private Integer deleted;

    public TblFechas() {
    }

    public TblFechas(String month, String day, String year, String hour, Integer idCita, Integer deleted) {
       this.month = month;
       this.day = day;
       this.year = year;
       this.hour = hour;
       this.idCita = idCita;
       this.deleted = deleted;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    
    




}


