package mydavids.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
@Entity
public class Table implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private int tableNumber;
    private int seating;
    private String location;

    public void setId(String id) {
        this.id = id;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getSeating() {
        return seating;
    }

    public String getLocation() {
        return location;
    }

    public Table(){

    }

    private Table(Builder builder){
        this.id = builder.id;
        this.tableNumber = builder.tableNumber;
        this.seating = builder.seating;
        this.location = builder.location;
    }

    public static class Builder{
        private String id;
        private int tableNumber;
        private int seating;
        private String location;

        public Builder id(String val){
            this.id = val;
            return this;
        }

        public Builder tableNumber(int val){
            this.tableNumber = val;
            return this;
        }

        public Builder seating(int val){
            this.seating = val;
            return this;
        }

        public Builder location(String val){
            this.location = val;
            return this;
        }

        public Builder copy(Table val){
            this.id = val.id;
            this.tableNumber = val.tableNumber;
            this.seating = val.seating;
            this.location = val.location;
            return this;
        }

        public Table build(){
            return new Table(this);
        }
    }
}
