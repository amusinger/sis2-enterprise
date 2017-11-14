package entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ORDER")
public class Order implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ORDER", nullable = false)
  private int id;

  @Column(name = "USER_ID", nullable = false)
  private int userID;
  
  @Column(name = "PRODUCT_ID", nullable = false)
  private int productID;

  public int getId() {
    return id;
  }

  public int getuserID() {
    return userID;
  }

  public void setuserID(int userID) {
    this.userID = userID;
  }
  public int getProductID() {
	    return productID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

}