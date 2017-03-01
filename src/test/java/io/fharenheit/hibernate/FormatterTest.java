package io.fharenheit.hibernate;

import org.junit.Test;

public class FormatterTest {

    @Test
    public void format() {
        String sql = new BasicFormatterImpl().format("select a,b,c,d,e,f from test where a like 'a%' and b = 'c' order by d desc group by e");
        System.out.println(sql);
    }

}
