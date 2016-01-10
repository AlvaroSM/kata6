package kata6;

public class Person {
    
    private final int id;
    private final String name;
    private final String mail;
    private final float peso;
    private final String genero;

    public Person(int id, String name, String mail, float peso, String genero) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.peso = peso;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public float getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }
    
    
}
