package com.api.platform.model.mysql.general;


import com.api.platform.model.mysql.BasicResult;
import lombok.Data;

@Data
public class GeneralWithPostionEvalResult extends BasicResult {

    public String charLevelRecall;
    public String charLevelPrecision;
    public String imageLevelRecall;
    public String imageLevelPrecision;

}
