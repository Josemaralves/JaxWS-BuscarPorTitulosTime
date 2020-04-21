package Controle;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Echo {

    @WebMethod
    public String echo(@WebParam(name = "as") String x){
        return "123" + x;
    }

}
