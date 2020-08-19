package leeson1;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Doctor {

    public void specialist(){
        System.out.println("Дантист");
    }
}
