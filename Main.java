public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Insertar palabras en el diccionario
        dictionary.insert("hello", "hola", "bonjour");
        dictionary.insert("goodbye", "adiós", "au revoir");
        dictionary.insert("house", "casa", "loger");
        dictionary.insert("dog", "perro", "chien");
        dictionary.insert("homework", "tarea", "devoirs");
        dictionary.insert("woman", "mujer", "femme");
        dictionary.insert("town", "pueblo", "ville");
        dictionary.insert("yes", "si", "Oui");

        // Buscar traducciones
        String[] translations = dictionary.search("hello");
        if (translations != null) {
            System.out.println("Spanish: " + translations[0] + ", French: " + translations[1]);
        } else {
            System.out.println("Palabra no encontrada");
        }

        // Eliminar una palabra
        dictionary.delete("goodbye");
    }
}
