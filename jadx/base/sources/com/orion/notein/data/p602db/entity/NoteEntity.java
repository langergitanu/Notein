package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\u0013HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0016HÆ\u0003J\t\u0010T\u001a\u00020\rHÆ\u0003J\t\u0010U\u001a\u00020\u0019HÆ\u0003J\t\u0010V\u001a\u00020\u0019HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010BJè\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\r2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u0013HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010$R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010$R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010$R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010$R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010$R\u001e\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010.\"\u0004\b7\u00100R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010B¨\u0006^"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteEntity;", "", "id", "", TmemberRight.TAG_USERID, NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_PARENT_ID, "recoverParentId", "pageListJson", "pageLayerListJson", "outlines", "", NoteMeta.PROPERTY_FAVORITE, "", "defaultPageId", "tnPath", "pdfInfoId", NoteMeta.PROPERTY_IN_TRASH_BIN, "savedPageIndex", "", "activatedPageLayerId", "zoom", "", "unboundedNote", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "sortKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;FZJJLjava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getUserId", "getTitle", "getParentId", "setParentId", "(Ljava/lang/String;)V", "getRecoverParentId", "setRecoverParentId", "getPageListJson", "setPageListJson", "getPageLayerListJson", "setPageLayerListJson", "getOutlines", "()Ljava/util/List;", "getFavorite", "()Z", "setFavorite", "(Z)V", "getDefaultPageId", "setDefaultPageId", "getTnPath", "getPdfInfoId", "setPdfInfoId", "getInTrashBin", "setInTrashBin", "getSavedPageIndex", "()I", "getActivatedPageLayerId", "getZoom", "()F", "getUnboundedNote", "getCreationTime", "()J", "getLastModificationTime", "getSortKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;FZJJLjava/lang/Integer;)Lcom/orion/notein/data/db/entity/NoteEntity;", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteEntity {
    private final String activatedPageLayerId;
    private final long creationTime;
    private String defaultPageId;
    private boolean favorite;
    private final String id;
    private boolean inTrashBin;
    private final long lastModificationTime;
    private final List<String> outlines;
    private String pageLayerListJson;
    private String pageListJson;
    private String parentId;
    private String pdfInfoId;
    private String recoverParentId;
    private final int savedPageIndex;
    private final Integer sortKey;
    private final String title;
    private final String tnPath;
    private final boolean unboundedNote;
    private final String userId;
    private final float zoom;

    public NoteEntity(String id, String userId, String title, String str, String str2, String str3, String str4, List<String> outlines, boolean z, String defaultPageId, String tnPath, String str5, boolean z2, int i, String activatedPageLayerId, float f, boolean z3, long j, long j2, Integer num) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(defaultPageId, "defaultPageId");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.parentId = str;
        this.recoverParentId = str2;
        this.pageListJson = str3;
        this.pageLayerListJson = str4;
        this.outlines = outlines;
        this.favorite = z;
        this.defaultPageId = defaultPageId;
        this.tnPath = tnPath;
        this.pdfInfoId = str5;
        this.inTrashBin = z2;
        this.savedPageIndex = i;
        this.activatedPageLayerId = activatedPageLayerId;
        this.zoom = f;
        this.unboundedNote = z3;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.sortKey = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteEntity copy$default(NoteEntity noteEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, String str8, String str9, String str10, boolean z2, int i, String str11, float f, boolean z3, long j, long j2, Integer num, int i2, Object obj) {
        Integer num2;
        long j3;
        String str12 = (i2 & 1) != 0 ? noteEntity.id : str;
        String str13 = (i2 & 2) != 0 ? noteEntity.userId : str2;
        String str14 = (i2 & 4) != 0 ? noteEntity.title : str3;
        String str15 = (i2 & 8) != 0 ? noteEntity.parentId : str4;
        String str16 = (i2 & 16) != 0 ? noteEntity.recoverParentId : str5;
        String str17 = (i2 & 32) != 0 ? noteEntity.pageListJson : str6;
        String str18 = (i2 & 64) != 0 ? noteEntity.pageLayerListJson : str7;
        List list2 = (i2 & 128) != 0 ? noteEntity.outlines : list;
        boolean z4 = (i2 & 256) != 0 ? noteEntity.favorite : z;
        String str19 = (i2 & 512) != 0 ? noteEntity.defaultPageId : str8;
        String str20 = (i2 & 1024) != 0 ? noteEntity.tnPath : str9;
        String str21 = (i2 & 2048) != 0 ? noteEntity.pdfInfoId : str10;
        boolean z5 = (i2 & 4096) != 0 ? noteEntity.inTrashBin : z2;
        int i3 = (i2 & 8192) != 0 ? noteEntity.savedPageIndex : i;
        String str22 = str12;
        String str23 = (i2 & 16384) != 0 ? noteEntity.activatedPageLayerId : str11;
        float f2 = (i2 & 32768) != 0 ? noteEntity.zoom : f;
        boolean z6 = (i2 & 65536) != 0 ? noteEntity.unboundedNote : z3;
        String str24 = str23;
        long j4 = (i2 & 131072) != 0 ? noteEntity.creationTime : j;
        long j5 = (i2 & 262144) != 0 ? noteEntity.lastModificationTime : j2;
        if ((i2 & 524288) != 0) {
            j3 = j5;
            num2 = noteEntity.sortKey;
        } else {
            num2 = num;
            j3 = j5;
        }
        return noteEntity.copy(str22, str13, str14, str15, str16, str17, str18, list2, z4, str19, str20, str21, z5, i3, str24, f2, z6, j4, j3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDefaultPageId() {
        return this.defaultPageId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPdfInfoId() {
        return this.pdfInfoId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPageListJson() {
        return this.pageListJson;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPageLayerListJson() {
        return this.pageLayerListJson;
    }

    public final List<String> component8() {
        return this.outlines;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    public final NoteEntity copy(String id, String userId, String title, String parentId, String recoverParentId, String pageListJson, String pageLayerListJson, List<String> outlines, boolean favorite, String defaultPageId, String tnPath, String pdfInfoId, boolean inTrashBin, int savedPageIndex, String activatedPageLayerId, float zoom, boolean unboundedNote, long creationTime, long lastModificationTime, Integer sortKey) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(defaultPageId, "defaultPageId");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        return new NoteEntity(id, userId, title, parentId, recoverParentId, pageListJson, pageLayerListJson, outlines, favorite, defaultPageId, tnPath, pdfInfoId, inTrashBin, savedPageIndex, activatedPageLayerId, zoom, unboundedNote, creationTime, lastModificationTime, sortKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteEntity)) {
            return false;
        }
        NoteEntity noteEntity = (NoteEntity) other;
        return OooOOO0.OooO0O0(this.id, noteEntity.id) && OooOOO0.OooO0O0(this.userId, noteEntity.userId) && OooOOO0.OooO0O0(this.title, noteEntity.title) && OooOOO0.OooO0O0(this.parentId, noteEntity.parentId) && OooOOO0.OooO0O0(this.recoverParentId, noteEntity.recoverParentId) && OooOOO0.OooO0O0(this.pageListJson, noteEntity.pageListJson) && OooOOO0.OooO0O0(this.pageLayerListJson, noteEntity.pageLayerListJson) && OooOOO0.OooO0O0(this.outlines, noteEntity.outlines) && this.favorite == noteEntity.favorite && OooOOO0.OooO0O0(this.defaultPageId, noteEntity.defaultPageId) && OooOOO0.OooO0O0(this.tnPath, noteEntity.tnPath) && OooOOO0.OooO0O0(this.pdfInfoId, noteEntity.pdfInfoId) && this.inTrashBin == noteEntity.inTrashBin && this.savedPageIndex == noteEntity.savedPageIndex && OooOOO0.OooO0O0(this.activatedPageLayerId, noteEntity.activatedPageLayerId) && Float.compare(this.zoom, noteEntity.zoom) == 0 && this.unboundedNote == noteEntity.unboundedNote && this.creationTime == noteEntity.creationTime && this.lastModificationTime == noteEntity.lastModificationTime && OooOOO0.OooO0O0(this.sortKey, noteEntity.sortKey);
    }

    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getDefaultPageId() {
        return this.defaultPageId;
    }

    public final boolean getFavorite() {
        return this.favorite;
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

    public final List<String> getOutlines() {
        return this.outlines;
    }

    public final String getPageLayerListJson() {
        return this.pageLayerListJson;
    }

    public final String getPageListJson() {
        return this.pageListJson;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPdfInfoId() {
        return this.pdfInfoId;
    }

    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.userId), 31, this.title);
        String str = this.parentId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recoverParentId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pageListJson;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageLayerListJson;
        int iOooO0O02 = OooO00o.OooO0O0(OooO00o.OooO0O0(o00000.OooO0O0(C21445Oooo.OooO00o(this.outlines, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.favorite), 31, this.defaultPageId), 31, this.tnPath);
        String str5 = this.pdfInfoId;
        int iOooO0O03 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(C20509OooO0oo.OooO0OO(this.zoom, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.savedPageIndex, o00000.OooO0O0((iOooO0O02 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.inTrashBin), 31), 31, this.activatedPageLayerId), 31), 31, this.unboundedNote), 31, this.creationTime), 31, this.lastModificationTime);
        Integer num = this.sortKey;
        return iOooO0O03 + (num != null ? num.hashCode() : 0);
    }

    public final void setDefaultPageId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.defaultPageId = str;
    }

    public final void setFavorite(boolean z) {
        this.favorite = z;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setPageLayerListJson(String str) {
        this.pageLayerListJson = str;
    }

    public final void setPageListJson(String str) {
        this.pageListJson = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPdfInfoId(String str) {
        this.pdfInfoId = str;
    }

    public final void setRecoverParentId(String str) {
        this.recoverParentId = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.title;
        String str4 = this.parentId;
        String str5 = this.recoverParentId;
        String str6 = this.pageListJson;
        String str7 = this.pageLayerListJson;
        List<String> list = this.outlines;
        boolean z = this.favorite;
        String str8 = this.defaultPageId;
        String str9 = this.tnPath;
        String str10 = this.pdfInfoId;
        boolean z2 = this.inTrashBin;
        int i = this.savedPageIndex;
        String str11 = this.activatedPageLayerId;
        float f = this.zoom;
        boolean z3 = this.unboundedNote;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Integer num = this.sortKey;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteEntity(id=", str, ", userId=", str2, ", title=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", parentId=", str4, ", recoverParentId=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", pageListJson=", str6, ", pageLayerListJson=");
        sbOooO0O0.append(str7);
        sbOooO0O0.append(", outlines=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", defaultPageId=");
        sbOooO0O0.append(str8);
        sbOooO0O0.append(", tnPath=");
        OooO0OO.OooO0o0(sbOooO0O0, str9, ", pdfInfoId=", str10, ", inTrashBin=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", savedPageIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", activatedPageLayerId=");
        sbOooO0O0.append(str11);
        sbOooO0O0.append(", zoom=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", unboundedNote=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", sortKey=", sbOooO0O0);
        sbOooO0O0.append(num);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ NoteEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, String str8, String str9, String str10, boolean z2, int i, String str11, float f, boolean z3, long j, long j2, Integer num, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i2 & 256) != 0 ? false : z, str8, str9, str10, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? 0 : i, str11, (32768 & i2) != 0 ? 1.0f : f, (65536 & i2) != 0 ? false : z3, j, j2, (i2 & 524288) != 0 ? null : num);
    }
}
