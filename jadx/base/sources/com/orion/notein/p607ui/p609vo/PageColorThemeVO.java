package com.orion.notein.p607ui.p609vo;

import OooOoo0.o00000;
import androidx.appcompat.app.OooOOO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PageColorThemeVO;", "", "color", "", "selected", "", "showVipBadge", "isAdd", "isEditAble", "<init>", "(IZZZZ)V", "getColor", "()I", "getSelected", "()Z", "getShowVipBadge", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageColorThemeVO {
    private final int color;
    private final boolean isAdd;
    private final boolean isEditAble;
    private final boolean selected;
    private final boolean showVipBadge;

    public PageColorThemeVO(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.color = i;
        this.selected = z;
        this.showVipBadge = z2;
        this.isAdd = z3;
        this.isEditAble = z4;
    }

    public static /* synthetic */ PageColorThemeVO copy$default(PageColorThemeVO pageColorThemeVO, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageColorThemeVO.color;
        }
        if ((i2 & 2) != 0) {
            z = pageColorThemeVO.selected;
        }
        if ((i2 & 4) != 0) {
            z2 = pageColorThemeVO.showVipBadge;
        }
        if ((i2 & 8) != 0) {
            z3 = pageColorThemeVO.isAdd;
        }
        if ((i2 & 16) != 0) {
            z4 = pageColorThemeVO.isEditAble;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return pageColorThemeVO.copy(i, z, z6, z3, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowVipBadge() {
        return this.showVipBadge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAdd() {
        return this.isAdd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEditAble() {
        return this.isEditAble;
    }

    public final PageColorThemeVO copy(int color, boolean selected, boolean showVipBadge, boolean isAdd, boolean isEditAble) {
        return new PageColorThemeVO(color, selected, showVipBadge, isAdd, isEditAble);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageColorThemeVO)) {
            return false;
        }
        PageColorThemeVO pageColorThemeVO = (PageColorThemeVO) other;
        return this.color == pageColorThemeVO.color && this.selected == pageColorThemeVO.selected && this.showVipBadge == pageColorThemeVO.showVipBadge && this.isAdd == pageColorThemeVO.isAdd && this.isEditAble == pageColorThemeVO.isEditAble;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowVipBadge() {
        return this.showVipBadge;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEditAble) + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(Integer.hashCode(this.color) * 31, 31, this.selected), 31, this.showVipBadge), 31, this.isAdd);
    }

    public final boolean isAdd() {
        return this.isAdd;
    }

    public final boolean isEditAble() {
        return this.isEditAble;
    }

    public String toString() {
        int i = this.color;
        boolean z = this.selected;
        boolean z2 = this.showVipBadge;
        boolean z3 = this.isAdd;
        boolean z4 = this.isEditAble;
        StringBuilder sb = new StringBuilder("PageColorThemeVO(color=");
        sb.append(i);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", showVipBadge=");
        sb.append(z2);
        sb.append(", isAdd=");
        sb.append(z3);
        sb.append(", isEditAble=");
        return OooOOO.OooO00o(sb, ")", z4);
    }

    public /* synthetic */ PageColorThemeVO(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, C24018OooO0oo c24018OooO0oo) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4);
    }
}
