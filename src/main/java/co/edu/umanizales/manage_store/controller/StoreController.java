package co.edu.umanizales.manage_store.controller;

import co.edu.umanizales.manage_store.model.Store;
import co.edu.umanizales.manage_store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path="store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getStores()
    {
        return storeService.getStores();
    }

    @PostMapping
    public String createStore(@RequestBody Store store) {
        storeService.addStore(store);
        return "Tienda agregada";
    }
}
