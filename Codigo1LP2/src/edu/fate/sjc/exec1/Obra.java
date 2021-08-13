package edu.fate.sjc.exec1;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter

public class Obra {
    private String genero;
    private String idioma;
    private String midia;
    private String nome;
    private int anoPublicacao;
    private String autor;
    private String editora;

}
