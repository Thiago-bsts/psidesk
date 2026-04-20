package model;

public class usuario {
    
    int id;
    char texto;
    char email;
    int idade;

    public usuario(int id, char texto, char email, int idade){
        this.id = id;
        this.texto = texto;
        this.email = email;
        this.idade = idade;
    }

    //getters e setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTexto() {
        return texto;
    }

    public void setTexto(char texto) {
        this.texto = texto;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "produto [nome: "+ nome +", email: "+ email +", idade: "+ idade +"]";
    }
}
