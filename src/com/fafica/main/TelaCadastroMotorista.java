package com.fafica.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import com.fafica.fachada.Fachada;
import com.fafica.motorista.Motorista;
import com.fafica.motorista.MotoristaJaCadastradoException;
import com.fafica.motorista.MotoristaNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class TelaCadastroMotorista {

	private JFrame frame;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JTextField textSalario;
	private JTextField textTelefone;
	private JTextField textId2;
	private JTable table;
	private Fachada fachada;
	private DefaultTableModel defaultTableModelMotorista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroMotorista window = new TelaCadastroMotorista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 
	 */
	public TelaCadastroMotorista() throws SQLException, ClassNotFoundException{
		fachada = Fachada.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 0, 722, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdMotorista = new JLabel("Id Motorista");
		lblIdMotorista.setBounds(10, 23, 74, 14);
		panel.add(lblIdMotorista);
		
		textId = new JTextField();
		textId.setBounds(85, 20, 58, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(174, 23, 46, 14);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(230, 20, 207, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(467, 23, 36, 14);
		panel.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(506, 20, 123, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(10, 69, 74, 14);
		panel.add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(85, 66, 154, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(267, 69, 46, 14);
		panel.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setBounds(310, 66, 86, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(439, 69, 74, 14);
		panel.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(523, 66, 106, 20);
		panel.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(103, 123, 111, 23);
		panel.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
			}
		});
		btnAtualizar.setBounds(308, 123, 106, 23);
		panel.add(btnAtualizar);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimparCampos.setBounds(512, 123, 117, 23);
		panel.add(btnLimparCampos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 171, 722, 51);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblIdMotorista_1 = new JLabel("Id Motorista");
		lblIdMotorista_1.setBounds(10, 26, 93, 14);
		panel_1.add(lblIdMotorista_1);
		
		textId2 = new JTextField();
		textId2.setBounds(103, 23, 86, 20);
		panel_1.add(textId2);
		textId2.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurar();
			}
		});
		btnProcurar.setBounds(252, 22, 110, 23);
		panel_1.add(btnProcurar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remover();
			}
		});
		btnRemover.setBounds(429, 22, 103, 23);
		panel_1.add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 233, 722, 131);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Id Motorista", "Nome", "CPF", "Endereco", "Salario", "Telefone"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnListarMotoristas = new JButton("Listar Motoristas");
		btnListarMotoristas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnListarMotoristas.setBounds(306, 375, 156, 23);
		frame.getContentPane().add(btnListarMotoristas);
	}
	
	private void limparCampos(){
		textId.setText("");
		textNome.setText("");
		textCpf.setText("");
		textEndereco.setText("");
		textSalario.setText("");
		textTelefone.setText("");
	}
	
	private void cadastrar(){
		
		String idMotorista = textId.getText();
		String nome = textNome.getText();
		String CPF = textCpf.getText();
		String endereco = textEndereco.getText();
		String salario = textSalario.getText();
		String telefone = textTelefone.getText();
		
		try{
		Motorista motorista = new Motorista(Integer.parseInt(idMotorista), nome, CPF, endereco, salario, telefone);
		fachada.cadastrarMotorista(motorista);
		JOptionPane.showMessageDialog(frame, "Motorista cadastrado com sucesso!");
		limparCampos();
		}catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);	
		}catch (CampoObrigatorioInvalidoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (MotoristaJaCadastradoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e){
			JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
		} 
		
	}
	
	private void atualizar(){
		
		String idMotorista = textId.getText();
		String nome = textNome.getText();
		String CPF = textCpf.getText();
		String endereco = textEndereco.getText();
		String salario = textSalario.getText();
		String telefone = textTelefone.getText();
		
		
		try{
			Motorista motorista = new Motorista(Integer.parseInt(idMotorista), nome, CPF, endereco, salario, telefone);
			fachada.atualizarMotorista(motorista);
			JOptionPane.showMessageDialog(frame, "Motorista atualizado com sucesso!");
			limparCampos();
		}catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObrigatorioInvalidoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (MotoristaNaoEncontradoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e){
			JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
		}	
			
		}
	
	private void listar() throws SQLException{
		limparTabelaMotorista();
		ArrayList<Motorista> motoristas = fachada.listarMotorista();
		for(Motorista motorista : motoristas) {
			Vector vector = new Vector();
			vector.add(motorista.getIdMotorista());
			vector.add(motorista.getNomeMotorista());
			vector.add(motorista.getCpfMotorista());
			vector.add(motorista.getEnderecoMotorista());
			vector.add(motorista.getSalarioMotorista());
			vector.add(motorista.getTelefoneMotorista());
			
			defaultTableModelMotorista.addRow(vector);
		}
	
	}
	
	private void limparTabelaMotorista() {
		defaultTableModelMotorista.setNumRows(0);
	}	
	
	
	private void procurar(){
		
		try{
			Motorista motorista = fachada.procurarMotorista(Integer.parseInt(textId2.getText()));
			limparCampos();
			textNome.setText(motorista.getNomeMotorista());
			textCpf.setText(motorista.getCpfMotorista());
			textEndereco.setText(motorista.getEnderecoMotorista());
			textSalario.setText(motorista.getSalarioMotorista());
			textTelefone.setText(motorista.getTelefoneMotorista());
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (MotoristaNaoEncontradoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObrigatorioInvalidoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e){
			JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
			
	}
	private void remover(){
		
		try {
			fachada.removerMotorista(Integer.parseInt(textId2.getText()));
			JOptionPane.showMessageDialog(frame, "Cliente Removido Com Sucesso");
			limparCampos();

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

		} catch (MotoristaNaoEncontradoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

		} catch (CampoObrigatorioInvalidoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

		} catch (Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

		}
		
		
		
	}
						
		
}
		
	
	
	
	
	


