package cn.loverot.demo.custom;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortMethod implements TemplateMethodModelEx {
    @Override
    public Object exec(List list) throws TemplateModelException {
        SimpleSequence arg0=(SimpleSequence)list.get(0);
        List<BigDecimal> l=arg0.toList();
        Collections.sort(l, new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                return o1.intValue()-o2.intValue();
            }
        });
        return l;
    }
}
