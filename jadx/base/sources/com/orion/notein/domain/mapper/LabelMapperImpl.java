package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.domain.models.Label;

/* JADX INFO: loaded from: classes9.dex */
public class LabelMapperImpl implements LabelMapper {
    @Override // com.orion.notein.domain.mapper.LabelMapper
    public LabelEntity toEntity(Label label) {
        if (label == null) {
            return null;
        }
        LabelEntity labelEntity = new LabelEntity();
        labelEntity.setId(label.getId());
        labelEntity.setName(label.getName());
        labelEntity.setColor(label.getColor());
        labelEntity.setCreatedTime(label.getCreatedTime());
        labelEntity.setModifiedTime(label.getModifiedTime());
        labelEntity.setIndex(label.getIndex());
        return labelEntity;
    }

    @Override // com.orion.notein.domain.mapper.LabelMapper
    public Label toModel(LabelEntity labelEntity) {
        if (labelEntity == null) {
            return null;
        }
        Label label = new Label();
        label.setId(labelEntity.getId());
        label.setName(labelEntity.getName());
        label.setColor(labelEntity.getColor());
        label.setCreatedTime(labelEntity.getCreatedTime());
        label.setModifiedTime(labelEntity.getModifiedTime());
        label.setIndex(labelEntity.getIndex());
        return label;
    }
}
