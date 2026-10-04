package com.orion.notein.data.p602db.entity;

import OooO0o.C20424OooO0Oo;
import OooOO0.OooO0O0;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.graphics.RectF;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010B\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J¬\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0007HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010$R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-¨\u0006J"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/DualLinkSourceEntity;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "pageId", C18437z2.f56754h, "", "bounds", "Landroid/graphics/RectF;", "textBounds", "", "dualLinkRefId", "dualLinkRefNoteId", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "left", "", "top", "right", "bottom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/RectF;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getPageId", "getType", "()I", "getBounds", "()Landroid/graphics/RectF;", "getTextBounds", "()Ljava/util/List;", "getDualLinkRefId", "setDualLinkRefId", "(Ljava/lang/String;)V", "getDualLinkRefNoteId", "setDualLinkRefNoteId", "getCreationTime", "()J", "getLastModificationTime", "getLeft", "()Ljava/lang/Float;", "setLeft", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/RectF;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/orion/notein/data/db/entity/DualLinkSourceEntity;", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkSourceEntity {
    private Float bottom;
    private final RectF bounds;
    private final long creationTime;
    private String dualLinkRefId;
    private String dualLinkRefNoteId;
    private final String id;
    private final long lastModificationTime;
    private Float left;
    private final String noteId;
    private final String pageId;
    private Float right;
    private final List<RectF> textBounds;
    private Float top;
    private final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public DualLinkSourceEntity(String id, String noteId, String pageId, int i, RectF bounds, List<? extends RectF> textBounds, String str, String str2, long j, long j2, Float f, Float f2, Float f3, Float f4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(textBounds, "textBounds");
        this.id = id;
        this.noteId = noteId;
        this.pageId = pageId;
        this.type = i;
        this.bounds = bounds;
        this.textBounds = textBounds;
        this.dualLinkRefId = str;
        this.dualLinkRefNoteId = str2;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    public final List<RectF> component6() {
        return this.textBounds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDualLinkRefId() {
        return this.dualLinkRefId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDualLinkRefNoteId() {
        return this.dualLinkRefNoteId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    public final DualLinkSourceEntity copy(String id, String noteId, String pageId, int type, RectF bounds, List<? extends RectF> textBounds, String dualLinkRefId, String dualLinkRefNoteId, long creationTime, long lastModificationTime, Float left, Float top, Float right, Float bottom) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(textBounds, "textBounds");
        return new DualLinkSourceEntity(id, noteId, pageId, type, bounds, textBounds, dualLinkRefId, dualLinkRefNoteId, creationTime, lastModificationTime, left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualLinkSourceEntity)) {
            return false;
        }
        DualLinkSourceEntity dualLinkSourceEntity = (DualLinkSourceEntity) other;
        return OooOOO0.OooO0O0(this.id, dualLinkSourceEntity.id) && OooOOO0.OooO0O0(this.noteId, dualLinkSourceEntity.noteId) && OooOOO0.OooO0O0(this.pageId, dualLinkSourceEntity.pageId) && this.type == dualLinkSourceEntity.type && OooOOO0.OooO0O0(this.bounds, dualLinkSourceEntity.bounds) && OooOOO0.OooO0O0(this.textBounds, dualLinkSourceEntity.textBounds) && OooOOO0.OooO0O0(this.dualLinkRefId, dualLinkSourceEntity.dualLinkRefId) && OooOOO0.OooO0O0(this.dualLinkRefNoteId, dualLinkSourceEntity.dualLinkRefNoteId) && this.creationTime == dualLinkSourceEntity.creationTime && this.lastModificationTime == dualLinkSourceEntity.lastModificationTime && OooOOO0.OooO0O0(this.left, dualLinkSourceEntity.left) && OooOOO0.OooO0O0(this.top, dualLinkSourceEntity.top) && OooOOO0.OooO0O0(this.right, dualLinkSourceEntity.right) && OooOOO0.OooO0O0(this.bottom, dualLinkSourceEntity.bottom);
    }

    public final Float getBottom() {
        return this.bottom;
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getDualLinkRefId() {
        return this.dualLinkRefId;
    }

    public final String getDualLinkRefNoteId() {
        return this.dualLinkRefNoteId;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final Float getLeft() {
        return this.left;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Float getRight() {
        return this.right;
    }

    public final List<RectF> getTextBounds() {
        return this.textBounds;
    }

    public final Float getTop() {
        return this.top;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.textBounds, C20424OooO0Oo.OooO0OO(this.bounds, C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.pageId), 31), 31), 31);
        String str = this.dualLinkRefId;
        int iHashCode = (iOooO00o + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dualLinkRefNoteId;
        int iOooO0O0 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.creationTime), 31, this.lastModificationTime);
        Float f = this.left;
        int iHashCode2 = (iOooO0O0 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.top;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.right;
        int iHashCode4 = (iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.bottom;
        return iHashCode4 + (f4 != null ? f4.hashCode() : 0);
    }

    public final void setBottom(Float f) {
        this.bottom = f;
    }

    public final void setDualLinkRefId(String str) {
        this.dualLinkRefId = str;
    }

    public final void setDualLinkRefNoteId(String str) {
        this.dualLinkRefNoteId = str;
    }

    public final void setLeft(Float f) {
        this.left = f;
    }

    public final void setRight(Float f) {
        this.right = f;
    }

    public final void setTop(Float f) {
        this.top = f;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.pageId;
        int i = this.type;
        RectF rectF = this.bounds;
        List<RectF> list = this.textBounds;
        String str4 = this.dualLinkRefId;
        String str5 = this.dualLinkRefNoteId;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Float f = this.left;
        Float f2 = this.top;
        Float f3 = this.right;
        Float f4 = this.bottom;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DualLinkSourceEntity(id=", str, ", noteId=", str2, ", pageId=");
        OooO0O0.OooO0Oo(i, str3, ", type=", ", bounds=", sbOooO0O0);
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", textBounds=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", dualLinkRefId=");
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", dualLinkRefNoteId=", str5, ", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", left=", sbOooO0O0);
        sbOooO0O0.append(f);
        sbOooO0O0.append(", top=");
        sbOooO0O0.append(f2);
        sbOooO0O0.append(", right=");
        sbOooO0O0.append(f3);
        sbOooO0O0.append(", bottom=");
        sbOooO0O0.append(f4);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ DualLinkSourceEntity(String str, String str2, String str3, int i, RectF rectF, List list, String str4, String str5, long j, long j2, Float f, Float f2, Float f3, Float f4, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, rectF, list, str4, str5, j, j2, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : f2, (i2 & 4096) != 0 ? null : f3, (i2 & 8192) != 0 ? null : f4);
    }
}
