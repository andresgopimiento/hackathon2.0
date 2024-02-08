public class AgendaContactos {
    //Acá dejaré los contactos almacenados como un arrray

    //Declaro el array dónde almacenaré los contactos
    private Contacto[] contactos;

    //SOBRECARGA DE MÉTODOS:

    //Métod definido con capacidad fija:
    public AgendaContactos() {
        this.contactos = new Contacto[10];
    }


    //Método para definir una capacidad:
    public AgendaContactos(int capacidad) {
        this.contactos = new Contacto[capacidad];
    }

    public void anadirContacto(Contacto x) {

        boolean encontrado = false;

        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] == null) {
                contactos[i] = x;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Contacto añadido");
        } else {
            System.out.println("No se puede añadir");
        }
    }

    public boolean existeContacto(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            Contacto x;
            if (contactos[i] == null && contacto.equals(contactos[i])) {
                return true;

            }
        }
        return false;
    }

    public void listarContactos() {
        for (int i=0;i< contactos.length;i++) {

        }
    }
}