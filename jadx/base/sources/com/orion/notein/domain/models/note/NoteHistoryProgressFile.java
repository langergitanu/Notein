package com.orion.notein.domain.models.note;

import androidx.core.app.NotificationCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteHistoryProgressFile;", "", NotificationCompat.CATEGORY_PROGRESS, "", "file", "Ljava/io/File;", "<init>", "(ILjava/io/File;)V", "getProgress", "()I", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteHistoryProgressFile {
    private final File file;
    private final int progress;

    public NoteHistoryProgressFile(int i, File file) {
        this.progress = i;
        this.file = file;
    }

    public static /* synthetic */ NoteHistoryProgressFile copy$default(NoteHistoryProgressFile noteHistoryProgressFile, int i, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noteHistoryProgressFile.progress;
        }
        if ((i2 & 2) != 0) {
            file = noteHistoryProgressFile.file;
        }
        return noteHistoryProgressFile.copy(i, file);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final NoteHistoryProgressFile copy(int progress, File file) {
        return new NoteHistoryProgressFile(progress, file);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteHistoryProgressFile)) {
            return false;
        }
        NoteHistoryProgressFile noteHistoryProgressFile = (NoteHistoryProgressFile) other;
        return this.progress == noteHistoryProgressFile.progress && OooOOO0.OooO0O0(this.file, noteHistoryProgressFile.file);
    }

    public final File getFile() {
        return this.file;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.progress) * 31;
        File file = this.file;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public String toString() {
        return "NoteHistoryProgressFile(progress=" + this.progress + ", file=" + this.file + ")";
    }

    public /* synthetic */ NoteHistoryProgressFile(int i, File file, int i2, C24018OooO0oo c24018OooO0oo) {
        this(i, (i2 & 2) != 0 ? null : file);
    }
}
