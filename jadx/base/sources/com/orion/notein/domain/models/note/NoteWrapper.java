package com.orion.notein.domain.models.note;

import androidx.concurrent.futures.OooO00o;
import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteWrapper;", "", "meta", "Lcom/orion/notein/domain/models/note/NoteMeta;", "folder", "Lcom/orion/notein/domain/models/folder/Folder;", "file", "Ljava/io/File;", "fileId", "", "lastHistoryVersionId", "<init>", "(Lcom/orion/notein/domain/models/note/NoteMeta;Lcom/orion/notein/domain/models/folder/Folder;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "getMeta", "()Lcom/orion/notein/domain/models/note/NoteMeta;", "getFolder", "()Lcom/orion/notein/domain/models/folder/Folder;", "getFile", "()Ljava/io/File;", "getFileId", "()Ljava/lang/String;", "getLastHistoryVersionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteWrapper {
    private final File file;
    private final String fileId;
    private final Folder folder;
    private final String lastHistoryVersionId;
    private final NoteMeta meta;

    public NoteWrapper(NoteMeta meta, Folder folder, File file, String str, String str2) {
        OooOOO0.OooO0oO(meta, "meta");
        OooOOO0.OooO0oO(file, "file");
        this.meta = meta;
        this.folder = folder;
        this.file = file;
        this.fileId = str;
        this.lastHistoryVersionId = str2;
    }

    public static /* synthetic */ NoteWrapper copy$default(NoteWrapper noteWrapper, NoteMeta noteMeta, Folder folder, File file, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            noteMeta = noteWrapper.meta;
        }
        if ((i & 2) != 0) {
            folder = noteWrapper.folder;
        }
        if ((i & 4) != 0) {
            file = noteWrapper.file;
        }
        if ((i & 8) != 0) {
            str = noteWrapper.fileId;
        }
        if ((i & 16) != 0) {
            str2 = noteWrapper.lastHistoryVersionId;
        }
        String str3 = str2;
        File file2 = file;
        return noteWrapper.copy(noteMeta, folder, file2, str, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NoteMeta getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Folder getFolder() {
        return this.folder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    public final NoteWrapper copy(NoteMeta meta, Folder folder, File file, String fileId, String lastHistoryVersionId) {
        OooOOO0.OooO0oO(meta, "meta");
        OooOOO0.OooO0oO(file, "file");
        return new NoteWrapper(meta, folder, file, fileId, lastHistoryVersionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteWrapper)) {
            return false;
        }
        NoteWrapper noteWrapper = (NoteWrapper) other;
        return OooOOO0.OooO0O0(this.meta, noteWrapper.meta) && OooOOO0.OooO0O0(this.folder, noteWrapper.folder) && OooOOO0.OooO0O0(this.file, noteWrapper.file) && OooOOO0.OooO0O0(this.fileId, noteWrapper.fileId) && OooOOO0.OooO0O0(this.lastHistoryVersionId, noteWrapper.lastHistoryVersionId);
    }

    public final File getFile() {
        return this.file;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final Folder getFolder() {
        return this.folder;
    }

    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    public final NoteMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        int iHashCode = this.meta.hashCode() * 31;
        Folder folder = this.folder;
        int iHashCode2 = (this.file.hashCode() + ((iHashCode + (folder == null ? 0 : folder.hashCode())) * 31)) * 31;
        String str = this.fileId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastHistoryVersionId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        NoteMeta noteMeta = this.meta;
        Folder folder = this.folder;
        File file = this.file;
        String str = this.fileId;
        String str2 = this.lastHistoryVersionId;
        StringBuilder sb = new StringBuilder("NoteWrapper(meta=");
        sb.append(noteMeta);
        sb.append(", folder=");
        sb.append(folder);
        sb.append(", file=");
        sb.append(file);
        sb.append(", fileId=");
        sb.append(str);
        sb.append(", lastHistoryVersionId=");
        return OooO00o.OooO0OO(sb, str2, ")");
    }

    public /* synthetic */ NoteWrapper(NoteMeta noteMeta, Folder folder, File file, String str, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this(noteMeta, folder, file, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
