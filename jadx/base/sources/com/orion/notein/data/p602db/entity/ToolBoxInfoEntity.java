package com.orion.notein.data.p602db.entity;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/ToolBoxInfoEntity;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "pos", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getNoteId", "getPos", "()I", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ToolBoxInfoEntity {
    private final String id;
    private final String noteId;
    private final int pos;

    public ToolBoxInfoEntity(String id, String noteId, int i) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.id = id;
        this.noteId = noteId;
        this.pos = i;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final int getPos() {
        return this.pos;
    }
}
