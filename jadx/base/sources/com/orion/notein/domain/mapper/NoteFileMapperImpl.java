package com.orion.notein.domain.mapper;

import com.huawei.cloud.services.drive.model.File;
import com.orion.notein.data.p602db.entity.NoteFileEntity;
import com.orion.notein.domain.models.note.NoteFile;

/* JADX INFO: loaded from: classes9.dex */
public class NoteFileMapperImpl extends NoteFileMapper {
    private final DateTimeMapper dateTimeMapper = new DateTimeMapper();

    @Override // com.orion.notein.domain.mapper.NoteFileMapper
    public NoteFile toNoteFile(NoteFileEntity noteFileEntity) {
        if (noteFileEntity == null) {
            return null;
        }
        NoteFile noteFile = new NoteFile(noteFileEntity.getId(), noteFileEntity.getNoteId(), noteFileEntity.getTemplateId(), noteFileEntity.getFolderId(), noteFileEntity.getLastModificationTime(), noteFileEntity.getParentId(), noteFileEntity.getFavorite(), noteFileEntity.getTitle(), noteFileEntity.getInTrashBin(), noteFileEntity.getFileName(), noteFileEntity.getMimeType(), false, false, noteFileEntity.getRecycledTime(), noteFileEntity.getCreatedTime(), noteFileEntity.getEditedTime(), noteFileEntity.getSize(), noteFileEntity.getDbVersion(), noteFileEntity.getSortKey(), noteFileEntity.getUsingOwnPdf(), noteFileEntity.getLockAdded(), noteFileEntity.getExtra());
        fillEntity(noteFileEntity, noteFile);
        return noteFile;
    }

    @Override // com.orion.notein.domain.mapper.NoteFileMapper
    public NoteFileEntity toNoteFileEntity(File file) {
        if (file == null) {
            return null;
        }
        NoteFileEntity noteFileEntity = new NoteFileEntity(file.getId(), null, null, null, 0L, null, false, null, false, file.getFileName(), file.getMimeType(), this.dateTimeMapper.toTimeInMills(file.getRecycledTime()).longValue(), this.dateTimeMapper.toTimeInMills(file.getCreatedTime()).longValue(), this.dateTimeMapper.toTimeInMills(file.getEditedTime()).longValue(), file.getLastHistoryVersionId(), file.getSize() != null ? file.getSize().longValue() : 0L, 0, null, false, false, null, 0);
        fillEntity(file, noteFileEntity);
        return noteFileEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteFileMapper
    public NoteFileEntity toNoteFileEntityFromGoogleFile(com.google.api.services.drive.model.File file) {
        if (file == null) {
            return null;
        }
        long jLongValue = this.dateTimeMapper.toTimeInMillsFromGoogleDateTime(file.getModifiedTime()).longValue();
        String headRevisionId = file.getHeadRevisionId();
        NoteFileEntity noteFileEntity = new NoteFileEntity(file.getId(), null, null, null, 0L, null, false, null, false, file.getName(), file.getMimeType(), 0L, this.dateTimeMapper.toTimeInMillsFromGoogleDateTime(file.getCreatedTime()).longValue(), jLongValue, headRevisionId, file.getSize() != null ? file.getSize().longValue() : 0L, 0, null, false, false, null, 0);
        fillEntityByGoogleFile(file, noteFileEntity);
        return noteFileEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteFileMapper
    public NoteFile toOneDriveNoteFile(NoteFileEntity noteFileEntity) {
        if (noteFileEntity == null) {
            return null;
        }
        NoteFile noteFile = new NoteFile(noteFileEntity.getId(), noteFileEntity.getNoteId(), noteFileEntity.getTemplateId(), noteFileEntity.getFolderId(), noteFileEntity.getLastModificationTime(), noteFileEntity.getParentId(), noteFileEntity.getFavorite(), noteFileEntity.getTitle(), noteFileEntity.getInTrashBin(), noteFileEntity.getFileName(), null, false, false, noteFileEntity.getRecycledTime(), noteFileEntity.getCreatedTime(), noteFileEntity.getEditedTime(), noteFileEntity.getSize(), noteFileEntity.getDbVersion(), noteFileEntity.getSortKey(), noteFileEntity.getUsingOwnPdf(), noteFileEntity.getLockAdded(), noteFileEntity.getExtra());
        fillEntity(noteFileEntity, noteFile);
        return noteFile;
    }
}
