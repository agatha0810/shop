package pl.akademiakodu.shop;

// Product.java, to jest Klasa, nie obiekt!:)
public class Product {
    // zo zawiera produkt
    // pola klasy:

    // dla każdej zmiennej jakiego jest ona typu
    private String name; // nazwa produktu

    private String description; // opis produktu

    // konstuktor 2 argumentowy
    public Product(String name, String description) {
        this.name = name; // this.name to name u góry
        // name to nazwa z argumentu konstruktora
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
