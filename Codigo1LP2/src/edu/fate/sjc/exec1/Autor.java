package edu.fate.sjc.exec1;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter

public class Autor {
    String name;
    String nationality;
}
