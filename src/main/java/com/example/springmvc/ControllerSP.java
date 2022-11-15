package com.example.springmvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerSP {

    @Autowired
    private ProductReposit productReposit;

    @GetMapping("/add")
    public String addProduct(Model model) {
        //model.addAttribute("product", new Product());
        return "addProduct";
    }

   @PostMapping("/add")
   public String addSumbit(@ModelAttribute("id") int id,
                           @ModelAttribute("cost") int cost,
                           @ModelAttribute("title") String title,
                           Product product) {
        product.setId(id);
        product.setCost(cost);
        product.setTitle(title);
        productReposit.addToList(product);
        return "addProduct";
   }

   @GetMapping("/all")
   public String showAll(Model model) {
        model.addAttribute("productList", productReposit.getList());
        return "showRepository";

   }

}
