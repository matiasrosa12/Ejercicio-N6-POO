package sistema_productos;

import java.util.Objects;

public class ElectronicProduct extends Product {
    // Atributos específicos
    private String brand;
    private int warrantyMonths;

    /*
     Constructor, construye un producto electrónico
     */
    public ElectronicProduct(int id, String name, double price, String brand, int warrantyMonths) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    // Getters y Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }

    /**
     * Método showInfo, muestra en pantalla los detalles del equipo
     */
    @Override
    public void showInfo() {
        System.out.println("--- DATOS DEL ELECTRÓNICO ---");
        super.showInfo();
        System.out.println("Marca: " + brand + " | Garantía: " + warrantyMonths + " meses");
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" + "brand='" + brand + '\'' + ", warrantyMonths=" + warrantyMonths + "} -> " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectronicProduct that = (ElectronicProduct) o;
        return warrantyMonths == that.warrantyMonths && Objects.equals(brand, that.brand);
    }
}