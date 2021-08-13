package edu.fate.sjc.exec1;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Data
@Builder
@Getter
@Setter

public class Usuario {
    private String name;
    private String adress;
    private String cpf;
    private Date birthDate;

    public void consultWork (String name , int anoPublicacao) 
    {
        System.out.println("Obra de nome " + name + " publicada no ano de " + anoPublicacao + "."); 
    }

    public void reserveWork (String name) 
    {
        System.out.println("Obra de nome " + name + " reservada!"); 
    }

    public void lendWork (String name) 
    {
        System.out.println("Obra de nome " + name + " emprestada!"); 
    }
    
    
    
}
