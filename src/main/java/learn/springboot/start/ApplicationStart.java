package learn.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.annotation.ApplicationScope;

@EnableAutoConfiguration // faz a auto configuração das classes que precisam ser executadas ao rodar a aplicação spring
@ComponentScan(basePackages = "learn.springboot") //Diz ao spring qual o pacote base a ser observado para rodar
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args); // Inicia a aplicação usando a classe e os argumentos passados
    }
}
