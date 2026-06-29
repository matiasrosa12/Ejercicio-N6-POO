package sistema_productos;

import java.util.Objects;

public class FoodProduct extends Product {
    // Atributos específicos
    private String expirationDate;
    private int calories;

    /*
     Constructor, crea un producto alimenticio heredando de Product.
     */
    public FoodProduct(int id, String name, double price, String expirationDate, int calories) {
        super(id, name, price); // Llama al constructor 
        this.expirationDate = expirationDate;
        this.calories = calories;
    }

    // Getters y Setters
    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    /*
     Método showInfo, imprime la información completa del alimento.
     */
    @Override
    public void showInfo() {
        System.out.println("--- DATOS DEL ALIMENTO ---");
        super.showInfo();
        System.out.println("Vence el: " + expirationDate + " | Calorías: " + calories + " kcal");
    }

    @Override
    public String toString() {
        return "FoodProduct{" + "expirationDate='" + expirationDate + '\'' + ", calories=" + calories + "} -> " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Verifica la igualdad de la clase padre
        FoodProduct that = (FoodProduct) o;
        return calories == that.calories && Objects.equals(expirationDate, that.expirationDate);
    }
}