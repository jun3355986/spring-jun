package com.mashibing.selfEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;


/**
 * @className: HahaPropertyEditorRegistrar
 * @description: TODO 类描述
 * @author: jdt
 * @date: 2022/6/26 01:38
 **/
public class HahaPropertyEditorRegistrar implements PropertyEditorRegistrar {


    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Haha.class, new HahaPropertyEditor());
    }
}
