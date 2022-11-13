package intro;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class intro extends JFrame{
    JScrollPane scrollPane;
    ImageIcon icon;

    public intro() {
        icon = new ImageIcon("src/이미지/intro.png");

        //배경 Panel 생성후 컨텐츠페인으로 지정
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };

        JButton button = new JButton("버튼");
        button.setLocation(400,300);
        background.add(button);
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }

    public static void main(String[] args) {
        intro frame = new intro();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 360);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
