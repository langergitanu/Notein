package com.orion.notein.domain.models.page;

import OooO0o.C20424OooO0Oo;
import OooOO0.OooO0O0;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.DualLinkSourceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u0000 [2\u00020\u0001:\u0001[Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001cJ\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001cJ\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010\u001aJ\u0010\u0010>\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b?\u0010\u001eJ|\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010\u001cJ\u0010\u0010C\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bC\u00106J\u001a\u0010F\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bJ\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u00108R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010:R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010<\"\u0004\bS\u0010TR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\bZ\u0010\u001e¨\u0006\\"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/DualLinkSource;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", NoteMeta.PROPERTY_NOTE_ID, "pageId", "", C18437z2.f56754h, "Landroid/graphics/RectF;", "bounds", "", "textBounds", "Lcom/orion/notein/domain/models/page/DualLinkRef;", "ref", "", "validation", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/RectF;Ljava/util/List;Lcom/orion/notein/domain/models/page/DualLinkRef;ZJJ)V", "", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "layerId", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "component4", "()I", "component5", "()Landroid/graphics/RectF;", "component6", "()Ljava/util/List;", "component7", "()Lcom/orion/notein/domain/models/page/DualLinkRef;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/RectF;Ljava/util/List;Lcom/orion/notein/domain/models/page/DualLinkRef;ZJJ)Lcom/orion/notein/domain/models/page/DualLinkSource;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNoteId", "getPageId", "I", "getType", "Landroid/graphics/RectF;", "getBounds", "Ljava/util/List;", "getTextBounds", "Lcom/orion/notein/domain/models/page/DualLinkRef;", "getRef", "setRef", "(Lcom/orion/notein/domain/models/page/DualLinkRef;)V", "Z", "getValidation", "setValidation", "(Z)V", "J", "getLastModificationTime", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkSource implements INoteinDisplayItem {
    public static final int SOURCE_IMAGE = 0;
    public static final int SOURCE_PDF_TEXT = 1;
    private final RectF bounds;
    public final long creationTime;
    public final String id;
    private final long lastModificationTime;
    private final String noteId;
    private final String pageId;
    private DualLinkRef ref;
    private final List<RectF> textBounds;
    private final int type;
    private boolean validation;

    /* JADX WARN: Multi-variable type inference failed */
    public DualLinkSource(String id, String noteId, String pageId, int i, RectF bounds, List<? extends RectF> textBounds, DualLinkRef dualLinkRef, boolean z, long j, long j2) {
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
        this.ref = dualLinkRef;
        this.validation = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DualLinkSource copy$default(DualLinkSource dualLinkSource, String str, String str2, String str3, int i, RectF rectF, List list, DualLinkRef dualLinkRef, boolean z, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dualLinkSource.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dualLinkSource.noteId;
        }
        if ((i2 & 4) != 0) {
            str3 = dualLinkSource.pageId;
        }
        if ((i2 & 8) != 0) {
            i = dualLinkSource.type;
        }
        if ((i2 & 16) != 0) {
            rectF = dualLinkSource.bounds;
        }
        if ((i2 & 32) != 0) {
            list = dualLinkSource.textBounds;
        }
        if ((i2 & 64) != 0) {
            dualLinkRef = dualLinkSource.ref;
        }
        if ((i2 & 128) != 0) {
            z = dualLinkSource.validation;
        }
        if ((i2 & 256) != 0) {
            j = dualLinkSource.creationTime;
        }
        if ((i2 & 512) != 0) {
            j2 = dualLinkSource.lastModificationTime;
        }
        long j3 = j2;
        long j4 = j;
        DualLinkRef dualLinkRef2 = dualLinkRef;
        boolean z2 = z;
        RectF rectF2 = rectF;
        List list2 = list;
        return dualLinkSource.copy(str, str2, str3, i, rectF2, list2, dualLinkRef2, z2, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
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
    public final DualLinkRef getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    public final DualLinkSource copy(String id, String noteId, String pageId, int type, RectF bounds, List<? extends RectF> textBounds, DualLinkRef ref, boolean validation, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(textBounds, "textBounds");
        return new DualLinkSource(id, noteId, pageId, type, bounds, textBounds, ref, validation, creationTime, lastModificationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, null, null, 0, new RectF(this.bounds), null, null, false, creationTime, 0L, 750, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualLinkSource)) {
            return false;
        }
        DualLinkSource dualLinkSource = (DualLinkSource) other;
        return OooOOO0.OooO0O0(this.id, dualLinkSource.id) && OooOOO0.OooO0O0(this.noteId, dualLinkSource.noteId) && OooOOO0.OooO0O0(this.pageId, dualLinkSource.pageId) && this.type == dualLinkSource.type && OooOOO0.OooO0O0(this.bounds, dualLinkSource.bounds) && OooOOO0.OooO0O0(this.textBounds, dualLinkSource.textBounds) && OooOOO0.OooO0O0(this.ref, dualLinkSource.ref) && this.validation == dualLinkSource.validation && this.creationTime == dualLinkSource.creationTime && this.lastModificationTime == dualLinkSource.lastModificationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        float fOooO0o0 = o000000O.OooO0o0(21.0f);
        float fOooO0o02 = (this.bounds.left - fOooO0o0) - o000000O.OooO0o0(4.0f);
        RectF rectF = this.bounds;
        return new RectF(fOooO0o02, rectF.top, rectF.left - o000000O.OooO0o0(4.0f), this.bounds.top + fOooO0o0);
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

    public final DualLinkRef getRef() {
        return this.ref;
    }

    public final List<RectF> getTextBounds() {
        return this.textBounds;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.textBounds, C20424OooO0Oo.OooO0OO(this.bounds, C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.pageId), 31), 31), 31);
        DualLinkRef dualLinkRef = this.ref;
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(o00000.OooO0O0((iOooO00o + (dualLinkRef == null ? 0 : dualLinkRef.hashCode())) * 31, 31, this.validation), 31, this.creationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        this.bounds.offset(dx, dy);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        RectF rectF = this.bounds;
        if (rectF != null) {
            matrix.mapRect(rectF);
        }
    }

    public final void setRef(DualLinkRef dualLinkRef) {
        this.ref = dualLinkRef;
    }

    public final void setValidation(boolean z) {
        this.validation = z;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return new DualLinkSourceInfo(this.id, new RectF(this.bounds), this.validation, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.pageId;
        int i = this.type;
        RectF rectF = this.bounds;
        List<RectF> list = this.textBounds;
        DualLinkRef dualLinkRef = this.ref;
        boolean z = this.validation;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DualLinkSource(id=", str, ", noteId=", str2, ", pageId=");
        OooO0O0.OooO0Oo(i, str3, ", type=", ", bounds=", sbOooO0O0);
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", textBounds=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", ref=");
        sbOooO0O0.append(dualLinkRef);
        sbOooO0O0.append(", validation=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ DualLinkSource(String str, String str2, String str3, int i, RectF rectF, List list, DualLinkRef dualLinkRef, boolean z, long j, long j2, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? new RectF() : rectF, (i2 & 32) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i2 & 64) != 0 ? null : dualLinkRef, (i2 & 128) != 0 ? true : z, j, (i2 & 512) != 0 ? System.currentTimeMillis() : j2);
    }
}
