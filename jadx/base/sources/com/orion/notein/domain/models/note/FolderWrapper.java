package com.orion.notein.domain.models.note;

import androidx.concurrent.futures.OooO00o;
import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/FolderWrapper;", "", "folder", "Lcom/orion/notein/domain/models/folder/Folder;", "file", "Ljava/io/File;", "fileId", "", "<init>", "(Lcom/orion/notein/domain/models/folder/Folder;Ljava/io/File;Ljava/lang/String;)V", "getFolder", "()Lcom/orion/notein/domain/models/folder/Folder;", "getFile", "()Ljava/io/File;", "getFileId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class FolderWrapper {
    private final File file;
    private final String fileId;
    private final Folder folder;

    public FolderWrapper(Folder folder, File file, String str) {
        OooOOO0.OooO0oO(folder, "folder");
        OooOOO0.OooO0oO(file, "file");
        this.folder = folder;
        this.file = file;
        this.fileId = str;
    }

    public static /* synthetic */ FolderWrapper copy$default(FolderWrapper folderWrapper, Folder folder, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            folder = folderWrapper.folder;
        }
        if ((i & 2) != 0) {
            file = folderWrapper.file;
        }
        if ((i & 4) != 0) {
            str = folderWrapper.fileId;
        }
        return folderWrapper.copy(folder, file, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Folder getFolder() {
        return this.folder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    public final FolderWrapper copy(Folder folder, File file, String fileId) {
        OooOOO0.OooO0oO(folder, "folder");
        OooOOO0.OooO0oO(file, "file");
        return new FolderWrapper(folder, file, fileId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FolderWrapper)) {
            return false;
        }
        FolderWrapper folderWrapper = (FolderWrapper) other;
        return OooOOO0.OooO0O0(this.folder, folderWrapper.folder) && OooOOO0.OooO0O0(this.file, folderWrapper.file) && OooOOO0.OooO0O0(this.fileId, folderWrapper.fileId);
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

    public int hashCode() {
        int iHashCode = (this.file.hashCode() + (this.folder.hashCode() * 31)) * 31;
        String str = this.fileId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Folder folder = this.folder;
        File file = this.file;
        String str = this.fileId;
        StringBuilder sb = new StringBuilder("FolderWrapper(folder=");
        sb.append(folder);
        sb.append(", file=");
        sb.append(file);
        sb.append(", fileId=");
        return OooO00o.OooO0OO(sb, str, ")");
    }

    public /* synthetic */ FolderWrapper(Folder folder, File file, String str, int i, C24018OooO0oo c24018OooO0oo) {
        this(folder, file, (i & 4) != 0 ? null : str);
    }
}
