package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import com.orion.notein.domain.models.p605ai.NoteAiContent;

/* JADX INFO: loaded from: classes9.dex */
public class NoteAiContentMapperImpl extends NoteAiContentMapper {
    @Override // com.orion.notein.domain.mapper.NoteAiContentMapper
    public NoteAiContentEntity toEntity(NoteAiContent noteAiContent) {
        if (noteAiContent == null) {
            return null;
        }
        NoteAiContentEntity noteAiContentEntity = new NoteAiContentEntity(noteAiContent.getId(), null, noteAiContent.getSavedSummaryIndex(), noteAiContent.getCreationTime(), noteAiContent.getLastModificationTime());
        fillEntity(noteAiContent, noteAiContentEntity);
        return noteAiContentEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteAiContentMapper
    public NoteAiContent toModel(NoteAiContentEntity noteAiContentEntity) {
        if (noteAiContentEntity == null) {
            return null;
        }
        NoteAiContent noteAiContent = new NoteAiContent();
        noteAiContent.setId(noteAiContentEntity.getId());
        noteAiContent.setSavedSummaryIndex(noteAiContentEntity.getSavedSummaryIndex());
        noteAiContent.setCreationTime(noteAiContentEntity.getCreationTime());
        noteAiContent.setLastModificationTime(noteAiContentEntity.getLastModificationTime());
        fillModel(noteAiContentEntity, noteAiContent);
        return noteAiContent;
    }
}
