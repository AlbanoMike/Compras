package Entidades;

public class Cliente {

    private String Name;
    private String Email;

    public Cliente() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", Email='" + Email;
    }
}
