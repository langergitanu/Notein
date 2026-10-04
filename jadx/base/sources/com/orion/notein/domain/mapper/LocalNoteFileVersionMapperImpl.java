package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.LocalNoteFileVersionEntity;
import com.orion.notein.domain.models.cloud.LocalNoteFileVersion;

/* JADX INFO: loaded from: classes9.dex */
public class LocalNoteFileVersionMapperImpl extends LocalNoteFileVersionMapper {
    @Override // com.orion.notein.domain.mapper.LocalNoteFileVersionMapper
    public LocalNoteFileVersion toModel(LocalNoteFileVersionEntity localNoteFileVersionEntity) {
        if (localNoteFileVersionEntity == null) {
            return null;
        }
        return new LocalNoteFileVersion(localNoteFileVersionEntity.getId(), localNoteFileVersionEntity.getEditedTime(), localNoteFileVersionEntity.getLastHistoryVersionId());
    }
}
