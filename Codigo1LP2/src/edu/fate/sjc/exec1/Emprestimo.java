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

public class Emprestimo {

    private Date loanDate; //data emprestimo
    private Date returnDate; // data devolucao
    private String Atributte1;
    
}
