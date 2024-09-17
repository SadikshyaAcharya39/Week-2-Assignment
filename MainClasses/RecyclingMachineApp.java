package MainClasses;

import javax.swing.*;

    // Main class to run the program
    public class RecyclingMachineApp {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CustomerPanel().setVisible(true);
                }
            });
        }
    }

