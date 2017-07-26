package com.jaya.com.jaya;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by jnaga1 on 7/26/2017.
 */
public class JobProcessor implements ItemProcessor<String,String> {

    @Override
    public String process(String s) throws Exception {
        return s.toUpperCase();
    }
}
