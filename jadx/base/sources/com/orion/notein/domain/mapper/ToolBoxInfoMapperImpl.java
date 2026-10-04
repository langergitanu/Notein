package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import com.orion.notein.domain.models.note.ToolBoxInfo;

/* JADX INFO: loaded from: classes9.dex */
public class ToolBoxInfoMapperImpl extends ToolBoxInfoMapper {
    @Override // com.orion.notein.domain.mapper.ToolBoxInfoMapper
    public ToolBoxInfoEntity toEntity(ToolBoxInfo toolBoxInfo) {
        if (toolBoxInfo == null) {
            return null;
        }
        return new ToolBoxInfoEntity(toolBoxInfo.getId(), toolBoxInfo.getNoteId(), toolBoxInfo.getPos());
    }

    @Override // com.orion.notein.domain.mapper.ToolBoxInfoMapper
    public ToolBoxInfo toToolBoxInfo(ToolBoxInfoEntity toolBoxInfoEntity) {
        if (toolBoxInfoEntity == null) {
            return null;
        }
        return new ToolBoxInfo(toolBoxInfoEntity.getId(), toolBoxInfoEntity.getNoteId(), toolBoxInfoEntity.getPos());
    }
}
