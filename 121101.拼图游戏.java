


import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    JFrame frame = new JFrame("一个小程序");
    int cell=128;
    int array2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,0},
            {10,11,9}
    };
    //顺序显示图片的矩阵

    //按照map2[][]矩阵来显示
//    int map2[][]={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9},
//            {10,11,12}
//    };
    int count=0;
    //构造方法
    public App() {


        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {

                java.net.URL imgURL = App.class.getResource("img/nezha_"+array2d[row][column]+".png");
                label_list.add(new JLabel());
                label_list.get(count).setIcon(new ImageIcon(imgURL));
                label_list.get(count).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(count));
                count++;
            }
        }



        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);//敲击任意键。
            if(e.getKeyCode()==KeyEvent.VK_UP){
                System.out.printf("下");
                /*更改数组-上移*/
                new Zero().goDown(array2d);
                /*重新添加标签*/
                showMyGame();
                win(array2d);
            }

                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    System.out.printf("右");
                    /*更改数组-上移*/
                    new Zero().goLeft(array2d);
                    showMyGame();
                    win(array2d);
                }

                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    System.out.printf("左");
                    /*更改数组-上移*/
                    new Zero().goRight(array2d);

                    /*重新添加标签*/

                    showMyGame();
                    win(array2d);
                }

                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    System.out.printf("上");
                    /*更改数组-上移*/
                    new Zero().goUp(array2d);
                    showMyGame();
                    win(array2d);
                }

        }
    });
    }

    public void win(int array2d[][]){
        int w=0;
        for (int K = 0; K < array2d.length; K++) {
            for (int L = 0; L < array2d[0].length; L++) {
                if(array2d[K][L]==((K*3)+L)+1){
                    w++;
                }
            }
        }
        if(w==11){
            JOptionPane.showMessageDialog(null,"恭喜通关");
            frame.dispose();
        }
    }

    void showMyGame(){
        //移动矩阵
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(array2d[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
                myPanel.repaint();
            }
        }
    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL999 = App.class.getResource("img/foreground.GIF");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);

        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        myPanel.setFocusable(true);
        //frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}

