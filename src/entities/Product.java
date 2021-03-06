package entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="PRODUCT")
public class Product implements Serializable {
	
private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUCT", nullable = false)
  private int id;

  @Column(name = "DESCRIPTION", nullable = false)
  private String description;
  
  @Column(name = "PRICE", nullable = false)
  private int price;

  public int getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}