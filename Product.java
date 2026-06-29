package sistema_productos;

import java.util.Objects;

public class Product {
    // Atributos privados
    private int id;
    private String name;
    private double price;

    /*
     Constructor, Inicia una nueva instancia de Product
    */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /*
     * Getters y Setters, permiten acceder y modificar los atributos privados de la clase de forma segura
     */
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    /**
     Método showInfo, imprime por consola los datos básicos del producto
     */
    public void showInfo() {
        System.out.println("ID: " + id + " | Producto: " + name + " | Precio: $" + price);
    }

    /**
     Método toString, devuelve una representación en formato texto del objeto
     */
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }

    /**
     Método equals, compara si este producto es exactamente igual a otro objeto
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }
}