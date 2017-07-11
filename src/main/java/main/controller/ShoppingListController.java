package main.controller;

import main.model.ShoppingList;
import main.view.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    @RequestMapping("/products")
    public List<ShoppingList> getAllList(){
        return shoppingListService.getAllList();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add-product", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public void addProduct(@RequestBody @RequestParam("name") String name, ShoppingList shoppingList){

        shoppingListService.addProduct(shoppingList);

    }

}
