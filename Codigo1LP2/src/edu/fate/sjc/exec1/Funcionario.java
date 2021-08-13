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

public class Funcionario {
    private Date admissionDate;
    private String department;

    public void registerWork (String name , int num) 
    {
        System.out.println("Obra " + name + " com número de registro " + num + " registrada com sucesso");
    }

    public void deleteWork (int num) 
    {
        System.out.println("Obra com número de registro " + num + " foi deletada com sucesso" );
    }
}


