import javax.swing.*;

public class arraykap11 {
    public static void main(String[] args) {
String s = JOptionPane.showInputDialog("How many have taken this test?");
int n = Integer.parseInt(s);
String [] namn = new String [n];
double [] pris = new double [n];
for (int i=0; i<n; i++) {
    namn[i] = JOptionPane.showInputDialog("Name person number " + (1+i) + "?");
    s = JOptionPane.showInputDialog("Score on the test for " + namn[i] + "?");
    pris[i] = Double.parseDouble(s);
}
int worst = 0;
for (int i=1; i<n; i++)
    if (pris[i] < pris[worst]) {
        worst = i;
    }
    JOptionPane.showMessageDialog(null, namn[worst] + " was the worst at the test. \n" + "Score: " + pris[worst] + " poäng.");
    }
}
