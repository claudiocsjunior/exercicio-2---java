public class Contador{
	private String texto;

	public Contador(String texto_recebido){
		this.texto = texto_recebido;
	}

	public void efetuar_contagem(){
		this.retirar_caracteres_especiais();
		this.modificar_texto_minusculo();	
		//criar map	
		//Quebrar a string em onde houver espaços
		//Salvar as strings num map cuja as chaves serão as string e o valor será a quantidade que ele tem
			//OBS.: Antes de salvar, verificar se a palavra já foi adicionada
		//Printar valores
	}	

	//Retirar os caracteres especiais
	public void retirar_caracteres_especiais(){
		this.texto = this.texto.replaceAll("[^A-zZ-Z1-9 ]", "");
	}
	
	//transformar as palavras em minusculas
	public void modificar_texto_minusculo(){
		this.texto = this.texto.toLowerCase();
		System.out.println(this.texto);	
	}

	

}
