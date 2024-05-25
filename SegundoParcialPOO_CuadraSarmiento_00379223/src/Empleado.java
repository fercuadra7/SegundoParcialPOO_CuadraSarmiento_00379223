public class Empleado {

    String ID;
    String name;
    String apellido;
    int age;

    public Empleado(String ID, String name, String apellido, int age) {
        this.ID = ID;
        this.name = name;
        this.apellido = apellido;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
