package edu.fate.sjc.exec1;

import lombok.Builder;
import lombok.Data; // ver depois pra que funciona isso
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter

public class Aluno {
    private String RA;
    private String course;
    
}
