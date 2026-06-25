package atividadetriangulo;
public class AtividadeTriangulo {

    public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new TelaTriangulo().setVisible(true);
        }
    });

}
}