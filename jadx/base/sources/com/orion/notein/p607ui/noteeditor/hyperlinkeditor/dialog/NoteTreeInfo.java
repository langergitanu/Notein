package com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18252l2;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo000.EnumC29357OooOooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001bJn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b\n\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b5\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0010\u0010\u001bR\u0011\u00106\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001b¨\u00067"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/dialog/NoteTreeInfo;", "", "", NoteMeta.PROPERTY_NOTE_ID, NoteMeta.PROPERTY_TITLE, "Lo0Ooo000/OooOooO;", C18437z2.f56754h, "", FirebaseAnalytics.Param.LEVEL, "", "isSelected", "", C18252l2.f55571g, "Lcom/orion/notein/domain/models/folder/Folder;", "folder", NoteMeta.PROPERTY_PARENT_ID, "isEmptyFolder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lo0Ooo000/OooOooO;IZJLcom/orion/notein/domain/models/folder/Folder;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lo0Ooo000/OooOooO;", "component4", "()I", "component5", "()Z", "component6", "()J", "component7", "()Lcom/orion/notein/domain/models/folder/Folder;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lo0Ooo000/OooOooO;IZJLcom/orion/notein/domain/models/folder/Folder;Ljava/lang/String;Z)Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/dialog/NoteTreeInfo;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNoteId", "getTitle", "Lo0Ooo000/OooOooO;", "getType", "I", "getLevel", "Z", "J", "getCreateTime", "Lcom/orion/notein/domain/models/folder/Folder;", "getFolder", "getParentId", "isFolder", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteTreeInfo {
    private final long createTime;
    private final Folder folder;
    private final boolean isEmptyFolder;
    private final boolean isSelected;
    private final int level;
    private final String noteId;
    private final String parentId;
    private final String title;
    private final EnumC29357OooOooO type;

    public NoteTreeInfo(String noteId, String title, EnumC29357OooOooO type, int i, boolean z, long j, Folder folder, String str, boolean z2) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(type, "type");
        this.noteId = noteId;
        this.title = title;
        this.type = type;
        this.level = i;
        this.isSelected = z;
        this.createTime = j;
        this.folder = folder;
        this.parentId = str;
        this.isEmptyFolder = z2;
    }

    public static /* synthetic */ NoteTreeInfo copy$default(NoteTreeInfo noteTreeInfo, String str, String str2, EnumC29357OooOooO enumC29357OooOooO, int i, boolean z, long j, Folder folder, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteTreeInfo.noteId;
        }
        if ((i2 & 2) != 0) {
            str2 = noteTreeInfo.title;
        }
        if ((i2 & 4) != 0) {
            enumC29357OooOooO = noteTreeInfo.type;
        }
        if ((i2 & 8) != 0) {
            i = noteTreeInfo.level;
        }
        if ((i2 & 16) != 0) {
            z = noteTreeInfo.isSelected;
        }
        if ((i2 & 32) != 0) {
            j = noteTreeInfo.createTime;
        }
        if ((i2 & 64) != 0) {
            folder = noteTreeInfo.folder;
        }
        if ((i2 & 128) != 0) {
            str3 = noteTreeInfo.parentId;
        }
        if ((i2 & 256) != 0) {
            z2 = noteTreeInfo.isEmptyFolder;
        }
        boolean z3 = z2;
        Folder folder2 = folder;
        long j2 = j;
        int i3 = i;
        boolean z4 = z;
        EnumC29357OooOooO enumC29357OooOooO2 = enumC29357OooOooO;
        return noteTreeInfo.copy(str, str2, enumC29357OooOooO2, i3, z4, j2, folder2, str3, z3);
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
    public final EnumC29357OooOooO getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Folder getFolder() {
        return this.folder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsEmptyFolder() {
        return this.isEmptyFolder;
    }

    public final NoteTreeInfo copy(String noteId, String title, EnumC29357OooOooO type, int level, boolean isSelected, long createTime, Folder folder, String parentId, boolean isEmptyFolder) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(type, "type");
        return new NoteTreeInfo(noteId, title, type, level, isSelected, createTime, folder, parentId, isEmptyFolder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteTreeInfo)) {
            return false;
        }
        NoteTreeInfo noteTreeInfo = (NoteTreeInfo) other;
        return OooOOO0.OooO0O0(this.noteId, noteTreeInfo.noteId) && OooOOO0.OooO0O0(this.title, noteTreeInfo.title) && this.type == noteTreeInfo.type && this.level == noteTreeInfo.level && this.isSelected == noteTreeInfo.isSelected && this.createTime == noteTreeInfo.createTime && OooOOO0.OooO0O0(this.folder, noteTreeInfo.folder) && OooOOO0.OooO0O0(this.parentId, noteTreeInfo.parentId) && this.isEmptyFolder == noteTreeInfo.isEmptyFolder;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Folder getFolder() {
        return this.folder;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC29357OooOooO getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.level, (this.type.hashCode() + OooO00o.OooO0O0(this.noteId.hashCode() * 31, 31, this.title)) * 31, 31), 31, this.isSelected), 31, this.createTime);
        Folder folder = this.folder;
        int iHashCode = (iOooO0O0 + (folder == null ? 0 : folder.hashCode())) * 31;
        String str = this.parentId;
        return Boolean.hashCode(this.isEmptyFolder) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isEmptyFolder() {
        return this.isEmptyFolder;
    }

    public final boolean isFolder() {
        EnumC29357OooOooO enumC29357OooOooO = this.type;
        return enumC29357OooOooO == EnumC29357OooOooO.f104117OooOoO || enumC29357OooOooO == EnumC29357OooOooO.f104116OooOo0o;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.noteId;
        String str2 = this.title;
        EnumC29357OooOooO enumC29357OooOooO = this.type;
        int i = this.level;
        boolean z = this.isSelected;
        long j = this.createTime;
        Folder folder = this.folder;
        String str3 = this.parentId;
        boolean z2 = this.isEmptyFolder;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteTreeInfo(noteId=", str, ", title=", str2, ", type=");
        sbOooO0O0.append(enumC29357OooOooO);
        sbOooO0O0.append(", level=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", isSelected=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", createTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", folder=");
        sbOooO0O0.append(folder);
        sbOooO0O0.append(", parentId=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", isEmptyFolder=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ NoteTreeInfo(String str, String str2, EnumC29357OooOooO enumC29357OooOooO, int i, boolean z, long j, Folder folder, String str3, boolean z2, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, enumC29357OooOooO, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? null : folder, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? false : z2);
    }
}
