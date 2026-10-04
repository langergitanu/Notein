package com.orion.notein.data.p602db.entity;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteConflictEntity;", "", NoteMeta.PROPERTY_NOTE_ID, "", NoteMeta.PROPERTY_TITLE, TmemberRight.TAG_USERID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNoteId", "()Ljava/lang/String;", "getTitle", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteConflictEntity {
    private final String noteId;
    private final String title;
    private final String userId;

    public NoteConflictEntity(String noteId, String title, String userId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(userId, "userId");
        this.noteId = noteId;
        this.title = title;
        this.userId = userId;
    }

    public static /* synthetic */ NoteConflictEntity copy$default(NoteConflictEntity noteConflictEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteConflictEntity.noteId;
        }
        if ((i & 2) != 0) {
            str2 = noteConflictEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = noteConflictEntity.userId;
        }
        return noteConflictEntity.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final NoteConflictEntity copy(String noteId, String title, String userId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(userId, "userId");
        return new NoteConflictEntity(noteId, title, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteConflictEntity)) {
            return false;
        }
        NoteConflictEntity noteConflictEntity = (NoteConflictEntity) other;
        return OooOOO0.OooO0O0(this.noteId, noteConflictEntity.noteId) && OooOOO0.OooO0O0(this.title, noteConflictEntity.title) && OooOOO0.OooO0O0(this.userId, noteConflictEntity.userId);
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + OooO00o.OooO0O0(this.noteId.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        String str = this.noteId;
        String str2 = this.title;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("NoteConflictEntity(noteId=", str, ", title=", str2, ", userId="), this.userId, ")");
    }
}
