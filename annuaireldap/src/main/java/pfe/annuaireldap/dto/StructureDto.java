package pfe.annuaireldap.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class StructureDto {
    private String id;
    private String ou;
    private String descriptionAr;
    private String  descriptionFr;
    private String  structurePath;

}
