package com.orion.notein.domain.models.note;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\bL\b\u0086\b\u0018\u0000 b2\u00020\u0001:\u0001bBñ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u000bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\u0017HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010AJ\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jú\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020\u0017HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001f\"\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010\"R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010\"R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010\"R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u001f¨\u0006c"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteFile;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, MyTemplate.PROPERTY_TEMPLATE_ID, Folder.PROPERTY_FOLDER_ID, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", NoteMeta.PROPERTY_PARENT_ID, NoteMeta.PROPERTY_FAVORITE, "", NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_IN_TRASH_BIN, "fileName", "mimeType", "recycled", "directlyRecycled", "recycledTime", "createdTime", "editedTime", "size", "dbVersion", "", "sortKey", "usingOwnPdf", "lockAdded", "extra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZJJJJILjava/lang/Integer;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getNoteId", "setNoteId", "(Ljava/lang/String;)V", "getTemplateId", "setTemplateId", "getFolderId", "setFolderId", "getLastModificationTime", "()J", "setLastModificationTime", "(J)V", "getParentId", "setParentId", "getFavorite", "()Z", "setFavorite", "(Z)V", "getTitle", "setTitle", "getInTrashBin", "setInTrashBin", "getFileName", "getMimeType", "setMimeType", "getRecycled", "getDirectlyRecycled", "getRecycledTime", "getCreatedTime", "getEditedTime", "getSize", "getDbVersion", "()I", "getSortKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsingOwnPdf", "getLockAdded", "getExtra", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZJJJJILjava/lang/Integer;ZZLjava/lang/String;)Lcom/orion/notein/domain/models/note/NoteFile;", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteFile {
    public static final String ERROR_HAS_CURSOR = "10001";
    public static final String ERROR_NETWORK_ERROR = "10000";
    public static final String ERROR_NOT_WIFI = "10004";
    public static final String ERROR_REMOTE_HAS_CONFLICT_WITH_LOCAL = "10003";
    public static final String ERROR_REQUEST_HISTORY_VERSION_FAILED = "10002";
    private final long createdTime;
    private final int dbVersion;
    private final boolean directlyRecycled;
    private final long editedTime;
    private final String extra;
    private boolean favorite;
    private final String fileName;
    private String folderId;
    private final String id;
    private boolean inTrashBin;
    private long lastModificationTime;
    private final boolean lockAdded;
    private String mimeType;
    private String noteId;
    private String parentId;
    private final boolean recycled;
    private final long recycledTime;
    private final long size;
    private final Integer sortKey;
    private String templateId;
    private String title;
    private final boolean usingOwnPdf;

    public NoteFile(String id, String str, String str2, String str3, long j, String str4, boolean z, String str5, boolean z2, String fileName, String str6, boolean z3, boolean z4, long j2, long j3, long j4, long j5, int i, Integer num, boolean z5, boolean z6, String str7) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(fileName, "fileName");
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
        this.mimeType = str6;
        this.recycled = z3;
        this.directlyRecycled = z4;
        this.recycledTime = j2;
        this.createdTime = j3;
        this.editedTime = j4;
        this.size = j5;
        this.dbVersion = i;
        this.sortKey = num;
        this.usingOwnPdf = z5;
        this.lockAdded = z6;
        this.extra = str7;
    }

    public static /* synthetic */ NoteFile copy$default(NoteFile noteFile, String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, boolean z2, String str7, String str8, boolean z3, boolean z4, long j2, long j3, long j4, long j5, int i, Integer num, boolean z5, boolean z6, String str9, int i2, Object obj) {
        String str10;
        boolean z7;
        String str11 = (i2 & 1) != 0 ? noteFile.id : str;
        String str12 = (i2 & 2) != 0 ? noteFile.noteId : str2;
        String str13 = (i2 & 4) != 0 ? noteFile.templateId : str3;
        String str14 = (i2 & 8) != 0 ? noteFile.folderId : str4;
        long j6 = (i2 & 16) != 0 ? noteFile.lastModificationTime : j;
        String str15 = (i2 & 32) != 0 ? noteFile.parentId : str5;
        boolean z8 = (i2 & 64) != 0 ? noteFile.favorite : z;
        String str16 = (i2 & 128) != 0 ? noteFile.title : str6;
        boolean z9 = (i2 & 256) != 0 ? noteFile.inTrashBin : z2;
        String str17 = (i2 & 512) != 0 ? noteFile.fileName : str7;
        String str18 = (i2 & 1024) != 0 ? noteFile.mimeType : str8;
        boolean z10 = (i2 & 2048) != 0 ? noteFile.recycled : z3;
        boolean z11 = (i2 & 4096) != 0 ? noteFile.directlyRecycled : z4;
        String str19 = str11;
        String str20 = str12;
        long j7 = (i2 & 8192) != 0 ? noteFile.recycledTime : j2;
        long j8 = (i2 & 16384) != 0 ? noteFile.createdTime : j3;
        long j9 = (i2 & 32768) != 0 ? noteFile.editedTime : j4;
        long j10 = (i2 & 65536) != 0 ? noteFile.size : j5;
        int i3 = (i2 & 131072) != 0 ? noteFile.dbVersion : i;
        long j11 = j10;
        Integer num2 = (i2 & 262144) != 0 ? noteFile.sortKey : num;
        boolean z12 = (i2 & 524288) != 0 ? noteFile.usingOwnPdf : z5;
        Integer num3 = num2;
        boolean z13 = (i2 & 1048576) != 0 ? noteFile.lockAdded : z6;
        if ((i2 & 2097152) != 0) {
            z7 = z13;
            str10 = noteFile.extra;
        } else {
            str10 = str9;
            z7 = z13;
        }
        return noteFile.copy(str19, str20, str13, str14, j6, str15, z8, str16, z9, str17, str18, z10, z11, j7, j8, j9, j11, i3, num3, z12, z7, str10);
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
    public final boolean getRecycled() {
        return this.recycled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getDirectlyRecycled() {
        return this.directlyRecycled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getRecycledTime() {
        return this.recycledTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getEditedTime() {
        return this.editedTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getDbVersion() {
        return this.dbVersion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getLockAdded() {
        return this.lockAdded;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getExtra() {
        return this.extra;
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

    public final NoteFile copy(String id, String noteId, String templateId, String folderId, long lastModificationTime, String parentId, boolean favorite, String title, boolean inTrashBin, String fileName, String mimeType, boolean recycled, boolean directlyRecycled, long recycledTime, long createdTime, long editedTime, long size, int dbVersion, Integer sortKey, boolean usingOwnPdf, boolean lockAdded, String extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(fileName, "fileName");
        return new NoteFile(id, noteId, templateId, folderId, lastModificationTime, parentId, favorite, title, inTrashBin, fileName, mimeType, recycled, directlyRecycled, recycledTime, createdTime, editedTime, size, dbVersion, sortKey, usingOwnPdf, lockAdded, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteFile)) {
            return false;
        }
        NoteFile noteFile = (NoteFile) other;
        return OooOOO0.OooO0O0(this.id, noteFile.id) && OooOOO0.OooO0O0(this.noteId, noteFile.noteId) && OooOOO0.OooO0O0(this.templateId, noteFile.templateId) && OooOOO0.OooO0O0(this.folderId, noteFile.folderId) && this.lastModificationTime == noteFile.lastModificationTime && OooOOO0.OooO0O0(this.parentId, noteFile.parentId) && this.favorite == noteFile.favorite && OooOOO0.OooO0O0(this.title, noteFile.title) && this.inTrashBin == noteFile.inTrashBin && OooOOO0.OooO0O0(this.fileName, noteFile.fileName) && OooOOO0.OooO0O0(this.mimeType, noteFile.mimeType) && this.recycled == noteFile.recycled && this.directlyRecycled == noteFile.directlyRecycled && this.recycledTime == noteFile.recycledTime && this.createdTime == noteFile.createdTime && this.editedTime == noteFile.editedTime && this.size == noteFile.size && this.dbVersion == noteFile.dbVersion && OooOOO0.OooO0O0(this.sortKey, noteFile.sortKey) && this.usingOwnPdf == noteFile.usingOwnPdf && this.lockAdded == noteFile.lockAdded && OooOOO0.OooO0O0(this.extra, noteFile.extra);
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final int getDbVersion() {
        return this.dbVersion;
    }

    public final boolean getDirectlyRecycled() {
        return this.directlyRecycled;
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

    public final boolean getRecycled() {
        return this.recycled;
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
        int iOooO0O03 = OooO00o.OooO0O0(o00000.OooO0O0((iOooO0O02 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.inTrashBin), 31, this.fileName);
        String str6 = this.mimeType;
        int iOooO00o = C20785Oooo00o.OooO00o(this.dbVersion, C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0((iOooO0O03 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.recycled), 31, this.directlyRecycled), 31, this.recycledTime), 31, this.createdTime), 31, this.editedTime), 31, this.size), 31);
        Integer num = this.sortKey;
        int iOooO0O04 = o00000.OooO0O0(o00000.OooO0O0((iOooO00o + (num == null ? 0 : num.hashCode())) * 31, 31, this.usingOwnPdf), 31, this.lockAdded);
        String str7 = this.extra;
        return iOooO0O04 + (str7 != null ? str7.hashCode() : 0);
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

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setNoteId(String str) {
        this.noteId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
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
        boolean z3 = this.recycled;
        boolean z4 = this.directlyRecycled;
        long j2 = this.recycledTime;
        long j3 = this.createdTime;
        long j4 = this.editedTime;
        long j5 = this.size;
        int i = this.dbVersion;
        Integer num = this.sortKey;
        boolean z5 = this.usingOwnPdf;
        boolean z6 = this.lockAdded;
        String str9 = this.extra;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteFile(id=", str, ", noteId=", str2, ", templateId=");
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
        sbOooO0O0.append(", mimeType=");
        sbOooO0O0.append(str8);
        sbOooO0O0.append(", recycled=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", directlyRecycled=");
        sbOooO0O0.append(z4);
        sbOooO0O0.append(", recycledTime=");
        sbOooO0O0.append(j2);
        C22205OooOOo.OooO0OO(j3, ", createdTime=", ", editedTime=", sbOooO0O0);
        sbOooO0O0.append(j4);
        C22205OooOOo.OooO0OO(j5, ", size=", ", dbVersion=", sbOooO0O0);
        sbOooO0O0.append(i);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", usingOwnPdf=");
        sbOooO0O0.append(z5);
        sbOooO0O0.append(", lockAdded=");
        sbOooO0O0.append(z6);
        sbOooO0O0.append(", extra=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str9, ")");
    }

    public /* synthetic */ NoteFile(String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, boolean z2, String str7, String str8, boolean z3, boolean z4, long j2, long j3, long j4, long j5, int i, Integer num, boolean z5, boolean z6, String str9, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) == 0 ? str8 : "", (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4, (i2 & 8192) != 0 ? 0L : j2, (i2 & 16384) != 0 ? 0L : j3, (32768 & i2) != 0 ? 0L : j4, (65536 & i2) != 0 ? 0L : j5, (131072 & i2) != 0 ? 0 : i, (i2 & 262144) != 0 ? null : num, (i2 & 524288) != 0 ? false : z5, (i2 & 1048576) == 0 ? z6 : false, (i2 & 2097152) != 0 ? null : str9);
    }
}
