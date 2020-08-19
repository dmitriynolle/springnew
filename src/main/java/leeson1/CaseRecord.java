package leeson1;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CaseRecord {

    public void giveOut(){
        System.out.println("Карта выдана");
    }
}
