import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CalcFrame2_new extends JFrame {

    public static void main(String[] args) {
        // Boa prática: iniciar a interface gráfica de forma segura (Thread-Safe)
        SwingUtilities.invokeLater(() -> {
            CalcFrame2 f = new CalcFrame2();
            f.setVisible(true); // O método show() é obsoleto
        });
    }

    public CalcFrame2_new() {
        super("Calculadora");
        setSize(350, 270);
        setLocation(200, 150); 
        
        // Esta única linha substitui toda a interface WindowListener
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}