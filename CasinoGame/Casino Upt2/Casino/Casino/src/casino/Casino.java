package casino;

public class Casino {

    public static void main(String[] args) {

        Login x = new Login();
        x.setVisible(true);
        x.setSize(600, 900);
        x.setLocationRelativeTo(null);

        Login.PassInput.setVisible(false);
        Login.UserInput.setVisible(false);
        Login.UserRegisterInput.setVisible(false);
        Login.RegisterPassInput.setVisible(false);
        Login.CreateAccount.setVisible(false);
        Login.LoginAccount.setVisible(false);
        Login.InvalidRegister.setVisible(false);
        Login.InvalidLogin.setVisible(false);
        Login.Info5.setVisible(false);
        Login.Info2.setVisible(false);
        Login.Info3.setVisible(false);
        Login.Info4.setVisible(false);

    }

}
