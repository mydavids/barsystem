package mydavids.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String idNumber;
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    private String accessLevel;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Staff(){

    }

    private Staff(Builder builder){
        this.id = builder.id;
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
        this.accessLevel = builder.accessLevel;
    }

    public static class Builder{
        private Long id;
        private String idNumber;
        private String name;
        private String surname;
        private String password;
        private String accessLevel;

        public Builder id(Long val){
            this.id = val;
            return this;
        }

        public Builder idNumber(String val){
            this.idNumber = val;
            return this;
        }

        public Builder name(String val){
            this.name = val;
            return this;
        }

        public Builder surname(String val){
            this.surname = val;
            return this;
        }

        public Builder password(String val){
            this.password = val;
            return this;
        }

        public Builder accessLevel(String val){
            this.accessLevel = val;
            return this;
        }

        public Builder copy(Staff val){
            this.id = val.id;
            this.idNumber = val.idNumber;
            this.name = val.name;
            this.surname = val.surname;
            this.password = val.password;
            this.accessLevel = val.accessLevel;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }



}
