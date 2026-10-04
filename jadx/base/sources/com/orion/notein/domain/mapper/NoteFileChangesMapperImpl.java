package com.orion.notein.domain.mapper;

import com.huawei.cloud.services.drive.model.Change;
import com.orion.notein.domain.models.note.NoteFileChange;
import com.orion.notein.domain.models.note.NoteFileEntityChange;

/* JADX INFO: loaded from: classes9.dex */
public class NoteFileChangesMapperImpl extends NoteFileChangesMapper {
    private final DateTimeMapper dateTimeMapper = new DateTimeMapper();

    @Override // com.orion.notein.domain.mapper.NoteFileChangesMapper
    public NoteFileChange toNoteFileChange(NoteFileEntityChange noteFileEntityChange) {
        if (noteFileEntityChange == null) {
            return null;
        }
        return new NoteFileChange(noteFileEntityChange.getChangeType(), null, noteFileEntityChange.getFileId(), noteFileEntityChange.getDeleted(), noteFileEntityChange.getTime());
    }

    @Override // com.orion.notein.domain.mapper.NoteFileChangesMapper
    public NoteFileEntityChange toNoteFileEntityChange(Change change) {
        if (change == null) {
            return null;
        }
        return new NoteFileEntityChange(change.getChangeType(), null, change.getFileId(), change.getDeleted() != null ? change.getDeleted().booleanValue() : false, this.dateTimeMapper.toTimeInMills(change.getTime()).longValue());
    }

    @Override // com.orion.notein.domain.mapper.NoteFileChangesMapper
    public NoteFileEntityChange toNoteFileEntityChangeFromGoogleFileChange(com.google.api.services.drive.model.Change change) {
        if (change == null) {
            return null;
        }
        return new NoteFileEntityChange(change.getChangeType(), null, change.getFileId(), change.getRemoved() != null ? change.getRemoved().booleanValue() : false, this.dateTimeMapper.toTimeInMillsFromGoogleDateTime(change.getTime()).longValue());
    }
}
