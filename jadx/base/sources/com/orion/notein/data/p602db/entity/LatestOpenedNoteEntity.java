package com.orion.notein.data.p602db.entity;

import com.aspose.slides.C22212OooOoO0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/LatestOpenedNoteEntity;", "", NoteMeta.PROPERTY_NOTE_ID, "", FirebaseAnalytics.Param.INDEX, "", "<init>", "(Ljava/lang/String;I)V", "getNoteId", "()Ljava/lang/String;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LatestOpenedNoteEntity {
    private final int index;
    private final String noteId;

    public LatestOpenedNoteEntity(String noteId, int i) {
        OooOOO0.OooO0oO(noteId, "noteId");
        this.noteId = noteId;
        this.index = i;
    }

    public static /* synthetic */ LatestOpenedNoteEntity copy$default(LatestOpenedNoteEntity latestOpenedNoteEntity, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = latestOpenedNoteEntity.noteId;
        }
        if ((i2 & 2) != 0) {
            i = latestOpenedNoteEntity.index;
        }
        return latestOpenedNoteEntity.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final LatestOpenedNoteEntity copy(String noteId, int index) {
        OooOOO0.OooO0oO(noteId, "noteId");
        return new LatestOpenedNoteEntity(noteId, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestOpenedNoteEntity)) {
            return false;
        }
        LatestOpenedNoteEntity latestOpenedNoteEntity = (LatestOpenedNoteEntity) other;
        return OooOOO0.OooO0O0(this.noteId, latestOpenedNoteEntity.noteId) && this.index == latestOpenedNoteEntity.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.noteId.hashCode() * 31);
    }

    public String toString() {
        return C22212OooOoO0.OooO0OO(this.index, "LatestOpenedNoteEntity(noteId=", this.noteId, ", index=", ")");
    }
}
