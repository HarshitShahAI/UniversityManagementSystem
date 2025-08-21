package university;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendanceDetail extends JFrame implements ActionListener {

    JTable j1;
    JButton b1;
    String h[] = {"Employee ID", "Date", "First Half", "Second Half"};
    String d[][] = new String[15][4];
    int i = 0, j = 0;

    TeacherAttendanceDetail() {
        super("View Teacher Attendance");
        setSize(800, 300);
        setLocation(450, 150);

        try {
            String q = "select * from attendance_teacher";

            Connection cn = Conn.Connect();
            ResultSet rs = cn.createStatement().executeQuery(q);
            while (rs.next()) {
                d[i][j++] = rs.getString("emp_id");
                d[i][j++] = rs.getString("date");
                d[i][j++] = rs.getString("first_half");
                d[i][j++] = rs.getString("second_half");
                i++;
                j = 0;
            }

            j1 = new JTable(d, h);

        } catch (Exception e) {
            e.printStackTrace();
        }

        b1 = new JButton("Print");
        add(b1, "South");
        JScrollPane s1 = new JScrollPane(j1);
        add(s1);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            j1.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TeacherAttendanceDetail().setVisible(true);
    }
}
