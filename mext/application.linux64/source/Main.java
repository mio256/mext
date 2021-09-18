import javax.swing.*;

class Main {

    public static void main(String args[]) {

        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 閉じるボタンで終了
        frame.setBounds(1920 / 2, 1080 / 2, 1080 / 4, 1920 / 6); // X位置 Y位置 X幅 Y幅
        frame.setTitle("mext"); // タイトル
        frame.setVisible(true); // 可視化

    }

}
