public static void main(String[] arg) {
        System.out.println("Datei-Baum");

        File f = new File("C:\\Users\\TomNB\\Desktop\\Apps\\WhatsBot\\WhatsBot\\");
        File[] l = f.listFiles();

        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i].getPath());
        }
}
