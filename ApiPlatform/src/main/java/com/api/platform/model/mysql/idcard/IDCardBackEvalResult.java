package com.api.platform.model.mysql.idcard;

import com.api.platform.model.mysql.BasicResult;
import lombok.Data;

@Data
public class IDCardBackEvalResult extends BasicResult {

    /**
     * 召回率
     */
    public String issuingDateRecall;
    public String issuingAuthorityRecall;
    public String expiryDateRecall;


    /**
     * 准确率
     */
    public String issuingDateAccuracy;
    public String issuingAuthorityAccuracy;
    public String expiryDateAccuracy;


}
