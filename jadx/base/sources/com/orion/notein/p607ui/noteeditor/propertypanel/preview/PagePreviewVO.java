package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import android.graphics.Point;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0016HÆ\u0003J\u009d\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0006HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010!R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/preview/PagePreviewVO;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, FirebaseAnalytics.Param.INDEX, "", "url", "width", "height", "isCurrent", "", "isCover", "removable", "isSearchResult", "copyable", "clickTarget", "Landroid/graphics/Point;", "labelList", "", "Lcom/orion/notein/ui/vo/ItemLabelVO;", "rotationDirection", "Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIZZZZZLandroid/graphics/Point;Ljava/util/List;Lcom/orion/notein/domain/models/page/Page$RotationDirection;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getIndex", "()I", "getUrl", "getWidth", "getHeight", "()Z", "getRemovable", "getCopyable", "getClickTarget", "()Landroid/graphics/Point;", "getLabelList", "()Ljava/util/List;", "setLabelList", "(Ljava/util/List;)V", "getRotationDirection", "()Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PagePreviewVO {
    private final Point clickTarget;
    private final boolean copyable;
    private final int height;
    private final String id;
    private final int index;
    private final boolean isCover;
    private final boolean isCurrent;
    private final boolean isSearchResult;
    private List<ItemLabelVO> labelList;
    private final String noteId;
    private final boolean removable;
    private final Page.RotationDirection rotationDirection;
    private final String url;
    private final int width;

    public PagePreviewVO(String id, String noteId, int i, String url, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Point point, List<ItemLabelVO> labelList, Page.RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(labelList, "labelList");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        this.id = id;
        this.noteId = noteId;
        this.index = i;
        this.url = url;
        this.width = i2;
        this.height = i3;
        this.isCurrent = z;
        this.isCover = z2;
        this.removable = z3;
        this.isSearchResult = z4;
        this.copyable = z5;
        this.clickTarget = point;
        this.labelList = labelList;
        this.rotationDirection = rotationDirection;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsSearchResult() {
        return this.isSearchResult;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCopyable() {
        return this.copyable;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Point getClickTarget() {
        return this.clickTarget;
    }

    public final List<ItemLabelVO> component13() {
        return this.labelList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Page.RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsCover() {
        return this.isCover;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRemovable() {
        return this.removable;
    }

    public final PagePreviewVO copy(String id, String noteId, int index, String url, int width, int height, boolean isCurrent, boolean isCover, boolean removable, boolean isSearchResult, boolean copyable, Point clickTarget, List<ItemLabelVO> labelList, Page.RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(labelList, "labelList");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        return new PagePreviewVO(id, noteId, index, url, width, height, isCurrent, isCover, removable, isSearchResult, copyable, clickTarget, labelList, rotationDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagePreviewVO)) {
            return false;
        }
        PagePreviewVO pagePreviewVO = (PagePreviewVO) other;
        return OooOOO0.OooO0O0(this.id, pagePreviewVO.id) && OooOOO0.OooO0O0(this.noteId, pagePreviewVO.noteId) && this.index == pagePreviewVO.index && OooOOO0.OooO0O0(this.url, pagePreviewVO.url) && this.width == pagePreviewVO.width && this.height == pagePreviewVO.height && this.isCurrent == pagePreviewVO.isCurrent && this.isCover == pagePreviewVO.isCover && this.removable == pagePreviewVO.removable && this.isSearchResult == pagePreviewVO.isSearchResult && this.copyable == pagePreviewVO.copyable && OooOOO0.OooO0O0(this.clickTarget, pagePreviewVO.clickTarget) && OooOOO0.OooO0O0(this.labelList, pagePreviewVO.labelList) && this.rotationDirection == pagePreviewVO.rotationDirection;
    }

    public final Point getClickTarget() {
        return this.clickTarget;
    }

    public final boolean getCopyable() {
        return this.copyable;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<ItemLabelVO> getLabelList() {
        return this.labelList;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final boolean getRemovable() {
        return this.removable;
    }

    public final Page.RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.height, C20785Oooo00o.OooO00o(this.width, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.index, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31), 31, this.url), 31), 31), 31, this.isCurrent), 31, this.isCover), 31, this.removable), 31, this.isSearchResult), 31, this.copyable);
        Point point = this.clickTarget;
        return this.rotationDirection.hashCode() + C21445Oooo.OooO00o(this.labelList, (iOooO0O0 + (point == null ? 0 : point.hashCode())) * 31, 31);
    }

    public final boolean isCover() {
        return this.isCover;
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public final boolean isSearchResult() {
        return this.isSearchResult;
    }

    public final void setLabelList(List<ItemLabelVO> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.labelList = list;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        int i = this.index;
        String str3 = this.url;
        int i2 = this.width;
        int i3 = this.height;
        boolean z = this.isCurrent;
        boolean z2 = this.isCover;
        boolean z3 = this.removable;
        boolean z4 = this.isSearchResult;
        boolean z5 = this.copyable;
        Point point = this.clickTarget;
        List<ItemLabelVO> list = this.labelList;
        Page.RotationDirection rotationDirection = this.rotationDirection;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("PagePreviewVO(id=", str, ", noteId=", str2, ", index=");
        C21036OooOOo0.OooO0Oo(i, ", url=", str3, ", width=", sbOooO0O0);
        C24472OooOoo.OooO0O0(sbOooO0O0, ", height=", ", isCurrent=", i2, i3);
        sbOooO0O0.append(z);
        sbOooO0O0.append(", isCover=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", removable=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", isSearchResult=");
        sbOooO0O0.append(z4);
        sbOooO0O0.append(", copyable=");
        sbOooO0O0.append(z5);
        sbOooO0O0.append(", clickTarget=");
        sbOooO0O0.append(point);
        sbOooO0O0.append(", labelList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", rotationDirection=");
        sbOooO0O0.append(rotationDirection);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ PagePreviewVO(String str, String str2, int i, String str3, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Point point, List list, Page.RotationDirection rotationDirection, int i4, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, i, str3, i2, i3, z, z2, z3, z4, z5, (i4 & 2048) != 0 ? null : point, (i4 & 4096) != 0 ? C34434OooOoO.f123453OooOo0o : list, rotationDirection);
    }
}
