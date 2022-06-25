package com.mashibing.selfEditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @className: HahaPropertyEditor
 * @description: TODO 类描述
 * @author: jdt
 * @date: 2022/6/26 01:24
 **/
public class HahaPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        String[] data = text.split("\\|");
        Haha haha = new Haha();
        haha.setHaWhat(data[0]);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            haha.setHaTime(sf.parse(data[1]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        haha.setHaScore(Integer.parseInt(data[2]));
        setValue(haha);
    }


}
