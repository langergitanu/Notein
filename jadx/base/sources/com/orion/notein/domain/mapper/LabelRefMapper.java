package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.domain.models.LabelType;

/* JADX INFO: loaded from: classes9.dex */
public interface LabelRefMapper {
    default LabelType convertIntToLabelType(int i) {
        return LabelType.INSTANCE.fromValue(i);
    }

    default int convertLabelTypeToInt(LabelType labelType) {
        return labelType.getValue();
    }

    ItemLabelCrossRef toEntity(LabelRef labelRef);

    LabelRef toModel(ItemLabelCrossRef itemLabelCrossRef);
}
