package com.jaya.com.jaya.writer;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by jnaga1 on 7/26/2017.
 */
public class JobWritter implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> list) throws Exception {
        for (String str:list) {
            System.out.println("The Items to be written into database or file system"+str);
        }
    }
}
