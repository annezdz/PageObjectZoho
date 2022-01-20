package memoriasArraysListas.entities;

public class Aluguel {
    public String name;
    public String email;
    public int room;

    public Aluguel(String name, String email, int room) {
        this.name = name;
        this.email = email;
        setRoom(room);
    }

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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        if(room >= 0 && room <= 9) {
            this.room = room;
        } else {
            System.out.println("Escolha um quarto de 0 a 9.");
        }
    }

    @Override
    public String toString() {
        return "Busy rooms :" + room + ": " + name + " , " + email;
    }
}
