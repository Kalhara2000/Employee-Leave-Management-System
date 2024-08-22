package leave.management.system;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LeaveManagementSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        Loading load = new Loading();
        Login login = new Login();
        load.setVisible(true);

        for (int i = 1; i <= 100; ++i) {
            try {

                Thread.sleep(80);
                Loading.progressBar.setValue(i);
                if (i % 2 == 0) {
                    Loading.wait.setText("Please Wait . . .");
                } else {
                    Loading.wait.setText("Please Wait . . . .");
                }

                if (i == 100) {
                    load.setVisible(false);
                    login.setVisible(true);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(LeaveManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
