package com.orion.notein.domain.models.page;

import OooO0o.C20424OooO0Oo;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.QuoteInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010 J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020(2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010 J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u00108J\u0010\u0010;\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010 J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b@\u0010>J\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bA\u00108J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010 J\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010 J\u0010\u0010D\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bD\u0010\"J\u0010\u0010E\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bE\u0010\u001eJ\u0010\u0010F\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bF\u0010\u001eJ´\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bI\u0010 J\u0010\u0010J\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bJ\u00108J\u001a\u0010M\u001a\u00020\u00142\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u00108\"\u0004\bS\u0010TR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010Q\u001a\u0004\bU\u00108\"\u0004\bV\u0010TR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010Q\u001a\u0004\bW\u00108\"\u0004\bX\u0010TR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010<R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\b\\\u0010>R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\b]\u0010 R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b^\u0010>R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\b_\u00108R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\b`\u0010 R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010aR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\b\u0016\u0010\u001e¨\u0006c"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Quote;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "", C18437z2.f56754h, "bgColor", "underlineColor", "Landroid/graphics/RectF;", "labelRect", "", "rectList", "text", "annoItemIdList", "linkType", "linkId", "layerId", "", C17625c.f52155b, "", "isVerticalPdfText", "isRtlOrBttPdfText", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILandroid/graphics/RectF;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;JZZ)V", "", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "()I", "component4", "component5", "component6", "()Landroid/graphics/RectF;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILandroid/graphics/RectF;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;JZZ)Lcom/orion/notein/domain/models/page/Quote;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "I", "getType", "setType", "(I)V", "getBgColor", "setBgColor", "getUnderlineColor", "setUnderlineColor", "Landroid/graphics/RectF;", "getLabelRect", "Ljava/util/List;", "getRectList", "getText", "getAnnoItemIdList", "getLinkType", "getLinkId", "J", "Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Quote implements INoteinDisplayItem {
    private final List<String> annoItemIdList;
    private int bgColor;
    public final long creationTime;
    public final String id;
    private final boolean isRtlOrBttPdfText;
    private final boolean isVerticalPdfText;
    private final RectF labelRect;
    public final String layerId;
    private final String linkId;
    private final int linkType;
    private final String pageId;
    private final List<RectF> rectList;
    private final String text;
    private int type;
    private int underlineColor;

    /* JADX WARN: Multi-variable type inference failed */
    public Quote(String id, String pageId, int i, int i2, int i3, RectF labelRect, List<? extends RectF> rectList, String text, List<String> list, int i4, String linkId, String layerId, long j, boolean z, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(labelRect, "labelRect");
        OooOOO0.OooO0oO(rectList, "rectList");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(linkId, "linkId");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.pageId = pageId;
        this.type = i;
        this.bgColor = i2;
        this.underlineColor = i3;
        this.labelRect = labelRect;
        this.rectList = rectList;
        this.text = text;
        this.annoItemIdList = list;
        this.linkType = i4;
        this.linkId = linkId;
        this.layerId = layerId;
        this.creationTime = j;
        this.isVerticalPdfText = z;
        this.isRtlOrBttPdfText = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Quote copy$default(Quote quote, String str, String str2, int i, int i2, int i3, RectF rectF, List list, String str3, List list2, int i4, String str4, String str5, long j, boolean z, boolean z2, int i5, Object obj) {
        return quote.copy((i5 & 1) != 0 ? quote.id : str, (i5 & 2) != 0 ? quote.pageId : str2, (i5 & 4) != 0 ? quote.type : i, (i5 & 8) != 0 ? quote.bgColor : i2, (i5 & 16) != 0 ? quote.underlineColor : i3, (i5 & 32) != 0 ? quote.labelRect : rectF, (i5 & 64) != 0 ? quote.rectList : list, (i5 & 128) != 0 ? quote.text : str3, (i5 & 256) != 0 ? quote.annoItemIdList : list2, (i5 & 512) != 0 ? quote.linkType : i4, (i5 & 1024) != 0 ? quote.linkId : str4, (i5 & 2048) != 0 ? quote.layerId : str5, (i5 & 4096) != 0 ? quote.creationTime : j, (i5 & 8192) != 0 ? quote.isVerticalPdfText : z, (i5 & 16384) != 0 ? quote.isRtlOrBttPdfText : z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getLinkType() {
        return this.linkType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLinkId() {
        return this.linkId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsRtlOrBttPdfText() {
        return this.isRtlOrBttPdfText;
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
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RectF getLabelRect() {
        return this.labelRect;
    }

    public final List<RectF> component7() {
        return this.rectList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<String> component9() {
        return this.annoItemIdList;
    }

    public final Quote copy(String id, String pageId, int type, int bgColor, int underlineColor, RectF labelRect, List<? extends RectF> rectList, String text, List<String> annoItemIdList, int linkType, String linkId, String layerId, long creationTime, boolean isVerticalPdfText, boolean isRtlOrBttPdfText) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(labelRect, "labelRect");
        OooOOO0.OooO0oO(rectList, "rectList");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(linkId, "linkId");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new Quote(id, pageId, type, bgColor, underlineColor, labelRect, rectList, text, annoItemIdList, linkType, linkId, layerId, creationTime, isVerticalPdfText, isRtlOrBttPdfText);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        RectF rectF = new RectF(this.labelRect);
        List<RectF> list = this.rectList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        return copy$default(this, id, null, 0, 0, 0, rectF, arrayList, null, null, 0, null, getLayerId(), creationTime, false, false, 26526, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) other;
        return OooOOO0.OooO0O0(this.id, quote.id) && OooOOO0.OooO0O0(this.pageId, quote.pageId) && this.type == quote.type && this.bgColor == quote.bgColor && this.underlineColor == quote.underlineColor && OooOOO0.OooO0O0(this.labelRect, quote.labelRect) && OooOOO0.OooO0O0(this.rectList, quote.rectList) && OooOOO0.OooO0O0(this.text, quote.text) && OooOOO0.OooO0O0(this.annoItemIdList, quote.annoItemIdList) && this.linkType == quote.linkType && OooOOO0.OooO0O0(this.linkId, quote.linkId) && OooOOO0.OooO0O0(this.layerId, quote.layerId) && this.creationTime == quote.creationTime && this.isVerticalPdfText == quote.isVerticalPdfText && this.isRtlOrBttPdfText == quote.isRtlOrBttPdfText;
    }

    public final List<String> getAnnoItemIdList() {
        return this.annoItemIdList;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Iterator<T> it = this.rectList.iterator();
        Float fValueOf4 = null;
        if (it.hasNext()) {
            float fMin = ((RectF) it.next()).top;
            while (it.hasNext()) {
                fMin = Math.min(fMin, ((RectF) it.next()).top);
            }
            fValueOf = Float.valueOf(fMin);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        Iterator<T> it2 = this.rectList.iterator();
        if (it2.hasNext()) {
            float fMax = ((RectF) it2.next()).bottom;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, ((RectF) it2.next()).bottom);
            }
            fValueOf2 = Float.valueOf(fMax);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Iterator<T> it3 = this.rectList.iterator();
        if (it3.hasNext()) {
            float fMin2 = ((RectF) it3.next()).left;
            while (it3.hasNext()) {
                fMin2 = Math.min(fMin2, ((RectF) it3.next()).left);
            }
            fValueOf3 = Float.valueOf(fMin2);
        } else {
            fValueOf3 = null;
        }
        float fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
        Iterator<T> it4 = this.rectList.iterator();
        if (it4.hasNext()) {
            float fMax2 = ((RectF) it4.next()).right;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((RectF) it4.next()).right);
            }
            fValueOf4 = Float.valueOf(fMax2);
        }
        return new RectF(fFloatValue3, fFloatValue, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f, fFloatValue2);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    public final RectF getLabelRect() {
        return this.labelRect;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return "none";
    }

    public final String getLinkId() {
        return this.linkId;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<RectF> getRectList() {
        return this.rectList;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(C21445Oooo.OooO00o(this.rectList, C20424OooO0Oo.OooO0OO(this.labelRect, C20785Oooo00o.OooO00o(this.underlineColor, C20785Oooo00o.OooO00o(this.bgColor, C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31), 31), 31), 31), 31), 31, this.text);
        List<String> list = this.annoItemIdList;
        return Boolean.hashCode(this.isRtlOrBttPdfText) + o00000.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.linkType, (iOooO0O0 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.linkId), 31, this.layerId), 31, this.creationTime), 31, this.isVerticalPdfText);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return false;
    }

    public final boolean isRtlOrBttPdfText() {
        return this.isRtlOrBttPdfText;
    }

    public final boolean isVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        this.labelRect.offset(dx, dy);
        Iterator<T> it = this.rectList.iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(dx, dy);
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        matrix.mapRect(this.labelRect);
        Iterator<T> it = this.rectList.iterator();
        while (it.hasNext()) {
            matrix.mapRect((RectF) it.next());
        }
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnderlineColor(int i) {
        this.underlineColor = i;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        List<RectF> list = this.rectList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        List<String> list2 = this.annoItemIdList;
        QuoteInfo quoteInfo = new QuoteInfo(this.id, this.bgColor, this.underlineColor, new RectF(this.labelRect), this.type, arrayList, this.text, this.linkId, this.layerId, this.creationTime, list2 != null ? OooOo.o0ooOO0(list2) : C34434OooOoO.f123453OooOo0o, null, this.isVerticalPdfText, this.isRtlOrBttPdfText, 2048, null);
        quoteInfo.recreateIconBounds(1.0f);
        return quoteInfo;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        int i = this.type;
        int i2 = this.bgColor;
        int i3 = this.underlineColor;
        RectF rectF = this.labelRect;
        List<RectF> list = this.rectList;
        String str3 = this.text;
        List<String> list2 = this.annoItemIdList;
        int i4 = this.linkType;
        String str4 = this.linkId;
        String str5 = this.layerId;
        long j = this.creationTime;
        boolean z = this.isVerticalPdfText;
        boolean z2 = this.isRtlOrBttPdfText;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Quote(id=", str, ", pageId=", str2, ", type=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", bgColor=", ", underlineColor=", i, i2);
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", labelRect=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", rectList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", text=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", annoItemIdList=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(", linkType=");
        sbOooO0O0.append(i4);
        sbOooO0O0.append(", linkId=");
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", layerId=", str5, ", creationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", isVerticalPdfText=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", isRtlOrBttPdfText=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
