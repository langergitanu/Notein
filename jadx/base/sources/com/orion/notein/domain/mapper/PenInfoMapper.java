package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PenInfoEntity;
import com.orion.notein.domain.models.note.PenInfo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PenInfoMapper {
    public abstract PenInfoEntity toEntity(PenInfo penInfo);

    public abstract PenInfo toPenInfo(PenInfoEntity penInfoEntity);
}
