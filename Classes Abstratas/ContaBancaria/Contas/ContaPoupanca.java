package Contas;

import Excecoes.SaldoInsuficienteException;
import Excecoes.SenhaInvalidaException;

public class ContaPoupanca extends ContaBancaria{

	private double taxa = 5;
	
	public ContaPoupanca(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) 
			throws SaldoInsuficienteException, SenhaInvalidaException {
		if(this.senha.equals(senha)) {
			if(this.saldo >= valor + taxa) {
				this.saldo -= taxa + valor;
				conta.saldo += valor;
				} else {
					throw new SaldoInsuficienteException();
				}
		} else {
			throw new SenhaInvalidaException();
		}
	}
}
