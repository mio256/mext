import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {

    JTextArea textArea;
    String enterButtonString = "to txt";

    MainFrame() {

        // アイコン設定
        ImageIcon icon = new ImageIcon("./icon.png");
        setIconImage(icon.getImage());

        // メモ テキストエリア
        JPanel textAreaPanel = new JPanel();
        textArea = new JTextArea(20, 25);
        textAreaPanel.add(textArea);

        // 決定 ボタン
        JPanel enterButtonPanel = new JPanel();
        JButton enterButton = new JButton(enterButtonString);
        enterButton.addActionListener(this); // Action
        enterButtonPanel.add(enterButton);

        // ペイン
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS)); // 縦一列に並べる
        Container contentPane = getContentPane();
        contentPane.add(textAreaPanel, BorderLayout.CENTER);
        contentPane.add(enterButtonPanel, BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e) { // Action

        String cmd = e.getActionCommand();
        // System.out.println(cmd);

        if (cmd.equals(enterButtonString)) { // enterButton
            cmdEnterButton();
        }

    }

    public void cmdEnterButton() {

        String str = textArea.getText();
        // System.out.println(str);
        SaveText saveText = new SaveText();

        saveText.put(str);
        saveText.save();

    }

}
