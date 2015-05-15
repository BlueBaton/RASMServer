package Billing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Insets;

public class BiilingDesk {

	private JFrame frmBillingDesk;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiilingDesk window = new BiilingDesk();
					window.frmBillingDesk.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BiilingDesk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBillingDesk = new JFrame();
		frmBillingDesk.setTitle("Billing Desk");
		frmBillingDesk.setBounds(0, 0, 1365, 728);
		frmBillingDesk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frmBillingDesk.getContentPane().setLayout(gridBagLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc = new GridBagConstraints();
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		frmBillingDesk.getContentPane().add(tabbedPane, gbc_tabbedPane);
		gbc.gridx = 1;
		gbc.gridy = 2;
		JPanel panel = new JPanel();
		tabbedPane.addTab("Billing", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{49, 0, 39, 39, 39, 39, 39, 39, 39, 39, 39, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 1, 0, 0};
		gbl_panel.rowHeights = new int[]{34, 600};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton tabl1btn = new JButton("1");
		tabl1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		GridBagConstraints gbc_tabl1btn = new GridBagConstraints();
		gbc_tabl1btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl1btn.gridx = 1;
		gbc_tabl1btn.gridy = 0;
		panel.add(tabl1btn, gbc_tabl1btn);
		
		JButton tabl2btn = new JButton("2");
		GridBagConstraints gbc_tabl2btn = new GridBagConstraints();
		gbc_tabl2btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl2btn.gridx = 2;
		gbc_tabl2btn.gridy = 0;
		panel.add(tabl2btn, gbc_tabl2btn);
		
		JButton tabl3btn = new JButton("3");
		GridBagConstraints gbc_tabl3btn = new GridBagConstraints();
		gbc_tabl3btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl3btn.gridx = 3;
		gbc_tabl3btn.gridy = 0;
		panel.add(tabl3btn, gbc_tabl3btn);
		
		JButton tabl4btn = new JButton("4");
		GridBagConstraints gbc_tabl4btn = new GridBagConstraints();
		gbc_tabl4btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl4btn.gridx = 4;
		gbc_tabl4btn.gridy = 0;
		panel.add(tabl4btn, gbc_tabl4btn);
		
		JButton tabl5btn = new JButton("5");
		tabl5btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_tabl5btn = new GridBagConstraints();
		gbc_tabl5btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl5btn.gridx = 5;
		gbc_tabl5btn.gridy = 0;
		panel.add(tabl5btn, gbc_tabl5btn);
		
		JButton tabl6btn = new JButton("6");
		tabl6btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_tabl6btn = new GridBagConstraints();
		gbc_tabl6btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl6btn.gridx = 6;
		gbc_tabl6btn.gridy = 0;
		panel.add(tabl6btn, gbc_tabl6btn);
		
		JButton tabl7btn = new JButton("7");
		GridBagConstraints gbc_tabl7btn = new GridBagConstraints();
		gbc_tabl7btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl7btn.gridx = 7;
		gbc_tabl7btn.gridy = 0;
		panel.add(tabl7btn, gbc_tabl7btn);
		
		JButton tabl8btn = new JButton("8");
		GridBagConstraints gbc_tabl8btn = new GridBagConstraints();
		gbc_tabl8btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl8btn.gridx = 8;
		gbc_tabl8btn.gridy = 0;
		panel.add(tabl8btn, gbc_tabl8btn);
		
		JButton tabl9btn = new JButton("9");
		GridBagConstraints gbc_tabl9btn = new GridBagConstraints();
		gbc_tabl9btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl9btn.gridx = 9;
		gbc_tabl9btn.gridy = 0;
		panel.add(tabl9btn, gbc_tabl9btn);
		
		JButton tabl10btn = new JButton("10");
		GridBagConstraints gbc_tabl10btn = new GridBagConstraints();
		gbc_tabl10btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl10btn.gridx = 10;
		gbc_tabl10btn.gridy = 0;
		panel.add(tabl10btn, gbc_tabl10btn);
		
		JButton tabl11btn = new JButton("11");
		GridBagConstraints gbc_tabl11btn = new GridBagConstraints();
		gbc_tabl11btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl11btn.gridx = 11;
		gbc_tabl11btn.gridy = 0;
		panel.add(tabl11btn, gbc_tabl11btn);
		
		JButton tabl12btn = new JButton("12");
		GridBagConstraints gbc_tabl12btn = new GridBagConstraints();
		gbc_tabl12btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl12btn.gridx = 12;
		gbc_tabl12btn.gridy = 0;
		panel.add(tabl12btn, gbc_tabl12btn);
		
		JButton tabl13btn = new JButton("13");
		GridBagConstraints gbc_tabl13btn = new GridBagConstraints();
		gbc_tabl13btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl13btn.gridx = 13;
		gbc_tabl13btn.gridy = 0;
		panel.add(tabl13btn, gbc_tabl13btn);
		
		JButton tabl14btn = new JButton("14");
		GridBagConstraints gbc_tabl14btn = new GridBagConstraints();
		gbc_tabl14btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl14btn.gridx = 14;
		gbc_tabl14btn.gridy = 0;
		panel.add(tabl14btn, gbc_tabl14btn);
		
		JButton tabl15btn = new JButton("15");
		tabl15btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_tabl15btn = new GridBagConstraints();
		gbc_tabl15btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl15btn.gridx = 15;
		gbc_tabl15btn.gridy = 0;
		panel.add(tabl15btn, gbc_tabl15btn);
		
		JButton tabl16btn = new JButton("16");
		GridBagConstraints gbc_tabl16btn = new GridBagConstraints();
		gbc_tabl16btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl16btn.gridx = 16;
		gbc_tabl16btn.gridy = 0;
		panel.add(tabl16btn, gbc_tabl16btn);
		
		JButton tabl17btn = new JButton("17");
		GridBagConstraints gbc_tabl17btn = new GridBagConstraints();
		gbc_tabl17btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl17btn.gridx = 17;
		gbc_tabl17btn.gridy = 0;
		panel.add(tabl17btn, gbc_tabl17btn);
		
		JButton tabl18btn = new JButton("18");
		GridBagConstraints gbc_tabl18btn = new GridBagConstraints();
		gbc_tabl18btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl18btn.gridx = 18;
		gbc_tabl18btn.gridy = 0;
		panel.add(tabl18btn, gbc_tabl18btn);
		
		JButton tabl19btn = new JButton("19");
		GridBagConstraints gbc_tabl19btn = new GridBagConstraints();
		gbc_tabl19btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl19btn.gridx = 19;
		gbc_tabl19btn.gridy = 0;
		panel.add(tabl19btn, gbc_tabl19btn);
		
		JButton tabl20btn = new JButton("20");
		GridBagConstraints gbc_tabl20btn = new GridBagConstraints();
		gbc_tabl20btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl20btn.gridx = 20;
		gbc_tabl20btn.gridy = 0;
		panel.add(tabl20btn, gbc_tabl20btn);
		
		JButton tabl21btn = new JButton("21");
		GridBagConstraints gbc_tabl21btn = new GridBagConstraints();
		gbc_tabl21btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl21btn.gridx = 21;
		gbc_tabl21btn.gridy = 0;
		panel.add(tabl21btn, gbc_tabl21btn);
		
		JButton tabl22btn = new JButton("22");
		GridBagConstraints gbc_tabl22btn = new GridBagConstraints();
		gbc_tabl22btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl22btn.gridx = 22;
		gbc_tabl22btn.gridy = 0;
		panel.add(tabl22btn, gbc_tabl22btn);
		
		JButton tabl23btn = new JButton("23");
		GridBagConstraints gbc_tabl23btn = new GridBagConstraints();
		gbc_tabl23btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl23btn.gridx = 23;
		gbc_tabl23btn.gridy = 0;
		panel.add(tabl23btn, gbc_tabl23btn);
		
		JButton tabl24btn = new JButton("24");
		GridBagConstraints gbc_tabl24btn = new GridBagConstraints();
		gbc_tabl24btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl24btn.gridx = 24;
		gbc_tabl24btn.gridy = 0;
		panel.add(tabl24btn, gbc_tabl24btn);
		
		JButton tabl25btn = new JButton("25");
		GridBagConstraints gbc_tabl25btn = new GridBagConstraints();
		gbc_tabl25btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl25btn.gridx = 25;
		gbc_tabl25btn.gridy = 0;
		panel.add(tabl25btn, gbc_tabl25btn);
		
		JButton tabl26btn = new JButton("26");
		GridBagConstraints gbc_tabl26btn = new GridBagConstraints();
		gbc_tabl26btn.insets = new Insets(0, 0, 0, 5);
		gbc_tabl26btn.gridx = 26;
		gbc_tabl26btn.gridy = 0;
		panel.add(tabl26btn, gbc_tabl26btn);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		panel.add(table, gbc_table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
	}

}
