package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;

    public FileUploaded(File aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
