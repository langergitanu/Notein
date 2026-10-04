package com.orion.notein.p607ui.p609vo;

import OooO0Oo.C20398OooO0O0;
import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PenWidthVO;", "", FirebaseAnalytics.Param.INDEX, "", C18437z2.f56754h, "color", "widthInMillimetre", "", "selected", "", "<init>", "(IIIFZ)V", "getIndex", "()I", "getType", "getColor", "getWidthInMillimetre", "()F", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenWidthVO {
    private final int color;
    private final int index;
    private final boolean selected;
    private final int type;
    private final float widthInMillimetre;

    public PenWidthVO(int i, int i2, int i3, float f, boolean z) {
        this.index = i;
        this.type = i2;
        this.color = i3;
        this.widthInMillimetre = f;
        this.selected = z;
    }

    public static /* synthetic */ PenWidthVO copy$default(PenWidthVO penWidthVO, int i, int i2, int i3, float f, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = penWidthVO.index;
        }
        if ((i4 & 2) != 0) {
            i2 = penWidthVO.type;
        }
        if ((i4 & 4) != 0) {
            i3 = penWidthVO.color;
        }
        if ((i4 & 8) != 0) {
            f = penWidthVO.widthInMillimetre;
        }
        if ((i4 & 16) != 0) {
            z = penWidthVO.selected;
        }
        boolean z2 = z;
        int i5 = i3;
        return penWidthVO.copy(i, i2, i5, f, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWidthInMillimetre() {
        return this.widthInMillimetre;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final PenWidthVO copy(int index, int type, int color, float widthInMillimetre, boolean selected) {
        return new PenWidthVO(index, type, color, widthInMillimetre, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenWidthVO)) {
            return false;
        }
        PenWidthVO penWidthVO = (PenWidthVO) other;
        return this.index == penWidthVO.index && this.type == penWidthVO.type && this.color == penWidthVO.color && Float.compare(this.widthInMillimetre, penWidthVO.widthInMillimetre) == 0 && this.selected == penWidthVO.selected;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public final float getWidthInMillimetre() {
        return this.widthInMillimetre;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + C20509OooO0oo.OooO0OO(this.widthInMillimetre, C20785Oooo00o.OooO00o(this.color, C20785Oooo00o.OooO00o(this.type, Integer.hashCode(this.index) * 31, 31), 31), 31);
    }

    public String toString() {
        int i = this.index;
        int i2 = this.type;
        int i3 = this.color;
        float f = this.widthInMillimetre;
        boolean z = this.selected;
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("PenWidthVO(index=", i, ", type=", ", color=", i2);
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", widthInMillimetre=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", selected=");
        return OooOOO.OooO00o(sbOooO0O0, ")", z);
    }
}
