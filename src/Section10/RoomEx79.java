package src.Section10;

public class RoomEx79 {
    private String name;
    private String email;

    //construtor
    public RoomEx79(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString()
    @Override
    public String toString() {
        return name
                + ", "
                + email;
    }
}
