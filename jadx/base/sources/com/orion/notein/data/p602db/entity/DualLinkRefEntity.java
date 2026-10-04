package com.orion.notein.data.p602db.entity;

import OooO0o.C20424OooO0Oo;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import android.graphics.RectF;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u009e\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u001dR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(¨\u0006E"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/DualLinkRefEntity;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "pageId", "bounds", "Landroid/graphics/RectF;", "itemId", "dualLinkSourceId", "dualLinkSourceNoteId", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "left", "", "top", "right", "bottom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getPageId", "getBounds", "()Landroid/graphics/RectF;", "getItemId", "setItemId", "(Ljava/lang/String;)V", "getDualLinkSourceId", "setDualLinkSourceId", "getDualLinkSourceNoteId", "setDualLinkSourceNoteId", "getCreationTime", "()J", "getLastModificationTime", "getLeft", "()Ljava/lang/Float;", "setLeft", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/orion/notein/data/db/entity/DualLinkRefEntity;", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkRefEntity {
    private Float bottom;
    private final RectF bounds;
    private final long creationTime;
    private String dualLinkSourceId;
    private String dualLinkSourceNoteId;
    private final String id;
    private String itemId;
    private final long lastModificationTime;
    private Float left;
    private final String noteId;
    private final String pageId;
    private Float right;
    private Float top;

    public DualLinkRefEntity(String id, String noteId, String pageId, RectF bounds, String str, String str2, String str3, long j, long j2, Float f, Float f2, Float f3, Float f4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        this.id = id;
        this.noteId = noteId;
        this.pageId = pageId;
        this.bounds = bounds;
        this.itemId = str;
        this.dualLinkSourceId = str2;
        this.dualLinkSourceNoteId = str3;
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
    public final Float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
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
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDualLinkSourceId() {
        return this.dualLinkSourceId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDualLinkSourceNoteId() {
        return this.dualLinkSourceNoteId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final DualLinkRefEntity copy(String id, String noteId, String pageId, RectF bounds, String itemId, String dualLinkSourceId, String dualLinkSourceNoteId, long creationTime, long lastModificationTime, Float left, Float top, Float right, Float bottom) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        return new DualLinkRefEntity(id, noteId, pageId, bounds, itemId, dualLinkSourceId, dualLinkSourceNoteId, creationTime, lastModificationTime, left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualLinkRefEntity)) {
            return false;
        }
        DualLinkRefEntity dualLinkRefEntity = (DualLinkRefEntity) other;
        return OooOOO0.OooO0O0(this.id, dualLinkRefEntity.id) && OooOOO0.OooO0O0(this.noteId, dualLinkRefEntity.noteId) && OooOOO0.OooO0O0(this.pageId, dualLinkRefEntity.pageId) && OooOOO0.OooO0O0(this.bounds, dualLinkRefEntity.bounds) && OooOOO0.OooO0O0(this.itemId, dualLinkRefEntity.itemId) && OooOOO0.OooO0O0(this.dualLinkSourceId, dualLinkRefEntity.dualLinkSourceId) && OooOOO0.OooO0O0(this.dualLinkSourceNoteId, dualLinkRefEntity.dualLinkSourceNoteId) && this.creationTime == dualLinkRefEntity.creationTime && this.lastModificationTime == dualLinkRefEntity.lastModificationTime && OooOOO0.OooO0O0(this.left, dualLinkRefEntity.left) && OooOOO0.OooO0O0(this.top, dualLinkRefEntity.top) && OooOOO0.OooO0O0(this.right, dualLinkRefEntity.right) && OooOOO0.OooO0O0(this.bottom, dualLinkRefEntity.bottom);
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

    public final String getDualLinkSourceId() {
        return this.dualLinkSourceId;
    }

    public final String getDualLinkSourceNoteId() {
        return this.dualLinkSourceNoteId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getItemId() {
        return this.itemId;
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

    public final Float getTop() {
        return this.top;
    }

    public int hashCode() {
        int iOooO0OO = C20424OooO0Oo.OooO0OO(this.bounds, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.pageId), 31);
        String str = this.itemId;
        int iHashCode = (iOooO0OO + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dualLinkSourceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dualLinkSourceNoteId;
        int iOooO0O0 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.creationTime), 31, this.lastModificationTime);
        Float f = this.left;
        int iHashCode3 = (iOooO0O0 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.top;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.right;
        int iHashCode5 = (iHashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.bottom;
        return iHashCode5 + (f4 != null ? f4.hashCode() : 0);
    }

    public final void setBottom(Float f) {
        this.bottom = f;
    }

    public final void setDualLinkSourceId(String str) {
        this.dualLinkSourceId = str;
    }

    public final void setDualLinkSourceNoteId(String str) {
        this.dualLinkSourceNoteId = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
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
        RectF rectF = this.bounds;
        String str4 = this.itemId;
        String str5 = this.dualLinkSourceId;
        String str6 = this.dualLinkSourceNoteId;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Float f = this.left;
        Float f2 = this.top;
        Float f3 = this.right;
        Float f4 = this.bottom;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DualLinkRefEntity(id=", str, ", noteId=", str2, ", pageId=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", itemId=");
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", dualLinkSourceId=", str5, ", dualLinkSourceNoteId=");
        OooO.OooO00o(j, str6, ", creationTime=", sbOooO0O0);
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

    public /* synthetic */ DualLinkRefEntity(String str, String str2, String str3, RectF rectF, String str4, String str5, String str6, long j, long j2, Float f, Float f2, Float f3, Float f4, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, rectF, str4, str5, str6, (i & 128) != 0 ? System.currentTimeMillis() : j, (i & 256) != 0 ? System.currentTimeMillis() : j2, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : f2, (i & 2048) != 0 ? null : f3, (i & 4096) != 0 ? null : f4);
    }
}
