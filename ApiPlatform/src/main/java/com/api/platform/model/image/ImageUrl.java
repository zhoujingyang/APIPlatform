package com.api.platform.model.image;

import lombok.Data;

@Data
public class ImageUrl {

    public Eval eval;
    public Function function;
    public Performance performance;
    public Stability stability;

}
