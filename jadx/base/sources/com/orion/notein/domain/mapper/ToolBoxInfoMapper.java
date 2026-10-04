package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import com.orion.notein.domain.models.note.ToolBoxInfo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ToolBoxInfoMapper {
    public abstract ToolBoxInfoEntity toEntity(ToolBoxInfo toolBoxInfo);

    public abstract ToolBoxInfo toToolBoxInfo(ToolBoxInfoEntity toolBoxInfoEntity);
}
