public class Producto {
    private int id, bin, aisle;
    private String name, categoria;
    private double price;

    public Producto() {
    }

    public Producto(int id, int bin, int aisle, String name, String categoria, double price) {
        this.id = id;
        this.bin = bin;
        this.aisle = aisle;
        this.name = name;
        this.categoria = categoria;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", bin=" + bin + ", aisle=" + aisle + ", name=" + name + ", categoria=" + categoria + ", price=" + price + '}';
    }
   
}
