package com.orion.notein.domain.models.note;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31190OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteInFile;", "", "", "md5", "Ljava/io/File;", "file", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "LoO00ooO/OooOooO;", "deleteFileWithItsParentAfterUsed", "()V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/io/File;", "copy", "(Ljava/lang/String;Ljava/io/File;)Lcom/orion/notein/domain/models/note/NoteInFile;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMd5", "Ljava/io/File;", "getFile", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteInFile {
    private final File file;
    private final String md5;

    public NoteInFile(String md5, File file) {
        OooOOO0.OooO0oO(md5, "md5");
        OooOOO0.OooO0oO(file, "file");
        this.md5 = md5;
        this.file = file;
    }

    public static /* synthetic */ NoteInFile copy$default(NoteInFile noteInFile, String str, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteInFile.md5;
        }
        if ((i & 2) != 0) {
            file = noteInFile.file;
        }
        return noteInFile.copy(str, file);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final NoteInFile copy(String md5, File file) {
        OooOOO0.OooO0oO(md5, "md5");
        OooOOO0.OooO0oO(file, "file");
        return new NoteInFile(md5, file);
    }

    public final void deleteFileWithItsParentAfterUsed() {
        String parent = this.file.getParent();
        if (parent != null) {
            C31190OooO0oo.OooO0oo(C31190OooO0oo.OooOOO0(parent));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteInFile)) {
            return false;
        }
        NoteInFile noteInFile = (NoteInFile) other;
        return OooOOO0.OooO0O0(this.md5, noteInFile.md5) && OooOOO0.OooO0O0(this.file, noteInFile.file);
    }

    public final File getFile() {
        return this.file;
    }

    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        return this.file.hashCode() + (this.md5.hashCode() * 31);
    }

    public String toString() {
        return "NoteInFile(md5=" + this.md5 + ", file=" + this.file + ")";
    }
}
