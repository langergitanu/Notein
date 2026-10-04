package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.domain.models.LabelRef;

/* JADX INFO: loaded from: classes9.dex */
public class LabelRefMapperImpl implements LabelRefMapper {
    @Override // com.orion.notein.domain.mapper.LabelRefMapper
    public ItemLabelCrossRef toEntity(LabelRef labelRef) {
        if (labelRef == null) {
            return null;
        }
        ItemLabelCrossRef itemLabelCrossRef = new ItemLabelCrossRef();
        itemLabelCrossRef.setLabelId(labelRef.getLabelId());
        itemLabelCrossRef.setItemId(labelRef.getItemId());
        itemLabelCrossRef.setExtraInfo(labelRef.getExtraInfo());
        itemLabelCrossRef.setCreatedTime(labelRef.getCreatedTime());
        itemLabelCrossRef.setModifiedTime(labelRef.getModifiedTime());
        itemLabelCrossRef.setItemType(convertLabelTypeToInt(labelRef.getItemType()));
        return itemLabelCrossRef;
    }

    @Override // com.orion.notein.domain.mapper.LabelRefMapper
    public LabelRef toModel(ItemLabelCrossRef itemLabelCrossRef) {
        if (itemLabelCrossRef == null) {
            return null;
        }
        LabelRef labelRef = new LabelRef();
        labelRef.setLabelId(itemLabelCrossRef.getLabelId());
        labelRef.setItemId(itemLabelCrossRef.getItemId());
        labelRef.setExtraInfo(itemLabelCrossRef.getExtraInfo());
        labelRef.setCreatedTime(itemLabelCrossRef.getCreatedTime());
        labelRef.setModifiedTime(itemLabelCrossRef.getModifiedTime());
        labelRef.setItemType(convertIntToLabelType(itemLabelCrossRef.getItemType()));
        return labelRef;
    }
}
