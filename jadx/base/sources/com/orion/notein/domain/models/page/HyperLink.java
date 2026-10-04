package com.orion.notein.domain.models.page;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.HyperLinkInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u0017J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u0017J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u0017J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u0017J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010\u0019JZ\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u0017J\u0010\u00109\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b9\u00100J\u001a\u0010<\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u00100R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bB\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bC\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010D\u001a\u0004\bE\u00104\"\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010H¨\u0006I"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/HyperLink;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "", C18437z2.f56754h, FirebaseAnalytics.Param.DESTINATION, "extras", "Landroid/graphics/RectF;", "bounds", "", C17625c.f52155b, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;J)V", "", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "layerId", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "()I", "component4", "component5", "component6", "()Landroid/graphics/RectF;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;J)Lcom/orion/notein/domain/models/page/HyperLink;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "I", "getType", "getDestination", "getExtras", "Landroid/graphics/RectF;", "getBounds", "setBounds", "(Landroid/graphics/RectF;)V", "J", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HyperLink implements INoteinDisplayItem {
    private RectF bounds;
    public final long creationTime;
    private final String destination;
    private final String extras;
    public final String id;
    private final String pageId;
    private final int type;

    public HyperLink(String id, String pageId, int i, String destination, String str, RectF rectF, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(destination, "destination");
        this.id = id;
        this.pageId = pageId;
        this.type = i;
        this.destination = destination;
        this.extras = str;
        this.bounds = rectF;
        this.creationTime = j;
    }

    public static /* synthetic */ HyperLink copy$default(HyperLink hyperLink, String str, String str2, int i, String str3, String str4, RectF rectF, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hyperLink.id;
        }
        if ((i2 & 2) != 0) {
            str2 = hyperLink.pageId;
        }
        if ((i2 & 4) != 0) {
            i = hyperLink.type;
        }
        if ((i2 & 8) != 0) {
            str3 = hyperLink.destination;
        }
        if ((i2 & 16) != 0) {
            str4 = hyperLink.extras;
        }
        if ((i2 & 32) != 0) {
            rectF = hyperLink.bounds;
        }
        if ((i2 & 64) != 0) {
            j = hyperLink.creationTime;
        }
        long j2 = j;
        String str5 = str4;
        RectF rectF2 = rectF;
        return hyperLink.copy(str, str2, i, str3, str5, rectF2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    public final HyperLink copy(String id, String pageId, int type, String destination, String extras, RectF bounds, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(destination, "destination");
        return new HyperLink(id, pageId, type, destination, extras, bounds, creationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, null, 0, null, null, new RectF(this.bounds), creationTime, 30, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperLink)) {
            return false;
        }
        HyperLink hyperLink = (HyperLink) other;
        return OooOOO0.OooO0O0(this.id, hyperLink.id) && OooOOO0.OooO0O0(this.pageId, hyperLink.pageId) && this.type == hyperLink.type && OooOOO0.OooO0O0(this.destination, hyperLink.destination) && OooOOO0.OooO0O0(this.extras, hyperLink.extras) && OooOOO0.OooO0O0(this.bounds, hyperLink.bounds) && this.creationTime == hyperLink.creationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        RectF rectF = this.bounds;
        return rectF != null ? new RectF(rectF) : new RectF();
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getExtras() {
        return this.extras;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return "none";
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31), 31, this.destination);
        String str = this.extras;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.bounds;
        return Long.hashCode(this.creationTime) + ((iHashCode + (rectF != null ? rectF.hashCode() : 0)) * 31);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        RectF rectF = this.bounds;
        if (rectF != null) {
            rectF.offset(dx, dy);
        }
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

    public final void setBounds(RectF rectF) {
        this.bounds = rectF;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        RectF rectF = this.bounds;
        if (rectF == null) {
            return null;
        }
        return new HyperLinkInfo(this.id, this.type, this.destination, this.extras, new RectF(rectF), this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        int i = this.type;
        String str3 = this.destination;
        String str4 = this.extras;
        RectF rectF = this.bounds;
        long j = this.creationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("HyperLink(id=", str, ", pageId=", str2, ", type=");
        C21036OooOOo0.OooO0Oo(i, ", destination=", str3, ", extras=", sbOooO0O0);
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", creationTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sbOooO0O0);
    }

    public /* synthetic */ HyperLink(String str, String str2, int i, String str3, String str4, RectF rectF, long j, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, i, str3, str4, (i2 & 32) != 0 ? null : rectF, j);
    }
}
