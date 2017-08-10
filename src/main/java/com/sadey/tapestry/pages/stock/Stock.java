package com.sadey.tapestry.pages.stock;

import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InitialValue;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.form.IPropertySelectionModel;
import org.apache.tapestry.form.StringPropertySelectionModel;
import org.apache.tapestry.html.BasePage;

import java.util.Date;

/**
 * Created by chaihaipeng on 2017/8/10.
 */
public abstract class Stock extends BasePage{



    public IPage onOk() {
        System.out.println(getQuoteDate());
        System.out.println(getStockId());
        int stockValue = (getQuoteDate().toString()+getStockId().hashCode()).hashCode() % 100;
        Result result = getResultPage();
        result.setResult(stockValue);
        return result;
    }

    @InitialValue("literal:MSFC")
    abstract public String getStockId();

    @InjectPage("stock/Result")
    abstract public Result getResultPage();

    abstract public Date getQuoteDate();

    public IPropertySelectionModel getAvailStockIds() {
        return new StringPropertySelectionModel(new String[] { "IBM", "MSFT", "RHAT" });
    }

}
