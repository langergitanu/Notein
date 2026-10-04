package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.concurrent.futures.OooO0O0;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\bS\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\u0016HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010AJ\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0016HÆ\u0003Jú\u0001\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010dJ\u0013\u0010e\u001a\u00020\u000b2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u0016HÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001f\"\u0004\b!\u0010\"R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010\"R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010\"R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010\"R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010\"R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\u001e\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010\"R\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?¨\u0006i"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteFileEntity;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, MyTemplate.PROPERTY_TEMPLATE_ID, Folder.PROPERTY_FOLDER_ID, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", NoteMeta.PROPERTY_PARENT_ID, NoteMeta.PROPERTY_FAVORITE, "", NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_IN_TRASH_BIN, "fileName", "mimeType", "recycledTime", "createdTime", "editedTime", "lastHistoryVersionId", "size", "dbVersion", "", "sortKey", "usingOwnPdf", "lockAdded", "extra", "syncType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JILjava/lang/Integer;ZZLjava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getNoteId", "setNoteId", "(Ljava/lang/String;)V", "getTemplateId", "setTemplateId", "getFolderId", "setFolderId", "getLastModificationTime", "()J", "setLastModificationTime", "(J)V", "getParentId", "setParentId", "getFavorite", "()Z", "setFavorite", "(Z)V", "getTitle", "setTitle", "getInTrashBin", "setInTrashBin", "getFileName", "getMimeType", "getRecycledTime", "getCreatedTime", "getEditedTime", "getLastHistoryVersionId", "getSize", "getDbVersion", "()I", "setDbVersion", "(I)V", "getSortKey", "()Ljava/lang/Integer;", "setSortKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUsingOwnPdf", "setUsingOwnPdf", "getLockAdded", "setLockAdded", "getExtra", "setExtra", "getSyncType", "setSyncType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JILjava/lang/Integer;ZZLjava/lang/String;I)Lcom/orion/notein/data/db/entity/NoteFileEntity;", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteFileEntity {
    private final long createdTime;
    private int dbVersion;
    private final long editedTime;
    private String extra;
    private boolean favorite;
    private final String fileName;
    private String folderId;
    private final String id;
    private boolean inTrashBin;
    private final String lastHistoryVersionId;
    private long lastModificationTime;
    private boolean lockAdded;
    private final String mimeType;
    private String noteId;
    private String parentId;
    private final long recycledTime;
    private final long size;
    private Integer sortKey;
    private int syncType;
    private String templateId;
    private String title;
    private boolean usingOwnPdf;

    public NoteFileEntity(String id, String str, String str2, String str3, long j, String str4, boolean z, String str5, boolean z2, String fileName, String mimeType, long j2, long j3, long j4, String str6, long j5, int i, Integer num, boolean z3, boolean z4, String str7, int i2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(fileName, "fileName");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.id = id;
        this.noteId = str;
        this.templateId = str2;
        this.folderId = str3;
        this.lastModificationTime = j;
        this.parentId = str4;
        this.favorite = z;
        this.title = str5;
        this.inTrashBin = z2;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.recycledTime = j2;
        this.createdTime = j3;
        this.editedTime = j4;
        this.lastHistoryVersionId = str6;
        this.size = j5;
        this.dbVersion = i;
        this.sortKey = num;
        this.usingOwnPdf = z3;
        this.lockAdded = z4;
        this.extra = str7;
        this.syncType = i2;
    }

    public static /* synthetic */ NoteFileEntity copy$default(NoteFileEntity noteFileEntity, String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, boolean z2, String str7, String str8, long j2, long j3, long j4, String str9, long j5, int i, Integer num, boolean z3, boolean z4, String str10, int i2, int i3, Object obj) {
        int i4;
        String str11;
        String str12 = (i3 & 1) != 0 ? noteFileEntity.id : str;
        String str13 = (i3 & 2) != 0 ? noteFileEntity.noteId : str2;
        String str14 = (i3 & 4) != 0 ? noteFileEntity.templateId : str3;
        String str15 = (i3 & 8) != 0 ? noteFileEntity.folderId : str4;
        long j6 = (i3 & 16) != 0 ? noteFileEntity.lastModificationTime : j;
        String str16 = (i3 & 32) != 0 ? noteFileEntity.parentId : str5;
        boolean z5 = (i3 & 64) != 0 ? noteFileEntity.favorite : z;
        String str17 = (i3 & 128) != 0 ? noteFileEntity.title : str6;
        boolean z6 = (i3 & 256) != 0 ? noteFileEntity.inTrashBin : z2;
        String str18 = (i3 & 512) != 0 ? noteFileEntity.fileName : str7;
        String str19 = (i3 & 1024) != 0 ? noteFileEntity.mimeType : str8;
        long j7 = (i3 & 2048) != 0 ? noteFileEntity.recycledTime : j2;
        String str20 = str12;
        String str21 = str13;
        long j8 = (i3 & 4096) != 0 ? noteFileEntity.createdTime : j3;
        long j9 = (i3 & 8192) != 0 ? noteFileEntity.editedTime : j4;
        String str22 = (i3 & 16384) != 0 ? noteFileEntity.lastHistoryVersionId : str9;
        long j10 = (32768 & i3) != 0 ? noteFileEntity.size : j5;
        int i5 = (i3 & 65536) != 0 ? noteFileEntity.dbVersion : i;
        long j11 = j10;
        Integer num2 = (i3 & 131072) != 0 ? noteFileEntity.sortKey : num;
        boolean z7 = (i3 & 262144) != 0 ? noteFileEntity.usingOwnPdf : z3;
        Integer num3 = num2;
        boolean z8 = (i3 & 524288) != 0 ? noteFileEntity.lockAdded : z4;
        String str23 = (i3 & 1048576) != 0 ? noteFileEntity.extra : str10;
        if ((i3 & 2097152) != 0) {
            str11 = str23;
            i4 = noteFileEntity.syncType;
        } else {
            i4 = i2;
            str11 = str23;
        }
        return noteFileEntity.copy(str20, str21, str14, str15, j6, str16, z5, str17, z6, str18, str19, j7, j8, j9, str22, j11, i5, num3, z7, z8, str11, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getRecycledTime() {
        return this.recycledTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getEditedTime() {
        return this.editedTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDbVersion() {
        return this.dbVersion;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getLockAdded() {
        return this.lockAdded;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getSyncType() {
        return this.syncType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFolderId() {
        return this.folderId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final NoteFileEntity copy(String id, String noteId, String templateId, String folderId, long lastModificationTime, String parentId, boolean favorite, String title, boolean inTrashBin, String fileName, String mimeType, long recycledTime, long createdTime, long editedTime, String lastHistoryVersionId, long size, int dbVersion, Integer sortKey, boolean usingOwnPdf, boolean lockAdded, String extra, int syncType) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(fileName, "fileName");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        return new NoteFileEntity(id, noteId, templateId, folderId, lastModificationTime, parentId, favorite, title, inTrashBin, fileName, mimeType, recycledTime, createdTime, editedTime, lastHistoryVersionId, size, dbVersion, sortKey, usingOwnPdf, lockAdded, extra, syncType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteFileEntity)) {
            return false;
        }
        NoteFileEntity noteFileEntity = (NoteFileEntity) other;
        return OooOOO0.OooO0O0(this.id, noteFileEntity.id) && OooOOO0.OooO0O0(this.noteId, noteFileEntity.noteId) && OooOOO0.OooO0O0(this.templateId, noteFileEntity.templateId) && OooOOO0.OooO0O0(this.folderId, noteFileEntity.folderId) && this.lastModificationTime == noteFileEntity.lastModificationTime && OooOOO0.OooO0O0(this.parentId, noteFileEntity.parentId) && this.favorite == noteFileEntity.favorite && OooOOO0.OooO0O0(this.title, noteFileEntity.title) && this.inTrashBin == noteFileEntity.inTrashBin && OooOOO0.OooO0O0(this.fileName, noteFileEntity.fileName) && OooOOO0.OooO0O0(this.mimeType, noteFileEntity.mimeType) && this.recycledTime == noteFileEntity.recycledTime && this.createdTime == noteFileEntity.createdTime && this.editedTime == noteFileEntity.editedTime && OooOOO0.OooO0O0(this.lastHistoryVersionId, noteFileEntity.lastHistoryVersionId) && this.size == noteFileEntity.size && this.dbVersion == noteFileEntity.dbVersion && OooOOO0.OooO0O0(this.sortKey, noteFileEntity.sortKey) && this.usingOwnPdf == noteFileEntity.usingOwnPdf && this.lockAdded == noteFileEntity.lockAdded && OooOOO0.OooO0O0(this.extra, noteFileEntity.extra) && this.syncType == noteFileEntity.syncType;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final int getDbVersion() {
        return this.dbVersion;
    }

    public final long getEditedTime() {
        return this.editedTime;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final boolean getLockAdded() {
        return this.lockAdded;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final long getRecycledTime() {
        return this.recycledTime;
    }

    public final long getSize() {
        return this.size;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final int getSyncType() {
        return this.syncType;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.noteId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.templateId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.folderId;
        int iOooO0O0 = C20703o000000o.OooO0O0((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.lastModificationTime);
        String str4 = this.parentId;
        int iOooO0O02 = o00000.OooO0O0((iOooO0O0 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.favorite);
        String str5 = this.title;
        int iOooO0O03 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(o00000.OooO0O0((iOooO0O02 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.inTrashBin), 31, this.fileName), 31, this.mimeType), 31, this.recycledTime), 31, this.createdTime), 31, this.editedTime);
        String str6 = this.lastHistoryVersionId;
        int iOooO00o = C20785Oooo00o.OooO00o(this.dbVersion, C20703o000000o.OooO0O0((iOooO0O03 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.size), 31);
        Integer num = this.sortKey;
        int iOooO0O04 = o00000.OooO0O0(o00000.OooO0O0((iOooO00o + (num == null ? 0 : num.hashCode())) * 31, 31, this.usingOwnPdf), 31, this.lockAdded);
        String str7 = this.extra;
        return Integer.hashCode(this.syncType) + ((iOooO0O04 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final void setDbVersion(int i) {
        this.dbVersion = i;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFavorite(boolean z) {
        this.favorite = z;
    }

    public final void setFolderId(String str) {
        this.folderId = str;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setLockAdded(boolean z) {
        this.lockAdded = z;
    }

    public final void setNoteId(String str) {
        this.noteId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setSortKey(Integer num) {
        this.sortKey = num;
    }

    public final void setSyncType(int i) {
        this.syncType = i;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUsingOwnPdf(boolean z) {
        this.usingOwnPdf = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.templateId;
        String str4 = this.folderId;
        long j = this.lastModificationTime;
        String str5 = this.parentId;
        boolean z = this.favorite;
        String str6 = this.title;
        boolean z2 = this.inTrashBin;
        String str7 = this.fileName;
        String str8 = this.mimeType;
        long j2 = this.recycledTime;
        long j3 = this.createdTime;
        long j4 = this.editedTime;
        String str9 = this.lastHistoryVersionId;
        long j5 = this.size;
        int i = this.dbVersion;
        Integer num = this.sortKey;
        boolean z3 = this.usingOwnPdf;
        boolean z4 = this.lockAdded;
        String str10 = this.extra;
        int i2 = this.syncType;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteFileEntity(id=", str, ", noteId=", str2, ", templateId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", folderId=", str4, ", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", parentId=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", title=");
        sbOooO0O0.append(str6);
        sbOooO0O0.append(", inTrashBin=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", fileName=");
        sbOooO0O0.append(str7);
        OooO0O0.OooO0O0(sbOooO0O0, ", mimeType=", str8, ", recycledTime=");
        sbOooO0O0.append(j2);
        C22205OooOOo.OooO0OO(j3, ", createdTime=", ", editedTime=", sbOooO0O0);
        sbOooO0O0.append(j4);
        sbOooO0O0.append(", lastHistoryVersionId=");
        sbOooO0O0.append(str9);
        C22205OooOOo.OooO0OO(j5, ", size=", ", dbVersion=", sbOooO0O0);
        sbOooO0O0.append(i);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", usingOwnPdf=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", lockAdded=");
        sbOooO0O0.append(z4);
        sbOooO0O0.append(", extra=");
        sbOooO0O0.append(str10);
        sbOooO0O0.append(", syncType=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NoteFileEntity(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, long r36, java.lang.String r38, boolean r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, long r44, long r46, long r48, java.lang.String r50, long r51, int r53, java.lang.Integer r54, boolean r55, boolean r56, java.lang.String r57, int r58, int r59, kotlin.jvm.internal.C24018OooO0oo r60) {
        /*
            r31 = this;
            r0 = r59
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r33
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L11
            r6 = r2
            goto L13
        L11:
            r6 = r34
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r35
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r3 = 0
            r8 = r3
            goto L25
        L23:
            r8 = r36
        L25:
            r1 = r0 & 32
            if (r1 == 0) goto L2b
            r10 = r2
            goto L2d
        L2b:
            r10 = r38
        L2d:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L34
            r11 = r3
            goto L36
        L34:
            r11 = r39
        L36:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3c
            r12 = r2
            goto L3e
        L3c:
            r12 = r40
        L3e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L44
            r13 = r3
            goto L46
        L44:
            r13 = r41
        L46:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L4d
            r22 = r2
            goto L4f
        L4d:
            r22 = r50
        L4f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L57
            r26 = r2
            goto L59
        L57:
            r26 = r54
        L59:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L61
            r27 = r3
            goto L63
        L61:
            r27 = r55
        L63:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L6b
            r28 = r3
            goto L6d
        L6b:
            r28 = r56
        L6d:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L75
            r29 = r2
            goto L77
        L75:
            r29 = r57
        L77:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L91
            r30 = r3
            r4 = r32
            r14 = r42
            r15 = r43
            r16 = r44
            r18 = r46
            r20 = r48
            r23 = r51
            r25 = r53
            r3 = r31
            goto La5
        L91:
            r30 = r58
            r3 = r31
            r4 = r32
            r14 = r42
            r15 = r43
            r16 = r44
            r18 = r46
            r20 = r48
            r23 = r51
            r25 = r53
        La5:
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r23, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.data.p602db.entity.NoteFileEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, long, long, long, java.lang.String, long, int, java.lang.Integer, boolean, boolean, java.lang.String, int, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
