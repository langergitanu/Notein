package com.orion.notein.domain.models.note;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/RecoverIncompletelyNote;", "", NoteMeta.PROPERTY_NOTE_ID, "", TmemberRight.TAG_USERID, "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNoteId", "()Ljava/lang/String;", "getUserId", "getFilePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class RecoverIncompletelyNote {
    private final String filePath;
    private final String noteId;
    private final String userId;

    public RecoverIncompletelyNote(String noteId, String userId, String filePath) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(filePath, "filePath");
        this.noteId = noteId;
        this.userId = userId;
        this.filePath = filePath;
    }

    public static /* synthetic */ RecoverIncompletelyNote copy$default(RecoverIncompletelyNote recoverIncompletelyNote, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recoverIncompletelyNote.noteId;
        }
        if ((i & 2) != 0) {
            str2 = recoverIncompletelyNote.userId;
        }
        if ((i & 4) != 0) {
            str3 = recoverIncompletelyNote.filePath;
        }
        return recoverIncompletelyNote.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final RecoverIncompletelyNote copy(String noteId, String userId, String filePath) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(filePath, "filePath");
        return new RecoverIncompletelyNote(noteId, userId, filePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoverIncompletelyNote)) {
            return false;
        }
        RecoverIncompletelyNote recoverIncompletelyNote = (RecoverIncompletelyNote) other;
        return OooOOO0.OooO0O0(this.noteId, recoverIncompletelyNote.noteId) && OooOOO0.OooO0O0(this.userId, recoverIncompletelyNote.userId) && OooOOO0.OooO0O0(this.filePath, recoverIncompletelyNote.filePath);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.filePath.hashCode() + OooO00o.OooO0O0(this.noteId.hashCode() * 31, 31, this.userId);
    }

    public String toString() {
        String str = this.noteId;
        String str2 = this.userId;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("RecoverIncompletelyNote(noteId=", str, ", userId=", str2, ", filePath="), this.filePath, ")");
    }
}
