package com.orion.notein.data.p602db.entity.old;

import OooOO0.OooO0O0;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017HÆ\u0003J·\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017HÆ\u0001J\u0013\u0010L\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0011HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u001e\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006P"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/old/PageEntity;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "paperSpecJson", "paperOrientation", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "paperThemeJson", "paperPaddingJson", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "tnPath", "unbounded", "", "source", "", "recoverNoteId", "recoverNoteTitle", "recoverIndex", NoteMeta.PROPERTY_IN_TRASH_BIN, "historyPageIdList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZILjava/lang/String;Ljava/lang/String;IZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getPaperSpecJson", "setPaperSpecJson", "(Ljava/lang/String;)V", "getPaperOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "getPaperThemeJson", "setPaperThemeJson", "getPaperPaddingJson", "setPaperPaddingJson", "getCreationTime", "()J", "getLastModificationTime", "getTnPath", "getUnbounded", "()Z", "setUnbounded", "(Z)V", "getSource", "()I", "setSource", "(I)V", "getRecoverNoteId", "getRecoverNoteTitle", "getRecoverIndex", "getInTrashBin", "setInTrashBin", "getHistoryPageIdList", "()Ljava/util/List;", "setHistoryPageIdList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageEntity {
    private final long creationTime;
    private List<String> historyPageIdList;
    private final String id;
    private boolean inTrashBin;
    private final long lastModificationTime;
    private final String noteId;
    private final PaperOrientation paperOrientation;
    private String paperPaddingJson;
    private String paperSpecJson;
    private String paperThemeJson;
    private final int recoverIndex;
    private final String recoverNoteId;
    private final String recoverNoteTitle;
    private int source;
    private final String tnPath;
    private boolean unbounded;

    public PageEntity(String id, String noteId, String str, PaperOrientation paperOrientation, String str2, String str3, long j, long j2, String tnPath, boolean z, int i, String recoverNoteId, String recoverNoteTitle, int i2, boolean z2, List<String> list) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(paperOrientation, "paperOrientation");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(recoverNoteId, "recoverNoteId");
        OooOOO0.OooO0oO(recoverNoteTitle, "recoverNoteTitle");
        this.id = id;
        this.noteId = noteId;
        this.paperSpecJson = str;
        this.paperOrientation = paperOrientation;
        this.paperThemeJson = str2;
        this.paperPaddingJson = str3;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.tnPath = tnPath;
        this.unbounded = z;
        this.source = i;
        this.recoverNoteId = recoverNoteId;
        this.recoverNoteTitle = recoverNoteTitle;
        this.recoverIndex = i2;
        this.inTrashBin = z2;
        this.historyPageIdList = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getUnbounded() {
        return this.unbounded;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRecoverNoteId() {
        return this.recoverNoteId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRecoverNoteTitle() {
        return this.recoverNoteTitle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getRecoverIndex() {
        return this.recoverIndex;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final List<String> component16() {
        return this.historyPageIdList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaperSpecJson() {
        return this.paperSpecJson;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaperOrientation getPaperOrientation() {
        return this.paperOrientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaperThemeJson() {
        return this.paperThemeJson;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaperPaddingJson() {
        return this.paperPaddingJson;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    public final PageEntity copy(String id, String noteId, String paperSpecJson, PaperOrientation paperOrientation, String paperThemeJson, String paperPaddingJson, long creationTime, long lastModificationTime, String tnPath, boolean unbounded, int source, String recoverNoteId, String recoverNoteTitle, int recoverIndex, boolean inTrashBin, List<String> historyPageIdList) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(paperOrientation, "paperOrientation");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(recoverNoteId, "recoverNoteId");
        OooOOO0.OooO0oO(recoverNoteTitle, "recoverNoteTitle");
        return new PageEntity(id, noteId, paperSpecJson, paperOrientation, paperThemeJson, paperPaddingJson, creationTime, lastModificationTime, tnPath, unbounded, source, recoverNoteId, recoverNoteTitle, recoverIndex, inTrashBin, historyPageIdList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) other;
        return OooOOO0.OooO0O0(this.id, pageEntity.id) && OooOOO0.OooO0O0(this.noteId, pageEntity.noteId) && OooOOO0.OooO0O0(this.paperSpecJson, pageEntity.paperSpecJson) && this.paperOrientation == pageEntity.paperOrientation && OooOOO0.OooO0O0(this.paperThemeJson, pageEntity.paperThemeJson) && OooOOO0.OooO0O0(this.paperPaddingJson, pageEntity.paperPaddingJson) && this.creationTime == pageEntity.creationTime && this.lastModificationTime == pageEntity.lastModificationTime && OooOOO0.OooO0O0(this.tnPath, pageEntity.tnPath) && this.unbounded == pageEntity.unbounded && this.source == pageEntity.source && OooOOO0.OooO0O0(this.recoverNoteId, pageEntity.recoverNoteId) && OooOOO0.OooO0O0(this.recoverNoteTitle, pageEntity.recoverNoteTitle) && this.recoverIndex == pageEntity.recoverIndex && this.inTrashBin == pageEntity.inTrashBin && OooOOO0.OooO0O0(this.historyPageIdList, pageEntity.historyPageIdList);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final List<String> getHistoryPageIdList() {
        return this.historyPageIdList;
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

    public final String getNoteId() {
        return this.noteId;
    }

    public final PaperOrientation getPaperOrientation() {
        return this.paperOrientation;
    }

    public final String getPaperPaddingJson() {
        return this.paperPaddingJson;
    }

    public final String getPaperSpecJson() {
        return this.paperSpecJson;
    }

    public final String getPaperThemeJson() {
        return this.paperThemeJson;
    }

    public final int getRecoverIndex() {
        return this.recoverIndex;
    }

    public final String getRecoverNoteId() {
        return this.recoverNoteId;
    }

    public final String getRecoverNoteTitle() {
        return this.recoverNoteTitle;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId);
        String str = this.paperSpecJson;
        int iHashCode = (this.paperOrientation.hashCode() + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.paperThemeJson;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paperPaddingJson;
        int iOooO0O02 = o00000.OooO0O0(C20785Oooo00o.OooO00o(this.recoverIndex, OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.source, o00000.OooO0O0(OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.creationTime), 31, this.lastModificationTime), 31, this.tnPath), 31, this.unbounded), 31), 31, this.recoverNoteId), 31, this.recoverNoteTitle), 31), 31, this.inTrashBin);
        List<String> list = this.historyPageIdList;
        return iOooO0O02 + (list != null ? list.hashCode() : 0);
    }

    public final void setHistoryPageIdList(List<String> list) {
        this.historyPageIdList = list;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setPaperPaddingJson(String str) {
        this.paperPaddingJson = str;
    }

    public final void setPaperSpecJson(String str) {
        this.paperSpecJson = str;
    }

    public final void setPaperThemeJson(String str) {
        this.paperThemeJson = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.paperSpecJson;
        PaperOrientation paperOrientation = this.paperOrientation;
        String str4 = this.paperThemeJson;
        String str5 = this.paperPaddingJson;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        String str6 = this.tnPath;
        boolean z = this.unbounded;
        int i = this.source;
        String str7 = this.recoverNoteId;
        String str8 = this.recoverNoteTitle;
        int i2 = this.recoverIndex;
        boolean z2 = this.inTrashBin;
        List<String> list = this.historyPageIdList;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("PageEntity(id=", str, ", noteId=", str2, ", paperSpecJson=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", paperOrientation=");
        sbOooO0O0.append(paperOrientation);
        sbOooO0O0.append(", paperThemeJson=");
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", paperPaddingJson=", str5, ", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", tnPath=", sbOooO0O0);
        sbOooO0O0.append(str6);
        sbOooO0O0.append(", unbounded=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", source=");
        C21036OooOOo0.OooO0Oo(i, ", recoverNoteId=", str7, ", recoverNoteTitle=", sbOooO0O0);
        OooO0O0.OooO0Oo(i2, str8, ", recoverIndex=", ", inTrashBin=", sbOooO0O0);
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", historyPageIdList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ PageEntity(String str, String str2, String str3, PaperOrientation paperOrientation, String str4, String str5, long j, long j2, String str6, boolean z, int i, String str7, String str8, int i2, boolean z2, List list, int i3, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, paperOrientation, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, j, j2, str6, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? 0 : i, str7, str8, i2, (i3 & 16384) != 0 ? false : z2, list);
    }
}
