package com.api.platform.model.param.function;

import com.api.platform.model.param.ParamBasicResult;
import lombok.Data;


@Data
public class FunctionTestParam extends ParamBasicResult {

    public String type;
    public String imgName;
    FunctionTestResultParam result;
}
