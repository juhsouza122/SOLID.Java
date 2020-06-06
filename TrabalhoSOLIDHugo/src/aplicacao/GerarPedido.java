package aplicacao;

import java.text.DecimalFormat;
import java.util.Scanner;

import bebidas.Bebidas;
import bebidas.KOChaPreto;
import bebidas.OChaVerde;
import bebidas.Refrigerante;
import carne.Boi;
import carne.Carne;
import carne.Porco;
import carne.Vegano;
import extras.CarneExtra;
import extras.Chilli;
import extras.CremeAlho;
import extras.Croutons;
import extras.Extras;
import extras.Shitake;
import extras.Tofu;
import notificacao.Observable;
import ramenshop.ComboGrande;
import ramenshop.ComboMedio;
import ramenshop.ComboPequeno;
import ramenshop.Pedido;

public class GerarPedido {
	public void pedido() {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat dformat = new DecimalFormat("#.##");

		System.out.println("--------RAMEN SHOP--------");
		System.out.println("---------Cardápio---------");

		System.out.println("\nEscolha o tamanho: \n1-Tamanho Pequeno -------- 9.90 \n2-Tamanho Médio -------- 12.90 \n3-Tamanho Grande -------- 15.90 \n");
		System.out.println("Digite qual tamanho deseja:");
		int tamanho = entrada.nextInt();
		Pedido combo = validarCombo(tamanho);

		System.out.println("Carnes: \n1-Vegano -------- +3.90 \n2-Porco -------- +5.90 \n3-Boi -------- +7.90 \n");
		System.out.println("Digite uma carne:");
		int escolhaCarne = entrada.nextInt();
		Carne carne = validarCarne(escolhaCarne, combo);

		System.out.println("Extras: \n1-Carne Extra -------- +4.00 \n2-Chilli -------- +1.50 \n3-Creme de alho -------- +2.50 \n4-Croutons -------- +2.00 \n5-Shitake -------- +6.90 \n6-Tofu -------- +2.70 \n");
		System.out.println("Digite um extra:");
		int escolhaExtra = entrada.nextInt();
		Extras extras = validarExtra(escolhaExtra, carne);

		System.out.println("Bebidas: \n1-Refrigerante -------- +5.90 \n2-O-Chá(verde) -------- +3.90 \n3-KO-Chá(preto) -------- +0.00 \n");
		System.out.println("Digite uma bebida:");
		int bebidaEscolha = entrada.nextInt();
		Bebidas bebidas = validarBebida(bebidaEscolha, extras);

		System.out.println("Pedido: " + bebidas.getDescricao());
		System.out.println("Total: " + dformat.format(bebidas.getPreco()));

		entrada.close();
	}

	Pedido validarCombo(int tamanho) {
		Pedido combo = null;
		if (tamanho == 1) {
			combo = new ComboPequeno();
		}
		if (tamanho == 2) {
			combo = new ComboMedio();
		}
		if (tamanho == 3) {
			combo = new ComboGrande();
		}

		return combo;
	}

	Carne validarCarne(int escolhaCarne, Pedido combo) {
		Carne carne = null;
		if (escolhaCarne == 1) {
			carne = new Vegano(combo);
		}
		if (escolhaCarne == 2) {
			carne = new Porco(combo);
		}
		if (escolhaCarne == 3) {
			carne = new Boi(combo);
		}

		return carne;
	}

	Extras validarExtra(int escolhaextra, Carne carne) {
		Extras extras = null;
		if (escolhaextra == 1) {
			extras = new CarneExtra(carne);
		}
		if (escolhaextra == 2) {
			extras = new Chilli(carne);
		}
		if (escolhaextra == 3) {
			extras = new CremeAlho(carne);
		}
		if (escolhaextra == 4) {
			extras = new Croutons(carne);
		}
		if (escolhaextra == 5) {
			extras = new Shitake(carne);
		}
		if (escolhaextra == 6) {
			extras = new Tofu(carne);
		}

		return extras;
	}

	private Bebidas validarBebida(int bebidaEscolha, Extras extras) {
		Bebidas bebidas = null;
		if (bebidaEscolha == 1) {
			bebidas = new Refrigerante(extras);
		}
		if (bebidaEscolha == 2) {
			bebidas = new OChaVerde(extras);
		}
		if (bebidaEscolha == 3) {
			bebidas = new KOChaPreto(extras);
		}
		return bebidas;
	}
}
