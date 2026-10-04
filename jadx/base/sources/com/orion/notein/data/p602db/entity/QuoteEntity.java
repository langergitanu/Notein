package com.orion.notein.data.p602db.entity;

import OooO0o.C20424OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J·\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001J\u0013\u0010F\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0006HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00104R\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00104¨\u0006J"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/QuoteEntity;", "", "id", "", "pageId", C18437z2.f56754h, "", "color", "bgColor", "underlineColor", "labelRect", "Landroid/graphics/RectF;", "rectList", "", "text", "annoItemIdList", "linkType", "linkId", "layerId", C17625c.f52155b, "", "isVerticalPdfText", "", "isRtlOrBttPdfText", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIILandroid/graphics/RectF;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;JZZ)V", "getId", "()Ljava/lang/String;", "getPageId", "getType", "()I", "setType", "(I)V", "getColor$annotations", "()V", "getColor", "setColor", "getBgColor", "setBgColor", "getUnderlineColor", "setUnderlineColor", "getLabelRect", "()Landroid/graphics/RectF;", "getRectList", "()Ljava/util/List;", "getText", "getAnnoItemIdList", "getLinkType", "getLinkId", "getLayerId", "getCreationTime", "()J", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class QuoteEntity {
    private final List<String> annoItemIdList;
    private int bgColor;
    private int color;
    private final long creationTime;
    private final String id;
    private final boolean isRtlOrBttPdfText;
    private final boolean isVerticalPdfText;
    private final RectF labelRect;
    private final String layerId;
    private final String linkId;
    private final int linkType;
    private final String pageId;
    private final List<RectF> rectList;
    private final String text;
    private int type;
    private int underlineColor;

    /* JADX WARN: Multi-variable type inference failed */
    public QuoteEntity(String id, String pageId, int i, int i2, int i3, int i4, RectF labelRect, List<? extends RectF> rectList, String text, List<String> list, int i5, String linkId, String layerId, long j, boolean z, boolean z2) {
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
        this.color = i2;
        this.bgColor = i3;
        this.underlineColor = i4;
        this.labelRect = labelRect;
        this.rectList = rectList;
        this.text = text;
        this.annoItemIdList = list;
        this.linkType = i5;
        this.linkId = linkId;
        this.layerId = layerId;
        this.creationTime = j;
        this.isVerticalPdfText = z;
        this.isRtlOrBttPdfText = z2;
    }

    public static /* synthetic */ void getColor$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.annoItemIdList;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getLinkType() {
        return this.linkType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLinkId() {
        return this.linkId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
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
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RectF getLabelRect() {
        return this.labelRect;
    }

    public final List<RectF> component8() {
        return this.rectList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final QuoteEntity copy(String id, String pageId, int type, int color, int bgColor, int underlineColor, RectF labelRect, List<? extends RectF> rectList, String text, List<String> annoItemIdList, int linkType, String linkId, String layerId, long creationTime, boolean isVerticalPdfText, boolean isRtlOrBttPdfText) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(labelRect, "labelRect");
        OooOOO0.OooO0oO(rectList, "rectList");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(linkId, "linkId");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new QuoteEntity(id, pageId, type, color, bgColor, underlineColor, labelRect, rectList, text, annoItemIdList, linkType, linkId, layerId, creationTime, isVerticalPdfText, isRtlOrBttPdfText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuoteEntity)) {
            return false;
        }
        QuoteEntity quoteEntity = (QuoteEntity) other;
        return OooOOO0.OooO0O0(this.id, quoteEntity.id) && OooOOO0.OooO0O0(this.pageId, quoteEntity.pageId) && this.type == quoteEntity.type && this.color == quoteEntity.color && this.bgColor == quoteEntity.bgColor && this.underlineColor == quoteEntity.underlineColor && OooOOO0.OooO0O0(this.labelRect, quoteEntity.labelRect) && OooOOO0.OooO0O0(this.rectList, quoteEntity.rectList) && OooOOO0.OooO0O0(this.text, quoteEntity.text) && OooOOO0.OooO0O0(this.annoItemIdList, quoteEntity.annoItemIdList) && this.linkType == quoteEntity.linkType && OooOOO0.OooO0O0(this.linkId, quoteEntity.linkId) && OooOOO0.OooO0O0(this.layerId, quoteEntity.layerId) && this.creationTime == quoteEntity.creationTime && this.isVerticalPdfText == quoteEntity.isVerticalPdfText && this.isRtlOrBttPdfText == quoteEntity.isRtlOrBttPdfText;
    }

    public final List<String> getAnnoItemIdList() {
        return this.annoItemIdList;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final int getColor() {
        return this.color;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final RectF getLabelRect() {
        return this.labelRect;
    }

    public final String getLayerId() {
        return this.layerId;
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
        int iOooO0O0 = OooO00o.OooO0O0(C21445Oooo.OooO00o(this.rectList, C20424OooO0Oo.OooO0OO(this.labelRect, C20785Oooo00o.OooO00o(this.underlineColor, C20785Oooo00o.OooO00o(this.bgColor, C20785Oooo00o.OooO00o(this.color, C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31), 31), 31), 31), 31), 31), 31, this.text);
        List<String> list = this.annoItemIdList;
        return Boolean.hashCode(this.isRtlOrBttPdfText) + o00000.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.linkType, (iOooO0O0 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.linkId), 31, this.layerId), 31, this.creationTime), 31, this.isVerticalPdfText);
    }

    public final boolean isRtlOrBttPdfText() {
        return this.isRtlOrBttPdfText;
    }

    public final boolean isVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnderlineColor(int i) {
        this.underlineColor = i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        int i = this.type;
        int i2 = this.color;
        int i3 = this.bgColor;
        int i4 = this.underlineColor;
        RectF rectF = this.labelRect;
        List<RectF> list = this.rectList;
        String str3 = this.text;
        List<String> list2 = this.annoItemIdList;
        int i5 = this.linkType;
        String str4 = this.linkId;
        String str5 = this.layerId;
        long j = this.creationTime;
        boolean z = this.isVerticalPdfText;
        boolean z2 = this.isRtlOrBttPdfText;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("QuoteEntity(id=", str, ", pageId=", str2, ", type=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", color=", ", bgColor=", i, i2);
        C24472OooOoo.OooO0O0(sbOooO0O0, ", underlineColor=", ", labelRect=", i3, i4);
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", rectList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", text=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", annoItemIdList=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(", linkType=");
        C21036OooOOo0.OooO0Oo(i5, ", linkId=", str4, ", layerId=", sbOooO0O0);
        OooO.OooO00o(j, str5, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(", isVerticalPdfText=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", isRtlOrBttPdfText=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ QuoteEntity(String str, String str2, int i, int i2, int i3, int i4, RectF rectF, List list, String str3, List list2, int i5, String str4, String str5, long j, boolean z, boolean z2, int i6, C24018OooO0oo c24018OooO0oo) {
        this((i6 & 1) != 0 ? "" : str, str2, i, i2, i3, i4, rectF, list, str3, list2, i5, str4, str5, j, z, z2);
    }
}
