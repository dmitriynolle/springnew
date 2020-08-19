package leeson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Registry {
    CaseRecord caseRecord = new CaseRecord();
    Doctor doctor;

    @Autowired
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void work(){
        caseRecord.giveOut();
        doctor.specialist();
    }
}
