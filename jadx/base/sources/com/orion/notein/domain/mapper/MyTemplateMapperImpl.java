package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.models.papertheme.MyTemplate;

/* JADX INFO: loaded from: classes9.dex */
public class MyTemplateMapperImpl extends MyTemplateMapper {
    @Override // com.orion.notein.domain.mapper.MyTemplateMapper
    public MyTemplateEntity toEntity(MyTemplate myTemplate) {
        if (myTemplate == null) {
            return null;
        }
        MyTemplateEntity myTemplateEntity = new MyTemplateEntity(myTemplate.getId(), null, null, myTemplate.getCreationTime(), myTemplate.getLastModificationTime(), myTemplate.getName());
        fillEntity(myTemplate, myTemplateEntity);
        return myTemplateEntity;
    }

    @Override // com.orion.notein.domain.mapper.MyTemplateMapper
    public MyTemplate toMyTemplate(MyTemplateEntity myTemplateEntity) {
        if (myTemplateEntity == null) {
            return null;
        }
        MyTemplate myTemplate = new MyTemplate();
        myTemplate.setId(myTemplateEntity.getId());
        myTemplate.setCreationTime(myTemplateEntity.getCreationTime());
        myTemplate.setLastModificationTime(myTemplateEntity.getLastModificationTime());
        myTemplate.setName(myTemplateEntity.getName());
        fillModel(myTemplateEntity, myTemplate);
        return myTemplate;
    }
}
