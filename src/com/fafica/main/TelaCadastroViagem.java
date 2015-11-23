package com.fafica.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroViagem extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroViagem frame = new TelaCadastroViagem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroViagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 485);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(10, 0, 721, 205);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdViagem = new JLabel("ID Viagem");
		lblIdViagem.setBounds(10, 27, 79, 14);
		panel.add(lblIdViagem);
		
		textField = new JTextField();
		textField.setBounds(99, 24, 146, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(10, 71, 46, 14);
		panel.add(lblDestino);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 64, 200, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Custo");
		lblNewLabel.setBounds(10, 116, 46, 14);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 109, 200, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblData = new JLabel("Data ");
		lblData.setBounds(10, 159, 46, 14);
		panel.add(lblData);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 153, 200, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(353, 23, 89, 23);
		panel.add(btnCadastrar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(490, 23, 89, 23);
		panel.add(btnRemover);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(622, 23, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(353, 94, 119, 23);
		panel.add(btnLimparCampos);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(543, 94, 89, 23);
		panel.add(btnProcurar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 211, 721, 199);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID Viagem", "Destino", "Custo", "Data"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnListarViagens = new JButton("Listar Viagens");
		btnListarViagens.setBounds(338, 413, 118, 23);
		getContentPane().add(btnListarViagens);
	}

}
