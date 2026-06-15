public class UsuarioService {
    
    public static void validarUsuario(int edad) throws Exception {

        validarEdad(edad);
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 18) {
            throw new EdadInvalidaException("Error: Debe ser mayor de edad. ");
        }
    }
}
