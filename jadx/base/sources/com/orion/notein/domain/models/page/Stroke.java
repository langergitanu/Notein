package com.orion.notein.domain.models.page;

import OooOoo0.C20703o000000o;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.TableStyleOptions;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.PressurePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u000fJ\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u000fJ\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u000fJ\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u0010\u001bJ\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00105JP\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u00103\"\u0004\bD\u0010ER$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u00105\"\u0004\bH\u0010I¨\u0006J"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Stroke;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "layerId", "", C17625c.f52155b, "Lcom/orion/penkit/models/DrawRecord;", "record", "Lcom/orion/penkit/models/InkStrokeInfo;", "inkStroke", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/orion/penkit/models/DrawRecord;Lcom/orion/penkit/models/InkStrokeInfo;)V", "toString", "()Ljava/lang/String;", "", "isInkStroke", "()Z", "", "scale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "getLayerId", "getCreationTime", "()J", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "component4", "component5", "()Lcom/orion/penkit/models/DrawRecord;", "component6", "()Lcom/orion/penkit/models/InkStrokeInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/orion/penkit/models/DrawRecord;Lcom/orion/penkit/models/InkStrokeInfo;)Lcom/orion/notein/domain/models/page/Stroke;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "J", "Lcom/orion/penkit/models/DrawRecord;", "getRecord", "setRecord", "(Lcom/orion/penkit/models/DrawRecord;)V", "Lcom/orion/penkit/models/InkStrokeInfo;", "getInkStroke", "setInkStroke", "(Lcom/orion/penkit/models/InkStrokeInfo;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Stroke implements INoteinDisplayItem {
    public final long creationTime;
    public final String id;
    private InkStrokeInfo inkStroke;
    public final String layerId;
    private final String pageId;
    private DrawRecord record;

    public Stroke(String id, String pageId, String layerId, long j, DrawRecord drawRecord, InkStrokeInfo inkStrokeInfo) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.pageId = pageId;
        this.layerId = layerId;
        this.creationTime = j;
        this.record = drawRecord;
        this.inkStroke = inkStrokeInfo;
    }

    public static /* synthetic */ Stroke copy$default(Stroke stroke, String str, String str2, String str3, long j, DrawRecord drawRecord, InkStrokeInfo inkStrokeInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stroke.id;
        }
        if ((i & 2) != 0) {
            str2 = stroke.pageId;
        }
        if ((i & 4) != 0) {
            str3 = stroke.layerId;
        }
        if ((i & 8) != 0) {
            j = stroke.creationTime;
        }
        if ((i & 16) != 0) {
            drawRecord = stroke.record;
        }
        if ((i & 32) != 0) {
            inkStrokeInfo = stroke.inkStroke;
        }
        long j2 = j;
        String str4 = str3;
        return stroke.copy(str, str2, str4, j2, drawRecord, inkStrokeInfo);
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
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DrawRecord getRecord() {
        return this.record;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InkStrokeInfo getInkStroke() {
        return this.inkStroke;
    }

    public final Stroke copy(String id, String pageId, String layerId, long creationTime, DrawRecord record, InkStrokeInfo inkStroke) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new Stroke(id, pageId, layerId, creationTime, record, inkStroke);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        DrawRecord drawRecord = this.record;
        DrawRecord drawRecordDeepCopy = drawRecord != null ? drawRecord.deepCopy(id, layerId, creationTime) : null;
        InkStrokeInfo inkStrokeInfo = this.inkStroke;
        return copy$default(this, id, null, layerId, creationTime, drawRecordDeepCopy, inkStrokeInfo != null ? inkStrokeInfo.deepCopy(id, layerId, creationTime) : null, 2, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return OooOOO0.OooO0O0(this.id, stroke.id) && OooOOO0.OooO0O0(this.pageId, stroke.pageId) && OooOOO0.OooO0O0(this.layerId, stroke.layerId) && this.creationTime == stroke.creationTime && OooOOO0.OooO0O0(this.record, stroke.record) && OooOOO0.OooO0O0(this.inkStroke, stroke.inkStroke);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        RectF boundingBox = null;
        if (isInkStroke()) {
            InkStrokeInfo inkStrokeInfo = this.inkStroke;
            if (inkStrokeInfo != null) {
                boundingBox = inkStrokeInfo.getBoundingBox(1.0f);
            }
        } else {
            DrawRecord drawRecord = this.record;
            if (drawRecord != null) {
                float width = (drawRecord.getWidth() * scale) / 2;
                return new RectF(drawRecord.getBounds().left - width, drawRecord.getBounds().top - width, drawRecord.getBounds().right + width, drawRecord.getBounds().bottom + width);
            }
        }
        return boundingBox == null ? new RectF() : boundingBox;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    public final InkStrokeInfo getInkStroke() {
        return this.inkStroke;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return this.layerId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final DrawRecord getRecord() {
        return this.record;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31, this.layerId), 31, this.creationTime);
        DrawRecord drawRecord = this.record;
        int iHashCode = (iOooO0O0 + (drawRecord == null ? 0 : drawRecord.hashCode())) * 31;
        InkStrokeInfo inkStrokeInfo = this.inkStroke;
        return iHashCode + (inkStrokeInfo != null ? inkStrokeInfo.hashCode() : 0);
    }

    public final boolean isInkStroke() {
        return this.inkStroke != null;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        DrawRecord drawRecord = this.record;
        if (drawRecord != null) {
            drawRecord.offset(dx, dy);
        }
        InkStrokeInfo inkStrokeInfo = this.inkStroke;
        if (inkStrokeInfo != null) {
            inkStrokeInfo.offset(dx, dy);
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        DrawRecord drawRecord = this.record;
        if (drawRecord != null) {
            drawRecord.rotate(r, center);
        }
        InkStrokeInfo inkStrokeInfo = this.inkStroke;
        if (inkStrokeInfo != null) {
            inkStrokeInfo.rotate(r, center);
        }
    }

    public final void setInkStroke(InkStrokeInfo inkStrokeInfo) {
        this.inkStroke = inkStrokeInfo;
    }

    public final void setRecord(DrawRecord drawRecord) {
        this.record = drawRecord;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        if (isInkStroke()) {
            InkStrokeInfo inkStrokeInfo = this.inkStroke;
            if (inkStrokeInfo != null) {
                return inkStrokeInfo.deepCopy(this.id, this.layerId, this.creationTime);
            }
            return null;
        }
        DrawRecord drawRecord = this.record;
        if (drawRecord == null) {
            return null;
        }
        String str = this.id;
        int type = drawRecord.getType();
        int color = drawRecord.getColor();
        float width = drawRecord.getWidth();
        List<PressurePoint> points = drawRecord.getPoints();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(points, 10));
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            arrayList.add(PressurePoint.copy$default((PressurePoint) it.next(), 0.0f, 0.0f, 0.0f, 0, 15, null));
        }
        return new DrawRecord(str, type, color, width, OooOo.o0ooOoO(arrayList), new RectF(drawRecord.getBounds()), this.layerId, this.creationTime, drawRecord.isTapeTransparent(), null, false, TableStyleOptions.DEFAULT_2003, null);
    }

    public String toString() {
        return "Stroke(id=" + this.id + ", ink=" + (this.inkStroke != null) + ")";
    }

    public /* synthetic */ Stroke(String str, String str2, String str3, long j, DrawRecord drawRecord, InkStrokeInfo inkStrokeInfo, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? "" : str2, str3, j, (i & 16) != 0 ? null : drawRecord, (i & 32) != 0 ? null : inkStrokeInfo);
    }
}
