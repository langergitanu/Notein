package com.orion.notein.domain.mapper;

import com.huawei.cloud.services.drive.model.Change;
import com.orion.notein.domain.models.note.NoteFileChange;
import com.orion.notein.domain.models.note.NoteFileEntityChange;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteFileChangesMapper {
    public abstract NoteFileChange toNoteFileChange(NoteFileEntityChange noteFileEntityChange);

    public abstract NoteFileEntityChange toNoteFileEntityChange(Change change);

    public abstract NoteFileEntityChange toNoteFileEntityChangeFromGoogleFileChange(com.google.api.services.drive.model.Change change);
}
