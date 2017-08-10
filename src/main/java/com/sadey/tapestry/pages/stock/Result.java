package com.sadey.tapestry.pages.stock;

import org.apache.tapestry.html.BasePage;

/**
 * Created by chaihaipeng on 2017/8/8.
 */
public class Result extends BasePage {

    private int result;

    public void setResult(int i) {
       this.result=i;
    }


    public String getResult() {
        return result+"";
    }
}
