package sistema_productos;

public class Program {

    public static void main(String[] args) {
        
        // Se instancian los objetos con datos de prueba
        FoodProduct sweet = new FoodProduct(101, "Alfajor Don Luigi", 12000.00, "15/08/2026", 450);
        ElectronicProduct watch = new ElectronicProduct(205, "Reloj Garmin 165", 350000.00, "Garmin", 12);
        
        // Prueba del método showInfo()
        System.out.println("=== PRUEBA DE INFORMACIÓN ===");
        sweet.showInfo();
        System.out.println();
        watch.showInfo();
        
        // Prueba del método toString
        System.out.println("\n=== PRUEBA DE TOSTRING ===");
        System.out.println(sweet.toString());
        System.out.println(watch.toString());
        
        // Prueba del método equals
        System.out.println("\n=== PRUEBA DE EQUALS ===");
        FoodProduct anotherSweet = new FoodProduct(101, "Alfajor Don Luigi", 12000.00, "15/08/2026", 450);
        
        System.out.println("¿El Alfajor es igual al Reloj? -> " + sweet.equals(watch)); // Tiene que dar false
        System.out.println("¿El Alfajor es igual a la otra instancia del Alfajor? -> " + sweet.equals(anotherSweet)); // Tiene que dar true
    }
}