package com.orion.notein.domain.mapper;

import com.huawei.cloud.services.drive.model.HistoryVersion;
import com.orion.notein.domain.models.note.NoteHistoryVersion;

/* JADX INFO: loaded from: classes9.dex */
public class NoteHistoryVersionMapperImpl extends NoteHistoryVersionMapper {
    private final DateTimeMapper dateTimeMapper = new DateTimeMapper();

    @Override // com.orion.notein.domain.mapper.NoteHistoryVersionMapper
    public NoteHistoryVersion toNoteHistoryVersion(HistoryVersion historyVersion) {
        if (historyVersion == null) {
            return null;
        }
        return new NoteHistoryVersion(historyVersion.getId(), historyVersion.getOriginalFilename(), this.dateTimeMapper.toTimeInMills(historyVersion.getEditedTime()).longValue(), historyVersion.getSize() != null ? historyVersion.getSize().longValue() : 0L);
    }
}
