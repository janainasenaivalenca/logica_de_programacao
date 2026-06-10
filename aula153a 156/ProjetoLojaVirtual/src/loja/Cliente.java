package loja;

public class Cliente {
	
    String	nome;
    int idade;
    String email;

    public void setNome(String nome) {
	   if(nome. isEmpty()) {
		 
		 System.out.println("nome inválido");
	   }else {
		 this.nome =nome;
	 }
 }
 
    public String getNome() {
	   return nome;
 }
    public void setIdade(int idade) {
	   if(idade < 0) {
		 System.out.println("idade inválido");
	   }else {
		 this.idade = idade;
	 }
 }
    public int getIdade() {
	    return idade;
 }
 
    public void setEmail(String email) {
	   if (email.isEmpty()){
		 
		 System.out.println("email inválido");
	   }else {
		 this.email =email;
	 }
 }
   public String getEmail() {
	   return email;
 }
}
