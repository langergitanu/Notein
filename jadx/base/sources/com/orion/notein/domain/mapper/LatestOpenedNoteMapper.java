package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.LatestOpenedNoteEntity;
import com.orion.notein.domain.models.note.LatestOpenedNote;

/* JADX INFO: loaded from: classes9.dex */
public interface LatestOpenedNoteMapper {
    LatestOpenedNoteEntity toEntity(LatestOpenedNote latestOpenedNote);

    LatestOpenedNote toModel(LatestOpenedNoteEntity latestOpenedNoteEntity);
}
