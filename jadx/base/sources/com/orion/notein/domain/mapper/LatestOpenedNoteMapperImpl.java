package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.LatestOpenedNoteEntity;
import com.orion.notein.domain.models.note.LatestOpenedNote;

/* JADX INFO: loaded from: classes9.dex */
public class LatestOpenedNoteMapperImpl implements LatestOpenedNoteMapper {
    @Override // com.orion.notein.domain.mapper.LatestOpenedNoteMapper
    public LatestOpenedNoteEntity toEntity(LatestOpenedNote latestOpenedNote) {
        if (latestOpenedNote == null) {
            return null;
        }
        return new LatestOpenedNoteEntity(latestOpenedNote.getNoteId(), latestOpenedNote.getIndex());
    }

    @Override // com.orion.notein.domain.mapper.LatestOpenedNoteMapper
    public LatestOpenedNote toModel(LatestOpenedNoteEntity latestOpenedNoteEntity) {
        if (latestOpenedNoteEntity == null) {
            return null;
        }
        return new LatestOpenedNote(latestOpenedNoteEntity.getNoteId(), latestOpenedNoteEntity.getIndex());
    }
}
