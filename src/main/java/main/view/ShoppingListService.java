package main.view;

import main.model.ShoppingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public List<ShoppingList> getAllList(){
        List<ShoppingList> products = new ArrayList<>();
        shoppingListRepository.findAll().forEach(products::add);
        return  products;
    }

    public void addProduct(ShoppingList shoppingList){
        shoppingListRepository.save(shoppingList);
    }

}
