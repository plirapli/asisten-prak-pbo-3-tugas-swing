package tugas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author rafli
 */
public class LoginPage extends JFrame {
    JLabel header = new JLabel("Selamat Datang!");
    JLabel subheader = new JLabel("Silakan masuk untuk melanjutkan.");
    JLabel labelUsername = new JLabel("Username");
    JLabel labelPassword = new JLabel("Password");
    JLabel labelJenisKelamin = new JLabel("Jenis Kelamin");
    
    JTextField inputUsername = new JTextField();
    JTextField inputPassword = new JTextField();
    
    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
    
    JButton tombolLogin = new JButton("Login");
            
    LoginPage() {
        setVisible(true);
        setSize(480, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(subheader);
        add(labelUsername);
        add(labelPassword);
        add(labelJenisKelamin);
        add(inputUsername);
        add(inputPassword);
        add(pilihLaki);
        add(pilihPerempuan);
        add(tombolLogin);
        
        header.setFont (header.getFont().deriveFont (20.0f));
        header.setBounds(20, 20, 440, 24);
        subheader.setBounds(20, 50, 440, 12);
        
        labelUsername.setBounds(20, 84, 440, 12);
        inputUsername.setBounds(18, 100, 440, 32);
        
        labelPassword.setBounds(20, 150, 440, 12);
        inputPassword.setBounds(18, 166, 440, 32);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
        
        labelJenisKelamin.setBounds(20, 216, 440, 12);
        
        pilihLaki.setBounds(14, 232, 128, 32);
        pilihPerempuan.setBounds(224, 232, 128, 32);
        
        tombolLogin.setBounds(14, 280, 452, 36);
    }
}
