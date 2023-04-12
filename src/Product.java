public class Product  implements Comparable{
    private String nametoy;

    public Product(String nametoy) {
        this.nametoy = nametoy;


    }

    public Product() {
    }

    public String getNametoy() {
        return nametoy;
    }

    public void setNametoy(String nametoy) {
        this.nametoy = nametoy;

    }

    @Override
    public String toString() {
        return "Product{" +
                "nametoy='" + nametoy + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



