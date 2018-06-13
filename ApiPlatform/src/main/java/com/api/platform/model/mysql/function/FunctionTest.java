package com.api.platform.model.mysql.function;

import com.api.platform.model.mysql.BasicResult;
import lombok.Data;

import java.util.List;

@Data
public class FunctionTest extends BasicResult {

    public String type;
    public String imgName;
    public List<FunctionTestResult> result;
}
