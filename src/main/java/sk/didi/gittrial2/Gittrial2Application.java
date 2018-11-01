package sk.didi.gittrial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.didi.gittrial2.dto.GitSample2;

@SpringBootApplication
public class Gittrial2Application {

    public static void main(String[] args) {
        SpringApplication.run(Gittrial2Application.class, args);
        System.out.println("I am Git Sample");
        System.out.println("I am new branch");

        GitSample2 g = new GitSample2();
        g.setMonths("August");
        System.out.println("Months: " + g.getMonths());
    }
}

