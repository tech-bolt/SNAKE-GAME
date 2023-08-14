import javax.swing.*;

public class GameFrame extends JFrame{
    GameFrame(){
        setTitle("SNAKE GAME");
        add(new GamePanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        new GameFrame();
    }
}
