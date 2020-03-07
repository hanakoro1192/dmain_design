package dmain_design.example.application.dmain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewV1 { //フィールドの作成
    //面接ID
    private String InterviewId;

    //選考採用ID
    private String screeningId;

    //面接次数
    private int interviewNumber;

    //面接結果
    private ScreeningStepResult screeningStepResult;

    //採用担当者ID
    private Long recruiterId;
}