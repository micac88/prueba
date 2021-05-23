public class Paola {
    public int edad;
    public String apellido;

    public Paola() {
    }

    public Paola(int edad, String apellido) {
        this.edad = edad+1;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
