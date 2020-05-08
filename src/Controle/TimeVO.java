package Controle;

import java.util.Arrays;
import java.util.List;

public class TimeVO {

    private String nome;
    private List<String> titulo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<String> titulo) {
        this.titulo = titulo;
    }

    public List<TimeVO> MOCK(){
        TimeVO a = new TimeVO();
        a.setNome("Flamengo");
        a.setTitulo(Arrays.asList("Brasileirao","Mundial","Carioca"));

        TimeVO b = new TimeVO();
        b.setNome("Vasco");
        b.setTitulo(Arrays.asList());

        TimeVO c = new TimeVO();
        c.setNome("Fluminense");
        c.setTitulo(Arrays.asList("Brasileirao"));

        TimeVO d = new TimeVO();
        d.setNome("Botafogo");
        d.setTitulo(Arrays.asList("Libertadores"));

        TimeVO e = new TimeVO();
        e.setNome("Caxias");
        e.setTitulo(Arrays.asList("Libertadores","Carioca"));

        TimeVO f = new TimeVO();
        f.setNome("Cruzeiro");
        f.setTitulo(Arrays.asList("Brasileirao"));


        return Arrays.asList(a,b,c,d,e,f);
    }
}
