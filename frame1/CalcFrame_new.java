import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CalcFrame_new extends JFrame {
    
    // Construtor
    public CalcFrame_new () {
        super("Calculadora");
        setSize(350, 270);
        setLocation(200, 150);
        
      // Comando essencial: garante que o programa seja totalmente encerrado ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Boa prática: iniciar a interface gráfica na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            CalcFrame_new f = new CalcFrame_new ();
            f.setVisible(true);
        });
    }
}
