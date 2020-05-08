package Controle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService
public class Echo {

    TimeVO time = new TimeVO();

    @WebMethod
    public List<TimeVO> echo(@WebParam(name = "titulo") String titulo){
        return time.MOCK().stream().filter(time -> time.getTitulo().contains(titulo)).collect(Collectors.toList());
    }

}
