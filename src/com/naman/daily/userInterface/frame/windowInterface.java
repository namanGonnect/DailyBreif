package com.naman.daily.userInterface.frame;

import javax.swing.*;
import java.awt.*;
import com.naman.daily.userInterface.colors.*;
import com.naman.daily.userInterface.visibility.onStart;

/**
 * @author unknown
 */
public class windowInterface extends JFrame {

    public windowInterface() {
        initComponents();
    }

    public JMenuBar getMenuBarMain() {
        return menuBarMain;
    }

    public JTextArea getTextAreaMain() {
        return textAreaMain;
    }

    public JMenu getRefreshButton() {
        return refreshButton;
    }

    public JMenu getMenuTodo() {
        return menuTodo;
    }

    public JMenuItem getShowTodoItem() {
        return showTodoItem;
    }

    public JMenu getMenuSchedule() {
        return menuSchedule;
    }

    public JMenuItem getShowScheduleItem() {
        return showScheduleItem;
    }

    public JMenu getMenuDaily() {
        return menuDaily;
    }

    public JMenuItem getShowTimeItem() {
        return showTimeItem;
    }

    public JMenuItem getShowObjectiveItem() {
        return showObjectiveItem;
    }

    public JMenuItem getShowTimetableItem() {
        return showTimetableItem;
    }

    public JLabel getAppName() {
        return appName;
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public JMenuItem getRefreshManWindowItem() {
        return refreshManWindowItem;
    }

    public void setMainFrame(String appName, Font font, windowInterface ui) {

        this.setJMenuBar(menuBarMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(appName);
        this.setFont(font);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.getAppName().setFont(font);
        this.getContentPane().add(getAppName());
        this.setVisible(true);

        //color setter object
        darkModeSetter darkModeSetter = new darkModeSetter();

        darkModeSetter.setColorMenuBar(getMenuBarMain());
        darkModeSetter.setColorTextArea(getTextAreaMain());
        darkModeSetter.setColorLabel(getAppName());
        darkModeSetter.setColorFrame(getMainFrame());

        this.add(getTextAreaMain());
        getTextAreaMain().setSize(500, 200);

        //Visibility Controller
        onStart onStart = new onStart();
        onStart.visibilityOnStart(ui);

        ui.getTextAreaMain().setVisible(true);
        getTextAreaMain().append("\n" + "\n" + "\n" + "\n" + getAppName().getText());
        getTextAreaMain().setFont(font);

        this.pack();
        this.setSize(1100, 900);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        mainFrame = new JFrame();
        menuBarMain = new JMenuBar();
        menuTodo = new JMenu();
        showTodoItem = new JMenuItem();
        menuSchedule = new JMenu();
        showScheduleItem = new JMenuItem();
        menuDaily = new JMenu();
        showTimeItem = new JMenuItem();
        showObjectiveItem = new JMenuItem();
        showTimetableItem = new JMenuItem();
        refreshButton = new JMenu();
        refreshManWindowItem = new JMenuItem();
        appName = new JLabel();
        textAreaMain = new JTextArea();

        //======== mainFrame ========
        {
            var mainFrameContentPane = mainFrame.getContentPane();

            //======== menuBarMain ========
            {

                //======== menuTodo ========
                {
                    menuTodo.setText("TODO");

                    //---- showTodoItem ----
                    showTodoItem.setText("Show");
                    menuTodo.add(showTodoItem);
                }
                menuBarMain.add(menuTodo);

                //======== menuSchedule ========
                {
                    menuSchedule.setText("Schedule");

                    //---- showScheduleItem ----
                    showScheduleItem.setText("Show - Coming Soon");
                    menuSchedule.add(showScheduleItem);
                }
                menuBarMain.add(menuSchedule);

                //======== menuDaily ========
                {
                    menuDaily.setText("Breif");

                    //---- showTimeItem ----
                    showTimeItem.setText("Time");
                    menuDaily.add(showTimeItem);

                    //---- showObjectiveItem ----
                    showObjectiveItem.setText("Objective");
                    menuDaily.add(showObjectiveItem);

                    //---- showTimetableItem ----
                    showTimetableItem.setText("Time-Table");
                    menuDaily.add(showTimetableItem);
                }
                menuBarMain.add(menuDaily);

                //======== refreshButton ========
                {
                    refreshButton.setText("Refresh");

                    //---- refreshManWindowItem ----
                    refreshManWindowItem.setText("Refresh Window");
                    refreshButton.add(refreshManWindowItem);
                }
                menuBarMain.add(refreshButton);
            }
            mainFrame.setJMenuBar(menuBarMain);

            //---- appName ----
            appName.setText("Daily Breif");

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainFrameContentPaneLayout.createParallelGroup()
                            .addComponent(appName, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAreaMain, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(appName, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAreaMain, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
            );
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame mainFrame;
    private JMenuBar menuBarMain;
    private JMenu menuTodo;
    private JMenuItem showTodoItem;
    private JMenu menuSchedule;
    private JMenuItem showScheduleItem;
    private JMenu menuDaily;
    private JMenuItem showTimeItem;
    private JMenuItem showObjectiveItem;
    private JMenuItem showTimetableItem;
    private JMenu refreshButton;
    private JMenuItem refreshManWindowItem;
    private JLabel appName;
    private JTextArea textAreaMain;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
