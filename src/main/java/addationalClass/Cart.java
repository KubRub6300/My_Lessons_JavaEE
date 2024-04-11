package addationalClass;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartContents = new HashMap<>();

    public void putOnCart(Product product, int count){
        cartContents.put(product,count);
    }

    public Map<Product,Integer> getCartContent(){
        return cartContents;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartContents=" + cartContents +
                '}';
    }
}
