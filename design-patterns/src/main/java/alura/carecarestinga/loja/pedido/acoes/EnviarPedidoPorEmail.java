package alura.carecarestinga.loja.pedido.acoes;

import alura.carecarestinga.loja.pedido.Pedido;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente "
				+ pedido.getCliente() + " na Data : "
				+ pedido.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
