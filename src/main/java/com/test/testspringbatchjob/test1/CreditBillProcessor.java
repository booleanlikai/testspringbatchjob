/**
 *
 */
package com.test.testspringbatchjob.test1;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-1-6下午09:55:38
 */
@Component
@StepScope
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {

    public CreditBill process(CreditBill bill) throws Exception {
        System.out.println(bill.toString());
        return bill;
    }
}
