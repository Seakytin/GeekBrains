package homework.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToeGraphics {
    static public class Game extends JFrame {
        private static final String DOT_EMPTY = "DOT_EMPTY";
        private static final String DRAW_X = "DRAW_X";
        private static final String DRAW_O = "DRAW_O";
        public Game() {
          //  setBounds(500, 500, 400, 300);
            setSize(500, 500);
            setTitle("Game TicTacToe");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            JButton[] jbs = new JButton[9];
            setLayout(new GridLayout(3, 3));
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                add(createButton());

         //  }
         //  jbs[4] =  new JButton("#" + 1);
         //  add(jbs[4]);

         //  for (int i = 5; i < 8; i++) {
         //      jbs[i] = new JButton("#" + i);
         //      add(createButton());
         //  }
         //  jbs[8] =  new JButton("#" + 2);
         //  add(jbs[8]);

         //  for (int i = 9; i < 12; i++) {
         //          jbs[i] = new JButton("#" + i);
         //          add(createButton());
         //      }
         //  jbs[12] =  new JButton("#" + 3);
         //  add(jbs[12]);

         //  for (int i = 13; i < 16; i++) {
         //          jbs[i] = new JButton("#" + i);
         //          add(createButton());
                }
            setVisible(true);
        }
        private JButton createButton() {
            return new JButton() {
                {
                    setActionCommand(DOT_EMPTY);
                    addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //String action = getActionCommand().equals(DOT_EMPTY) ? DRAW_X : DOT_EMPTY;
                           String action = DOT_EMPTY;
                           if (getActionCommand().equals(DOT_EMPTY) == getActionCommand().equals(DOT_EMPTY)){action=(DRAW_X);}
                            setActionCommand(action);
                        }
                        public void computerTurn() {
                            int rowIndex = 0;
                            int colIndex = 0;
                            Random rand = new Random();
                            do {
                                rowIndex = rand.nextInt();
                                colIndex = rand.nextInt(JButton[]);
                            } while (!isCellValid(rowIndex, colIndex, DOT_O));

                            map[rowIndex][colIndex] = DOT_O;
                        }
                    });
                }
                @Override
                public void paint(Graphics graphics) {
                    super.paint(graphics);

                    if (getActionCommand().equals(DOT_EMPTY)) {
                        graphics.drawRect(0, 0, getWidth(), getWidth());
                        graphics.setColor(Color.GRAY);
                        graphics.fillRect(2, 2, getWidth(), getWidth());
                    }
                    else if (getActionCommand().equals(DRAW_X)){
                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.setStroke(new BasicStroke(10));
                        g2d.setColor(Color.BLUE);
                        g2d.drawLine(2, 2, this.getWidth(), this.getHeight());
                        g2d.drawLine(this.getWidth(), 2,  2, this.getHeight());
                    }
                    else if (getActionCommand().equals(DRAW_O)){
                        graphics.drawRect(0, 0, getWidth(), getWidth());
                        graphics.setColor(Color.RED);
                        graphics.fillRect(2, 2, getWidth(), getWidth());
                    }
                    
                }
            };
        }
    }
    public  static void main(String[] args) {new Game();}
}
