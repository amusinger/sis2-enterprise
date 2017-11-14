package cart.beans;

import javax.ejb.Local;

@Local
public interface Cart {
	public void addProduct(String title);
    public void removeProduct(String title);
}
