import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Os estoy enseñando a copiar bien");
    frame.setSize(300, 300);
    frame.setLocation(5, 5);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("En tiempo real", SwingConstants.CENTER);
    frame.add(label);

    frame.show();
  }
}