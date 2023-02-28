package co.edu.umanizales.manage_store.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sale {
    private Store store;
    private Seller vendor;
    private int quantity;
}
