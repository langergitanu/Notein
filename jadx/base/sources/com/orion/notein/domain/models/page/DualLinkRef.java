package com.orion.notein.domain.models.page;

import OooO0o.C20424OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.DualLinkRefInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u001aJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001aJ\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001aJ\u0010\u00103\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b9\u0010\u0018J\u0010\u0010:\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b:\u0010\u001cJ\u0010\u0010;\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b;\u0010\u001cJn\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\u001aJ\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bH\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010K\u001a\u0004\bL\u00106\"\u0004\bM\u0010NR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u00108\"\u0004\bQ\u0010RR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010S\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010W\u001a\u0004\bX\u0010\u001c¨\u0006Y"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/DualLinkRef;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", NoteMeta.PROPERTY_NOTE_ID, "pageId", "Landroid/graphics/RectF;", "bounds", "Lcom/orion/notein/domain/models/page/Image;", "item", "Lcom/orion/notein/domain/models/page/DualLinkSource;", "source", "", "validation", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;Lcom/orion/notein/domain/models/page/Image;Lcom/orion/notein/domain/models/page/DualLinkSource;ZJJ)V", "", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "layerId", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "component4", "()Landroid/graphics/RectF;", "component5", "()Lcom/orion/notein/domain/models/page/Image;", "component6", "()Lcom/orion/notein/domain/models/page/DualLinkSource;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;Lcom/orion/notein/domain/models/page/Image;Lcom/orion/notein/domain/models/page/DualLinkSource;ZJJ)Lcom/orion/notein/domain/models/page/DualLinkRef;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNoteId", "getPageId", "Landroid/graphics/RectF;", "getBounds", "Lcom/orion/notein/domain/models/page/Image;", "getItem", "setItem", "(Lcom/orion/notein/domain/models/page/Image;)V", "Lcom/orion/notein/domain/models/page/DualLinkSource;", "getSource", "setSource", "(Lcom/orion/notein/domain/models/page/DualLinkSource;)V", "Z", "getValidation", "setValidation", "(Z)V", "J", "getLastModificationTime", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkRef implements INoteinDisplayItem {
    private final RectF bounds;
    public final long creationTime;
    public final String id;
    private Image item;
    private final long lastModificationTime;
    private final String noteId;
    private final String pageId;
    private DualLinkSource source;
    private boolean validation;

    public DualLinkRef(String id, String noteId, String pageId, RectF bounds, Image image, DualLinkSource dualLinkSource, boolean z, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        this.id = id;
        this.noteId = noteId;
        this.pageId = pageId;
        this.bounds = bounds;
        this.item = image;
        this.source = dualLinkSource;
        this.validation = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    public static /* synthetic */ DualLinkRef copy$default(DualLinkRef dualLinkRef, String str, String str2, String str3, RectF rectF, Image image, DualLinkSource dualLinkSource, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dualLinkRef.id;
        }
        if ((i & 2) != 0) {
            str2 = dualLinkRef.noteId;
        }
        if ((i & 4) != 0) {
            str3 = dualLinkRef.pageId;
        }
        if ((i & 8) != 0) {
            rectF = dualLinkRef.bounds;
        }
        if ((i & 16) != 0) {
            image = dualLinkRef.item;
        }
        if ((i & 32) != 0) {
            dualLinkSource = dualLinkRef.source;
        }
        if ((i & 64) != 0) {
            z = dualLinkRef.validation;
        }
        if ((i & 128) != 0) {
            j = dualLinkRef.creationTime;
        }
        if ((i & 256) != 0) {
            j2 = dualLinkRef.lastModificationTime;
        }
        long j3 = j2;
        long j4 = j;
        DualLinkSource dualLinkSource2 = dualLinkSource;
        boolean z2 = z;
        Image image2 = image;
        String str4 = str3;
        return dualLinkRef.copy(str, str2, str4, rectF, image2, dualLinkSource2, z2, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final Image getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DualLinkSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final DualLinkRef copy(String id, String noteId, String pageId, RectF bounds, Image item, DualLinkSource source, boolean validation, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        return new DualLinkRef(id, noteId, pageId, bounds, item, source, validation, creationTime, lastModificationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        long j;
        INoteinDisplayItem iNoteinDisplayItemDeepCopy;
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        Image image = this.item;
        if (image != null) {
            j = creationTime;
            iNoteinDisplayItemDeepCopy = image.deepCopy(image.getId(), getLayerId(), j);
        } else {
            j = creationTime;
            iNoteinDisplayItemDeepCopy = null;
        }
        return copy$default(this, id, null, null, null, iNoteinDisplayItemDeepCopy instanceof Image ? (Image) iNoteinDisplayItemDeepCopy : null, null, false, j, 0L, StyleIdentifier.LIST_TABLE_3_ACCENT_6, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualLinkRef)) {
            return false;
        }
        DualLinkRef dualLinkRef = (DualLinkRef) other;
        return OooOOO0.OooO0O0(this.id, dualLinkRef.id) && OooOOO0.OooO0O0(this.noteId, dualLinkRef.noteId) && OooOOO0.OooO0O0(this.pageId, dualLinkRef.pageId) && OooOOO0.OooO0O0(this.bounds, dualLinkRef.bounds) && OooOOO0.OooO0O0(this.item, dualLinkRef.item) && OooOOO0.OooO0O0(this.source, dualLinkRef.source) && this.validation == dualLinkRef.validation && this.creationTime == dualLinkRef.creationTime && this.lastModificationTime == dualLinkRef.lastModificationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        float dual_link_icon_size = (this.bounds.left - DualLinkRefInfo.INSTANCE.getDUAL_LINK_ICON_SIZE()) - o000000O.OooO0o0(4.0f);
        RectF rectF = this.bounds;
        return new RectF(dual_link_icon_size, rectF.top, rectF.right, rectF.bottom);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    public final Image getItem() {
        return this.item;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return "none";
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final DualLinkSource getSource() {
        return this.source;
    }

    public final boolean getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int iOooO0OO = C20424OooO0Oo.OooO0OO(this.bounds, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.pageId), 31);
        Image image = this.item;
        int iHashCode = (iOooO0OO + (image == null ? 0 : image.hashCode())) * 31;
        DualLinkSource dualLinkSource = this.source;
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(o00000.OooO0O0((iHashCode + (dualLinkSource != null ? dualLinkSource.hashCode() : 0)) * 31, 31, this.validation), 31, this.creationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        Image image = this.item;
        if (image != null) {
            image.offset(dx, dy);
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Image image = this.item;
        if (image != null) {
            image.rotate(r, center);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        RectF rectF = this.bounds;
        if (rectF != null) {
            matrix.mapRect(rectF);
        }
    }

    public final void setItem(Image image) {
        this.item = image;
    }

    public final void setSource(DualLinkSource dualLinkSource) {
        this.source = dualLinkSource;
    }

    public final void setValidation(boolean z) {
        this.validation = z;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        InterfaceC31284OooO0O0 displayItem;
        OooOOO0.OooO0oO(context, "context");
        Image image = this.item;
        if (image == null || (displayItem = image.toDisplayItem(context)) == null) {
            return null;
        }
        return new DualLinkRefInfo(this.id, displayItem, this.validation, null, this.creationTime, 8, null);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.pageId;
        RectF rectF = this.bounds;
        Image image = this.item;
        DualLinkSource dualLinkSource = this.source;
        boolean z = this.validation;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DualLinkRef(id=", str, ", noteId=", str2, ", pageId=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", item=");
        sbOooO0O0.append(image);
        sbOooO0O0.append(", source=");
        sbOooO0O0.append(dualLinkSource);
        sbOooO0O0.append(", validation=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ DualLinkRef(String str, String str2, String str3, RectF rectF, Image image, DualLinkSource dualLinkSource, boolean z, long j, long j2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, (i & 8) != 0 ? new RectF() : rectF, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : dualLinkSource, (i & 64) != 0 ? true : z, j, (i & 256) != 0 ? System.currentTimeMillis() : j2);
    }
}
