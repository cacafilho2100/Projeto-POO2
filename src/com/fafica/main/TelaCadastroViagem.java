package com.fafica.main;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

import com.fafica.fachada.Fachada;
import com.fafica.motorista.Motorista;
import com.fafica.motorista.MotoristaNaoEncontradoException;
import com.fafica.util.CampoObrigatorioInvalidoException;
import com.fafica.viagem.Viagem;
import com.fafica.viagem.ViagemJaCadastradaException;
import com.fafica.viagem.ViagemNaoEncontradaException;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroViagem {

	private JFrame frame;
	private Fachada fachada;
	private JTextField textIdViagem;
	private JTextField textDestino;
	private JTextField textCusto;
	private JTextField textData;
	private JTable table;
	private DefaultTableModel defaultTableModelViagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroViagem window = new TelaCadastroViagem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroViagem() throws ClassNotFoundException, SQLException {
		fachada = Fachada.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 724, 179);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdViagem = new JLabel("Id Viagem");
		lblIdViagem.setBounds(10, 27, 71, 14);
		panel.add(lblIdViagem);
		
		textIdViagem = new JTextField();
		textIdViagem.setBounds(66, 24, 86, 20);
		panel.add(textIdViagem);
		textIdViagem.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(191, 27, 46, 14);
		panel.add(lblDestino);
		
		textDestino = new JTextField();
		textDestino.setBounds(251, 24, 120, 20);
		panel.add(textDestino);
		textDestino.setColumns(10);
		
		JLabel lblCusto = new JLabel("Custo");
		lblCusto.setBounds(410, 27, 46, 14);
		panel.add(lblCusto);
		
		textCusto = new JTextField();
		textCusto.setBounds(453, 24, 86, 20);
		panel.add(textCusto);
		textCusto.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(563, 27, 46, 14);
		panel.add(lblData);
		
		textData = new JTextField();
		textData.setBounds(602, 24, 96, 20);
		panel.add(textData);
		textData.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
				limparCampos();
			}
		});
		btnCadastrar.setBounds(42, 123, 89, 23);
		panel.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
				limparCampos();
			}
		});
		btnAtualizar.setBounds(178, 123, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimparCampos.setBounds(318, 123, 120, 23);
		panel.add(btnLimparCampos);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurar();
				
			}
		});
		btnProcurar.setBounds(484, 123, 89, 23);
		panel.add(btnProcurar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remover();
			}
		});
		btnRemover.setBounds(614, 123, 89, 23);
		panel.add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 200, 724, 196);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Id Viagem", "Destino", "Custo", "Data"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Listar Viagens");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(318, 407, 129, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	
	
	public void cadastrar(){
		
		String idViagem = textIdViagem.getText();
		String destino = textDestino.getText();
		String custo = textCusto.getText();
		String data = textData.getText();
		
		try{
			Viagem viagem = new Viagem(Integer.parseInt(idViagem), destino, custo, data);
			fachada.cadastrarViagem(viagem);
			JOptionPane.showMessageDialog(frame, "Viagem Cadastrada com Sucesso!");
		}catch(ViagemJaCadastradaException e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}catch(CampoObrigatorioInvalidoException e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
			
	}
	
	private void limparCampos(){
		textIdViagem.setText("");
		textDestino.setText("");
		textCusto.setText("");
		textData.setText("");
	}
	
	private void atualizar(){
		
		String idViagem = textIdViagem.getText();
		String destino = textDestino.getText();
		String custo = textCusto.getText();
		String data = textData.getText();
		
		try{
			Viagem viagem = new Viagem(Integer.parseInt(idViagem), destino, custo, data);
			fachada.atualizarViagem(viagem);
			JOptionPane.showMessageDialog(frame, "Viagem Atualizada com Sucesso!");
		}catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}catch(CampoObrigatorioInvalidoException e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}catch(ViagemNaoEncontradaException e){
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	private void limparTabelaViavem() {
		defaultTableModelViagem.setNumRows(0);
	}
	
	
	private void listar() throws SQLException{
		limparTabelaViavem();
		ArrayList<Viagem> viagens = fachada.listarViagem();
		for(Viagem viagem : viagens){
			Vector vector = new Vector();
			vector.add(viagem.getIdViagem());
			vector.add(viagem.getDestino());
			vector.add(viagem.getCusto());
			vector.add(viagem.getData());
			
			defaultTableModelViagem.addRow(vector);
		}
		
	}
	
	private void procurar(){
		
	
	try{
		Viagem viagem = fachada.procurarViagem(Integer.parseInt(textIdViagem.getText()));
		limparCampos();
		textDestino.setText(viagem.getDestino());
		textCusto.setText(viagem.getCusto());
		textData.setText(viagem.getData());
		
	}catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	} catch (ViagemNaoEncontradaException e) {
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	} catch (CampoObrigatorioInvalidoException e) {
		JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	} catch (Exception e){
		JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
	}
}	
	
	
	private void remover(){
		String idViagem = textIdViagem.getText();
		
		try {
			fachada.removerViagem(Integer.parseInt(idViagem));
			JOptionPane.showMessageDialog(frame, "Viagem removida com sucesso!");
			limparCampos();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (ViagemNaoEncontradaException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObrigatorioInvalidoException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e){
			JOptionPane.showMessageDialog(frame, "ERROR", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
		
}

	
			
		
		


