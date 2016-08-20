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
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String stockID;
    private String name;
    private double price;
    private int amountInStock;
    private String description;

    public void setId(String id) {
        this.id = id;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getStockID() {
        return stockID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public String getDescription() {
        return description;
    }

    public Stock(){

    }

    private Stock(Builder builder){
        this.id = builder.id;
        this.stockID = builder.stockID;
        this.name = builder.name;
        this.price = builder.price;
        this.amountInStock = builder.amountInStock;
        this.description = builder.description;
    }

    public static class Builder{
        private String id;
        private String stockID;
        private String name;
        private double price;
        private int amountInStock;
        private String description;

        public Builder id(String val){
            this.id = val;
            return this;
        }

        public Builder stockID(String val){
            this.stockID = val;
            return this;
        }

        public Builder name(String val){
            this.name = val;
            return this;
        }

        public Builder price(double val){
            this.price = val;
            return this;
        }

        public Builder amountInStock(int val){
            this.amountInStock = val;
            return this;
        }


        public Builder description(String val){
            this.description = val;
            return this;
        }

        public Builder copy(Stock val){
            this.id = val.id;
            this.stockID = val.stockID;
            this.name = val.name;
            this.price = val.price;
            this.amountInStock = val.amountInStock;
            this.description = val.description;
            return this;
        }

        public Stock build(){
            return new Stock(this);
        }
    }
}
