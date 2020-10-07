package com.myz.mbg.dbrouter.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @author yzMa
 * @desc
 * @ses {@link org.mybatis.generator.plugins.MapperAnnotationPlugin} 参考
 * @date 2020/10/7 12:26
 * @email 2641007740@qq.com
 */
public class DbRouterAnnotationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return false;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//        interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper")); //$NON-NLS-1$
//        interfaze.addAnnotation("@Mapper"); //$NON-NLS-1$
        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }
}
