package com.orion.notein.domain.models.page;

import OooOoO.C20509OooO0oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.EditingLanguage;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o00o0o0o.C25446OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u00105J\u0010\u0010;\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b;\u00105J\u0010\u0010<\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b<\u00105J\u0010\u0010=\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b=\u0010\u001cJ\u0010\u0010>\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u00105J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010\u001eJ\u0010\u0010@\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b@\u0010 J\u008e\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010\u001eJ\u0010\u0010D\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bD\u00105J\u001a\u0010G\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bL\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u00107R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u00109R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bQ\u00105R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bR\u00105R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bS\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bV\u00105R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010IR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010W¨\u0006X"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Shape;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "", "color", "", "width", "", "Landroid/graphics/PointF;", "points", C18437z2.f56754h, "blendMode", "style", "", "tapeLike", "opacityOfFillColor", "layerId", "", C17625c.f52155b, "<init>", "(Ljava/lang/String;Ljava/lang/String;IFLjava/util/List;IIIZILjava/lang/String;J)V", "scale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "()I", "component4", "()F", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;IFLjava/util/List;IIIZILjava/lang/String;J)Lcom/orion/notein/domain/models/page/Shape;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "I", "getColor", "F", "getWidth", "Ljava/util/List;", "getPoints", "getType", "getBlendMode", "getStyle", "Z", "getTapeLike", "getOpacityOfFillColor", "J", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Shape implements INoteinDisplayItem {
    private final int blendMode;
    private final int color;
    public final long creationTime;
    public final String id;
    public final String layerId;
    private final int opacityOfFillColor;
    private final String pageId;
    private final List<PointF> points;
    private final int style;
    private final boolean tapeLike;
    private final int type;
    private final float width;

    /* JADX WARN: Multi-variable type inference failed */
    public Shape(String id, String pageId, int i, float f, List<? extends PointF> points, int i2, int i3, int i4, boolean z, int i5, String layerId, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.pageId = pageId;
        this.color = i;
        this.width = f;
        this.points = points;
        this.type = i2;
        this.blendMode = i3;
        this.style = i4;
        this.tapeLike = z;
        this.opacityOfFillColor = i5;
        this.layerId = layerId;
        this.creationTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Shape copy$default(Shape shape, String str, String str2, int i, float f, List list, int i2, int i3, int i4, boolean z, int i5, String str3, long j, int i6, Object obj) {
        return shape.copy((i6 & 1) != 0 ? shape.id : str, (i6 & 2) != 0 ? shape.pageId : str2, (i6 & 4) != 0 ? shape.color : i, (i6 & 8) != 0 ? shape.width : f, (i6 & 16) != 0 ? shape.points : list, (i6 & 32) != 0 ? shape.type : i2, (i6 & 64) != 0 ? shape.blendMode : i3, (i6 & 128) != 0 ? shape.style : i4, (i6 & 256) != 0 ? shape.tapeLike : z, (i6 & 512) != 0 ? shape.opacityOfFillColor : i5, (i6 & 1024) != 0 ? shape.layerId : str3, (i6 & 2048) != 0 ? shape.creationTime : j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOpacityOfFillColor() {
        return this.opacityOfFillColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final List<PointF> component5() {
        return this.points;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getTapeLike() {
        return this.tapeLike;
    }

    public final Shape copy(String id, String pageId, int color, float width, List<? extends PointF> points, int type, int blendMode, int style, boolean tapeLike, int opacityOfFillColor, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new Shape(id, pageId, color, width, points, type, blendMode, style, tapeLike, opacityOfFillColor, layerId, creationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        List<PointF> list = this.points;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (PointF pointF : list) {
            arrayList.add(new PointF(pointF.x, pointF.y));
        }
        return copy$default(this, id, null, 0, 0.0f, OooOo.o0ooOoO(arrayList), 0, 0, 0, false, 0, layerId, creationTime, 1006, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) other;
        return OooOOO0.OooO0O0(this.id, shape.id) && OooOOO0.OooO0O0(this.pageId, shape.pageId) && this.color == shape.color && Float.compare(this.width, shape.width) == 0 && OooOOO0.OooO0O0(this.points, shape.points) && this.type == shape.type && this.blendMode == shape.blendMode && this.style == shape.style && this.tapeLike == shape.tapeLike && this.opacityOfFillColor == shape.opacityOfFillColor && OooOOO0.OooO0O0(this.layerId, shape.layerId) && this.creationTime == shape.creationTime;
    }

    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        return new ShapeInfo(null, this.color, this.width, this.points, this.type, this.blendMode, this.layerId, this.creationTime, this.style, this.tapeLike, 0, false, EditingLanguage.ARABIC_EGYPT, null).getBoundingBox(scale);
    }

    public final int getColor() {
        return this.color;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return this.layerId;
    }

    public final int getOpacityOfFillColor() {
        return this.opacityOfFillColor;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<PointF> getPoints() {
        return this.points;
    }

    public final int getStyle() {
        return this.style;
    }

    public final boolean getTapeLike() {
        return this.tapeLike;
    }

    public final int getType() {
        return this.type;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Long.hashCode(this.creationTime) + OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.opacityOfFillColor, o00000.OooO0O0(C20785Oooo00o.OooO00o(this.style, C20785Oooo00o.OooO00o(this.blendMode, C20785Oooo00o.OooO00o(this.type, C21445Oooo.OooO00o(this.points, C20509OooO0oo.OooO0OO(this.width, C20785Oooo00o.OooO00o(this.color, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31), 31), 31), 31), 31), 31), 31, this.tapeLike), 31), 31, this.layerId);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        for (PointF pointF : this.points) {
            pointF.x += dx;
            pointF.y += dy;
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        int i = 0;
        for (Object obj : this.points) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PointF pointF = (PointF) obj;
            PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF(pointF.x, pointF.y), center, r);
            pointF.x = pointFOooOO0O.x;
            pointF.y = pointFOooOO0O.y;
            i = i2;
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        List<PointF> list = this.points;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (PointF pointF : list) {
            arrayList.add(new PointF(pointF.x, pointF.y));
        }
        return new ShapeInfo(this.id, this.color, this.width, arrayList, this.type, this.blendMode, this.layerId, this.creationTime, this.style, this.tapeLike, this.opacityOfFillColor, false);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        int i = this.color;
        float f = this.width;
        List<PointF> list = this.points;
        int i2 = this.type;
        int i3 = this.blendMode;
        int i4 = this.style;
        boolean z = this.tapeLike;
        int i5 = this.opacityOfFillColor;
        String str3 = this.layerId;
        long j = this.creationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Shape(id=", str, ", pageId=", str2, ", color=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", width=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", points=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", type=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", blendMode=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", style=", ", tapeLike=", i3, i4);
        sbOooO0O0.append(z);
        sbOooO0O0.append(", opacityOfFillColor=");
        sbOooO0O0.append(i5);
        sbOooO0O0.append(", layerId=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ Shape(String str, String str2, int i, float f, List list, int i2, int i3, int i4, boolean z, int i5, String str3, long j, int i6, C24018OooO0oo c24018OooO0oo) {
        this((i6 & 1) != 0 ? UUID.randomUUID().toString() : str, (i6 & 2) != 0 ? "" : str2, i, f, list, i2, i3, i4, z, i5, str3, j);
    }
}
