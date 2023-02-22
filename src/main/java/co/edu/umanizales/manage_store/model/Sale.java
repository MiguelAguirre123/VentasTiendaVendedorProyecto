package co.edu.umanizales.manage_store.model;

import lombok.Data;

@Data
public class Sale {
    private Store store;
    private Seller vendor;
    private int quantity;
}
