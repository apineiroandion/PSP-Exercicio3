public class Main {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("Sistema operativo " + osName);
        String userDir = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo " + userDir);
        System.setProperty("user.dir", "/home/dam");
        userDir = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo cambiado a " + userDir);
        System.setProperty("user.dir", "/tmp");
        userDir = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo cambiado a " + userDir);
    }
}
