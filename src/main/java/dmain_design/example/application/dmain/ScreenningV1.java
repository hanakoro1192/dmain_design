package dmain_design.example.application.dmain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScreenningV1{
    //採用選考ID
    private String interviewId;

    //応募した日
    private String screeningId;

    //選考日
    private LocalDate applyDate;
    
    //選考採用ステータス
    private ScreenStatusV1 status; //仕様がなくclassを作る必要がある

    //面接結果
    private String applicantEmailAddress;
}
