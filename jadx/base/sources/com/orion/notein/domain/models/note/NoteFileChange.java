package com.orion.notein.domain.models.note;

import OooOoo0.o00000;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteFileChange;", "", "changeType", "", "file", "Lcom/orion/notein/domain/models/note/NoteFile;", "fileId", "deleted", "", "time", "", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/note/NoteFile;Ljava/lang/String;ZJ)V", "getChangeType", "()Ljava/lang/String;", "getFile", "()Lcom/orion/notein/domain/models/note/NoteFile;", "setFile", "(Lcom/orion/notein/domain/models/note/NoteFile;)V", "getFileId", "getDeleted", "()Z", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteFileChange {
    private final String changeType;
    private final boolean deleted;
    private NoteFile file;
    private final String fileId;
    private final long time;

    public NoteFileChange(String changeType, NoteFile noteFile, String fileId, boolean z, long j) {
        OooOOO0.OooO0oO(changeType, "changeType");
        OooOOO0.OooO0oO(fileId, "fileId");
        this.changeType = changeType;
        this.file = noteFile;
        this.fileId = fileId;
        this.deleted = z;
        this.time = j;
    }

    public static /* synthetic */ NoteFileChange copy$default(NoteFileChange noteFileChange, String str, NoteFile noteFile, String str2, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteFileChange.changeType;
        }
        if ((i & 2) != 0) {
            noteFile = noteFileChange.file;
        }
        if ((i & 4) != 0) {
            str2 = noteFileChange.fileId;
        }
        if ((i & 8) != 0) {
            z = noteFileChange.deleted;
        }
        if ((i & 16) != 0) {
            j = noteFileChange.time;
        }
        long j2 = j;
        return noteFileChange.copy(str, noteFile, str2, z, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChangeType() {
        return this.changeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NoteFile getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final NoteFileChange copy(String changeType, NoteFile file, String fileId, boolean deleted, long time) {
        OooOOO0.OooO0oO(changeType, "changeType");
        OooOOO0.OooO0oO(fileId, "fileId");
        return new NoteFileChange(changeType, file, fileId, deleted, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteFileChange)) {
            return false;
        }
        NoteFileChange noteFileChange = (NoteFileChange) other;
        return OooOOO0.OooO0O0(this.changeType, noteFileChange.changeType) && OooOOO0.OooO0O0(this.file, noteFileChange.file) && OooOOO0.OooO0O0(this.fileId, noteFileChange.fileId) && this.deleted == noteFileChange.deleted && this.time == noteFileChange.time;
    }

    public final String getChangeType() {
        return this.changeType;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final NoteFile getFile() {
        return this.file;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = this.changeType.hashCode() * 31;
        NoteFile noteFile = this.file;
        return Long.hashCode(this.time) + o00000.OooO0O0(OooO00o.OooO0O0((iHashCode + (noteFile == null ? 0 : noteFile.hashCode())) * 31, 31, this.fileId), 31, this.deleted);
    }

    public final void setFile(NoteFile noteFile) {
        this.file = noteFile;
    }

    public String toString() {
        String str = this.changeType;
        NoteFile noteFile = this.file;
        String str2 = this.fileId;
        boolean z = this.deleted;
        long j = this.time;
        StringBuilder sb = new StringBuilder("NoteFileChange(changeType=");
        sb.append(str);
        sb.append(", file=");
        sb.append(noteFile);
        sb.append(", fileId=");
        sb.append(str2);
        sb.append(", deleted=");
        sb.append(z);
        sb.append(", time=");
        return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sb);
    }

    public /* synthetic */ NoteFileChange(String str, NoteFile noteFile, String str2, boolean z, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : noteFile, str2, z, j);
    }
}
