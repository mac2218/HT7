public class Dictionary {
    private Node root;

    public Dictionary() {
        root = null;
    }

    // Método para insertar un nodo
    public void insert(String english, String spanish, String french) {
        root = insertRec(root, english, spanish, french);
    }

    private Node insertRec(Node root, String english, String spanish, String french) {
        if (root == null) {
            root = new Node(english, spanish, french);
            return root;
        }

        if (english.compareTo(root.english) < 0) {
            root.left = insertRec(root.left, english, spanish, french);
        } else if (english.compareTo(root.english) > 0) {
            root.right = insertRec(root.right, english, spanish, french);
        }

        return root;
    }

    // Método para buscar una palabra en inglés y devolver las traducciones
    public String[] search(String english) {
        Node result = searchRec(root, english);
        if (result != null) {
            return new String[]{result.spanish, result.french};
        }
        return null;
    }

    private Node searchRec(Node root, String english) {
        if (root == null || root.english.equals(english)) {
            return root;
        }

        if (english.compareTo(root.english) < 0) {
            return searchRec(root.left, english);
        } else {
            return searchRec(root.right, english);
        }
    }

    // Método para eliminar un nodo
    public void delete(String english) {
        root = deleteRec(root, english);
    }

    private Node deleteRec(Node root, String english) {
        if (root == null) {
            return root;
        }

        if (english.compareTo(root.english) < 0) {
            root.left = deleteRec(root.left, english);
        } else if (english.compareTo(root.english) > 0) {
            root.right = deleteRec(root.right, english);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.english = minValue(root.right);
            root.right = deleteRec(root.right, root.english);
        }

        return root;
    }

    private String minValue(Node root) {
        String minValue = root.english;
        while (root.left != null) {
            minValue = root.left.english;
            root = root.left;
        }
        return minValue;
    }
}

