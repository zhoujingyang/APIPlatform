package com.api.platform.model.mysql.function;

import com.api.platform.model.mysql.BasicResult;
import lombok.Data;


@Data
public class FunctionTestResult extends BasicResult {

    public String caseId;
    public String status;
    public String testTime;
    public String message;
    public String imgResult;
    public String interfaceName;
}

