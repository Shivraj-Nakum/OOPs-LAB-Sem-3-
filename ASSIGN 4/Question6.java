import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Question6 {
    public Question6() {
        JFrame f = new JFrame("Checkbox Example");
        String[] langs = {"WRAP", "PIZZA", "COKE", "TEA"};

        int xDisp = 100, yDisp = 30, width = 75, height = 75;
        ArrayList<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
        for(int i = 0; i < langs.length; i++) {
            checkBoxes.add(new JCheckBox(langs[i], false));
            checkBoxes.get(i).setBounds(xDisp, yDisp, width, height);
            yDisp += 50;
        }

        for(JCheckBox checkBox: checkBoxes)
            f.add(checkBox);
        JButton btn = new JButton("Submit");
        btn.setBounds(xDisp, yDisp + 50, 100, 50);
        
        f.add(btn);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question6();
    }
}