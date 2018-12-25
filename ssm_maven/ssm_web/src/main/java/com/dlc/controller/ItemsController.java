package com.dlc.controller;

import com.dlc.domain.Items;
import com.dlc.service.ItemsService;
import com.dlc.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/itemsController")
@SessionAttributes("{item}")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/showItems")
    public String showItems(Model model){
        Items byId = service.findById(1);
        model.addAttribute("item",byId);
        return "itemDetail";
    }
}
