package com.orion.notein.p607ui.p609vo;

import OooOO0.OooO0O0;
import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\u0095\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, m80612d2 = {"Lcom/orion/notein/ui/vo/TiledPagePreviewVO;", "", "id", "", FirebaseAnalytics.Param.INDEX, "", "url", "width", "height", "isCover", "", "orientation", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "removable", "timestamp", "", "selectable", "isSelected", "hasComment", "highlight", "rotationDirection", "Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIZLcom/orion/notein/domain/models/page/PaperOrientation;ZJZZZZLcom/orion/notein/domain/models/page/Page$RotationDirection;)V", "getId", "()Ljava/lang/String;", "getIndex", "()I", "getUrl", "getWidth", "getHeight", "()Z", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "getRemovable", "getTimestamp", "()J", "getSelectable", "getHasComment", "getHighlight", "getRotationDirection", "()Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TiledPagePreviewVO {
    private final boolean hasComment;
    private final int height;
    private final boolean highlight;
    private final String id;
    private final int index;
    private final boolean isCover;
    private final boolean isSelected;
    private final PaperOrientation orientation;
    private final boolean removable;
    private final Page.RotationDirection rotationDirection;
    private final boolean selectable;
    private final long timestamp;
    private final String url;
    private final int width;

    public TiledPagePreviewVO(String id, int i, String url, int i2, int i3, boolean z, PaperOrientation orientation, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, Page.RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        this.id = id;
        this.index = i;
        this.url = url;
        this.width = i2;
        this.height = i3;
        this.isCover = z;
        this.orientation = orientation;
        this.removable = z2;
        this.timestamp = j;
        this.selectable = z3;
        this.isSelected = z4;
        this.hasComment = z5;
        this.highlight = z6;
        this.rotationDirection = rotationDirection;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSelectable() {
        return this.selectable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHasComment() {
        return this.hasComment;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHighlight() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Page.RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCover() {
        return this.isCover;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getRemovable() {
        return this.removable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final TiledPagePreviewVO copy(String id, int index, String url, int width, int height, boolean isCover, PaperOrientation orientation, boolean removable, long timestamp, boolean selectable, boolean isSelected, boolean hasComment, boolean highlight, Page.RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        return new TiledPagePreviewVO(id, index, url, width, height, isCover, orientation, removable, timestamp, selectable, isSelected, hasComment, highlight, rotationDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiledPagePreviewVO)) {
            return false;
        }
        TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) other;
        return OooOOO0.OooO0O0(this.id, tiledPagePreviewVO.id) && this.index == tiledPagePreviewVO.index && OooOOO0.OooO0O0(this.url, tiledPagePreviewVO.url) && this.width == tiledPagePreviewVO.width && this.height == tiledPagePreviewVO.height && this.isCover == tiledPagePreviewVO.isCover && this.orientation == tiledPagePreviewVO.orientation && this.removable == tiledPagePreviewVO.removable && this.timestamp == tiledPagePreviewVO.timestamp && this.selectable == tiledPagePreviewVO.selectable && this.isSelected == tiledPagePreviewVO.isSelected && this.hasComment == tiledPagePreviewVO.hasComment && this.highlight == tiledPagePreviewVO.highlight && this.rotationDirection == tiledPagePreviewVO.rotationDirection;
    }

    public final boolean getHasComment() {
        return this.hasComment;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getHighlight() {
        return this.highlight;
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemovable() {
        return this.removable;
    }

    public final Page.RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.rotationDirection.hashCode() + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0((this.orientation.hashCode() + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.height, C20785Oooo00o.OooO00o(this.width, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.index, this.id.hashCode() * 31, 31), 31, this.url), 31), 31), 31, this.isCover)) * 31, 31, this.removable), 31, this.timestamp), 31, this.selectable), 31, this.isSelected), 31, this.hasComment), 31, this.highlight);
    }

    public final boolean isCover() {
        return this.isCover;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        int i = this.index;
        String str2 = this.url;
        int i2 = this.width;
        int i3 = this.height;
        boolean z = this.isCover;
        PaperOrientation paperOrientation = this.orientation;
        boolean z2 = this.removable;
        long j = this.timestamp;
        boolean z3 = this.selectable;
        boolean z4 = this.isSelected;
        boolean z5 = this.hasComment;
        boolean z6 = this.highlight;
        Page.RotationDirection rotationDirection = this.rotationDirection;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "TiledPagePreviewVO(id=", str, ", index=", ", url=");
        OooO0O0.OooO0Oo(i2, str2, ", width=", ", height=", sbOooO0OO);
        sbOooO0OO.append(i3);
        sbOooO0OO.append(", isCover=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", orientation=");
        sbOooO0OO.append(paperOrientation);
        sbOooO0OO.append(", removable=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(", timestamp=");
        sbOooO0OO.append(j);
        sbOooO0OO.append(", selectable=");
        sbOooO0OO.append(z3);
        sbOooO0OO.append(", isSelected=");
        sbOooO0OO.append(z4);
        sbOooO0OO.append(", hasComment=");
        sbOooO0OO.append(z5);
        sbOooO0OO.append(", highlight=");
        sbOooO0OO.append(z6);
        sbOooO0OO.append(", rotationDirection=");
        sbOooO0OO.append(rotationDirection);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
